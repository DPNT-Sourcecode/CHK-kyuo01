package befaster.solutions.CHK;

public class CheckoutSolution {
    public Integer checkout(String skus) {
    	int countA=0;
    	int countB=0;
    	int countE=0; // counters for discount items
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
    		case('E'):
    			total+=40;
    			countE++;
    			break;
    		default:
    			return -1;
    		}
    	}

    	total -= calculateItemLevelDiscountForA(countA);
    	if (countE / 2 > 1 && countB >= 1) {
    		total -= calculateItemLevelDiscountForEAndB(countB, countE);
    	} else if (countB > 1) {
    		total -= calculateItemLevelDiscountForB(countB);
    	}
    	
        return total;
    }
    
    private int calculateItemLevelDiscountForA(int countA) {
    	if (countA>=5 && countA%3==0) {
    		int multiplier = countA / 5;
    		return (50 * multiplier);
    	}
    	if (countA>=3) {
    		int multiplier = countA / 3;
    		return (20 * multiplier);
    	}
    	return 0;
    }
    
    private int calculateItemLevelDiscountForB(int countB) {
    	if (countB>=2) {
    		int multiplier = countB / 2;
    		return (15 * multiplier);
    	}
    	return 0;
    }
    
    private int calculateItemLevelDiscountForEAndB(int countB, int countE) {
    	if (countE>=2) {
    		int multiplier = countE / 2;
    		if (countB >= multiplier) {
    			return multiplier * 30;
    		} else {
    			return countB * 30;
    		}
    	}
    	return 0;
    }
}




