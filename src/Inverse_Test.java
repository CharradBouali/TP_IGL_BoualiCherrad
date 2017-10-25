import static org.junit.Assert.*;

import org.junit.Test;

public class Inverse_Test {

	@Test
	public void Inverse_test() 
	{
		VectorHelper a=new VectorHelper(4);
		int []res=new int[4];
		
		res=a.inverse();
		
		assertEquals(res[0],9);
		assertEquals(res[1],7);
		assertEquals(res[2],5);
		assertEquals(res[3],3);
	}

}
