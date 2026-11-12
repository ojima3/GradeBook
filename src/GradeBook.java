import java.util.*;
public class GradeBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Hey, Welcome to Grade Book");
		System.out.println("Enter Grades (1=100. Enter -1 to stop.");
		
		int grade = 0;
		int count = 0;
		int total = 0;
		int highest = 0;
		int lowest = 100;
		
		while (grade != -1) {
			
			System.out.println("Ener Grade:");
			grade = in.nextInt();
			
			if (grade == -1) {
				break;
				
			}
			
			if (grade < 1 || grade > 100)  {
				System.out.println ("Not Valid");
					}
			else {
				total = total + grade;
				count = count + 1;
				
				if (grade > highest) {
				highest = grade;
				}
				if (grade < lowest) {
					lowest = grade;
				}
			}
			
		}
		
		System.out.println("All Done!");
		System.out.println("Total Grades Entered: " + count);
		
		if (count> 0) {
			double average = (double) total / count;
			System.out.println("Highest Grade: " + highest);
			System.out.println("Lowest Grade: " + lowest);
			System.out.println("Average: " + average);
		}
		
	in.close();
	}
	
	
	}


