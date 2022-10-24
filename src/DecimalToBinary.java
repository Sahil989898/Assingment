import java.util.Scanner;
public class DecimalToBinary {

	public static void main(String[] args) {
		int no;
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to convert into Binary ");		
        no = sc.nextInt();
	
        String binarystr = Integer.toBinaryString(no);
		  System.out.println("Binary value of the number is  " + binarystr);
	}
}
