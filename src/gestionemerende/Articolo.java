package gestionemerende;

public class Articolo {
	private String ID;
	private String descrizione;
	private double costoUnitario;
	private double apportoCalorico;

	public Articolo(String iD, String descrizione, double costoUnitario,
			double apportoCalorico) {
		if(iD!=null)
			ID = iD;
		else
			throw new IllegalArgumentException("L'Id non può essere null");
		if(descrizione!=null)
			this.descrizione = descrizione;
		else
			throw new IllegalArgumentException("La descrizione non può essere null");
		if(costoUnitario>0)
			this.costoUnitario = costoUnitario;
		else
			throw new IllegalArgumentException("Deve essere positivo");
		if(apportoCalorico>0)
			this.apportoCalorico = apportoCalorico;
		else
			throw new IllegalArgumentException("Deve essere positivo");
	}

	public String getID() {
		return ID;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public double getCostoUnitario() {
		return costoUnitario;
	}

	public double getApportoCalorico() {
		return apportoCalorico;
	}
	
}
