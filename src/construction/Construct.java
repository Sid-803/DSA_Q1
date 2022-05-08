package construction;
import linearSearch.*;
import java.util.Stack;


public class Construct {
	LinearSearchDSA obj1 = new LinearSearchDSA();
	static Stack<Integer> Building = new Stack<Integer>();
	int key;
	
	public Construct(int key) {
		this.key = key;
	}
	
	//Make use of linear search to add all possible other sizes which can be added on top of current maximum size
	public  void initiate(int[] arr,int key,Stack<Integer> s) {
		for(int a = key-1;a>=1;a--) { 
			boolean x = obj1.search(arr, a);
			if(x==true) {
				int z = s.peek();
				if((z-a)>1) {}
				else {
				s.push(a);
				}
			}
		}
	}
	
	//To report floors added in a day all non zero members from main stack are put in temporary stack
	public void emp(Stack<Integer> s1, Stack<Integer> s2) {
		if (s1.empty())
	        return;
		
		int s = s1.peek();
		s1.pop();
		if(s!=0)
		s2.push(s);
		emp(s1,s2);

	}
	
	//To print the stack
	public void PrintStack(Stack<Integer> s){
	     
	    // If stack is empty
	    if (s.empty())
	        return;
	   
	    // Extract top of the stack
	    int x = s.peek();
	   
	    // Pop the top element
	    s.pop();
	   
	    // Print the current top
	    // of the stack i.e., x
	    System.out.print(x + " ");
	   
	    // Proceed to print
	    // remaining stack
	    PrintStack(s);
	   
	    // Push the element back
	    s.push(x);
	}	
}
