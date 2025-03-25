package javapractise;

public class separateNumberAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input="1234TYvb99";
		
		StringBuilder numbers=new StringBuilder();
		StringBuilder alphabet=new StringBuilder();
		char[] characterArray=input.toCharArray();
		
		
		for(char character:characterArray) {
			if(Character.isDigit(character)) {
				numbers.append(character);
			}else if(Character.isAlphabetic(character)) {
				alphabet.append(character);
			}
		}
		System.out.println(numbers);
		System.out.println(alphabet);
		
	}

}
