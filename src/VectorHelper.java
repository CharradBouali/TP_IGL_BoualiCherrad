
//---------------------------------------------------------------------------/
public class VectorHelper 
{
	private int []tab;
	
	public VectorHelper(int taille)
	{
		this.tab=new int[taille];
		for (int i=0;i<taille;i++)
		{
			tab[i]=2*i+1;
		}
	}
	

//---------------------------------------------------------------------------------//
	public int[] SommeVect(int []v,int []t)  

	{
		//fait la somme de 2 vecteurs
		int i=t.length;
		int j=v.length;
		
		if (i!=j)
		{
			//exception
			
			try 
			{
				throw new DifferentTailleException();
			} 
			catch (DifferentTailleException e) 
			{
				System.out.print("Exception:Les deux vecteurs ne sont pas de taille identique");
			    return tab;
			}
	
			
		}
		else
		{   this.tab=new int[i];
			for (i=0;i<j;i++)
			{
				this.tab[i]=t[i]+v[i];
				//System.out.print("tab["+i+"]="+tab[i]+"\n");
			}
		}
		
		return tab;
	}
//---------------------------------------------------------------------------------//
	/**
	 * applique la fonction f(x)=2x+1 aux elements de tab
	 * @return un tableau contenant les images des elements de tab par la fonction f(x)=2x+1
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
    
    public int min_vect()
    {   int m=0;
        
        if(tab.length>0)  m=tab[0];
        else m=-1;
        
    	for(int i=1;i<tab.length;i++)
    	{
    		if (tab[i]<m)   m=tab[i];
    	}
    	return m;
    }
	//-----------------------------------------------------------------------------------//

public void inverse (int []v)
{   tab=v;

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

}


//-----------------------------------------------------------------------------------//
public void trier (int []v) 
{
 tab = v;
		int longueur = tab.length;
		int tampon = 0;
		boolean permut;
 
		do {
			// hypothèse : le tableau est trié
			permut = false;
			for (int i = 0; i < longueur - 1; i++) {
				// Teste si 2 éléments successifs sont dans le bon ordre ou non
				if (tab[i] > tab[i + 1]) {
					// s'ils ne le sont pas, on échange leurs positions
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
}

}
