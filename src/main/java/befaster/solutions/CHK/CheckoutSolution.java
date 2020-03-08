package befaster.solutions.CHK;

public class CheckoutSolution {
    public Integer checkout(String skus) {
    	int countA=0, countB=0; // counters for discount items
    	int total=0;
    	
    	for (int i=0; i<skus.length(); i++) {
    		switch (skus.charAt(i)) {
    		case ('A'):
    			countA++;
    			total+=50;
    			break;
    		case ('B'):
    			total+=30;
    			countB++;
    			break;
    		case ('C'):
    			total+=20;
    			break;
    		case ('D'):
    			total+=15;
    			break;
    		default:
    			return -1;
    		}
    	}
    	
    	if (countA>=3) {
    		total-=20;
    	}
    	if (countB>=2) {
    		total-=15;
    	}
    	
        return total;
    }
}



