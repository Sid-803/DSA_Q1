package linearSearch;

public class LinearSearchDSA {
public int key=0;
	

	
	public int search(int[] arr, int key) {
		for(int i = 0; i<arr.length;i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	}
	
	public void sort(int[] arr) {
		int size = arr.length;
		
		for(int i =0; i<size-1;i++) {
			int index = i;
			for(int j=i+1;j<size;j++) {
				if(arr[j]<arr[index]) {
					index=j; //search the smallest element
				}
			}
			//swap smallest at pos1
			int smallest = arr[index];
			arr[index]=arr[i];
			arr[i]= smallest;
		}
		
	}
}
