
//----------------------------------------------------------------------------------//
/**
*VectorHelper est une classe représente le vecteur des elements
**/
public class VectorHelper 
{
	private int []tab;
	private int min;
	private int max;
	
	
	public VectorHelper(int taille)
	{
		this.tab=new int[taille];
		for (int i=0;i<taille;i++)
		{
			tab[i]=2*i+3;
		}
	}
	
//---------------------------------------------------------------------------------//	
	/**
	 * affecter une valeur dans le tableau tab 
	 * @param val :la valeur que l'on veut rajouter
	 * @param index :l'indice de la valeur rajoutée
	 */
	
	public void affect(int val,int index) // affecter la valeur val dans tab à  l'indice index
	{
		if (tab.length>index) 
		{
			tab[index]=val;
		}
		
	}
//---------------------------------------------------------------------------------//

	/**
	*
	 * @param v : contient le premier vecteur
	 * @param t : contient le deuxieme vecteur 
	 * @return : la somme des deux vecteurs 
	 * Exemples : v={1,2,3} et t={2,5,6} => le resultat tab={3,7,9}
	 */ 

	public int[] SommeVect(int []v,int []t) throws DifferentTailleException  


	{
		//fait la somme de 2 vecteurs
		int i=t.length;
		int j=v.length;
		
		if (i!=j)
		{
			//exception
			throw new DifferentTailleException();					
		}
		else
		{   this.tab=new int[i];
			for (i=0;i<j;i++)
			{
				this.tab[i]=t[i]+v[i];
			}
		}
		
		return tab;
	}
//---------------------------------------------------------------------------------//
	/**
	 * applique la fonction f(x)=2x+1 aux elements de tab
	 * @return un tableau contenant les images des elements de tab par la fonction f(x)=2x+1
	 * Exemple tab={1,2,3} => le resultat res ={3,5,7}
	 */
	public int [] fonction()  //appliquer la fonction f(x)=2x+1 aux elements de tab
	{
		int []res =new int[tab.length];
		for(int i=0;i<tab.length;i++)
		{
			res[i]=2*tab[i]+1;
			System.out.print("res["+i+"]="+res[i]+"\n");
		}
		return res;
	}

//----------------------------------------------------------------------------------//

    /**
     * @return le maximum du vecteur tab
     *Exemple tab ={1,2,3} => max =3
     */
    public int max_vect()
    {   int m=0;
        
        if(tab.length>0)  m=tab[0];
        else m=-1;
        
    	for(int i=1;i<tab.length;i++)
    	{
    		if (tab[i]>m)   m=tab[i];
    	}
    	return m;
    }
 //---------------------------------------------------------------------------//
	/**
	*@return le minimum d'un vecteur 
	**Exemple tab ={1,2,3} => min =1
	*/
    public int min_vect()
    {   int m=-1;
        
        if(tab.length>0)  m=tab[0];
        
        { 
    	for(int i=1;i<tab.length;i++)
    	{
    		if (tab[i]<m)   m=tab[i];
    	}
    	}
    	return m;
    }

//-----------------------------------------------------------------------------//   
	/**
	*La fonction donne le min et le max simultinement 
	*
	***/
    public void min_max()
    {
         min=-1;
         max=-1;
        
        if(tab.length>0)  {
        	min=tab[0];  max=tab[0];
       
        
    	for(int i=1;i<tab.length;i++)
    	{
    		if (tab[i]>max)   max=tab[i];
    		if (tab[i]<min)   min=tab[i];
    	}
    	
        }
    	
    }
    
	//-----------------------------------------------------------------------------------//


/** 
 * Fonction pour inverser les ÃƒÂ©lements du vecteur 
 * @param v contient le vecteur ÃƒÂ  inverser 
 * Exemple tab={1,2,3} => le resultat tab = {3,2,1}
 */

public int[] inverse ()
{   
    
	int i,j,x;


	i=0;
	j=tab.length-1;
	
	while (i<j)
	{
	x=tab[j];
	tab[j] = tab[i];
        tab[i] = x;
        i = i + 1;
        j = j - 1;	
	}
	
	for (i=0;i<tab.length;i++)
	{
		System.out.print("tab["+i+"]="+tab[i]+"\n");
	}

return tab;

}


//-----------------------------------------------------------------------------------//





/**
 * Fonction pour trier les ÃƒÂ©lements du vecteur 
 * @param v contient le vecteur ÃƒÂ  trier
 * Exemple tab ={1,7,6} => tab ={1,6,7} 
 */

public int[] trier () 

{

		int longueur = tab.length;
		int tampon = 0;
		boolean permut;
 
		do {

			// hypothese : le tableau est trié
			permut = false;
			for (int i = 0; i < longueur - 1; i++) {
				// Teste si 2 ÃƒÂƒÃ‚Â©lÃƒÂƒÃ‚Â©ments successifs sont dans le bon ordre ou non
				if (tab[i] > tab[i + 1]) {
					// s'ils ne le sont pas, on ÃƒÂƒÃ‚Â©change leurs positions

					tampon = tab[i];
					tab[i] = tab[i + 1];
					tab[i + 1] = tampon;
					permut = true;
				}
			}
		} while (permut);
		
		
		for (int i=0;i<tab.length;i++)
		{
			System.out.print("tab["+i+"]="+tab[i]+"\n");
		}


return tab;
}

public int getMin() {
	return min;
}

public void SetMin(int min) {
    min = min;
}

public int getMax() {
	return max;
}

public void SetMax(int max) {
	max = max;
}



}
