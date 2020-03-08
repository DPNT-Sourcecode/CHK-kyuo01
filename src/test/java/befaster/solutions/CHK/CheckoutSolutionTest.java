package befaster.solutions.CHK;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

import org.junit.Test;

public class CheckoutSolutionTest {

	CheckoutSolution checkout = new CheckoutSolution();
	
	@Test
	public void assertThatOneACosts50() {
		String basket = "A";
		assertThat(checkout.checkout(basket), equalTo(50));
	}
}

