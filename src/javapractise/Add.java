package javapractise;

public class Add {

	public static void main(String[] args) {

		String input="abBcd";
		
		int count=0;
		char lastCharacter=input.toCharArray()[0];
		
		lastCharacter=Character.toLowerCase(lastCharacter);
		
		for(int i=1;i<=input.length()-1;i++) {
			char currentCharacter=input.toCharArray()[i];
			currentCharacter=Character.toLowerCase(currentCharacter);
		if(lastCharacter!=currentCharacter) {
			count++;
		}
		lastCharacter=currentCharacter;
		
		
		}
		
		System.out.println("the count of character key chnage " + count);
		
		
		int[] arr= {5,6,7,8};
		
		boolean increasing=true;
		boolean decreasing=true;
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i-1]<arr[i]) {
				decreasing=false;
			}else if(arr[i-1]>arr[i]) {
				increasing=false;
			}
		}
		
		if(increasing ||decreasing ) {
			System.out.println("it is monotonic array");
		}
		else {
			System.out.println("it is not monotonic array");
		}
	}

}
