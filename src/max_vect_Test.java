import static org.junit.Assert.*;

import org.junit.Test;

public class max_vect_Test {

	@Test
	public void max_vect_test() 
	{
		VectorHelper a=new VectorHelper(5);
		
		a.min_max();
		assertEquals(a.getMax(),11);
		
		assertEquals(a.max_vect(),11);
	}

}
