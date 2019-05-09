package model;

public class Article {

	private int id;
	private String nom;
	private int prixUnitaire;
	private int quantite;
	
public Article(){
		// TODO Auto-generated constructor stub
		
	}
	
	public Article(int id, String nom, int prixUnitaire, int quantite){
		super();
		this.id = id;
		this.nom = nom;
		this.prixUnitaire = prixUnitaire;
		this.quantite = quantite;
	}
	

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getPrixUnitaire() {
		return prixUnitaire;
	}

	public void setPrixUnitaire(int prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

}
