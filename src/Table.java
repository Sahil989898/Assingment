import java.util.Scanner;
public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int num;
   System.out.print("Enter number");
   Scanner r = new Scanner(System.in);
   num = r.nextInt();
   
   for (int i=1; i<=10; i++) {
	   System.out.println(num+ " x "+ i + " = " + num*i);
   
   }
	}
}
