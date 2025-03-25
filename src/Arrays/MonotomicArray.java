package Arrays;

public class MonotomicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {5,4,3,2,1};
		
		
		boolean increasing=true;
		boolean decreasing=true;
		
		for
		(int i=1;i<arr.length;i++) {
			if(arr[i-1]<arr[i]) {
				decreasing=false;
				
			}
			else if(arr[i-1]>arr[i]) {
				increasing=false;
			}
		}
		if(increasing || decreasing) {
			System.out.println("it is monotonic array");
		}
		
		
		else {
			System.out.println("it is not monotonic array");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
