import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class PixelYoda {
	
	// Definimos el tamaÃ±o de la imagen en ancho y alto
	private static int width = 1155;
    private static int height = 1225;
    
    // Definimos el tamaÃƒÂ±o del pixel
    private static int PIXEL_SIZE = 35;
    private static Graphics2D g;
    
    // Definimos los colores a usar
    static Color white 			= Color.white;
    //static Color black		= Color.black;
    //static Color blue  		= Color.blue;
    //static Color red   		= Color.red;
    static Color black			= new Color(0,0,0);
    static Color darkGreen		= new Color(76,115,0);
    static Color paleGreen		= new Color(138,166,0);
    static Color lightGreen		= new Color(191,218,54);
    static Color gray			= new Color(153,153,153);
    static Color brown			= new Color(128,100,32);
    static Color paleBrown		= new Color(190,172,123);
    static Color darkCream		= new Color(224,211,186);
    static Color cream			= new Color(245,238,217);
    static Color darkRed		= new Color(134,67,37);
    static Color red			= new Color(191,82,48);
    static Color wine			= new Color(89,43,22);
    static Color jediBlue		= new Color(120,186,211);
    
    
    static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    
    public static void paint() {
    	//Fondo
    	drawBackground(PIXEL_SIZE, jediBlue);
    	
    	//Sombra
    	drawHorizontalLine(13, 18, 1, darkGreen);
    	drawHorizontalLine(11, 20, 2, darkGreen);
    	drawHorizontalLine(10, 21, 3, darkGreen);
    	drawHorizontalLine(9, 22, 4, darkGreen);
    	drawHorizontalLine(30, 31, 4, darkGreen);
    	drawHorizontalLine(1, 4, 5, darkGreen);
    	drawHorizontalLine(8, 25, 5, darkGreen);
    	drawHorizontalLine(27, 31, 5, darkGreen);
    	drawHorizontalLine(1, 31, 6, darkGreen);
    	drawHorizontalLine(2, 30, 7, darkGreen);
    	drawHorizontalLine(3, 29, 8, darkGreen);
    	drawHorizontalLine(4, 28, 9, darkGreen);
    	drawHorizontalLine(5, 27, 10, darkGreen);
    	drawHorizontalLine(5, 25, 11, darkGreen);
    	fillRect(5, 12, 20, 2, darkGreen);
    	drawHorizontalLine(6, 23, 14, darkGreen);
    	drawHorizontalLine(7, 22, 15, darkGreen);
    	drawHorizontalLine(7, 24, 16, brown);
    	fillRect(7, 17, 19, 2, brown);
    	fillRect(6, 19, 21, 3, brown);
    	drawHorizontalLine(6, 27, 22, brown);
    	fillRect(5, 23, 23, 6, brown);
    	fillRect(6, 29, 22, 4, brown);
    	drawHorizontalLine(7, 26, 33, brown);
    	
    	//Oreja Izquierda
    	drawHorizontalLine(2, 4, 6, lightGreen);
    	drawHorizontalLine(3, 5, 7, lightGreen);
    	putPixel(4, 8, lightGreen);
    	
    	//Cabeza
    	drawHorizontalLine(13, 18, 2, lightGreen);
    	putPixel(17, 2, paleGreen);
    	drawHorizontalLine(11, 19, 3, lightGreen);
    	putPixel(12, 3, paleGreen);
    	putPixel(16, 3, paleGreen);
    	putPixel(20, 3, paleGreen);
    	drawHorizontalLine(10, 20, 4, paleGreen);
    	putPixel(21, 4, lightGreen);
    	drawHorizontalLine(9, 21, 5, lightGreen);
    	putPixel(11, 5, paleGreen);
    	putPixel(15, 5, paleGreen);
    	putPixel(18, 5, paleGreen);
    	drawHorizontalLine(11, 14, 6, lightGreen);
    	putPixel(20, 6, lightGreen);
    	
    	//Oreja Derecha
    	putPixel(30, 5, lightGreen);
    	drawHorizontalLine(27, 30, 6, lightGreen);
    	drawHorizontalLine(23, 26, 7, lightGreen);
    	putPixel(29, 7, lightGreen);
    	putPixel(28, 8, lightGreen);
    	drawHorizontalLine(26, 27, 9, lightGreen);
    	
    	//Cabello
    	drawVerticalLine(4, 5, 7, gray);
    	putPixel(25, 3, gray);
    	drawHorizontalLine(23, 24, 4, gray);
    	drawHorizontalLine(22, 25, 5, gray);
    	drawHorizontalLine(23, 24, 5, white);
    	drawVerticalLine(6, 7, 21, gray);
    	putPixel(22, 6, white);
    	drawVerticalLine(12, 15, 26, gray);
    	drawHorizontalLine(24, 25, 14, gray);
    	drawVerticalLine(12, 13, 25, white);
    	
    	//Cara
    	drawHorizontalLine(7, 10, 7, lightGreen);
    	drawHorizontalLine(15, 20, 7, lightGreen);
    	drawHorizontalLine(10, 14, 8, lightGreen);
    	drawHorizontalLine(20, 22, 8, lightGreen);
    	drawHorizontalLine(21, 22, 9, lightGreen);
    	fillRect(11, 9, 3, 2, lightGreen);
    	drawHorizontalLine(21, 25, 10, lightGreen);
    	drawVerticalLine(9, 10, 6, white);
    	putPixel(10, 10, white);
    	fillRect(7, 9, 3, 2, black);
    	putPixel(18, 9, white);
    	drawHorizontalLine(14, 19, 10, white);
    	fillRect(15, 9, 3, 2, black);
    	putPixel(20, 10, paleGreen);
    	drawHorizontalLine(6, 19, 11, paleGreen);
    	drawHorizontalLine(11, 13, 11, lightGreen);
    	drawHorizontalLine(20, 23, 11, lightGreen);
    	drawHorizontalLine(6, 9, 12, lightGreen);
    	putPixel(10, 12, paleGreen);
    	drawHorizontalLine(13, 21, 12, lightGreen);
    	putPixel(15, 12, paleGreen);
    	drawHorizontalLine(6, 20, 13, lightGreen);
    	putPixel(9, 13, paleGreen);
    	putPixel(16, 13, paleGreen);
    	drawHorizontalLine(21, 23, 13, paleGreen);
    	drawHorizontalLine(7, 22, 14, paleGreen);
    	drawHorizontalLine(9, 16, 14, lightGreen);
    	drawHorizontalLine(10, 14, 14, black);
    	drawHorizontalLine(8, 21, 15, paleGreen);
    	drawHorizontalLine(10, 15, 15, lightGreen);
    	drawHorizontalLine(8, 21, 16, darkGreen);
    	drawHorizontalLine(9, 20, 16, paleGreen);
    	drawHorizontalLine(9, 10, 17, darkGreen);
    	drawHorizontalLine(11, 19, 17, paleGreen);
    	
    	//Bata
    	putPixel(23, 15, brown);
    	drawHorizontalLine(22, 23, 16, cream);
    	putPixel(8, 17, cream);
    	drawHorizontalLine(20, 24, 17, cream);
    	drawHorizontalLine(8, 24, 18, cream);
    	drawHorizontalLine(11, 17, 18, darkRed);
    	drawHorizontalLine(7, 20, 19, cream);
    	drawHorizontalLine(8, 9, 19, darkCream);
    	drawHorizontalLine(12, 16, 19, darkRed);
    	fillRect(22, 19, 4, 3, cream);
    	drawVerticalLine(20, 21, 7, cream);
    	drawHorizontalLine(9, 20, 20, darkCream);
    	putPixel(15, 20, darkRed);
    	putPixel(19, 20, cream);
    	drawHorizontalLine(18, 20, 21, darkCream);
    	drawHorizontalLine(7, 8, 22, cream);
    	drawHorizontalLine(16, 17, 22, cream);
    	drawHorizontalLine(21, 24, 22, cream);
    	fillRect(25, 22, 2, 2, darkCream);
    	fillRect(6, 23, 3, 5, cream);
    	drawHorizontalLine(16, 24, 23, cream);
    	drawHorizontalLine(15, 23, 24, cream);
    	drawVerticalLine(23, 24, 22, darkCream);
    	putPixel(17, 24, darkCream);
    	drawHorizontalLine(24, 26, 24, darkCream);
    	drawHorizontalLine(15, 21, 25, cream);
    	drawHorizontalLine(17, 19, 25, darkCream);
    	drawHorizontalLine(22, 26, 25, darkCream);
    	drawHorizontalLine(15, 25, 26, darkCream);
    	drawHorizontalLine(15, 24, 27, darkCream);
    	drawHorizontalLine(16, 22, 28, darkCream);
    	drawHorizontalLine(16, 20, 29, darkCream);
    	drawHorizontalLine(16, 17, 30, darkCream);
    	drawVerticalLine(27, 28, 6, darkCream);
    	drawVerticalLine(28, 32, 7, darkCream);
    	fillRect(8, 28, 2, 3, cream);
    	putPixel(8, 31, darkCream);
    	drawHorizontalLine(9, 10, 30, darkCream);
    	drawVerticalLine(27, 32, 26, darkCream);
    	drawVerticalLine(28, 31, 25, darkCream);
    	drawHorizontalLine(23, 24, 29, darkCream);
    	drawHorizontalLine(21, 24, 30, darkCream);
    	putPixel(18, 31, cream);
    	drawHorizontalLine(16, 17, 32, cream);
    	drawVerticalLine(26, 27, 10, paleBrown);
    	drawVerticalLine(27, 29, 11, paleBrown);
    	drawVerticalLine(28, 30, 12, paleBrown);
    	fillRect(12, 25, 2, 3, red);
    	drawVerticalLine(28, 31, 14, red);
    	putPixel(11, 26, wine);
    	putPixel(12, 27, wine);
    	drawVerticalLine(28, 31, 13, wine);
    	fillRect(14, 32, 2, 2, wine);
    	
    	//Patas
    	drawHorizontalLine(11, 14, 20, darkGreen);
    	fillRect(9, 21, 7, 3, darkGreen);
    	drawHorizontalLine(9, 13, 24, darkGreen);
    	drawHorizontalLine(10, 11, 25, darkGreen);
    	fillRect(11, 21, 4, 2, lightGreen);
    	putPixel(12, 22, darkGreen);
    	putPixel(10, 22, white);
    	putPixel(13, 23, white);
    	drawHorizontalLine(10, 11, 24, paleGreen);
    	fillRect(8, 32, 6, 2, darkGreen);
    	drawHorizontalLine(9, 10, 31, darkGreen);
    	putPixel(9, 32, lightGreen);
    	putPixel(11, 32, lightGreen);
    	fillRect(18, 32, 8, 2, darkGreen);
    	drawHorizontalLine(19, 24, 31, darkGreen);
    	putPixel(19, 32, lightGreen);
    	drawHorizontalLine(21, 22, 32, lightGreen);
    	putPixel(24, 32, lightGreen);
    	
    	
    	
    	/*
    	drawHorizontalLine(4, 14, 2, Color.black);
    	drawVerticalLine(3, 16, 3, Color.black);
    	fillRect(4, 3, 11, 14, gray);
    	putPixel(12, 6, Color.black);//*/
    	
        //drawSquareGrid(PIXEL_SIZE, Color.black);
        
        // Guardamos la imagen en formato JPG
        try {       
            ImageIO.write(image, "jpg", new File("C:\\Users\\aflor\\Downloads", "pixel_Yoda.jpg"));
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
