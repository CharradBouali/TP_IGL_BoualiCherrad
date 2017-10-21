import static org.junit.Assert.*;

import org.junit.Test;

public class fonction_Test {

	@Test
	public void fonction_test() 
	{
		 VectorHelper a=new VectorHelper(4);
			
	        int []res=a.fonction();
			
			assertEquals(res[0],7);
			assertEquals(res[1],11);
			assertEquals(res[2],15);
			assertEquals(res[3],19);
	}

}
