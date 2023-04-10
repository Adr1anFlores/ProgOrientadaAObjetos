import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class PixelGordielo {
	
	// Definimos el tamaÃ±o de la imagen en ancho y alto
	private static int width = 990;
    private static int height = 1089;
    
    // Definimos el tamaÃƒÂ±o del pixel
    private static int PIXEL_SIZE = 33;
    private static Graphics2D g;
    
    // Definimos los colores a usar
    static Color white 			= Color.white;
    //static Color black			= Color.black;
    //static Color blue  		= Color.blue;
    //static Color red   		= Color.red;
    static Color black			= new Color(33,31,29);
    static Color darkBrown		= new Color(43,39,38);
    static Color brown			= new Color(122,95,68);
    static Color darkPink		= new Color(205,74,81);
    static Color palePink		= new Color(229,169,162);
    static Color gordoGreen		= new Color(108,135,89);
    static Color lightBrown		= new Color(148,100,67);
    static Color darkGreen		= new Color(40,39,29);
    
    
    static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    
    public static void paint() {
    	//Fondo
    	drawBackground(PIXEL_SIZE, gordoGreen);
    	
    	//Sombra
    	drawHorizontalLine(24, 25, 0, black);
    	drawHorizontalLine(23, 26, 1, black);
    	drawHorizontalLine(22, 26, 2, black);
    	drawHorizontalLine(3, 5, 3, black);
    	drawHorizontalLine(21, 27, 3, black);
    	drawHorizontalLine(2, 11, 4, black);
    	drawHorizontalLine(17, 27, 4, black);
    	drawHorizontalLine(2, 27, 5, black);
    	fillRect(1, 6, 27, 2, black);
    	drawHorizontalLine(0, 5, 8, black);
    	fillRect(7, 8, 21, 3, black);
    	fillRect(0, 9, 5, 5, black);
    	fillRect(8, 11, 20, 2, black);
    	drawHorizontalLine(9, 27, 13, black);
    	drawHorizontalLine(0, 5, 14, black);
    	drawHorizontalLine(9, 29, 14, black);
    	drawHorizontalLine(0, 28, 15, black);
    	drawHorizontalLine(1, 29, 16, black);
    	drawHorizontalLine(1, 27, 17, black);
    	drawHorizontalLine(2, 27, 18, black);
    	drawHorizontalLine(2, 26, 19, black);
    	drawHorizontalLine(1, 25, 20, black);
    	drawHorizontalLine(1, 24, 21, black);
    	drawHorizontalLine(1, 22, 22, black);
    	drawHorizontalLine(1, 23, 23, black);
    	drawHorizontalLine(0, 24, 24, black);
    	fillRect(0, 25, 26, 2, black);
    	fillRect(20, 27, 6, 2, black);
    	drawHorizontalLine(21, 24, 29, black);
    	drawHorizontalLine(0, 17, 27, black);
    	fillRect(0, 28, 9, 2, black);
    	drawHorizontalLine(0, 4, 30, black);
    	drawHorizontalLine(1, 3, 31, black);
    	fillRect(12, 28, 7, 2, black);
    	drawHorizontalLine(13, 18, 30, black);
    	drawHorizontalLine(13, 17, 31, black);
    	drawHorizontalLine(14, 16, 32, black);
    	
    	//Cola
    	fillRect(3, 4, 3, 3, brown);
    	fillRect(2, 6, 3, 3, brown);
    	fillRect(1, 8, 3, 8, brown);
    	putPixel(4, 14, brown);
    	putPixel(3, 6, darkBrown);
    	putPixel(4, 7, darkBrown);
    	putPixel(1, 8, darkBrown);
    	putPixel(1, 10, darkBrown);
    	drawHorizontalLine(2, 3, 9, darkBrown);
    	drawHorizontalLine(2, 3, 11, darkBrown);
    	drawHorizontalLine(2, 3, 13, darkBrown);
    	drawVerticalLine(12, 14, 1, darkBrown);
    	drawHorizontalLine(3, 5, 15, darkBrown);
    	drawHorizontalLine(2, 4, 16, darkBrown);
    	drawHorizontalLine(2, 3, 17, darkBrown);
    	
    	//Orejas
    	fillRect(15, 6, 9, 7, brown);
    	fillRect(9, 8, 2, 3, darkPink);
    	fillRect(10, 10, 3, 2, darkPink);
    	drawVerticalLine(9, 12, 11, darkPink);
    	drawVerticalLine(9, 10, 10, palePink);
    	drawVerticalLine(10, 11, 11, palePink);
    	drawVerticalLine(5, 7, 8, darkBrown);
    	drawHorizontalLine(9, 11, 5, darkBrown);
    	drawHorizontalLine(11, 14, 6, darkBrown);
    	drawHorizontalLine(13, 15, 7, darkBrown);
    	drawHorizontalLine(14, 15, 8, darkBrown);
    	putPixel(15, 9, darkBrown);
    	drawHorizontalLine(17, 21, 5, darkBrown);
    	drawHorizontalLine(16, 19, 6, darkBrown);
    	drawHorizontalLine(21, 23, 6, darkBrown);
    	drawHorizontalLine(17, 18, 7, darkBrown);
    	drawHorizontalLine(18, 19, 8, darkBrown);
    	putPixel(19, 9, darkBrown);
    	drawVerticalLine(6, 8, 22, darkBrown);
    	putPixel(24, 7, darkBrown);
    	putPixel(25, 8, darkBrown);
    	putPixel(24, 1, darkBrown);
    	drawVerticalLine(1, 4, 25, darkBrown);
    	drawVerticalLine(3, 6, 26, darkBrown);
    	drawVerticalLine(8, 10, 24, brown);
    	putPixel(25, 9, brown);
    	
    	//Cara
    	putPixel(16, 13, darkBrown);
    	putPixel(15, 14, darkBrown);
    	drawHorizontalLine(11, 12, 14, darkBrown);
    	drawHorizontalLine(10, 11, 15, darkBrown);
    	drawHorizontalLine(10, 12, 17, darkBrown);
    	putPixel(10, 18, darkBrown);
    	drawHorizontalLine(24, 25, 15, darkBrown);
    	drawHorizontalLine(17, 18, 18, darkBrown);
    	drawHorizontalLine(14, 15, 21, darkBrown);
    	putPixel(13, 20, darkBrown);
    	putPixel(16, 20, darkBrown);
    	putPixel(28, 15, darkBrown);
    	putPixel(26, 16, darkBrown);
    	drawVerticalLine(17, 18, 27, darkBrown);
    	putPixel(26, 19, darkBrown);
    	putPixel(25, 20, darkBrown);
    	drawHorizontalLine(22, 24, 21, darkBrown);
    	putPixel(21, 22, darkBrown);
    	drawHorizontalLine(20, 21, 23, darkBrown);
    	putPixel(19, 24, darkBrown);
    	putPixel(26, 12, brown);
    	drawHorizontalLine(13, 15, 13, brown);
    	drawHorizontalLine(19, 23, 13, brown);
    	drawHorizontalLine(13, 14, 14, brown);
    	drawHorizontalLine(12, 14, 15, brown);
    	putPixel(16, 15, brown);
    	drawHorizontalLine(10, 15, 16, brown);
    	putPixel(13, 17, brown);
    	drawHorizontalLine(11, 12, 18, brown);
    	putPixel(15, 18, brown);
    	fillRect(9, 19, 4, 3, brown);
    	putPixel(13, 21, brown);
    	drawHorizontalLine(12, 20, 22, brown);
    	drawHorizontalLine(12, 19, 23, brown);
    	drawVerticalLine(14, 16, 20, brown);
    	putPixel(23, 14, brown);
    	putPixel(26, 18, brown);
    	putPixel(25, 19, brown);
    	putPixel(24, 20, brown);
    	putPixel(24, 13, white);
    	putPixel(27, 15, white);
    	drawVerticalLine(13, 15, 26, white);
    	drawHorizontalLine(21, 22, 14, white);
    	drawHorizontalLine(21, 23, 15, white);
    	drawHorizontalLine(21, 25, 16, white);
    	drawHorizontalLine(20, 26, 17, white);
    	drawHorizontalLine(19, 21, 18, white);
    	drawHorizontalLine(24, 25, 18, white);
    	putPixel(14, 16, white);
    	drawHorizontalLine(16, 17, 16, white);
    	drawHorizontalLine(14, 16, 17, white);
    	putPixel(16, 18, white);
    	drawHorizontalLine(13, 24, 19, white);
    	drawHorizontalLine(17, 23, 20, white);
    	drawHorizontalLine(16, 21, 21, white);
    	
    	//Nariz
    	drawHorizontalLine(22, 23, 17, brown);
    	putPixel(21, 18, lightBrown);
    	putPixel(22, 19, lightBrown);
    	
    	/*//Ojos
    	putPixel(17, 15, darkGreen);
    	putPixel(18, 16, darkGreen);
    	putPixel(18, 15, darkGreen);
    	putPixel(24, 12, darkGreen);
    	putPixel(25, 13, darkGreen);
    	putPixel(25, 12, darkGreen);*/
    	
    	//Cuerpo
    	fillRect(7, 16, 2, 12, brown);
    	fillRect(3, 19, 4, 9, brown);
    	fillRect(9, 22, 7, 5, brown);
    	putPixel(18, 25, brown);
    	fillRect(1, 26, 5, 3, brown);
    	putPixel(8, 16, darkBrown);
    	drawHorizontalLine(5, 7, 17, darkBrown);
    	drawHorizontalLine(4, 6, 18, darkBrown);
    	drawHorizontalLine(4, 5, 19, darkBrown);
    	putPixel(4, 20, darkBrown);
    	putPixel(4, 25, darkBrown);
    	drawVerticalLine(23, 25, 3, darkBrown);
    	drawVerticalLine(20, 26, 2, darkBrown);
    	drawVerticalLine(24, 25, 1, darkBrown);
    	drawVerticalLine(20, 24, 7, darkBrown);
    	drawVerticalLine(19, 21, 8, darkBrown);
    	drawVerticalLine(22, 23, 11, darkBrown);
    	drawHorizontalLine(13, 14, 23, darkBrown);
    	drawHorizontalLine(13, 16, 24, darkBrown);
    	drawHorizontalLine(14, 15, 25, darkBrown);
    	putPixel(1, 27, white);
    	fillRect(1, 28, 4, 2, white);
    	drawHorizontalLine(1, 3, 30, white);
    	drawHorizontalLine(7, 9, 25, white);
    	drawHorizontalLine(7, 10, 26, white);
    	drawHorizontalLine(6, 7, 27, white);
    	drawVerticalLine(24, 25, 17, white);
    	drawVerticalLine(23, 24, 18, white);
    	
    	//Patas
    	drawHorizontalLine(12, 16, 27, white);
    	fillRect(13, 28, 5, 2, white);
    	drawHorizontalLine(14, 17, 30, white);
    	drawHorizontalLine(14, 16, 31, white);
    	putPixel(13, 27, brown);
    	putPixel(15, 27, brown);
    	putPixel(17, 28, brown);
    	putPixel(13, 29, brown);
    	drawHorizontalLine(15, 16, 30, brown);
    	drawHorizontalLine(14, 15, 31, brown);
    	fillRect(20, 25, 5, 2, white);
    	fillRect(21, 27, 4, 2, white);
    	putPixel(23, 24, darkBrown);
    	putPixel(24, 25, darkBrown);
    	putPixel(22, 23, brown);
    	drawHorizontalLine(20, 22, 24, brown);
    	putPixel(23, 27, brown);
    	drawHorizontalLine(21, 22, 28, brown);
    	
    	/*
    	drawHorizontalLine(4, 14, 2, Color.black);
    	drawVerticalLine(3, 16, 3, Color.black);
    	fillRect(4, 3, 11, 14, gray);
    	putPixel(12, 6, Color.black);//*/
    	
        //drawSquareGrid(PIXEL_SIZE, Color.black);
        
        // Guardamos la imagen en formato JPG
        try {       
            ImageIO.write(image, "jpg", new File("C:\\Users\\aflor\\Downloads", "pixel_Gordielo.jpg"));
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
