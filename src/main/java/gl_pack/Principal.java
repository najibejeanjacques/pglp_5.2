package gl_pack;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DAOFactory derbyFactory = DAOFactory.getDAOFactory(2);
		Personnel personne1 = new Personnel.PersonnelBuilder("OUEDRAOGO", "Jamile Jean Luc").build();
		Personnel personne2 = new Personnel.PersonnelBuilder("OUEDRAOGO", "Najibe Jean Jacques").build();

		Telephone tel1 = new Telephone("01345678903", "33054567533");
		Telephone tel2 = new Telephone("03456433432", "22660108122");
		personne1.getNumeroListe().add(0, tel1);
		personne2.getNumeroListe().add(0, tel2);

		// derbyFactory.getTelephoneDAO().InsertCustomer(personne2);
		// derbyFactory.getTelephoneDAO().deleteCustomer(201);
		derbyFactory.getTelephoneDAO().findAllCustomer();
		// derbyFactory.getPersonnelDAO().InsertCustomer(personne1);
		// derbyFactory.getPersonnelDAO().InsertCustomer(personne2);
		// derbyFactory.getPersonnelDAO().findAllCustomer();
		// derbyFactory.getPersonnelDAO().deleteCustomer(personne1);

	}

}
