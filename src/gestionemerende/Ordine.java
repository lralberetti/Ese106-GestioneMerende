package gestionemerende;
import java.util.*;

public class Ordine {
	private String nome;
	private Vector<Articolo> articoli;
	private Classe classe;
	
	public Ordine(String nome){
		if(nome!=null)		
			this.nome=nome;
		else
			throw new IllegalArgumentException ("Il nome non può essere null");
		articoli= new Vector<Articolo>();
	}
	
	public String getNome(){
		return nome;
	}
	
	public Classe getClasse(){
		return classe;
	}
	
	public Vector<Articolo> getArticoli(){
		return articoli;
	}
	
	public double getCostoTotale(){
		double CostoTotale=0;
		/**
		 * for(Articolo a: Articoli){
		 * 	CostoTotale += a.getCostoUnitario();
		 * }
		 */
		for(int i=0;i<articoli.size();i++){																			
			CostoTotale+= articoli.get(i).getCostoUnitario();
		}
		return CostoTotale;
	}
	
	@Override
	public String toString() {
		return "Ordine [nome=" + nome + ", articoli=" + articoli + "]";
	}
	
}
