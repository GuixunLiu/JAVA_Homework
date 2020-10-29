/**
 * @(#)HourlyEmployee.java
 *
 *
 * @author
 * @version 1.00 2020/10/21
 */
package HourlyEmployee;

import java.util.*;

public class HourlyEmployee {
	int HourlyWage;
	public HourlyEmployee() {
		SetHourlyEmployee();
	}
	public HourlyEmployee(String Name,int Number, int hourlyWage){
		HourlyWage = hourlyWage;
		OutputHourlyEmployee(Name,Number);
	}
	public void SetHourlyEmployee() {
		System.out.println("Please input HourlyWage:");
		Scanner scan = new Scanner(System.in);
    	HourlyWage = scan.nextInt();
	}
	public int GetHourlyEmployee() {
		return HourlyWage;
	}
	public void OutputHourlyEmployee(String Name, int Number) {
		System.out.println("Name:"+Name);
    	System.out.println("Number:"+Number);
    	System.out.println("HourlyWage:"+HourlyWage);
	}
}
