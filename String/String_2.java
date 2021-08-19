package string;

import java.util.Scanner;

public class String_2 {

	public String change(String str) {
		String answer="";
		for(char x : str.toCharArray()) {
//			if(Character.isLowerCase(x)) 
//				answer+=Character.toUpperCase(x);
//			else 
//				answer+=Character.toLowerCase(x);
			
			if(x>=97 && x<=122) //ascii코드 사용
				answer+=(char)(x-32);
			else
				answer+=(char)(x+32);
		}
		
		return answer;
	}
	public static void main(String[] args) {
		String_2 str2 = new String_2();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(str2.change(str));

	}

}