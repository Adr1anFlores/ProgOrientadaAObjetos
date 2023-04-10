import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class PixelCraneo {
	
	// Definimos el tamaÃ±o de la imagen en ancho y alto
	private static int width = 625;
    private static int height = 575;
    
    // Definimos el tamaÃƒÂ±o del pixel
    private static int PIXEL_SIZE = 25;
    private static Graphics2D g;
    
    // Definimos los colores a usar
    static Color white 			= Color.white;
    //static Color black		= Color.black;
    //static Color blue  		= Color.blue;
    //static Color red   		= Color.red;
    static Color black			= new Color(0,0,0);
    static Color gray			= new Color(187,187,187);
    static Color gold			= new Color(146,136,49);
    
    
    static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    
    public static void paint() {
    	//Fondo
    	drawBackground(PIXEL_SIZE, gold);
    	
    	//Sombra
    	drawHorizontalLine(8, 16, 1, black);
    	drawHorizontalLine(6, 18, 2, black);
    	drawHorizontalLine(5, 19, 3, black);
    	drawHorizontalLine(4, 20, 4, black);
    	drawHorizontalLine(3, 21, 5, black);
    	fillRect(2, 6, 21, 2, black);
    	fillRect(1, 8, 23, 6, black);
    	fillRect(2, 14, 21, 2, black);
    	drawHorizontalLine(3, 21, 16, black);
    	drawHorizontalLine(4, 20, 17, black);
    	fillRect(6, 18, 13, 2, black);
    	drawHorizontalLine(7, 17, 20, black);
    	drawHorizontalLine(8, 16, 21, black);
    	
    	//Gris
    	drawHorizontalLine(8, 16, 2, gray);
    	drawHorizontalLine(6, 18, 3, gray);
    	drawHorizontalLine(5, 19, 4, gray);
    	drawHorizontalLine(4, 20, 5, gray);
    	fillRect(3, 6, 19, 2, gray);
    	drawHorizontalLine(2, 5, 8, gray);
    	drawHorizontalLine(2, 4, 9, gray);
    	fillRect(2, 10, 2, 4, gray);
    	drawHorizontalLine(3, 5, 14, gray);
    	putPixel(9, 14, gray);
    	drawHorizontalLine(3, 8, 15, gray);
    	drawHorizontalLine(4, 20, 16, gray);
    	drawHorizontalLine(6, 18, 17, gray);
    	drawHorizontalLine(7, 8, 18, gray);
    	drawVerticalLine(19, 20, 8, gray);
    	putPixel(10, 20, gray);
    	putPixel(12, 19, gray);
    	putPixel(14, 20, gray);
    	putPixel(12, 15, gray);
    	drawHorizontalLine(14, 16, 19, white);
    	putPixel(15, 19, gray);
    	drawVerticalLine(18, 19, 17, gray);
    	putPixel(15, 14, gray);
    	drawHorizontalLine(16, 21, 15, gray);
    	putPixel(19, 14, gray);
    	drawVerticalLine(8, 13, 22, gray);
    	
    	//Blanco
    	drawHorizontalLine(12, 17, 3, white);
    	drawHorizontalLine(10, 18, 4, white);
    	drawHorizontalLine(9, 19, 5, white);
    	drawHorizontalLine(8, 20, 6, white);
    	drawHorizontalLine(7, 20, 7, white);
    	drawHorizontalLine(10, 14, 8, white);
    	fillRect(11, 9, 3, 5, white);
    	drawHorizontalLine(10, 11, 14, white);
    	drawHorizontalLine(13, 14, 14, white);
    	drawHorizontalLine(9, 10, 15, white);
    	drawHorizontalLine(14, 15, 15, white);
    	drawHorizontalLine(8, 10, 16, white);
    	putPixel(12, 16, white);
    	drawHorizontalLine(14, 18, 16, white);
    	drawHorizontalLine(9, 17, 17, white);
    	drawHorizontalLine(10, 16, 18, white);
    	drawHorizontalLine(19, 21, 8, white);
    	drawHorizontalLine(20, 21, 9, white);
    	drawVerticalLine(10, 13, 21, white);
    	drawHorizontalLine(20, 21, 14, white);
    	drawHorizontalLine(19, 20, 15, white);
    	drawHorizontalLine(10, 11, 19, white);
    	
    	
    	/*
    	drawHorizontalLine(4, 14, 2, Color.black);
    	drawVerticalLine(3, 16, 3, Color.black);
    	fillRect(4, 3, 11, 14, gray);
    	putPixel(12, 6, Color.black);//*/
    	
        //drawSquareGrid(PIXEL_SIZE, Color.black);
        
        // Guardamos la imagen en formato JPG
        try {       
            ImageIO.write(image, "jpg", new File("C:\\Users\\aflor\\Downloads", "pixel_Craneo.jpg"));
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
