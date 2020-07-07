package fr.afpa.cda;

public class Commercial extends Salarie {
	
	private double m_dChiffreAffaire ;
	private int m_pcCommission ;
	
	public Commercial(int nMat, int nCatg, int nServ, String strNom, double dSal, double dChiffre,
			int dCommission) {
		super(nMat, nCatg, nServ, strNom, dSal);
		this.m_dChiffreAffaire = dChiffre;
		this.m_pcCommission = dCommission;
	}

	public Commercial() {
		super();
	}

	public double getM_dChiffreAffaire() {
		return m_dChiffreAffaire;
	}

	public void setM_dChiffreAffaire(double m_dChiffreAffaire) {
		this.m_dChiffreAffaire = m_dChiffreAffaire;
	}

	public int getM_pcCommission() {
		return m_pcCommission;
	}

	public void setM_pcCommission(int m_pcCommission) {
		this.m_pcCommission = m_pcCommission;
	}
	
    //Surchage des méthodes de la classe de base Salarie
	
	public String calculSalaire() {
		
		return "Le salaire de " + getM_strNom() + " est de " + getM_dSalaire() + 
				m_dChiffreAffaire * m_pcCommission /100 + ".";
	}
	
    public String toString() {
    	
		return super.toString() + "," + 
				m_dChiffreAffaire + ","+ m_pcCommission;
    	
    }
	
	
	
	

}
