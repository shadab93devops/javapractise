package javapractise;

import java.util.Arrays;

public class MoveZeroToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		int[] arr= {1,0,0,1,0,0,1,1,1,1};
		
		System.out.println(Arrays.toString(arr));
		int left=0;
		int right=arr.length-1;
		
		while(left<right) {
			if(arr[left]!=0) {
				left++;
			}else if(arr[right]!=1) {
				right++;
			}
			else {
				int temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
				left++;
				right--;
			}
		}
		
		
		System.out.println(Arrays.toString(arr));
	}

}
