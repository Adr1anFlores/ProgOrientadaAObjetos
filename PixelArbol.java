import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class PixelArbol {
	
	// Definimos el tamaÃ±o de la imagen en ancho y alto
	private static int width = 1845;
    private static int height = 2025;
    
    // Definimos el tamaÃƒÂ±o del pixel
    private static int PIXEL_SIZE = 45;
    private static Graphics2D g;
    
    // Definimos los colores a usar
    static Color white 			= Color.white;
    //static Color black		= Color.black;
    //static Color blue  		= Color.blue;
    //static Color red   		= Color.red;
    static Color black			= new Color(0,0,0);
    static Color darkBrown		= new Color(96,36,0);
    static Color brown			= new Color(127,70,17);
    static Color orange			= new Color(244,132,36);
    static Color lightBrown		= new Color(186,105,40);
    static Color yellow			= new Color(225,228,75);
    static Color lime			= new Color(190,214,74);
    static Color grass			= new Color(113,191,69);
    static Color green			= new Color(0,141,63);
    static Color darkGreen		= new Color(0,107,47);
    static Color skyCyan		= new Color(1,160,182);
    
    
    static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    
    public static void paint() {
    	//Fondo
    	drawBackground(PIXEL_SIZE, skyCyan);
    	
    	//Sombra
    	drawHorizontalLine(18, 23, 1, black);
    	drawHorizontalLine(16, 25, 2, black);
    	drawHorizontalLine(15, 26, 3, black);
    	drawHorizontalLine(14, 27, 4, black);
    	drawHorizontalLine(14, 28, 5, black);
    	drawHorizontalLine(12, 28, 6, black);
    	drawHorizontalLine(11, 29, 7, black);
    	drawHorizontalLine(10, 31, 8, black);
    	drawHorizontalLine(9, 33, 9, black);
    	fillRect(9, 10, 26, 2, black);
    	drawHorizontalLine(8, 35, 12, black);
    	drawHorizontalLine(6, 35, 13, black);
    	fillRect(5, 14, 32, 2, black);
    	drawHorizontalLine(4, 36, 16, black);
    	fillRect(3, 17, 33, 2, black);
    	drawHorizontalLine(3, 37, 19, black);
    	drawHorizontalLine(4, 38, 20, black);
    	drawHorizontalLine(4, 39, 21, black);
    	drawHorizontalLine(3, 39, 22, black);
    	drawHorizontalLine(2, 39, 23, black);
    	fillRect(1, 24, 39, 3, black);
    	drawHorizontalLine(2, 38, 27, black);
    	drawHorizontalLine(3, 37, 28, black);
    	drawHorizontalLine(4, 35, 29, black);
    	drawHorizontalLine(5, 8, 30, black);
    	drawHorizontalLine(11, 34, 30, black);
    	drawHorizontalLine(14, 28, 31, black);
    	drawHorizontalLine(15, 27, 32, black);
    	fillRect(16, 33, 11, 7, black);
    	drawHorizontalLine(15, 27, 40, black);
    	drawHorizontalLine(13, 29, 41, black);
    	drawHorizontalLine(12, 30, 42, black);
    	drawHorizontalLine(11, 31, 43, black);
    	
    	//Hoja1
    	fillRect(18, 2, 6, 4, lime);
    	drawHorizontalLine(16, 25, 3, lime);
    	drawHorizontalLine(24, 26, 4, lime);
    	putPixel(27, 5, lime);
    	drawHorizontalLine(18, 19, 2, yellow);
    	putPixel(21, 2, yellow);
    	putPixel(23, 2, yellow);
    	putPixel(20, 4, yellow);
    	putPixel(24, 3, grass);
    	putPixel(23, 4, grass);
    	putPixel(25, 4, grass);
    	drawHorizontalLine(16, 17, 4, grass);
    	drawHorizontalLine(17, 19, 5, grass);
    	drawHorizontalLine(22, 26, 5, grass);
    	drawHorizontalLine(19, 22, 6, grass);
    	putPixel(15, 4, green);
    	putPixel(16, 5, green);
    	drawHorizontalLine(17, 18, 6, green);
    	drawHorizontalLine(18, 22, 7, green);
    	drawHorizontalLine(19, 21, 8, green);
    	drawVerticalLine(7, 8, 20, grass);
    	putPixel(23, 6, green);
    	putPixel(27, 6, green);
    	putPixel(28, 7, green);
    	putPixel(29, 8, green);
    	putPixel(15, 5, darkGreen);
    	putPixel(29, 9, darkGreen);
    	
    	//Hoja2
    	putPixel(10, 11, darkGreen);
    	fillRect(10, 9, 2, 2, green);
    	drawHorizontalLine(11, 12, 9, grass);
    	drawHorizontalLine(12, 17, 8, grass);
    	drawHorizontalLine(14, 15, 7, grass);
    	drawHorizontalLine(17, 23, 9, grass);
    	drawHorizontalLine(18, 28, 10, grass);
    	drawHorizontalLine(18, 29, 11, grass);
    	drawHorizontalLine(16, 34, 12, grass);
    	putPixel(11, 8, lime);
    	drawHorizontalLine(12, 13, 7, lime);
    	putPixel(14, 6, lime);
    	putPixel(16, 7, lime);
    	putPixel(18, 8, lime);
    	putPixel(20, 10, green);
    	
    	//Hoja3
    	putPixel(30, 9, lime);
    	putPixel(31, 9, yellow);
    	putPixel(30, 10, grass);
    	drawHorizontalLine(31, 33, 10, lime);
    	drawHorizontalLine(31, 33, 11, grass);
    	putPixel(32, 11, lime);
    	drawHorizontalLine(24, 26, 7, yellow);
    	putPixel(25, 7, lime);
    	drawHorizontalLine(23, 27, 8, lime);
    	putPixel(27, 8, yellow);
    	putPixel(22, 9, lime);
    	drawHorizontalLine(24, 27, 9, lime);
    	putPixel(25, 9, yellow);
    	drawHorizontalLine(24, 28, 10, lime);
    	putPixel(22, 11, lime);
    	drawHorizontalLine(25, 26, 11, lime);
    	putPixel(29, 11, lime);
    	putPixel(30, 12, lime);
    	putPixel(34, 12, lime);
    	drawHorizontalLine(22, 32, 13, grass);
    	drawHorizontalLine(23, 34, 14, grass);
    	drawHorizontalLine(25, 35, 15, grass);
    	drawHorizontalLine(26, 34, 16, grass);
    	drawHorizontalLine(27, 33, 17, grass);
    	putPixel(27, 13, lime);
    	drawHorizontalLine(33, 34, 13, lime);
    	putPixel(31, 14, lime);
    	putPixel(35, 14, lime);
    	putPixel(24, 15, green);
    	putPixel(27, 15, green);
    	putPixel(25, 16, green);
    	putPixel(30, 16, green);
    	putPixel(33, 16, green);
    	putPixel(35, 16, green);
    	putPixel(25, 17, darkGreen);
    	putPixel(26, 17, green);
    	putPixel(28, 17, green);
    	putPixel(34, 17, green);
    	drawHorizontalLine(27, 34, 18, green);
    	putPixel(32, 18, grass);
    	putPixel(28, 19, darkGreen);
    	drawHorizontalLine(29, 34, 19, green);
    	putPixel(35, 19, lime);
    	
    	//Hoja4
    	drawHorizontalLine(14, 15, 10, lime);
    	putPixel(13, 10, yellow);
    	putPixel(16, 10, yellow);
    	drawHorizontalLine(12, 17, 11, lime);
    	putPixel(14, 11, yellow);
    	drawHorizontalLine(11, 15, 12, lime);
    	putPixel(12, 12, grass);
    	drawHorizontalLine(11, 16, 13, grass);
    	putPixel(13, 13, lime);
    	drawHorizontalLine(12, 15, 14, grass);
    	
    	//Hoja5
    	putPixel(9, 12, grass);
    	putPixel(8, 13, yellow);
    	putPixel(9, 13, lime);
    	fillRect(6, 14, 4, 2, lime);
    	putPixel(6, 14, yellow);
    	putPixel(10, 14, grass);
    	drawHorizontalLine(10, 14, 15, grass);
    	drawHorizontalLine(5, 10, 16, lime);
    	drawHorizontalLine(11, 13, 16, grass);
    	putPixel(6, 16, grass);
    	putPixel(9, 16, grass);
    	putPixel(12, 16, green);
    	drawHorizontalLine(4, 13, 17, grass);
    	drawHorizontalLine(5, 14, 18, grass);
    	putPixel(4, 18, green);
    	putPixel(7, 18, lime);
    	putPixel(10, 18, lime);
    	drawHorizontalLine(6, 21, 19, grass);
    	drawHorizontalLine(4, 5, 19, green);
    	putPixel(13, 19, green);
    	putPixel(17, 19, lime);
    	drawHorizontalLine(7, 26, 20, grass);
    	putPixel(6, 20, green);
    	drawHorizontalLine(11, 12, 20, green);
    	drawHorizontalLine(7, 13, 21, green);
    	putPixel(12, 21, grass);
    	
    	//Hoja6
    	putPixel(5, 21, darkGreen);
    	drawHorizontalLine(5, 10, 22, green);
    	putPixel(4, 22, grass);
    	putPixel(7, 22, darkGreen);
    	drawHorizontalLine(4, 8, 23, grass);
    	putPixel(3, 23, lime);
    	drawHorizontalLine(6, 7, 23, green);
    	drawHorizontalLine(3, 6, 24, grass);
    	putPixel(2, 24, lime);
    	fillRect(2, 25, 4, 2, green);
    	drawHorizontalLine(3, 5, 25, grass);
    	putPixel(4, 26, grass);
    	drawHorizontalLine(3, 5, 27, green);
    	putPixel(6, 27, darkGreen);
    	drawHorizontalLine(4, 7, 28, darkGreen);
    	drawHorizontalLine(5, 8, 29, darkGreen);
    	
    	//Hoja7
    	drawHorizontalLine(18, 20, 14, lime);
    	putPixel(17, 14, yellow);
    	putPixel(21, 14, yellow);
    	drawHorizontalLine(16, 22, 15, lime);
    	putPixel(19, 15, yellow);
    	fillRect(15, 16, 9, 2, lime);
    	putPixel(17, 16, grass);
    	drawHorizontalLine(20, 21, 16, grass);
    	fillRect(16, 17, 7, 2, grass);
    	putPixel(20, 18, lime);
    	
    	//Hoja8
    	drawHorizontalLine(9, 10, 28, grass);
    	drawHorizontalLine(8, 12, 27, grass);
    	drawHorizontalLine(7, 13, 26, grass);
    	drawHorizontalLine(8, 31, 25, grass);
    	putPixel(7, 25, lime);
    	putPixel(10, 25, lime);
    	drawHorizontalLine(9, 32, 24, grass);
    	putPixel(8, 24, lime);
    	putPixel(12, 24, lime);
    	drawHorizontalLine(9, 10, 23, lime);
    	fillRect(11, 22, 23, 2, grass);
    	drawHorizontalLine(14, 28, 21, grass);
    	putPixel(15, 23, green);
    	putPixel(17, 22, green);
    	putPixel(20, 23, green);
    	putPixel(16, 25, green);
    	putPixel(18, 25, green);
    	drawHorizontalLine(15, 23, 26, green);
    	drawHorizontalLine(19, 22, 26, grass);
    	drawHorizontalLine(14, 15, 27, green);
    	drawHorizontalLine(17, 19, 27, green);
    	drawHorizontalLine(22, 24, 27, green);
    	putPixel(21, 27, grass);
    	drawHorizontalLine(13, 16, 28, darkGreen);
    	drawHorizontalLine(20, 25, 28, darkGreen);
    	drawHorizontalLine(14, 15, 28, green);
    	drawHorizontalLine(21, 24, 28, green);
    	drawHorizontalLine(11, 15, 29, darkGreen);
    	drawHorizontalLine(20, 24, 29, darkGreen);
    	
    	//Hoja9
    	drawHorizontalLine(23, 26, 19, lime);
    	putPixel(22, 20, lime);
    	putPixel(27, 20, lime);
    	drawHorizontalLine(29, 30, 20, grass);
    	putPixel(31, 20, lime);
    	putPixel(24, 21, lime);
    	drawHorizontalLine(29, 32, 21, lime);
    	putPixel(31, 21, grass);
    	putPixel(26, 22, lime);
    	drawHorizontalLine(28, 29, 22, lime);
    	putPixel(33, 22, lime);
    	putPixel(31, 23, lime);
    	putPixel(25, 24, green);
    	putPixel(28, 24, green);
    	putPixel(33, 24, green);
    	drawHorizontalLine(24, 25, 25, green);
    	putPixel(32, 25, green);
    	drawHorizontalLine(25, 30, 26, green);
    	putPixel(27, 26, grass);
    	putPixel(29, 26, grass);
    	
    	//Hoja10
    	drawHorizontalLine(33, 34, 20, green);
    	putPixel(35, 20, grass);
    	putPixel(36, 20, lime);
    	putPixel(37, 20, yellow);
    	putPixel(34, 21, grass);
    	fillRect(35, 21, 4, 3, lime);
    	drawHorizontalLine(37, 38, 22, grass);
    	drawHorizontalLine(36, 38, 23, grass);
    	drawHorizontalLine(35, 37, 24, grass);
    	drawHorizontalLine(36, 37, 25, grass);
    	drawVerticalLine(24, 25, 38, green);
    	drawHorizontalLine(34, 35, 25, green);
    	drawHorizontalLine(33, 37, 26, green);
    	putPixel(38, 26, darkGreen);
    	drawHorizontalLine(31, 37, 27, darkGreen);
    	drawHorizontalLine(32, 36, 27, green);
    	drawHorizontalLine(27, 35, 28, darkGreen);
    	putPixel(34, 28, green);
    	drawHorizontalLine(29, 34, 29, darkGreen);
    	
    	//Tronco
    	putPixel(16, 30, darkBrown);
    	putPixel(15, 31, darkBrown);
    	putPixel(19, 30, darkBrown);
    	drawHorizontalLine(27, 28, 30, darkBrown);
    	fillRect(16, 31, 2, 2, brown);
    	drawHorizontalLine(19, 23, 31, brown);
    	putPixel(21, 31, darkBrown);
    	putPixel(24, 31, darkBrown);
    	drawHorizontalLine(17, 23, 32, lightBrown);
    	drawHorizontalLine(18, 19, 32, brown);
    	putPixel(21, 32, brown);
    	drawHorizontalLine(26, 27, 31, brown);
    	drawHorizontalLine(25, 26, 32, brown);
    	fillRect(17, 33, 9, 7, orange);
    	fillRect(18, 33, 7, 6, lightBrown);
    	putPixel(19, 33, brown);
    	drawHorizontalLine(23, 24, 33, brown);
    	putPixel(23, 34, brown);
    	putPixel(20, 35, brown);
    	drawVerticalLine(36, 37, 19, brown);
    	drawVerticalLine(36, 37, 21, brown);
    	drawVerticalLine(36, 38, 23, brown);
    	putPixel(20, 38, brown);
    	putPixel(19, 35, orange);
    	putPixel(20, 34, orange);
    	putPixel(21, 35, orange);
    	drawVerticalLine(36, 37, 20, darkBrown);
    	drawHorizontalLine(17, 19, 39, lightBrown);
    	putPixel(18, 39, brown);
    	drawHorizontalLine(20, 23, 40, orange);
    	fillRect(21, 39, 2, 2, lightBrown);
    	putPixel(24, 39, brown);
    	
    	//Roots
    	putPixel(16, 40, orange);
    	putPixel(15, 41, orange);
    	drawHorizontalLine(17, 18, 40, lightBrown);
    	putPixel(16, 41, lightBrown);
    	putPixel(19, 41, orange);
    	putPixel(20, 41, lightBrown);
    	drawHorizontalLine(22, 23, 41, lightBrown);
    	putPixel(24, 41, orange);
    	putPixel(25, 40, lightBrown);
    	putPixel(26, 40, orange);
    	putPixel(26, 41, lightBrown);
    	putPixel(27, 41, orange);
    	putPixel(13, 42, lightBrown);
    	drawHorizontalLine(14, 15, 42, brown);
    	drawHorizontalLine(17, 20, 42, brown);
    	drawHorizontalLine(22, 25, 42, brown);
    	drawHorizontalLine(27, 28, 42, brown);
    	putPixel(29, 42, lightBrown);
    	
    	
    	/*
    	drawHorizontalLine(4, 14, 2, Color.black);
    	drawVerticalLine(3, 16, 3, Color.black);
    	fillRect(4, 3, 11, 14, gray);
    	putPixel(12, 6, Color.black);//*/
    	
        //drawSquareGrid(PIXEL_SIZE, Color.black);
        
        // Guardamos la imagen en formato JPG
        try {       
            ImageIO.write(image, "jpg", new File("C:\\Users\\aflor\\Downloads", "pixel_Arbol.jpg"));
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
