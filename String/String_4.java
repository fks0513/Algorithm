package string;

import java.util.ArrayList;
import java.util.Scanner;

public class String_4 {
	public ArrayList<String> solution(int n, String[] str) {
		ArrayList<String> answer= new ArrayList<>();
//		for(String x : str) {
//			String tmp = new StringBuilder(x).reverse().toString();
//			answer.add(tmp);
//		}
		for(String x:str) {
			char[] s = x.toCharArray();//단어를 갖는 배열이 char로 전환
			int lt = 0, rt = x.length()-1;
			while(lt<rt) {
				char tmp = s[lt];
				s[lt]=s[rt];
				s[rt]=tmp;
				lt++;
				rt--;
			}
			String tmp = String.valueOf(s); //s라는 문자배열을 String화 시킴(valueOf=static class메서드)
			answer.add(tmp);
		}
		return answer;
		
	}

	public static void main(String[] args) {
		String_4 str4 = new String_4();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] str = new String[n];
		for(int i=0;i<n;i++) {
			str[i]=sc.next();
		}
		for(String x : str4.solution(n, str)) {
			System.out.println(x);
		}
		
	}

}
