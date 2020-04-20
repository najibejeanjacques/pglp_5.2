package gl_pack;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Personnel extends ComposantPersonnel implements java.io.Serializable {

		private String nom;
		private String prenom;
		private LocalDate dateNaissance;
	    private ArrayList<Telephone> NumeroListe = new ArrayList<Telephone>();
	    private Iterator it = NumeroListe.iterator();
	    
	    public LocalDate getDateNaissance() {
			return dateNaissance;
		}

		public void setDateNaissance(LocalDate dateNaissance) {
			this.dateNaissance = dateNaissance;
		}

		public ArrayList<Telephone> getNumeroListe() {
			return NumeroListe;
		}

		public void setNumeroListe(ArrayList<Telephone> numeroListe) {
			NumeroListe = numeroListe;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}

		public String getNom() {
	    	return this.nom;
	    }
	    
	    public String getPrenom() {
	    	return this.prenom;
	    }
	    
	    public static class PersonnelBuilder {
	    	private String nom;
			private String prenom;
			private LocalDate dateNaissance;
		    ArrayList<Telephone> NumeroListe = new ArrayList<Telephone>();
		    Iterator it = NumeroListe.iterator();
		    
		    public PersonnelBuilder(String nom, String prenom) {
		    	this.nom = nom;
		    	this.prenom = prenom;
		    }
		    
		    public PersonnelBuilder setDateNaissance(LocalDate dateNaiss) {
		    	this.dateNaissance = dateNaiss;
		    	return this;
		    }
		    
		    public PersonnelBuilder NumeroListe(ArrayList<Telephone> numero) {
		    	this.NumeroListe = numero;
		    	return this;
		    }
		    
		    public Personnel build() {
		    	return new Personnel(this);
		    }
	    }

	    private Personnel(PersonnelBuilder personnelBuilder) {
	    	nom = personnelBuilder.nom;
	    	prenom = personnelBuilder.prenom;
	    }

		@Override
		public void composant() {
			// TODO Auto-generated method stub
		}
		
		public List<Telephone> getTelephone() {
			// TODO Auto-generated method stub
			return NumeroListe;
		}

}

 



