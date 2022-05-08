package driver;

import java.util.Scanner;
import java.util.Stack;
import linearSearch.*;
public class driver {

	public static void main(String[] args) {
		
		LinearSearchDSA obj1 = new LinearSearchDSA();
		Stack<Integer> Building = new Stack<Integer>();
		System.out.println("Enter the no. of floors in building.");
		Scanner sc = new Scanner(System.in);
		int j = sc.nextInt();
		int key = j;
		int[] arr = new int[j];
		String[] arr2 = new String[j];
		
		for(int i = 0; i<j; i++) {
			System.out.println("Floor size on day" + i+1);
			int k = sc.nextInt();
			arr[i] = k;
			if(k==key) {
				Building.push(k);
				
			}
		}
		
	}

}
