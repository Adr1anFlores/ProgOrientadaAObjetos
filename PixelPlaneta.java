import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class PixelPlaneta {
	
	// Definimos el tamaÃ±o de la imagen en ancho y alto
	private static int width = 2401;
    private static int height = 2401;
    
    // Definimos el tamaÃƒÂ±o del pixel
    private static int PIXEL_SIZE = 49;
    private static Graphics2D g;
    
    // Definimos los colores a usar
    static Color white 			= Color.white;
    //static Color black		= Color.black;
    //static Color blue  		= Color.blue;
    //static Color red   		= Color.red;
    static Color black			= new Color(0,0,0);
    static Color blue			= new Color(50,163,221);
    static Color green			= new Color(167,205,60);
    static Color spacePurple	= new Color(40,40,70);
    
    
    static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    
    public static void paint() {
    	//Fondo
    	drawBackground(PIXEL_SIZE, spacePurple);
    	
    	//Sombra
    	drawHorizontalLine(20, 28, 1, black);
    	drawHorizontalLine(16, 32, 2, black);
    	drawHorizontalLine(14, 34, 3, black);
    	drawHorizontalLine(12, 36, 4, black);
    	drawHorizontalLine(11, 37, 5, black);
    	drawHorizontalLine(10, 38, 6, black);
    	drawHorizontalLine(8, 40, 7, black);
    	fillRect(7, 8, 35, 2, black);
    	drawHorizontalLine(6, 42, 10, black);
    	drawHorizontalLine(5, 43, 11, black);
    	fillRect(4, 12, 41, 2, black);
    	fillRect(3, 14, 43, 2, black);
    	fillRect(2, 16, 45, 4, black);
    	fillRect(1, 20, 47, 9, black);
    	fillRect(2, 29, 45, 4, black);
    	fillRect(3, 33, 43, 2, black);
    	fillRect(4, 35, 41, 2, black);
    	drawHorizontalLine(5, 43, 37, black);
    	drawHorizontalLine(6, 42, 38, black);
    	fillRect(7, 39, 35, 2, black);
    	drawHorizontalLine(8, 40, 41, black);
    	drawHorizontalLine(10, 38, 42, black);
    	drawHorizontalLine(11, 37, 43, black);
    	drawHorizontalLine(12, 36, 44, black);
    	drawHorizontalLine(14, 34, 45, black);
    	drawHorizontalLine(16, 32, 46, black);
    	drawHorizontalLine(20, 28, 47, black);
    	
    	//Agua
    	drawHorizontalLine(20, 28, 2, blue);
    	drawHorizontalLine(16, 32, 3, blue);
    	drawHorizontalLine(14, 34, 4, blue);
    	drawHorizontalLine(12, 36, 5, blue);
    	drawHorizontalLine(11, 37, 6, blue);
    	drawHorizontalLine(10, 38, 7, blue);
    	fillRect(8, 8, 33, 2, blue);
    	drawHorizontalLine(7, 41, 10, blue);
    	drawHorizontalLine(6, 42, 11, blue);
    	fillRect(5, 12, 39, 2, blue);
    	fillRect(4, 14, 41, 2, blue);
    	fillRect(3, 16, 43, 4, blue);
    	fillRect(2, 20, 45, 9, blue);
    	fillRect(3, 29, 43, 4, blue);
    	fillRect(4, 33, 41, 2, blue);
    	fillRect(5, 35, 39, 2, blue);
    	drawHorizontalLine(6, 42, 37, blue);
    	drawHorizontalLine(7, 41, 38, blue);
    	fillRect(8, 39, 33, 2, blue);
    	drawHorizontalLine(10, 38, 41, blue);
    	drawHorizontalLine(11, 37, 42, blue);
    	drawHorizontalLine(12, 36, 43, blue);
    	drawHorizontalLine(14, 34, 44, blue);
    	drawHorizontalLine(16, 32, 45, blue);
    	drawHorizontalLine(20, 28, 46, blue);
    	
    	//América
    	fillRect(16, 3, 5, 2, green);
    	putPixel(10, 7, green);
    	drawHorizontalLine(12, 14, 7, green);
    	fillRect(8, 8, 5, 2, green);
    	drawHorizontalLine(7, 15, 10, green);
    	drawHorizontalLine(6, 15, 11, green);
    	fillRect(5, 12, 11, 2, green);
    	drawHorizontalLine(4, 13, 14, green);
    	drawHorizontalLine(4, 10, 15, green);
    	fillRect(3, 16, 8, 2, green);
    	fillRect(3, 18, 7, 2, green);
    	fillRect(2, 20, 3, 4, green);
    	drawHorizontalLine(7, 9, 20, green);
    	putPixel(7, 23, green);
    	drawHorizontalLine(2, 7, 24, green);
    	drawHorizontalLine(4, 6, 25, green);
    	drawHorizontalLine(4, 5, 26, green);
    	drawHorizontalLine(5, 7, 27, green);
    	drawHorizontalLine(6, 7, 28, green);
    	drawHorizontalLine(7, 8, 29, green);
    	drawHorizontalLine(11, 12, 29, green);
    	drawHorizontalLine(7, 12, 30, green);
    	drawHorizontalLine(8, 15, 31, green);
    	drawHorizontalLine(9, 16, 32, green);
    	drawHorizontalLine(8, 17, 33, green);
    	fillRect(7, 34, 12, 2, green);
    	fillRect(8, 36, 10, 2, green);
    	fillRect(9, 38, 9, 2, green);
    	drawHorizontalLine(9, 15, 40, green);
    	drawHorizontalLine(10, 15, 41, green);
    	drawHorizontalLine(11, 14, 42, green);
    	drawHorizontalLine(12, 14, 43, green);
    	putPixel(14, 44, green);
    	
    	//EuropaAsiaÁfrica
    	drawHorizontalLine(30, 32, 3, green);
    	drawHorizontalLine(30, 33, 4, green);
    	drawHorizontalLine(31, 32, 5, green);
    	drawVerticalLine(9, 10, 25, green);
    	fillRect(27, 8, 2, 3, green);
    	putPixel(29, 8, green);
    	drawHorizontalLine(36, 37, 6, green);
    	drawHorizontalLine(36, 38, 7, green);
    	drawHorizontalLine(32, 40, 8, green);
    	drawHorizontalLine(31, 40, 9, green);
    	drawHorizontalLine(30, 41, 10, green);
    	drawHorizontalLine(30, 42, 11, green);
    	drawHorizontalLine(29, 43, 12, green);
    	drawHorizontalLine(30, 43, 13, green);
    	drawHorizontalLine(29, 44, 14, green);
    	fillRect(27, 15, 6, 2, green);
    	drawHorizontalLine(34, 44, 15, green);
    	putPixel(35, 16, green);
    	putPixel(38, 16, green);
    	drawHorizontalLine(41, 45, 16, green);
    	drawHorizontalLine(27, 31, 17, green);
    	drawHorizontalLine(34, 35, 17, green);
    	drawHorizontalLine(39, 45, 17, green);
    	drawHorizontalLine(28, 31, 18, green);
    	drawHorizontalLine(41, 43, 18, green);
    	drawHorizontalLine(28, 30, 19, green);
    	drawHorizontalLine(34, 38, 19, green);
    	drawHorizontalLine(41, 45, 19, green);
    	drawHorizontalLine(31, 46, 20, green);
    	drawHorizontalLine(31, 41, 21, green);
    	drawHorizontalLine(43, 46, 21, green);
    	drawHorizontalLine(30, 41, 22, green);
    	drawHorizontalLine(44, 46, 22, green);
    	drawHorizontalLine(30, 42, 23, green);
    	drawHorizontalLine(45, 46, 23, green);
    	drawHorizontalLine(31, 43, 24, green);
    	putPixel(46, 24, green);
    	fillRect(31, 25, 15, 2, green);
    	drawHorizontalLine(35, 44, 27, green);
    	drawHorizontalLine(36, 44, 28, green);
    	fillRect(37, 29, 7, 2, green);
    	fillRect(37, 31, 6, 3, green);
    	drawHorizontalLine(37, 41, 34, green);
    	fillRect(38, 35, 3, 2, green);
    	drawHorizontalLine(39, 40, 37, green);
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	/*
    	drawHorizontalLine(4, 14, 2, Color.black);
    	drawVerticalLine(3, 16, 3, Color.black);
    	fillRect(4, 3, 11, 14, gray);
    	putPixel(12, 6, Color.black);//*/
    	
        //drawSquareGrid(PIXEL_SIZE, Color.black);
        
        // Guardamos la imagen en formato JPG
        try {       
            ImageIO.write(image, "jpg", new File("C:\\Users\\aflor\\Downloads", "pixel_Planeta.jpg"));
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
