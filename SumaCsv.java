import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class SumaCsv {
	
	File fileCsv, fileTxt;
	HashMap<String, Integer> archivoCsv;
	Map<String, Integer> sumaPalabras;
	
	public SumaCsv() {
		this.fileCsv = new File("C:\\Users\\aflor\\Downloads", "emails.csv");
		this.fileTxt = new File("C:\\Users\\aflor\\Downloads", "175992.txt");
		this.archivoCsv = new HashMap<>();
		this.sumaPalabras = new HashMap<>();
	}
	
	BufferedReader lector = null;
    String linea = "";
    String separador = ",";
    
    public void read(int ID) {
    	try {
    		int numFila = 50;
    		int rowNumb = 0;
            lector = new BufferedReader(new FileReader(fileCsv));
            String[] words = new String[3002];
            
            while ((linea = lector.readLine()) != null && rowNumb == 0) {
            	String[] columna = linea.split(separador);
            	for (int i = 1; i < columna.length -1; i++) {
            		words[i] = columna[i];
            		System.out.println(words[i]);
            	}
            	rowNumb++;
            }
            
            while ((linea = lector.readLine()) != null && rowNumb < ID + numFila) {
                if (rowNumb >= ID) {
                    String[] columna = linea.split(separador);
                    for (int i = 1; i < columna.length - 1; i++) {
                        String word = words[i];
                        int count = Integer.parseInt(columna [i]);
                        sumaPalabras.put(word, sumaPalabras.getOrDefault(word, 0) + count);
                    }
                    
                }
                rowNumb++;
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        } 
        finally {
            if (lector != null) {
                try {
                    lector.close();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
	public void write(int ID) {
		try {
            FileWriter writer = new FileWriter("C:\\Users\\aflor\\Downloads\\"+ID+".txt");
            for (String word : sumaPalabras.keySet()) {
                String outputLine = word + ", " + sumaPalabras.get(word) + "\n";
                writer.write(outputLine);
            }
            writer.flush();
            writer.close();
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
	}
}