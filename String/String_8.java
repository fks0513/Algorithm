package string;

import java.util.Scanner;

public class String_8 {
	public String solution(String str) {
		String answer="NO";
		str = str.toUpperCase().replaceAll("[^A-Z]", ""); //대문자 A-Z까지가 아니면 다 공백으로 대체
		String tmp = new StringBuilder(str).reverse().toString();
		if(str.equals(tmp))
			answer="YES";
		return answer;
	}

	public static void main(String[] args) {
		String_8 str8 = new String_8();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine(); //한줄을 읽어야 하기 때문
		System.out.println(str8.solution(str));

	}
}