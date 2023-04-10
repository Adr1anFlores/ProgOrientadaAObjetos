import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class PixelRata {
	
	// Definimos el tamaÃ±o de la imagen en ancho y alto
	private static int width = 900;
    private static int height = 750;
    
    // Definimos el tamaÃƒÂ±o del pixel
    private static int PIXEL_SIZE = 30;
    private static Graphics2D g;
    
    // Definimos los colores a usar
    static Color white 			= Color.white;
    //static Color black		= Color.black;
    //static Color blue  		= Color.blue;
    //static Color red   		= Color.red;
    static Color black			= new Color(0,0,0);
    static Color brown			= new Color(148,131,113);
    static Color lightBrown		= new Color(208,196,184);
    static Color pink			= new Color(231,135,136);
    static Color lucyLila		= new Color(160,139,182);
    
    
    static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    
    public static void paint() {
    	//Fondo
    	drawBackground(PIXEL_SIZE, lucyLila);
    	
    	//Sombra
    	drawHorizontalLine(7, 10, 1, black);
    	drawHorizontalLine(6, 13, 2, black);
    	drawHorizontalLine(6, 14, 3, black);
    	drawHorizontalLine(5, 14, 4, black);
    	drawHorizontalLine(4, 14, 5, black);
    	drawHorizontalLine(1, 14, 6, black);
    	drawHorizontalLine(1, 13, 7, black);
    	drawHorizontalLine(1, 14, 8, black);
    	drawHorizontalLine(2, 15, 9, black);
    	drawHorizontalLine(3, 16, 10, black);
    	drawHorizontalLine(5, 17, 11, black);
    	drawHorizontalLine(6, 18, 12, black);
    	drawHorizontalLine(5, 18, 13, black);
    	drawHorizontalLine(5, 19, 14, black);
    	drawHorizontalLine(4, 19, 15, black);
    	fillRect(4, 16, 17, 2, black);
    	drawHorizontalLine(3, 20, 18, black);
    	drawHorizontalLine(2, 21, 19, black);
    	drawHorizontalLine(2, 27, 20, black);
    	drawHorizontalLine(3, 26, 21, black);
    	drawHorizontalLine(4, 19, 22, black);
    	drawHorizontalLine(21, 25, 22, black);
    	drawHorizontalLine(5, 18, 23, black);
    	drawHorizontalLine(25, 27, 19, black);
    	fillRect(26, 16, 3, 3, black);
    	fillRect(25, 14, 3, 2, black);
    	fillRect(24, 13, 3, 2, black);
    	fillRect(23, 12, 3, 2, black);
    	fillRect(22, 11, 2, 2, black);
    	fillRect(21, 10, 2, 2, black);
    	putPixel(21, 9, black);
    	
    	//brown
    	putPixel(22, 11, brown);
    	putPixel(23, 12, brown);
    	drawHorizontalLine(24, 25, 13, brown);
    	drawVerticalLine(14, 15, 26, brown);
    	drawVerticalLine(16, 18, 27, brown);
    	drawVerticalLine(19, 20, 26, brown);
    	drawHorizontalLine(21, 25, 21, brown);
    	fillRect(7, 2, 2, 2, brown);
    	putPixel(9, 2, brown);
    	fillRect(10, 3, 4, 4, brown);
    	drawHorizontalLine(5, 8, 5, brown);
    	drawHorizontalLine(4, 9, 6, brown);
    	drawHorizontalLine(2, 11, 7, brown);
    	drawHorizontalLine(2, 12, 8, brown);
    	drawHorizontalLine(5, 14, 9, brown);
    	drawHorizontalLine(7, 15, 10, brown);
    	drawHorizontalLine(8, 16, 11, brown);
    	fillRect(8, 12, 10, 2, brown);
    	fillRect(10, 14, 9, 2, brown);
    	fillRect(11, 16, 9, 2, brown);
    	drawHorizontalLine(14, 19, 18, brown);
    	drawHorizontalLine(15, 19, 19, brown);
    	drawHorizontalLine(16, 21, 20, brown);
    	drawHorizontalLine(17, 19, 21, brown);
    	drawHorizontalLine(17, 18, 22, brown);
    	
    	//lightBrown
    	drawHorizontalLine(3, 4, 9, lightBrown);
    	drawHorizontalLine(5, 6, 10, lightBrown);
    	putPixel(7, 12, lightBrown);
    	drawHorizontalLine(6, 8, 13, lightBrown);
    	drawHorizontalLine(6, 9, 14, lightBrown);
    	fillRect(5, 15, 6, 2, lightBrown);
    	drawHorizontalLine(5, 11, 17, lightBrown);
    	drawHorizontalLine(5, 10, 18, lightBrown);
    	fillRect(6, 19, 5, 2, lightBrown);
    	drawHorizontalLine(7, 11, 21, lightBrown);
    	drawHorizontalLine(8, 12, 22, lightBrown);
    	
    	//pink
    	fillRect(11, 4, 2, 2, pink);
    	putPixel(2, 7, pink);
    	fillRect(3, 19, 2, 2, pink);
    	drawHorizontalLine(4, 5, 21, pink);
    	drawHorizontalLine(5, 6, 22, pink);
    	fillRect(12, 19, 2, 2, pink);
    	fillRect(13, 20, 2, 2, pink);
    	fillRect(14, 21, 2, 2, pink);
    	
    	//black
    	fillRect(6, 6, 2, 2, black);
    	
    	
    	/*
    	drawHorizontalLine(4, 14, 2, Color.black);
    	drawVerticalLine(3, 16, 3, Color.black);
    	fillRect(4, 3, 11, 14, gray);
    	putPixel(12, 6, Color.black);//*/
    	
        //drawSquareGrid(PIXEL_SIZE, Color.black);
        
        // Guardamos la imagen en formato JPG
        try {       
            ImageIO.write(image, "jpg", new File("C:\\Users\\aflor\\Downloads", "pixel_Rata.jpg"));
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
