import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ DifferentTailleException_Test.class, fonction_Test.class, Inverse_Test.class, max_vect_Test.class,
		min_vect_Test.class, Somme_Vect_Test.class, Trier_Test.class })
public class AllTests {

}
