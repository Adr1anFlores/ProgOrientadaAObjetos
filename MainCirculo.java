
public class MainCirculo {
	
	public static void main(String[] args) {
		Circulo circ = new Circulo();
		
		System.out.println("Radio: " +circ.rad);
		System.out.println("Circunferencia: " +circ.calcCircunf());
		System.out.println("Área: " +circ.calcAreaCirc());
		circ.cambRadio(528);
		
		System.out.println("Radio: " +circ.rad);
		System.out.println("Circunferencia: " +circ.calcCircunf());
		System.out.println("Área: " +circ.calcAreaCirc());

}
	
}