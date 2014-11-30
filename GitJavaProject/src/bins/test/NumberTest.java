package bins.test;

import java.util.Arrays;

public class NumberTest {

	public static void main(String[] args) {
		Integer num = 23;
		System.out.println(num.intValue());
		System.out.println(num.doubleValue());
		Integer n2 = Integer.parseInt("6");
		System.out.println(n2.doubleValue());
		
		String sourceStr="Binu Kooran _$Njarakal";
		
		//char[] str = {'B','n'}
		
		String targetStr=null;
		

		char[] source = sourceStr.toCharArray();
		
		for (char c:source ){
			if (Character.isAlphabetic(c)){
				targetStr=targetStr+c;
			}
		}
		

		char[] chars = targetStr.toCharArray();
		
		Arrays.sort(chars);
		String sorted = new String(chars);
		System.out.println(sorted);
		
		/*
		char s[] = {'y','6','u','t','3'};
		char c[]={};
		int n[]={}; 
		int nctr=0;
		int cctr=0;
		for (char i : s){			
			if (Character.isDigit(i)){
				n[nctr] = i;
				nctr++;
			}else{
				c[cctr] = i;
				cctr++;
			}
		}
		System.out.println("Numbers");
		System.out.println(n.toString());
		System.out.println("characters");
		System.out.println(c.toString());
		*/
	}
}
