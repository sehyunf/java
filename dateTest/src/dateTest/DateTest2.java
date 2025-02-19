package dateTest;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTest2 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년MM월dd일");
		
		System.out.println(calendar.getTime());
		System.out.println(simpleDateFormat.format(calendar.getTime()));
		
		System.out.println();
		
		
		
		
	}
}
