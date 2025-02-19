package week1.day3;

public class IsPrimeNumber {
	
	public static boolean isPrime (int num)
	{
		if(num<=1)
		return false;
		for (int i = 2; i<num/2; i++) {
			if(num%i==0)
				
				return false;
		}
		return true;
		
	}

	public static void main(String[] args) {
     int num1= 13;
     if (isPrime(num1)) {
    	 
    	 System.out.println("Number is Prime");
		
	} else {

	
		
			System.out.println("Numberis not prime");
	}
    		 


	}

}
