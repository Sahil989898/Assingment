//write a java program to swap two variables without using 3rdd variable.
        
public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    int x = 10;
        int y = 5;
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swapping:"
                           + " x = " + x + ", y = " + y);
        
	}

}
