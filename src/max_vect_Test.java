import static org.junit.Assert.*;

import org.junit.Test;

public class max_vect_Test {

	@Test
	public void max_vect_test() 
	{
		VectorHelper a=new VectorHelper(5);
		int max=a.max_vect();
		assertEquals(max,11);
	}

}
