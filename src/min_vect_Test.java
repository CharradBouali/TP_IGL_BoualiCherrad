import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runners.JUnit4;

public class min_vect_Test {

	@Test
	public void min_vect_test() 
	{
		VectorHelper a=new VectorHelper(5);
		int min=a.min_vect();
		assertEquals(min,3);
	}

}
