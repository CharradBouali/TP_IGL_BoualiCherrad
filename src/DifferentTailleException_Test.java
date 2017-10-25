import org.junit.Test;


public class DifferentTailleException_Test {

	@Test (expected=DifferentTailleException.class)
	public void DifferentTailleException_test() throws DifferentTailleException 
	{
		
        VectorHelper a=new VectorHelper(5);
		
        
		int []t=new int[5];
		int []v=new int[4];
		
		t[0]=0;
		t[1]=1;
		t[2]=2;
		t[3]=3;
		
		v[0]=4;
		v[1]=5;
		v[2]=6;
		v[3]=6;
		
		a.SommeVect(v, t);	
		
		
	}

}
