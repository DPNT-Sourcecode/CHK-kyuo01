package befaster.solutions.HLO;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

import org.junit.Test;

public class HelloSolutionTest {
	HelloSolution solution = new HelloSolution();
	
	@Test
	public void assertThatHelloWithNoParamReturnsHelloWorld() {
		assertThat(solution.hello(""), equalTo("Hello, World!"));
	}
	
	@Test
	public void assertThatHelloWithParamJohnReturnsHelloJohn() {
		assertThat(solution.hello("John"), equalTo("Hello, John!"));
	}
}



