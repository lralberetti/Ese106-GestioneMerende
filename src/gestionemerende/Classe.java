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
	
	public void addOrdine(Ordine o){
		for(Ordine p : this.ordini){
			if(p.getNome() == o.getNome())
			{
				throw new IllegalArgumentException("Ordine 4ainf-20150430 already present");
			}
		}
		o.setClasse(this);
		this.ordini.addElement(o);
	}
	
	@Override
	public String toString() {
		return "Classe [nome=" + nome + ", ordini=" + ordini + "]";
	}
	
	
}