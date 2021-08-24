package string;

import java.util.Scanner;

public class String_6 {
	public String solution(String str) {
		String answer = "";
		for(int i=0;i<str.length();i++) {
//			System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i)));
			if(str.indexOf(str.charAt(i))==i)
				answer += str.charAt(i); //자기 문자와 위치가 같은 문자만 누적
		}
		return answer;
	}

	public static void main(String[] args) {
		String_6 str6 = new String_6();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(str6.solution(str));
	}

}

