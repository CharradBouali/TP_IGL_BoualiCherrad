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
