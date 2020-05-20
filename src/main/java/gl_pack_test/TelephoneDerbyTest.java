package gl_pack_test;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import gl_pack.DAOFactory;
import gl_pack.Personnel;
import gl_pack.Telephone;

public class TelephoneDerbyTest {

	@Test
	public void TelephoneDerbyNumPortable() {
		DAOFactory derbyFactory = DAOFactory.getDAOFactory(2);
		Personnel personne1 = new Personnel.PersonnelBuilder("OUEDRAOGO", "Jamile Jean Luc").build();
		Telephone tel1 = new Telephone("01345678903", "33054567533");
		personne1.getNumeroListe().add(0, tel1);
		assertTrue("Verifier", (personne1.getNumeroListe().get(0).getportable() == "33054567533"));
	}

	@Test
	public void TelephoneDerbyFixPro() {
		DAOFactory derbyFactory = DAOFactory.getDAOFactory(2);
		Personnel personne1 = new Personnel.PersonnelBuilder("OUEDRAOGO", "Jamile Jean Luc").build();
		Telephone tel1 = new Telephone("01345678903", "33054567533");
		personne1.getNumeroListe().add(0, tel1);
		assertTrue("Verifier", (personne1.getNumeroListe().get(0).getportable() == "01345678903"));
	}
}
