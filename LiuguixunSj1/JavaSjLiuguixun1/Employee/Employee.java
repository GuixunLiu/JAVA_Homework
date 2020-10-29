/**
 * @(#)Employee.java
 *
 *
 * @author
 * @version 1.00 2020/10/21
 */
package Employee;

import java.util.*;
import HourlyEmployee.HourlyEmployee;
import SalariedEmployee.SalariedEmployee;

public class Employee {
	String Name;
	int Number;
	int Pattern;
	int WeeklyWage;
	int HourlyWage;
	
	public Employee() {
		SetEmployee();
	}
	public void SetEmployee() {
		Scanner scan = new Scanner(System.in);
    	System.out.println("Please input name:");
    	Name = scan.nextLine();
    	System.out.println("Please input number:");
    	Number = scan.nextInt();
    	System.out.println("Choose SalariedEmployee(1) or HourlyEmployee(2)?");
    	Pattern = scan.nextInt();
    	if(Pattern == 1) {
			SalariedEmployee aSalariedEmployee = new SalariedEmployee();
			WeeklyWage = aSalariedEmployee.GetSalariedEmployee();
    	}
    	if(Pattern == 2) {
			HourlyEmployee anHourlyEmployee = new HourlyEmployee();
			HourlyWage = anHourlyEmployee.GetHourlyEmployee();
    	}
	}
	public void OutputEmployee() {
		if(Pattern == 1) {
			SalariedEmployee aSalariedEmployee = new SalariedEmployee(Name, Number, WeeklyWage);
		}
		if(Pattern == 2) {
			HourlyEmployee anHourlyEmployee = new HourlyEmployee(Name, Number, HourlyWage);
		}
	}
}
