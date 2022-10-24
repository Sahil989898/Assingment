import java.util.Arrays;
public class FindArrayInSetofArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		    String[] strings = {"One","Two","Three","Four","Five"};
		    String toFind= "Three";

		    boolean found = Arrays.stream(strings).anyMatch(t -> t.equals(toFind));

		    if(found)
		      System.out.println(toFind + " is found.");
		    else
		      System.out.println(toFind + " is not found.");
		  }
		

}
