package string;

import java.util.Scanner;

public class String_8 {
	public String solution(String str) {
		String answer="NO";
		str = str.toUpperCase().replaceAll("[^A-Z]", ""); //�빮�� A-Z������ �ƴϸ� �� �������� ��ü
		String tmp = new StringBuilder(str).reverse().toString();
		if(str.equals(tmp))
			answer="YES";
		return answer;
	}

	public static void main(String[] args) {
		String_8 str8 = new String_8();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine(); //������ �о�� �ϱ� ����
		System.out.println(str8.solution(str));

	}
}