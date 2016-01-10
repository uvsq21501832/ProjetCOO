package fr.uvsq.coo.projet_ex2;

import java.awt.Color;

public class Cercle implements Forme { // Mise en eouvre du patter builder
	//Parametres obligatoire
	private Point centre;
	private float rayon;
	//Parametre optionel
	private Color couleur;
	
	public static class Builder{
		//Parametres obligatoire
		private Point centre;
		private float rayon;
		//Parametre optionel
		private Color couleur=Color.WHITE;
		
		//constructeur avec specification de parametre
		public Builder(Point centre, float rayon){
			this.centre=centre;
			this.rayon=rayon;
		}
		//constructeur avec specification de parametre
		public Builder(){
			this.centre=new Point(0,0);
			this.rayon=1;
		}
		//Ajout des parametres optionnels
		public Builder couleur(Color couleur){
			this.couleur=couleur;
			return this;
		}
		//creation du Cercle
		public Cercle build(){
			return new Cercle(this);
		}
	}

	private Cercle(Builder builder){
		//parametres requis
		centre=builder.centre;
		rayon=builder.rayon;
		//parametres optionnels
		couleur=builder.couleur;
	}
	
	@Override
	public void chagneCouleurForme() {
		// TODO Auto-generated method stub

	}

	@Override
	public double calculSuperficie() {
		// TODO Auto-generated method stub
		return (Math.PI*Math.sqrt(rayon));
	}

	public Point getCentre() {
		return centre;
	}

	public void setCentre(Point centre) {
		this.centre = centre;
	}

	public float getRayon() {
		return rayon;
	}

	public void setRayon(float rayon) {
		this.rayon = rayon;
	}

	public Color getCouleur() {
		return couleur;
	}

	public void setCouleur(Color couleur) {
		this.couleur = couleur;
	}
}
