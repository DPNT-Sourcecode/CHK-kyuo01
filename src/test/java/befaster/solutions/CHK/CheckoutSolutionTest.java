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
	public void assertThat5ACosts200() {
		String basket = "AAAAA";
		assertThat(checkout.checkout(basket), equalTo(200));
	}
	
	@Test
	public void assertThat2BCosts45() {
		String basket = "BB";
		assertThat(checkout.checkout(basket), equalTo(45));
	}

	@Test
	public void assertThat6ACosts260() {
		String basket = "AAAAAA";
		assertThat(checkout.checkout(basket), equalTo(260));
	}
	
	@Test
	public void assertThat4BCosts90() {
		String basket = "BBBB";
		assertThat(checkout.checkout(basket), equalTo(90));
	}
	
	@Test
	public void assertThat2ECosts80() {
		String basket = "EE";
		assertThat(checkout.checkout(basket), equalTo(80));
	}
	
	@Test
	public void assertThat2EAndBCosts80() {
		String basket = "BEE";
		assertThat(checkout.checkout(basket), equalTo(80));
	}
	
	@Test
	public void assertThat4Eand2BCosts160() {
		String basket = "BBEEEE";
		assertThat(checkout.checkout(basket), equalTo(160));
	}
	
	@Test
	public void assertThat4EAnd3BCosts190() {
		String basket = "BBBEEEE";
		assertThat(checkout.checkout(basket), equalTo(190));
	}
	
	@Test
	public void assertThat2EAnd2BCosts110() {
		String basket = "BBEE";
		assertThat(checkout.checkout(basket), equalTo(110));
	}
}


