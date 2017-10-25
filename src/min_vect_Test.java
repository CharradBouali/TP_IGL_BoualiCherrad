import static org.junit.Assert.*;
import org.junit.Test;


public class min_vect_Test {

	@Test
	public void min_vect_test() 
	{
		VectorHelper a=new VectorHelper(5);
		a.min_max();

		assertEquals(a.getMin(),3);
		
		assertEquals(a.min_vect(),3);
	}

}
