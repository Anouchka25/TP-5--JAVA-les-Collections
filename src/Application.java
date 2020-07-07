/**
 * TP 1 : 
 */


public class Application {

	public static void main(String[] args) {
		
		Salarie sal = new Salarie();
         
		sal.m_nMatricule = 1;
		sal.m_nCategorie = 2;
		sal.m_nService = 10;
		sal.m_strNom = "Anouchka MINKOUE OBAME";
		sal.m_dSalaire = 2000;
		
		System.out.println("Matricule = " + sal.m_nMatricule);
		System.out.println("Catégorie = " + sal.m_nCategorie);
		System.out.println("Service = " + sal.m_nService);
		System.out.println("Nom = " + sal.m_strNom);
		System.out.println("Salaire = " + sal.m_dSalaire);
		
		System.out.println("Matricule = " + sal.calculSalaire());
	}

}
