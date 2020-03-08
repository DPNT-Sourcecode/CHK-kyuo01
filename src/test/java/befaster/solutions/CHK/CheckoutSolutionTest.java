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
	
	@Test
	public void assertThatOneBCosts30() {
		String basket = "B";
		assertThat(checkout.checkout(basket), equalTo(30));
	}

	@Test
	public void assertThatOneCCosts20() {
		String basket = "C";
		assertThat(checkout.checkout(basket), equalTo(20));
	}
	
	@Test
	public void assertThatOneDCosts15() {
		String basket = "D";
		assertThat(checkout.checkout(basket), equalTo(15));
	}
	
	@Test
	public void assertThat3ACosts130() {
		String basket = "AAA";
		assertThat(checkout.checkout(basket), equalTo(130));
	}
	
	@Test
	public void assertThat2BCosts45() {
		String basket = "BB";
		assertThat(checkout.checkout(basket), equalTo(45));
	}
}


