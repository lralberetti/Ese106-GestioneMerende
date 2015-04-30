package gestionemerende;
import java.util.*;

public class Classe {
	private String nome;
	private Vector<Ordine> ordini;


	public Classe(String nome){
		if(nome!=null)		
			this.nome=nome;
		else
			throw new IllegalArgumentException ("Il nome non può essere null");
		ordini=new Vector<Ordine>();
	}
	
	public String getNome(){
		return nome;
	}
	
	
	public Vector<Ordine> getOrdini() {
		return ordini;
	}

	@Override
	public String toString() {
		return "Classe [nome=" + nome + ", ordini=" + ordini + "]";
	}
	
	
}