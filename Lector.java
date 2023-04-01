
public class Lector {
	
	SumaCsv execute;
	
	public Lector() {
		this.execute = new SumaCsv();
	}
	
	public void ejecutar(int id) {
		int ID = Integer.parseInt(String.valueOf(id).substring(String.valueOf(id).length() -3, String.valueOf(id).length()));
		System.out.println(id +"," +ID);
		execute.read(ID);
		execute.write(id);
	}
	
	public void ejecutar(String id) {
		int IDW = Integer.parseInt(id);
		int ID = Integer.parseInt(id.substring(id.length() -3, id.length()));
		System.out.println(id +"," +ID);
		execute.read(ID);
		execute.write(IDW);
	}

}
