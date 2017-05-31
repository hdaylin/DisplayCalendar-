import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class DisplayFInance {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner (System.in); 
		
		String months[] = {"January","February","March","April","May","June","July","August","September","October","November", "December"};

		int year; 
		int month;  
		int day; 
		int first_day = 1;
		
		System.out.println("What's the year?"); 
		year = keyboard.nextInt(); 
		
		System.out.println("What month in numbers (1-12)"); 
		month = keyboard.nextInt() -1; 
		
		System.out.println("What day of the month are you looking up?");
		day = keyboard.nextInt(); 
		
		//create a Gregorian calendar with a particular date
		//Year must be a four digit integer
		//Month is an integer from 0 to 11
		//Day must be an integer from 1 to 31
		GregorianCalendar gc = new GregorianCalendar(year,month,day); 
		GregorianCalendar fd = new GregorianCalendar(year,month,first_day);
		//System.out.println("Month:" + gc.get(Calendar.MONTH));
		//show the month from the array
		System.out.println("\t\t" + months[gc.get(Calendar.MONTH)] + " " +gc.get(Calendar.YEAR));
		System.out.println("Sun" + "\t" + "Mon\t" + "Tues\t" +"Wed" + "\t" + "Thurs\t" + "Fri\t" + "Sat\t");
		
		//the day of the week is a numeric value from 1 to 7
				//System.out.print("Day of Week: ");
				int dayofweek = fd.get(Calendar.DAY_OF_WEEK); 
				//System.out.println(dayofweek); 
		
				if(month==3 || month ==5 || month ==8 || month ==10){		
				
				if(dayofweek == 1){
					System.out.println("1\t2\t3\t4\t5\t6\t7\t"); 
					System.out.println("8\t9\t10\t11\t12\t13\t14\t"); 
					System.out.println("15\t16\t17\t18\t19\t20\t21\t"); 
					System.out.println("22\t23\t24\t25\t26\t27\t28\t");
					System.out.println("29\t30");
				}else if(dayofweek == 2){
					System.out.println("\t1\t2\t3\t4\t5\t6"); 
					System.out.println("7\t8\t9\t10\t11\t12\t13\t"); 
					System.out.println("14\t15\t16\t17\t18\t19\t20\t"); 
					System.out.println("21\t22\t23\t24\t25\t26\t27\t");
					System.out.println("28\t29\t30");
				}else if(dayofweek == 3){
					System.out.println("\t\t1\t2\t3\t4\t5"); 
					System.out.println("6\t7\t8\t9\t10\t11\t12\t"); 
					System.out.println("13\t14\t15\t16\t17\t18\t19\t"); 
					System.out.println("20\t21\t22\t23\t24\t25\t26\t");
					System.out.println("27\t28\t29\t30");
				}else if(dayofweek == 4){
					System.out.println("\t\t\t1\t2\t3\t4"); 
					System.out.println("5\t6\t7\t8\t9\t10\t11\t"); 
					System.out.println("12\t13\t14\t15\t16\t17\t18\t"); 
					System.out.println("19\t20\t21\t22\t23\t24\t25\t");
					System.out.println("26\t27\t28\t29\t30");
				}else if(dayofweek == 5){
					System.out.println("\t\t\t\t1\t2\t3"); 
					System.out.println("4\t5\t6\t7\t8\t9\t10\t"); 
					System.out.println("11\t12\t13\t14\t15\t16\t17\t"); 
					System.out.println("18\t19\t20\t21\t22\t23\t24\t");
					System.out.println("25\t26\t27\t28\t29\t30");
				}else if(dayofweek == 6){
					System.out.println("\t\t\t\t\t1\t2"); 
					System.out.println("3\t4\t5\t6\t7\t8\t9\t"); 
					System.out.println("10\t11\t12\t13\t14\t15\t16\t"); 
					System.out.println("17\t18\t19\t20\t21\t22\t23\t");
					System.out.println("24\t25\t26\t27\t28\t29\t30");
					
				}else if(dayofweek == 7){
					System.out.println("\t\t\t\t\t1"); 
					System.out.println("2\t3\t4\t5\t6\t7\t8\t"); 
					System.out.println("9\t10\t11\t12\t13\t14\t15\t"); 
					System.out.println("16\t17\t18\t19\t20\t21\t22\t");
					System.out.println("23\t24\t25\t26\t27\t28\t29");
					System.out.println("30\t31");
				} 
		}else if(month ==1){ 
			if(dayofweek == 1){
				System.out.println("1\t2\t3\t4\t5\t6\t7\t"); 
				System.out.println("8\t9\t10\t11\t12\t13\t14\t"); 
				System.out.println("15\t16\t17\t18\t19\t20\t21\t"); 
				System.out.println("22\t23\t24\t25\t26\t27\t28\t");
				System.out.println("29");
			}else if(dayofweek == 2){
				System.out.println("\t1\t2\t3\t4\t5\t6"); 
				System.out.println("7\t8\t9\t10\t11\t12\t13\t"); 
				System.out.println("14\t15\t16\t17\t18\t19\t20\t"); 
				System.out.println("21\t22\t23\t24\t25\t26\t27\t");
				System.out.println("28\t29");
			}else if(dayofweek == 3){
				System.out.println("\t\t1\t2\t3\t4\t5"); 
				System.out.println("6\t7\t8\t9\t10\t11\t12\t"); 
				System.out.println("13\t14\t15\t16\t17\t18\t19\t"); 
				System.out.println("20\t21\t22\t23\t24\t25\t26\t");
				System.out.println("27\t28\t29");
			}else if(dayofweek == 4){
				System.out.println("\t\t\t1\t2\t3\t4"); 
				System.out.println("5\t6\t7\t8\t9\t10\t11\t"); 
				System.out.println("12\t13\t14\t15\t16\t17\t18\t"); 
				System.out.println("19\t20\t21\t22\t23\t24\t25\t");
				System.out.println("26\t27\t28\t29");
			}else if(dayofweek == 5){
				System.out.println("\t\t\t\t1\t2\t3"); 
				System.out.println("4\t5\t6\t7\t8\t9\t10\t"); 
				System.out.println("11\t12\t13\t14\t15\t16\t17\t"); 
				System.out.println("18\t19\t20\t21\t22\t23\t24\t");
				System.out.println("25\t26\t27\t28\t29");
			}else if(dayofweek == 6){
				System.out.println("\t\t\t\t\t1\t2"); 
				System.out.println("3\t4\t5\t6\t7\t8\t9\t"); 
				System.out.println("10\t11\t12\t13\t14\t15\t16\t"); 
				System.out.println("17\t18\t19\t20\t21\t22\t23\t");
				System.out.println("24\t25\t26\t27\t28\t29");
			}else if(dayofweek == 7){
				System.out.println("\t\t\t\t\t1"); 
				System.out.println("2\t3\t4\t5\t6\t7\t8\t"); 
				System.out.println("9\t10\t11\t12\t13\t14\t15\t"); 
				System.out.println("16\t17\t18\t19\t20\t21\t22\t");
				System.out.println("23\t24\t25\t26\t27\t28\t29");
			}
			 
		}else{ 
			if(dayofweek == 1){
				System.out.println("1\t2\t3\t4\t5\t6\t7\t"); 
				System.out.println("8\t9\t10\t11\t12\t13\t14\t"); 
				System.out.println("15\t16\t17\t18\t19\t20\t21\t"); 
				System.out.println("22\t23\t24\t25\t26\t27\t28\t");
				System.out.println("29\t30\t31");
			}else if(dayofweek == 2){
				System.out.println("\t1\t2\t3\t4\t5\t6"); 
				System.out.println("7\t8\t9\t10\t11\t12\t13\t"); 
				System.out.println("14\t15\t16\t17\t18\t19\t20\t"); 
				System.out.println("21\t22\t23\t24\t25\t26\t27\t");
				System.out.println("28\t29\t30");
			}else if(dayofweek == 3){
				System.out.println("\t\t1\t2\t3\t4\t5"); 
				System.out.println("6\t7\t8\t9\t10\t11\t12\t"); 
				System.out.println("13\t14\t15\t16\t17\t18\t19\t"); 
				System.out.println("20\t21\t22\t23\t24\t25\t26\t");
				System.out.println("27\t28\t29\t30\t31");
			}else if(dayofweek == 4){
				System.out.println("\t\t\t1\t2\t3\t4"); 
				System.out.println("5\t6\t7\t8\t9\t10\t11\t"); 
				System.out.println("12\t13\t14\t15\t16\t17\t18\t"); 
				System.out.println("19\t20\t21\t22\t23\t24\t25\t");
				System.out.println("26\t27\t28\t29\t30\t31");
			}else if(dayofweek == 5){
				System.out.println("\t\t\t\t1\t2\t3"); 
				System.out.println("4\t5\t6\t7\t8\t9\t10\t"); 
				System.out.println("11\t12\t13\t14\t15\t16\t17\t"); 
				System.out.println("18\t19\t20\t21\t22\t23\t24\t");
				System.out.println("25\t26\t27\t28\t29\t30\t31");
			}else if(dayofweek == 6){
				System.out.println("\t\t\t\t\t1\t2"); 
				System.out.println("3\t4\t5\t6\t7\t8\t9\t"); 
				System.out.println("10\t11\t12\t13\t14\t15\t16\t"); 
				System.out.println("17\t18\t19\t20\t21\t22\t23\t");
				System.out.println("24\t25\t26\t27\t28\t29\t30");
				System.out.println("31");
			}else if(dayofweek == 7){
				System.out.println("\t\t\t\t\t1"); 
				System.out.println("2\t3\t4\t5\t6\t7\t8\t"); 
				System.out.println("9\t10\t11\t12\t13\t14\t15\t"); 
				System.out.println("16\t17\t18\t19\t20\t21\t22\t");
				System.out.println("23\t24\t25\t26\t27\t28\t29");
				System.out.println("30\t31");
			}
			
			
		}
		
		
		System.out.println("Day:" + gc.get(Calendar.DATE));
		System.out.println("Year:" + gc.get(Calendar.YEAR));
		
		
		
		//display the time (you have to set the time above first)
		//GregorianCalendar gc = new GregorianCalendar(2010,2,15,15,30,0);
		System.out.print("Time: ");
		System.out.print(gc.get(Calendar.HOUR)+":");
		System.out.print(gc.get(Calendar.MINUTE) + ":");
		System.out.println(gc.get(Calendar.SECOND));
		
		//How many days ago was the date?
		//get the milliseconds and convert to the number of days
		long DateInMS = gc.getTimeInMillis();
		//you can also get this from the Date class
		//The Gregorian Calendar .getTime method returns a date object
		//A date object is the number of milliseconds
		//since January 1, 1970
		//The Date class allocates a Date object and initializes it so that it 
		//represents the time at which it was allocated, measured to the nearest millisecond.
		Date myDate = gc.getTime();
		myDate.getTime();
		
		//once you know the number of milliseconds you can convert them to the number of days
		long millisecondsPerDay = (24*60*60*1000);
		float numberOfDays = DateInMS/millisecondsPerDay;
		
		System.out.print("Number of Days: ");
		System.out.println(numberOfDays);
		
		
	}
}
	