import static org.junit.Assert.*;

import org.junit.Test;

public class Trier_Test {

	@Test
	public void Trier_test() 
	{
		VectorHelper a=new VectorHelper(5);
		int []res=new int[5];
		
		a.affect(13, 0);
		a.affect(12, 1);
		a.affect(21, 2);
		a.affect(6, 3);
		a.affect(33, 4);
		
		res=a.trier();
		
		assertEquals(res[0],6);
		assertEquals(res[1],12);
		assertEquals(res[2],13);
		assertEquals(res[3],21);
		assertEquals(res[4],33);
		
	}

}
