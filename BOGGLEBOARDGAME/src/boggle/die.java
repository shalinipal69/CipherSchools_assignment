package boggle;
import java.util.Random;
public class die {
	 private String[] values;
	    
	  
	    public die(String s1, String s2, String s3, String s4, String s5, String s6) {
	        values=new String[] {s1,s2,s3,s4,s5,s6};
	    }
	    
	    public String roll(Random rand) {
	        return values[rand.nextInt(6)];
	    }
}
