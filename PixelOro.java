import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class PixelOro {
	
	// Definimos el tamaÃ±o de la imagen en ancho y alto
	private static int width = 720;
    private static int height = 560;
    
    // Definimos el tamaÃƒÂ±o del pixel
    private static int PIXEL_SIZE = 40;
    private static Graphics2D g;
    
    // Definimos los colores a usar
    static Color white 			= Color.white;
    //static Color black		= Color.black;
    //static Color blue  		= Color.blue;
    //static Color red   		= Color.red;
    static Color black			= new Color(0,0,0);
    static Color darkYellow		= new Color(178,100,17);
    static Color darkBrown		= new Color(117,40,2);
    static Color yellowShade1	= new Color(220,150,19);
    static Color yellowShade2	= new Color(233,177,21);
    static Color yellowShade3	= new Color(250,214,74);
    static Color yellow			= new Color(253,245,95);
    static Color lightYellow	= new Color(255,253,224);
    static Color gray			= new Color(168,168,168);
    
    
    static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    
    public static void paint() {
    	//Fondo
    	drawBackground(PIXEL_SIZE, white);
    	
    	//Contorno
    	putPixel(14, 3, darkYellow);
    	putPixel(13, 2, darkYellow);
    	drawHorizontalLine(11, 12, 1, darkYellow);
    	drawHorizontalLine(8, 10, 2, darkYellow);
    	drawHorizontalLine(5, 7, 3, darkYellow);
    	drawHorizontalLine(2, 4, 4, darkYellow);
    	drawVerticalLine(5, 9, 1, darkYellow);
    	putPixel(2, 10, darkYellow);
    	putPixel(3, 11, darkYellow);
    	drawHorizontalLine(4, 5, 12, darkYellow);
    	drawHorizontalLine(6, 7, 12, darkBrown);
    	drawHorizontalLine(8, 10, 11, darkBrown);
    	drawHorizontalLine(11, 13, 10, darkBrown);
    	drawHorizontalLine(14, 15, 9, darkBrown);
    	drawVerticalLine(5, 8, 16, darkBrown);
    	putPixel(15, 4, darkBrown);
    	
    	//Relleno
    	drawHorizontalLine(11, 12, 2, yellowShade3);
    	drawHorizontalLine(8, 13, 3, yellow);
    	drawHorizontalLine(5, 14, 4, yellowShade3);
    	drawHorizontalLine(6, 13, 4, yellow);
    	drawHorizontalLine(2, 14, 5, lightYellow);
    	drawHorizontalLine(3, 12, 5, yellow);
    	putPixel(15, 5, yellow);
    	putPixel(11, 7, yellowShade2);
    	drawHorizontalLine(8, 13, 8, yellowShade2);
    	drawHorizontalLine(2, 11, 9, yellowShade2);
    	drawHorizontalLine(3, 10, 10, yellowShade2);
    	drawHorizontalLine(4, 7, 11, yellowShade2);
    	fillRect(14, 6, 2, 3, yellowShade3);
    	drawHorizontalLine(12, 13, 9, yellowShade3);
    	putPixel(14, 6, yellowShade1);
    	drawHorizontalLine(12, 14, 7, yellowShade1);
    	drawHorizontalLine(9, 12, 8, yellowShade1);
    	drawHorizontalLine(7, 11, 9, yellowShade1);
    	drawHorizontalLine(7, 9, 10, yellowShade1);
    	drawVerticalLine(6, 8, 2, yellowShade3);
    	drawVerticalLine(7, 9, 3, yellow);
    	drawVerticalLine(8, 10, 4, yellowShade3);
    	drawVerticalLine(9, 10, 5, yellow);
    	putPixel(5, 11, yellowShade3);
    	drawHorizontalLine(3, 12, 6, lightYellow);
    	drawHorizontalLine(4, 9, 6, yellow);
    	putPixel(13, 6, yellow);
    	drawHorizontalLine(4, 9, 7, lightYellow);
    	drawHorizontalLine(5, 6, 7, yellow);
    	putPixel(10, 7, yellow);
    	putPixel(5, 8, white);
    	putPixel(6, 8, lightYellow);
    	putPixel(7, 8, yellow);
    	
    	
    	    	
    	/*
    	drawHorizontalLine(4, 14, 2, Color.black);
    	drawVerticalLine(3, 16, 3, Color.black);
    	fillRect(4, 3, 11, 14, gray);
    	putPixel(12, 6, Color.black);//*/
    	
        //drawSquareGrid(PIXEL_SIZE, Color.black);
        
        // Guardamos la imagen en formato JPG
        try {       
            ImageIO.write(image, "jpg", new File("C:\\Users\\aflor\\Downloads", "pixel_Oro.jpg"));
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
