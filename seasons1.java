/**
 * Hamza
 * hamza@gmail.com
 */
import javax.swing.JOptionPane;

public class usepass {
	public enum MonthName {
		Jan, Feb, Mar, April, May, June, July, August, Sept, Oct, Nov, Dec
	}

	public static void main(String[] args) {
		MonthName[] choices = { MonthName.Jan, MonthName.Feb, MonthName.Mar, MonthName.April, MonthName.May,
				MonthName.June, MonthName.July, MonthName.August, MonthName.Sept, MonthName.Oct, MonthName.Nov,
				MonthName.Dec };
		MonthName input = (MonthName) JOptionPane.showInputDialog(null, "Select your Month.", "Month Name",
				JOptionPane.INFORMATION_MESSAGE, null, choices, choices[0]);
		//while (input != null) {
			String season;
			// Fill in switch case code below to check for account type and
			// return appropriate Welcome message
			switch (input) {
	          case Jan: 
	          case Feb: 
	          case Dec:
	            System.out.print("Wanna build a snowman?");
	            break;
	          case April: 
	          case May: 
	          case Mar:
	            season = "Happy Spring Days";
	            System.out.print(season);
	            break;
	          case July: 
	          case August: 
	          case June:
	            season = "Its summer time!";
	            System.out.print(season);
	            break;
	          case Oct: 
	          case Nov: 
	          case Sept:
	            season = "Welcome to the foilage season! ";
	            System.out.print(season);
	            break;
	          default:
	            season = "Bogus Month";
	            System.out.print(season);
	        }
		}
	}
//}
