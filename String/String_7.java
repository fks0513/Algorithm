package string;

import java.util.Scanner;

public class String_7 {
	public String solution(String str) {
		String answer = "NO";
		String tmp = new StringBuilder(str).reverse().toString();
		if(str.equalsIgnoreCase(tmp))
			answer="YES";
		
//		String answer = "YES";
//		str = str.toUpperCase(); //�빮�ڷ� �� �ٲ� -> ��ҹ��� ���� ������
//		int len = str.length();
//		for(int i=0;i<len/2;i++) {
//			if(str.charAt(i)!=str.charAt(len-i-1))
//				answer="NO";
//		}
		
		return answer;
	}

	public static void main(String[] args) {
		String_7 str7 = new String_7();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(str7.solution(str));
	}
}
