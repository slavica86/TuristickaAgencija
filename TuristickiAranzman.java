package turistickaAgencija;

public class TuristickiAranzman {
	String naziv;
	int brDana;
	double cena;
	
	public TuristickiAranzman (String n, int b, double c)
	{
		naziv = n;
		brDana = b;
		if (c >= 0)
			cena = c;
	}
	
		public void setCena(double novaCena)
		{
			if (novaCena >= 0)
				cena = novaCena;
		}
		
		public double getCena()
		{
			return cena;
		}
		
		public String prikaz()
		{
			return naziv+" - "+brDana+" dana";
		}
		
		public boolean skupljiOd(TuristickiAranzman t)
		{
			return cena > t.cena;
		}
	}

	

