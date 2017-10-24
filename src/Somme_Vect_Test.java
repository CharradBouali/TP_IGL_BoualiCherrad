import static org.junit.Assert.*;
import org.junit.Test;

public class Somme_Vect_Test {

	@Test
	public void Somme_Vect_test() 
	{
        VectorHelper a=new VectorHelper(4);
		
        int []res;
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
		
		try {
			res=a.SommeVect(v, t);
			assertEquals(res[0],4);
			assertEquals(res[1],6);
			assertEquals(res[2],8);
			assertEquals(res[3],10);
		} catch (DifferentTailleException e) {
			System.out.print("Exception:Les deux vecteurs ne sont pas de taille identique");
		    
		}	
		
	}

}
