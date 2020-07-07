/**
 * TP 5 : 
 */
package fr.afpa.cda;

import java.util.Enumeration;
import java.util.Hashtable;

public class Application {

	public static void main(String[] args) {
		
		Hashtable dict = new Hashtable();
		
		
		
        Salarie s = new Salarie(5, 8, 14, "Anouchka MINKOUE OBAME", 1500);
		Integer key = new Integer(s.getMatricule());
        dict.put(key, s);
		
        s = new Salarie(3, 1, 20, "Isodore DUMARC", 10000);
        dict.put(key, s);
        
        /**
         * Ici on ajoute chaque �lement dict.element() � l'Enumeration
         * hasMoreElement permet de v�rifier si le dictionnaire contient plus d'�lements
          */
        for (Enumeration e = dict.elements(); e.hasMoreElements() ;)  
        {
        	Salarie sal = (Salarie)e.nextElement();
        	System.out.println(sal);
        	System.out.println(sal.calculSalaire());
        }
		
		

		
	}

}
