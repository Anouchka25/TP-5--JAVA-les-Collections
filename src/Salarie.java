
public class Salarie {
	
	int m_nMatricule;
	int m_nCategorie;
	int m_nService;
	String m_strNom;
	double m_dSalaire;
	
	public String calculSalaire() {
		
		return "Le salaire de " + m_strNom + " est de " + m_dSalaire + ".";
	}
	

}
