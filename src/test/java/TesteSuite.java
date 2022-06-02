import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import calculadora.TestCalculadora;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@SuiteClasses({TestCalculadora.class})
public class TesteSuite {
	public static junit.framework.Test suite(){
		return new JUnit4TestAdapter(TesteSuite.class);
	}
}
