
public class test {

	public static void main(String[] args) 
	{
		VectorHelper a=new VectorHelper(5);
		
		int []t=new int[4];
		int []v=new int[4];
		
		t[0]=0;
		t[1]=1;
		t[2]=2;
		t[3]=3;
		
		v[0]=4;
		v[1]=5;
		v[2]=6;
		v[3]=7;
		
		a.SommeVect(v, t);
		a.fonction();

	}

}
