package codingtest;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class L_12901 {
	public String solution(int a, int b) {
		String answer = "";
	    DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
	    String totalA ="";
	    if(a<10) {
	    	totalA="0"+Integer.toString(a);
	    }else {
	    	totalA = Integer.toString(a);
	    }
	    String inputDate = "2016" + totalA + Integer.toString(b);
	    Date date;
	    
	    try {
	        date = dateFormat.parse(inputDate);
	        Calendar calendar = Calendar.getInstance();
	        calendar.setTime(date);
	
	        switch (calendar.get(Calendar.DAY_OF_WEEK)) {
	
	        case 1:
	            answer = "SUN";
	            break;
	        case 2:
	            answer = "MON";
	            break;
	        case 3:
	            answer = "TUE";
	            break;
	        case 4:
	            answer = "WED";
	            break;
	        case 5:
	            answer = "THU";
	            break;
	        case 6:
	            answer = "FRI";
	            break;
	        case 7:
	            answer = "SAT";
	            break;
	
	        }
	    } catch (ParseException e) {
	        e.printStackTrace();
	    }
	    System.out.println(answer);
	    return answer;
	}

	public static void main(String[] args) {
		L_12901 l = new L_12901();
		
		l.solution(12, 31);
				
	}

}
