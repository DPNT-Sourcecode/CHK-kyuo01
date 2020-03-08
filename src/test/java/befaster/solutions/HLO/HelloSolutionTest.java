package befaster.solutions.HLO;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.text.IsEqualIgnoringCase.equalToIgnoringCase;

import org.junit.Test;

public class HelloSolutionTest {
	HelloSolution solution = new HelloSolution();
	
	@Test
	public void assertThatHelloReturnsWorld() {
		assertThat(solution.hello(""), equalToIgnoringCase("world"));
	}
}

