package gestionemerende;
import java.util.*;

public class Istituto {
	private String nome;
	private Vector<Classe>classi;
	
	public Istituto(String nome) {
		if(nome!=null)
			this.nome = nome;
		else
			throw new IllegalArgumentException("Il nome non pu� essere null");
		classi = new Vector<Classe>();
	}

	public String getNome() {
		return nome;
	}
	
	public Vector<Classe> getClassi() {
		return classi;
	}

	@Override
	public String toString() {
		return "Istituto [nome=" + nome + ", classi=" + classi + "]";
	}
	

}
