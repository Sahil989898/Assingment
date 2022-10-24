import java.text.SimpleDateFormat;
import java.util.Date;

public class Timewithtimezone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
SimpleDateFormat sdf = new SimpleDateFormat(" HH:MM:SS");
Date date = new Date();
System.out.println(sdf.format(date)+" PST ");
		

	}

}
