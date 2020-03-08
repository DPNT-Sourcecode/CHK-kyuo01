package befaster.solutions.SUM;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SumSolutionTest {
    private SumSolution sum;
    
    @Rule
    ExpectedException thrown = ExpectedException.none();

    @Before
    public void setUp() {

        sum = new SumSolution();
    }

    @Test
    public void compute_sum() {
        assertThat(sum.compute(1, 1), equalTo(2));
    }
    
    @Test
    public void assertThatLowestSumIsZero() {
    	assertThat(sum.compute(0, 0), equalTo(0));
    }
    
    @Test
    public void assertThatGreatestSumIsTwoHundred() {
    	assertThat(sum.compute(100, 100), equalTo(200));
    }
    
    @Test
    public void assertThatParam1LessThanZeroThrowsException() {
    	thrown.expect(ParameterOutOfBoundsException.class);
    	sum.compute(-1,0);
    }
    
    @Test
    public void assertThatParam2LessThanZeroThrowsException() {
    	thrown.expect(ParameterOutOfBoundsException.class);
    	sum.compute(0,-1);
    }
    
    @Test
    public void assertThatParam1GreaterThan100ThrowsException() {
    	thrown.expect(ParameterOutOfBoundsException.class);
    	sum.compute(101, 0);
    }
    
    @Test
    public void assertThatParam2GreaterThan100ThrowsException() {
    	thrown.expect(ParameterOutOfBoundsException.class);
    	sum.compute(0,101);
    }
}

