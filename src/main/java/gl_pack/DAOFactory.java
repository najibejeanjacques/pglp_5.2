package gl_pack;

import java.util.List;
import java.util.Optional;

public abstract class DAOFactory {

	// Liste des types de DAO supporté par notre Factory
	public static final int ORACLE = 1;
	public static final int DERBY = 2;

	// Nous avons des methodes pour chaque DAO que nous allons crée
	public abstract PersonnelDAO getPersonnelDAO();

	public abstract TelephoneDAO getTelephoneDAO();

	public static DAOFactory getDAOFactory(int wichFactory) {
		switch (wichFactory) {
		case DERBY:
			return new DerbyDaoFactory();
		default:
			return null;
		}
	}

}
