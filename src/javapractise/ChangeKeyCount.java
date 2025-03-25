package javapractise;

public class ChangeKeyCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String input="abBaaaa";
		
		System.out.println(input.length()-1);
		char lastKey=input.toCharArray()[0];
		lastKey=Character.toLowerCase(lastKey);
		int count=0;
		for(int i=1;i<=input.length()-1;i++) {
			char currentKey=input.toCharArray()[i];
			
			currentKey=Character.toLowerCase(currentKey);
			
			if(currentKey != lastKey) {
				count++;
			}
			
			lastKey=currentKey;
			
		}
		
		System.out.println("the count of characetr change : "+ count);
	}

}
