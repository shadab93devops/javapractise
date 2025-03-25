package javapractise;

public class monotonicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] ar= {1,2,3,4,5,4};

boolean increasing=true;
boolean decreasing=true;
int left=0;
int right=1;
for(int i=1;i<=ar.length-1;i++) {
	if(ar[left]<ar[right]) {
		decreasing=false;
	}
	else if(ar[left]>ar[right]) {
		increasing=false;
	}
	else {
		left++;
		right++;
	}
}
	if(increasing || decreasing) {
		System.out.println("it is monotonic array");
	}else {
		System.out.println("it is not monotonic array");
	}
		
		
	}

}
