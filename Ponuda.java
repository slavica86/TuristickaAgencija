package turistickaAgencija;

public class Ponuda {

	public static void main(String[] args) {
		TuristickiAranzman t = new TuristickiAranzman ("Obilazak - Prag", 5, 8000);
		
		System.out.println("Aranzman: ");
		System.out.println(t.prikaz());
		System.out.println("Cena: ");
		System.out.println(t.getCena()+" din");
		
		t.setCena(7500);
		System.out.println("Cena: "+t.getCena()+" din");
		
		System.out.println("Cena: "+t.getCena()+" din");

	}

}
