import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class PixelOreo {
	
		// Definimos el tamaÃ±o de la imagen en ancho y alto
		private static int width = 1518;
	    private static int height = 2116;
	    
	    // Definimos el tamaÃƒÂ±o del pixel
	    private static int PIXEL_SIZE = 46;
	    private static Graphics2D g;
	    
	    // Definimos los colores a usar
	    static Color white 			= Color.white;
	    //static Color black			= Color.black;
	    //static Color blue  		= Color.blue;
	    //static Color red   		= Color.red;
	    static Color black			= new Color(12,8,7);
	    static Color darkGray		= new Color(68,64,63);
	    static Color midGray		= new Color(158,158,158);
	    static Color gray			= new Color(185,179,179);
	    static Color lightGray		= new Color(212,210,211);
	    static Color pink			= new Color(230,77,191);
	    static Color palePink		= new Color(227,145,207);
	    static Color oreoBlue		= new Color(146,219,230);
	    
	    static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
	    
	    public static void paint() {
	    	//Sombra
	    	drawBackground(PIXEL_SIZE, oreoBlue);
	    	drawHorizontalLine(18, 20, 0, black);
	    	drawHorizontalLine(28, 29, 0, black);
	    	drawHorizontalLine(17, 21, 1, black);
	    	drawHorizontalLine(27, 30, 1, black);
	    	drawHorizontalLine(17, 22, 2, black);
	    	drawHorizontalLine(26, 30, 2, black);
	    	fillRect(17, 3, 14, 5, black);
	    	fillRect(16, 8, 16, 6, black);
	    	fillRect(16, 14, 15, 2, black);
	    	fillRect(15, 16, 16, 4, black);
	    	fillRect(14, 20, 18, 2, black);
	    	drawHorizontalLine(13, 31, 22, black);
	    	drawHorizontalLine(12, 31, 23, black);
	    	fillRect(11, 24, 22, 2, black);
	    	drawHorizontalLine(10, 32, 26, black);
	    	fillRect(9, 27, 24, 2, black);
	    	fillRect(8, 29, 25, 2, black);
	    	drawHorizontalLine(8, 31, 31, black);
	    	fillRect(7, 32, 25, 2, black);
	    	drawVerticalLine(28, 34, 1, black);
	    	drawVerticalLine(27, 36, 2, black);
	    	drawVerticalLine(26, 37, 3, black);
	    	drawVerticalLine(26, 38, 4, black);
	    	drawVerticalLine(27, 29, 5, black);
	    	drawVerticalLine(33, 39, 5, black);
	    	drawVerticalLine(34, 40, 6, black);
	    	fillRect(7, 34, 25, 3, black);
	    	fillRect(7, 37, 24, 4, black);
	    	drawHorizontalLine(7, 24, 41, darkGray);
	    	drawHorizontalLine(26, 31, 41, midGray);
	    	drawHorizontalLine(8, 14, 42, midGray);
	    	drawHorizontalLine(16, 21, 42, midGray);
	    	fillRect(26, 42, 7, 2, midGray);
	    	drawHorizontalLine(10, 13, 43, midGray);
	    	fillRect(16, 43, 7, 2, midGray);
	    	drawHorizontalLine(27, 32, 44, midGray);
	    	drawHorizontalLine(17, 21, 45, midGray);
	    	drawHorizontalLine(28, 31, 45, midGray);
	    	
	    	//Cola
	    	drawHorizontalLine(3, 4, 27, white);
	    	drawHorizontalLine(2, 4, 28, white);
	    	drawHorizontalLine(2, 4, 29, white);
	    	putPixel(3, 30, white);
	    	drawHorizontalLine(3, 4, 36, darkGray);
	    	putPixel(4, 37, darkGray);
	    	putPixel(5, 38, darkGray);
	    	
	    	//Orejas
	    	putPixel(18, 0, midGray);
	    	putPixel(17, 1, midGray);
	    	putPixel(26, 1, midGray);
	    	putPixel(27, 0, midGray);
	    	drawVerticalLine(2, 4, 18, palePink);
	    	drawVerticalLine(2, 3, 21, palePink);
	    	putPixel(21, 4, pink);
	    	drawHorizontalLine(19, 20, 1, palePink);
	    	putPixel(28, 1, palePink);
	    	drawVerticalLine(2, 3, 29, palePink);
	    	fillRect(19, 2, 2, 4, pink);
	    	drawVerticalLine(5, 6, 18, pink);
	    	drawHorizontalLine(27, 28, 2, pink);
	    	drawHorizontalLine(27, 28, 3, pink);
	    	drawHorizontalLine(28, 29, 4, pink);
	    	putPixel(29, 5, pink);
	    	
	    	//Cabeza
	    	drawVerticalLine(5, 12, 25, lightGray);
	    	drawHorizontalLine(22, 23, 8, lightGray);
	    	putPixel(27, 8, lightGray);
	    	drawHorizontalLine(22, 27, 9, lightGray);
	    	drawHorizontalLine(23, 26, 10, lightGray);
	    	drawHorizontalLine(24, 26, 13, lightGray);
	    	drawVerticalLine(10, 12, 30, lightGray);
	    	drawVerticalLine(14, 15, 28, lightGray);
	    	putPixel(20, 15, lightGray);
	    	drawVerticalLine(16, 18, 27, lightGray);
	    	fillRect(22, 17, 2, 2, lightGray);
	    	drawVerticalLine(9, 15, 17, darkGray);
	    	putPixel(20, 10, darkGray);
	    	drawVerticalLine(13, 15, 30, darkGray);
	    	drawVerticalLine(11, 17, 29, darkGray);
	    	drawHorizontalLine(27, 28, 13, darkGray);
	    	putPixel(28, 18, darkGray);
	    	putPixel(27, 19, darkGray);
	    	putPixel(18, 16, darkGray);
	    	putPixel(19, 17, darkGray);
	    	putPixel(20, 18, darkGray);
	    	putPixel(24, 16, darkGray);
	    	putPixel(26, 16, darkGray);
	    	putPixel(24, 18, darkGray);
	    	putPixel(26, 18, darkGray);
	    	drawHorizontalLine(18, 19, 9, midGray);
	    	drawVerticalLine(11, 12, 17, midGray);
	    	drawHorizontalLine(18, 20, 13, midGray);
	    	putPixel(18, 14, midGray);
	    	drawHorizontalLine(18, 19, 15, midGray);
	    	drawHorizontalLine(19, 20, 16, midGray);
	    	drawHorizontalLine(20, 21, 17, midGray);
	    	drawHorizontalLine(21, 22, 18, midGray);
	    	drawHorizontalLine(21, 26, 19, midGray);
	    	drawVerticalLine(13, 15, 29, midGray);
	    	drawVerticalLine(16, 17, 28, midGray);
	    	drawHorizontalLine(23, 24, 9, white);
	    	putPixel(26, 9, midGray);
	    	drawHorizontalLine(24, 25, 10, white);
	    	fillRect(18, 10, 2, 3, white);
	    	drawHorizontalLine(19, 27, 14, white);
	    	drawHorizontalLine(21, 27, 15, white);
	    	drawHorizontalLine(21, 23, 16, white);
	    	
	    	//Cuerpo
	    	fillRect(17, 18, 2, 5, darkGray);
	    	fillRect(16, 19, 5, 2, darkGray);
	    	fillRect(28, 21, 2, 2, darkGray);
	    	putPixel(29, 20, darkGray);
	    	drawVerticalLine(23, 26, 15, darkGray);
	    	drawVerticalLine(27, 28, 16, darkGray);
	    	drawVerticalLine(29, 30, 17, darkGray);
	    	drawVerticalLine(31, 32, 18, darkGray);
	    	drawVerticalLine(25, 28, 31, darkGray);
	    	drawVerticalLine(29, 30, 30, darkGray);
	    	drawVerticalLine(31, 35, 29, darkGray);
	    	drawVerticalLine(35, 36, 30, darkGray);
	    	drawHorizontalLine(17, 18, 19, lightGray);
	    	drawHorizontalLine(17, 26, 20, lightGray);
	    	drawHorizontalLine(18, 27, 21, lightGray);
	    	drawHorizontalLine(19, 27, 22, lightGray);
	    	fillRect(16, 23, 15, 4, lightGray);
	    	fillRect(17, 27, 14, 2, lightGray);
	    	fillRect(18, 29, 12, 2, lightGray);
	    	fillRect(19, 31, 10, 2, lightGray);
	    	drawHorizontalLine(24, 26, 20, midGray);
	    	drawHorizontalLine(25, 27, 21, midGray);
	    	drawHorizontalLine(25, 27, 22, midGray);
	    	drawHorizontalLine(17, 18, 20, white);
	    	drawHorizontalLine(18, 21, 21, white);
	    	drawHorizontalLine(19, 23, 22, white);
	    	fillRect(16, 23, 9, 2, white);
	    	drawHorizontalLine(17, 23, 25, white);
	    	drawHorizontalLine(18, 23, 26, white);
	    	drawHorizontalLine(19, 22, 27, white);
	    	//drawHorizontalLine(20, 22, 28, white);
	    	drawVerticalLine(23, 28, 30, gray);
	    	drawVerticalLine(23, 30, 29, gray);
	    	drawVerticalLine(27, 31, 28, gray);
	    	drawVerticalLine(29, 31, 27, gray);
	    	drawHorizontalLine(25, 29, 30, gray);
	    	drawHorizontalLine(24, 28, 31, gray);
	    	drawHorizontalLine(21, 26, 32, gray);
	    	drawHorizontalLine(21, 24, 33, gray);
	    	drawHorizontalLine(21, 22, 34, gray);
	    	drawHorizontalLine(25, 26, 33, midGray);
	    	drawHorizontalLine(23, 26, 34, midGray);
	    	drawHorizontalLine(21, 25, 35, midGray);
	    	drawHorizontalLine(22, 25, 36, midGray);
	    	drawHorizontalLine(22, 24, 37, midGray);
	    	drawHorizontalLine(22, 23, 38, midGray);
	    	drawHorizontalLine(22, 25, 39, midGray);
	    	drawHorizontalLine(22, 24, 40, midGray);
	    	
	    	//Patas
	    	drawVerticalLine(32, 36, 20, darkGray);
	    	drawVerticalLine(36, 40, 21, darkGray);
	    	drawVerticalLine(35, 39, 26, darkGray);
	    	putPixel(25, 40, darkGray);
	    	drawHorizontalLine(15, 17, 33, darkGray);
	    	drawVerticalLine(38, 41, 15, darkGray);
	    	drawVerticalLine(34, 37, 14, darkGray);
	    	drawVerticalLine(32, 33, 13, darkGray);
	    	putPixel(12, 31, darkGray);
	    	drawHorizontalLine(10, 11, 30, darkGray);
	    	drawVerticalLine(31, 36, 9, darkGray);
	    	putPixel(8, 37, darkGray);
	    	fillRect(27, 32, 2, 12, white);
	    	fillRect(28, 42, 2, 2, white);
	    	drawVerticalLine(32, 35, 27, lightGray);
	    	putPixel(28, 35, lightGray);
	    	drawVerticalLine(36, 41, 29, lightGray);
	    	drawVerticalLine(39, 40, 28, lightGray);
	    	drawVerticalLine(42, 44, 30, lightGray);
	    	drawVerticalLine(42, 43, 31, lightGray);
	    	drawHorizontalLine(28, 30, 44, lightGray);
	    	putPixel(26, 40, midGray);
	    	drawVerticalLine(37, 41, 30, midGray);
	    	putPixel(27, 43, midGray);
	    	putPixel(21, 41, midGray);
	    	putPixel(18, 33, white);
	    	fillRect(15, 34, 4, 4, white);
	    	fillRect(16, 38, 4, 4, white);
	    	fillRect(17, 42, 3, 2, white);
	    	drawVerticalLine(32, 38, 19, lightGray);
	    	drawVerticalLine(37, 38, 18, lightGray);
	    	drawVerticalLine(36, 37, 15, lightGray);
	    	drawVerticalLine(40, 41, 16, lightGray);
	    	drawVerticalLine(37, 43, 20, lightGray);
	    	putPixel(19, 43, lightGray);
	    	drawHorizontalLine(17, 19, 44, lightGray);
	    	fillRect(10, 31, 2, 11, white);
	    	drawVerticalLine(37, 40, 9, white);
	    	drawVerticalLine(38, 40, 8, white);
	    	putPixel(12, 41, white);
	    	drawVerticalLine(32, 36, 12, midGray);
	    	drawVerticalLine(34, 35, 13, midGray);
	    	drawHorizontalLine(10, 11, 37, midGray);
	    	drawHorizontalLine(11, 12, 38, midGray);
	    	drawHorizontalLine(13, 14, 39, midGray);
	    	putPixel(14, 38, midGray);
	    	drawVerticalLine(32, 33, 11, lightGray);
	    	drawVerticalLine(34, 35, 12, lightGray);
	    	putPixel(11, 36, lightGray);
	    	putPixel(10, 38, lightGray);
	    	drawHorizontalLine(10, 12, 39, lightGray);
	    	drawHorizontalLine(12, 14, 40, lightGray);
	    	drawHorizontalLine(8, 9, 41, lightGray);
	    	putPixel(13, 41, lightGray);
	    	drawHorizontalLine(10, 13, 42, lightGray);
	    	putPixel(7, 41, midGray);
	    	
	    	
	    	
	    	
	    	/*
	    	drawHorizontalLine(4, 14, 2, Color.black);
	    	drawVerticalLine(3, 16, 3, Color.black);
	    	fillRect(4, 3, 11, 14, gray);
	    	putPixel(12, 6, Color.black);//*/
	    	
	        //drawSquareGrid(PIXEL_SIZE, Color.black);
	        
	        // Guardamos la imagen en formato JPG
	        try {       
	            ImageIO.write(image, "jpg", new File("C:\\Users\\aflor\\Downloads", "pixel_Oreo.jpg"));
	            System.out.println("EXITO !!!");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	    
	    private static void drawVerticalLine(int a, int b, int x, Color c){
	   	    g.setColor(c);
	    	for(int i=a;i<=b;i++){
	    		 putPixel(x, i, c);
	        }
	    }
	    
	    private static void drawHorizontalLine(int a, int b, int y, Color c){
	    	g.setColor(c);
	        for(int i=a;i<=b;i++){
	        	 putPixel(i, y, c);
	        }
	    }
	    
	    private static void putPixel(int x, int y, Color c){       
		   g.setColor(c);
		   g.fillRect(x * PIXEL_SIZE, y * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);    
	    }
	    
	    private static void fillRect(int x, int y, int width, int height, Color c){
	    	g.setColor(c);
	    	g.fillRect(x * PIXEL_SIZE, y * PIXEL_SIZE, width*PIXEL_SIZE, height*PIXEL_SIZE);
	    }
	    
	    private static void drawSquareGrid(int size, Color c) {
	    	g.setColor(c);
	        for (int i = 0; i < size; i++) {
	            for (int j = 0; j < size; j++) { 
	                g.drawRect(i * PIXEL_SIZE, j * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);
	            }
	        }
	    }
	    private static void drawBackground(int size, Color c) {
	    	g.setColor(c);
	    	for (int i = 0; i < size; i++) {
	            for (int j = 0; j < size; j++) {
	                g.fillRect(i * PIXEL_SIZE, j * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);                
	            }
	        }
	    }    
	    
	    public static void main(String[] args) {
	        g = image.createGraphics();        
	        paint();
	    }

}
