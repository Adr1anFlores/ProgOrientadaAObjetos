import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class PixelDory {
	
	// Definimos el tamaÃ±o de la imagen en ancho y alto
	private static int width = 961;
    private static int height = 806;
    
    // Definimos el tamaÃƒÂ±o del pixel
    private static int PIXEL_SIZE = 31;
    private static Graphics2D g;
    
    // Definimos los colores a usar
    static Color white 			= Color.white;
    //static Color black		= Color.black;
    //static Color blue  		= Color.blue;
    //static Color red   		= Color.red;
    static Color black			= new Color(0,0,0);
    static Color blue			= new Color(0,87,167);
    static Color lightBlue		= new Color(134,191,234);
    static Color orange			= new Color(255,146,27);
    static Color yellow			= new Color(236,242,10);
    static Color oceanBlue		= new Color(0,168,165);
    
    
    static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    
    public static void paint() {
    	//Fondo
    	drawBackground(PIXEL_SIZE, oceanBlue);
    	
    	//Sombra
    	drawHorizontalLine(14, 18, 1, blue);
    	drawHorizontalLine(13, 19, 2, blue);
    	drawHorizontalLine(21, 22, 2, lightBlue);
    	drawHorizontalLine(12, 23, 3, blue);
    	drawHorizontalLine(12, 22, 4, blue);
    	fillRect(11, 5, 14, 3, blue);
    	putPixel(29, 5, blue);
    	fillRect(28, 6, 2, 2, blue);
    	drawHorizontalLine(10, 25, 8, blue);
    	drawHorizontalLine(27, 29, 8, yellow);
    	drawHorizontalLine(9, 28, 9, blue);
    	drawHorizontalLine(8, 28, 10, blue);
    	putPixel(1, 9, black);
    	drawHorizontalLine(1, 3, 10, black);
    	drawHorizontalLine(1, 6, 11, black);
    	drawHorizontalLine(10, 27, 11, black);
    	drawHorizontalLine(1, 26, 12, black);
    	drawHorizontalLine(1, 23, 13, black);
    	drawHorizontalLine(1, 25, 14, black);
    	drawHorizontalLine(1, 26, 15, black);
    	drawHorizontalLine(2, 26, 16, black);
    	drawHorizontalLine(2, 6, 17, black);
    	drawHorizontalLine(3, 4, 18, black);
    	drawHorizontalLine(11, 26, 17, blue);
    	drawHorizontalLine(12, 26, 18, blue);
    	drawHorizontalLine(13, 26, 19, blue);
    	drawHorizontalLine(13, 25, 20, blue);
    	drawHorizontalLine(12, 24, 21, blue);
    	drawHorizontalLine(12, 15, 22, lightBlue);
    	drawHorizontalLine(11, 14, 23, yellow);
    	drawHorizontalLine(10, 13, 24, yellow);
    	drawHorizontalLine(17, 23, 22, blue);
    	drawHorizontalLine(19, 22, 23, blue);
    	
    	//Cola
    	drawVerticalLine(10, 15, 1, yellow);
    	fillRect(2, 11, 2, 7, yellow);
    	fillRect(4, 12, 2, 5, yellow);
    	fillRect(6, 13, 3, 3, yellow);
    	drawHorizontalLine(7, 9, 13, orange);
    	drawHorizontalLine(9, 11, 14, orange);
    	drawHorizontalLine(8, 9, 15, orange);
    	fillRect(14, 12, 2, 3, blue);
    	putPixel(13, 13, blue);
    	drawHorizontalLine(11, 15, 10, black);
    	drawHorizontalLine(11, 14, 9, black);
    	fillRect(12, 7, 2, 2, black);
    	putPixel(13, 6, black);
    	drawVerticalLine(1, 4, 17, lightBlue);
    	drawVerticalLine(1, 3, 18, lightBlue);
    	drawVerticalLine(2, 4, 19, lightBlue);
    	drawHorizontalLine(13, 14, 5, black);
    	drawHorizontalLine(13, 16, 4, black);
    	drawHorizontalLine(14, 17, 3, black);
    	drawHorizontalLine(15, 18, 2, black);
    	
    	//Cara
    	fillRect(18, 6, 4, 2, white);
    	fillRect(19, 5, 2, 4, white);
    	fillRect(19, 6, 2, 2, black);
    	fillRect(23, 5, 2, 2, black);
    	drawHorizontalLine(23, 24, 4, white);
    	drawVerticalLine(5, 6, 25, white);
    	fillRect(20, 3, 2, 2, lightBlue);
    	drawHorizontalLine(21, 22, 5, lightBlue);
    	drawHorizontalLine(22, 23, 6, lightBlue);
    	drawHorizontalLine(23, 24, 7, lightBlue);
    	drawHorizontalLine(24, 25, 8, lightBlue);
    	drawHorizontalLine(25, 26, 9, lightBlue);
    	drawVerticalLine(10, 11, 26, lightBlue);
    	putPixel(27, 8, blue);
    	drawVerticalLine(6, 7, 29, yellow);
    	fillRect(27, 9, 2, 2, yellow);
    	putPixel(27, 11, yellow);
    	fillRect(17, 11, 3, 2, blue);
    	fillRect(18, 13, 3, 2, blue);
    	drawHorizontalLine(21, 25, 11, blue);
    	drawHorizontalLine(22, 26, 12, blue);
    	drawHorizontalLine(17, 21, 15, blue);
    	drawHorizontalLine(11, 23, 16, blue);
    	putPixel(21, 14, lightBlue);
    	drawHorizontalLine(22, 23, 15, lightBlue);
    	putPixel(26, 15, lightBlue);
    	drawHorizontalLine(24, 26, 16, lightBlue);
    	
    	//Aleta de abajo
    	drawVerticalLine(20, 21, 13, yellow);
    	drawVerticalLine(21, 22, 12, yellow);
    	drawVerticalLine(19, 21, 14, black);
    	drawVerticalLine(22, 23, 13, black);
    	putPixel(12, 24, black);
    	putPixel(13, 24, lightBlue);
    	drawVerticalLine(22, 23, 14, lightBlue);
    	drawVerticalLine(19, 22, 15, lightBlue);
    	drawVerticalLine(19, 21, 16, lightBlue);
    	putPixel(17, 19, lightBlue);
    	
    	    	
    	/*
    	drawHorizontalLine(4, 14, 2, Color.black);
    	drawVerticalLine(3, 16, 3, Color.black);
    	fillRect(4, 3, 11, 14, gray);
    	putPixel(12, 6, Color.black);//*/
    	
        //drawSquareGrid(PIXEL_SIZE, Color.black);
        
        // Guardamos la imagen en formato JPG
        try {       
            ImageIO.write(image, "jpg", new File("C:\\Users\\aflor\\Downloads", "pixel_Dory.jpg"));
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
