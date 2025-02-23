package week1.day4;

public class Palindrome {

	public static void main(String[] args) {
		
		  int num = 12021, reverse = 0, rem, temp;  
		  
		    // palindrome if num and reverse are equal  
		    if (getReverse(num, reverse) == num)  
		     System.out.println (num + " is Palindrome");  
		    else  
		      System.out.println (num + " is not Palindrome");  
		  }  
		//function to reverse the number    
		  static int getReverse(int num, int rev){  
		    if(num == 0)  
		        return rev;      
		    int rem = num % 10;  
		    rev = rev * 10 + rem;  
		    return getReverse(num / 10, rev);  
		}  
		}  