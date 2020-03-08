package befaster.solutions.HLO;

public class HelloSolution {
    public String hello(String friendName) {
    	if (friendName.equals("")) {
    		return "Hello, World!";
    	} 
    	
    	StringBuilder builder = new StringBuilder();
    	builder.append("Hello, ") 
    		   .append(friendName)
    		   .append("!");
    	
    	return builder.toString();
    }
}
