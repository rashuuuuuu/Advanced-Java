package javaIntro;

public class conditional {

	public static void main(String[] args) {
		//try weather the year is leap year or not
		int year1=2000;
		int year2=3456;
		if(year1%4==0) {
			if(year1%100==0) {
			if(year1%400==0){
				System.out.println("year1 is leap year");
			}
			else {
				System.out.println("year1 is not a leap year");
			}
			
		}
	}
}
}