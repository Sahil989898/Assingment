import java.util.Scanner;
public class Sumof3numbers {

	public static void main(String[] args) {
		int n,r,sum=0;
		System.out.println("Enter the number");

		Scanner ref = new Scanner(System.in);
		n = ref.nextInt();
		
		while(n>0) {
		r=n%10;
		sum=sum+r;
		n=n/10;
		
		}
		System.out.println("The sum of the digits are: " + sum);
	}
}
