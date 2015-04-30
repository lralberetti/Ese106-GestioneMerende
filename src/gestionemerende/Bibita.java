package gestionemerende;

public class Bibita extends Articolo{
	private double quantita;

	public Bibita(String iD, String descrizione, double costoUnitario,
			double apportoCalorico, double quantita) {
		super(iD, descrizione, costoUnitario, apportoCalorico);
		if(quantita>0)
			this.quantita = quantita;
		else
			throw new IllegalArgumentException ("la quantita deve essere positiva");
	}

}
