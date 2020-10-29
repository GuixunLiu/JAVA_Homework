/**
 * @(#)SalariedEmployee.java
 *
 *
 * @author
 * @version 1.00 2020/10/21
 */
package SalariedEmployee;

import java.util.Scanner;

public class SalariedEmployee {
	int WeeklyWage;
	public SalariedEmployee() {
		SetSalariedEmployee();
	}
	public SalariedEmployee(String Name,int Number, int weeklyWage){
		WeeklyWage = weeklyWage;
		OutputSalariedEmployee(Name, Number);
	}
	public void SetSalariedEmployee(){
    	System.out.println("Please input WeeklyWage:");
    	Scanner scan = new Scanner(System.in);
    	WeeklyWage = scan.nextInt();
    }
    public int GetSalariedEmployee(){
    	return WeeklyWage;
    }
    public void OutputSalariedEmployee(String Name,int Number){
    	System.out.println("Name:"+Name);
    	System.out.println("Number:"+Number);
    	System.out.println("WeeklyWage:"+WeeklyWage);
    }
}
