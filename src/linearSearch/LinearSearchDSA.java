package linearSearch;

//linear search to search if sizes less than max size are available in inventory.
public class LinearSearchDSA {
public int key=0;
	

	public boolean search(int[] arr, int key) {
		for(int i = 0; i<arr.length;i++) {
			if(arr[i]==key) {
				return true;
			}
		}
		return false;
	}
}
