import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class PixelDiamante {
	
	// Definimos el tamaÃ±o de la imagen en ancho y alto
	private static int width = 560;
    private static int height = 600;
    
    // Definimos el tamaÃƒÂ±o del pixel
    private static int PIXEL_SIZE = 40;
    private static Graphics2D g;
    
    // Definimos los colores a usar
    static Color white 			= Color.white;
    //static Color black		= Color.black;
    //static Color blue  		= Color.blue;
    //static Color red   		= Color.red;
    static Color black			= new Color(0,0,0);
    static Color darkBlue17		= new Color(17,114,122);
    static Color lightBlue213	= new Color(213,255,246);
    static Color turquoise74	= new Color(74,237,217);
    static Color turquoise44	= new Color(44,224,216);
    static Color lightBlue161	= new Color(161,251,232);
    static Color darkBlue32		= new Color(32,197,181);
    static Color darkBlue26		= new Color(26,170,167);
    static Color darkBlue28		= new Color(28,145,154);
    static Color darkBlue20		= new Color(20,94,83);
    static Color diamondBlue	= new Color(139,208,245);
    
    
    static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    
    public static void paint() {
    	//Fondo
    	drawBackground(PIXEL_SIZE, white);
    	
    	//Contorno
    	putPixel(9, 2, darkBlue17);
    	drawHorizontalLine(5, 8, 1, darkBlue17);
    	putPixel(4, 2, darkBlue17);
    	putPixel(3, 3, darkBlue17);
    	drawVerticalLine(4, 5, 2, darkBlue17);
    	drawVerticalLine(6, 9, 1, darkBlue17);
    	drawVerticalLine(10, 11, 2, darkBlue20);
    	putPixel(3, 12, darkBlue20);
    	drawHorizontalLine(4, 9, 13, darkBlue20);
    	putPixel(10, 12, darkBlue20);
    	drawVerticalLine(10, 11, 11, darkBlue20);
    	drawVerticalLine(6, 9, 12, darkBlue20);
    	drawVerticalLine(4, 5, 11, darkBlue20);
    	putPixel(10, 3, darkBlue20);
    	
    	//Relleno
    	drawHorizontalLine(5, 7, 2, white);
    	drawVerticalLine(2, 5, 8, lightBlue213);
    	putPixel(4, 3, white);
    	drawHorizontalLine(5, 6, 3, turquoise74);
    	putPixel(7, 3, lightBlue161);
    	putPixel(9, 3, darkBlue32);
    	drawVerticalLine(4, 5, 3, white);
    	drawVerticalLine(4, 5, 4, turquoise74);
    	drawHorizontalLine(5, 8, 4, lightBlue161);
    	putPixel(7, 4, lightBlue213);
    	fillRect(9, 4, 2, 2, turquoise74);
    	putPixel(10, 4, darkBlue32);
    	drawHorizontalLine(5, 7, 5, white);
    	putPixel(6, 5, lightBlue213);
    	putPixel(8, 5, lightBlue213);
    	fillRect(2, 6, 3, 4, white);
    	drawVerticalLine(6, 7, 3, turquoise74);
    	fillRect(5, 6, 4, 3, turquoise74);
    	drawHorizontalLine(7, 8, 6, lightBlue161);
    	fillRect(9, 6, 3, 3, darkBlue26);
    	drawVerticalLine(6, 7, 10, darkBlue32);
    	putPixel(4, 7, lightBlue213);
    	drawHorizontalLine(6, 8, 7, lightBlue161);
    	drawVerticalLine(7, 8, 9, darkBlue28);
    	putPixel(4, 8, darkBlue32);
    	drawHorizontalLine(5, 7, 8, lightBlue161);
    	putPixel(3, 8, lightBlue161);
    	fillRect(3, 9, 2, 2, turquoise74);
    	drawHorizontalLine(5, 8, 9, darkBlue26);
    	fillRect(9, 9, 2, 2, darkBlue32);
    	putPixel(11, 9, darkBlue28);
    	drawVerticalLine(10, 11, 4, darkBlue26);
    	drawVerticalLine(10, 11, 9, darkBlue26);
    	fillRect(5, 10, 4, 2, darkBlue32);
    	putPixel(3, 11, turquoise44);
    	putPixel(10, 11, lightBlue161);
    	putPixel(4, 12, darkBlue28);
    	drawHorizontalLine(5, 6, 12, turquoise74);
    	drawHorizontalLine(7, 8, 12, lightBlue161);
    	putPixel(9, 12, darkBlue32);
    	
    	
    	    	
    	/*
    	drawHorizontalLine(4, 14, 2, Color.black);
    	drawVerticalLine(3, 16, 3, Color.black);
    	fillRect(4, 3, 11, 14, gray);
    	putPixel(12, 6, Color.black);//*/
    	
        //drawSquareGrid(PIXEL_SIZE, Color.black);
        
        // Guardamos la imagen en formato JPG
        try {       
            ImageIO.write(image, "jpg", new File("C:\\Users\\aflor\\Downloads", "pixel_Diamante.jpg"));
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
