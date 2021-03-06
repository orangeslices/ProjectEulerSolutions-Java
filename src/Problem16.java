

import java.math.BigInteger;
/*
2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

What is the sum of the digits of the number 2^1000? 
*/
public class Problem16 {

	
	public static void main(String[] args) {
		int range = 1000;
		BigInteger b = new BigInteger("2");
		b = b.pow(range);

		int sum =0;
		String value = b.toString();
		
		for(int i =0; i< value.length();i++)
		{
			sum+= Integer.parseInt(value.substring(i,i+1));
		}
		System.out.println(sum);
	}

}
