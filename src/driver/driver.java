package driver;
import construction.*;
import java.util.Scanner;
import java.util.Stack;
public class driver {
	
	public static void main(String[] args) {
		//main stack
		Stack<Integer> Building = new Stack<Integer>(); 
		//temporary stack
		Stack<Integer> temp = new Stack<Integer>(); 
		System.out.println("Enter the no. of floors in building.");
		Scanner sc = new Scanner(System.in);
		int j = sc.nextInt();
		//Determines the size which goes at bottom
		int key1 = j; 
		//Instance of Construct class which contains stack related methods
		Construct obj2 = new Construct(j); 
		//Array to store all user inputs based on size received on daily basis
		int[] arr = new int[j]; 
		
		//looping to Save every floor size entry into array day wise.
		for(int i = 0; i<j; i++) {
			System.out.println("Floor size on day " + (i+1));
			int k = sc.nextInt();
			arr[i] = k;
			//if input != bottom floor
			if(k<key1) {
				Building.push(0); //null assembly on that day
				System.out.println("Day " + (i+1) + "-Floors which can be added is/are as follows:-");
				System.out.println(0);
				System.out.println();
			//if input = bottom floor
			}else {
				//input size is assembled that day is pushed in stack
				Building.push(k); 
				//Iterates all possible sizes which can be assembled that day based on recorded data in array
				obj2.initiate(arr, key1,Building);
				//Decreases the next maximum size based on last size assembled.
				int c = Building.peek();
				key1=c-1;
				//It empties all size assembled in a day in a temporary stack
				obj2.emp(Building, temp);
				//Prints the sizes assembled in that day using temporary stack
				System.out.println("Day " + (i+1) + "-Floor size which can be added is/are as follows:-");
				obj2.PrintStack(temp);
				System.out.println();
				System.out.println();
				//Clears the temporary stack for re-use.
				temp.clear();
			}
		}
		sc.close();	
	}
}
