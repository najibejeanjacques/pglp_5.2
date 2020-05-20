package gl_pack_test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import gl_pack.DAOFactory;
import gl_pack.Personnel;
import gl_pack.Telephone;

public class PersonnelDerbyTest {

	@Test
	public void PersonnelDerbyNom() {
		DAOFactory derbyFactory = DAOFactory.getDAOFactory(2);
		Personnel personne1 = new Personnel.PersonnelBuilder("OUEDRAOGO", "Jamile Jean Luc").build();
		assertTrue("Verifier", (personne1.getNom() == "OUEDRAOGO"));
	}

	@Test
	public void PersonnelDerbyPrenom() {
		DAOFactory derbyFactory = DAOFactory.getDAOFactory(2);
		Personnel personne1 = new Personnel.PersonnelBuilder("OUEDRAOGO", "Jamile Jean Luc").build();
		assertTrue("Verifier", (personne1.getNom() == "Jamile Jean"));
	}
}
