package string;

import java.util.Scanner;

public class String_1 {
	public int solution(String str, char t) {
		int answer = 0;
		str=str.toUpperCase();
		t=Character.toUpperCase(t); 
		//System.out.println(str+" "+t);
		
//		for(int i=0;i<str.length();i++) { �ε��� ���
//			if(str.charAt(i)==t) 
//				answer++;
//		}
		
		for(char x : str.toCharArray()) { //foreach�迭��
			if(x==t)
				answer++;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		String_1 str1 = new String_1();
		Scanner sc = new Scanner(System.in);
		String str=sc.next(); //���ڿ� �о����
		char c = sc.next().charAt(0); //���ڿ��� �����Ѱ��� ������
		
		System.out.println(str1.solution(str, c));

	}

}