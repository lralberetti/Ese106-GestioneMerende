package gestionemerende;

public class Panino extends Articolo{
	private boolean vegetariano;
	private boolean carneSuina;
	
	public Panino(String iD, String descrizione, double costoUnitario,
			double apportoCalorico, boolean vegetariano, boolean carneSuina) {
		super(iD, descrizione, costoUnitario, apportoCalorico);
		if(!vegetariano && !carneSuina) {
			this.vegetariano = vegetariano;
			this.carneSuina = carneSuina;
		}
		else
			throw new IllegalArgumentException("You are confused...");
	}
	
	public boolean isVegetariano(){
		return vegetariano;
	}
	
	public boolean isCarneSuina(){
		return carneSuina;
	}

	@Override
	public String toString() {
		return "Panino [vegetariano=" + vegetariano + ", carneSuina="
				+ carneSuina + "]";
	}
}
