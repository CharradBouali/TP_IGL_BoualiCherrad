
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
