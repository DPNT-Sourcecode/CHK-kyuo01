package befaster.solutions.SUM;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SumSolutionTest {
    private SumSolution sum;
    
    @Before
    public void setUp() {

        sum = new SumSolution();
    }

    @Test
    public void compute_sum() throws Exception {
        assertThat(sum.compute(1, 1), equalTo(2));
    }
    
    @Test
    public void assertThatLowestSumIsZero() throws Exception {
    	assertThat(sum.compute(0, 0), equalTo(0));
    }
    
    @Test
    public void assertThatGreatestSumIsTwoHundred() throws Exception {
    	assertThat(sum.compute(100, 100), equalTo(200));
    }
    
    @Test
    public void assertThatParam1LessThanZeroThrowsException() throws Exception{
    	assertThat(sum.compute(-1, 0), equalTo(0));
    }
    
    @Test
    public void assertThatParam2LessThanZeroThrowsException() throws Exception {
    	assertThat(sum.compute(0, -1), equalTo(0));
    }
    
    @Test
    public void assertThatParam1GreaterThan100ThrowsException() throws Exception{
    	assertThat(sum.compute(101, 0), equalTo(0));
    }
    
    @Test
    public void assertThatParam2GreaterThan100ThrowsException() throws Exception {
    	assertThat(sum.compute(101, 0), equalTo(0));
    }
}



