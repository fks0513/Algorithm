package string;

import java.util.Scanner;

public class String_6 {
	public String solution(String str) {
		String answer = "";
		for(int i=0;i<str.length();i++) {
			if(str.indexOf(str.charAt(i))==i) 
				//indexOf : Ư�� ���ڳ� ���ڿ��� �տ������� ó�� �߰ߵǴ� �ε����� ��ȯ
				answer+=str.charAt(i);
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
