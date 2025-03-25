package javapractise;

public class StringPanagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Try programiz.pro");
        
        String input="The quick brown fox jumps over the lazy dog";
        input=input.toLowerCase();
        boolean res=isPangram(input);
        System.out.println(res);
        
        
        if(res){
            System.out.println("it is panagram");
        }else {
            System.out.println("it is not panagram");
        }
	}
	 public  static boolean isPangram(String input){
	        if(input.length()<26){
	            return false;
	        }
	        
	        for(char i='a';i<='z';i++){
	          if(input.indexOf(i)==-1 ){
	              return false;
	          }
	          break;
	          
	        }
	        return true;
	        
	        
	    }
}
