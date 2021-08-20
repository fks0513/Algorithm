package string;

import java.util.Scanner;

public class String_3 {
	public String solution(String str) {
		String answer="";
		int m=Integer.MIN_VALUE, pos; //최소값으로 초기화
		
//		String[] s=str.split(" "); //공백으로 나눔
//		for(String x : s) {
//			int len = x.length();
//			if(len>m) {
//				m=len;
//				answer=x;
//			}
//		}				
		
		//indexOf,substring 활용
		while((pos=str.indexOf(' '))!=-1){
			String tmp = str.substring(0, pos);
			int len = tmp.length();
			if(len>m) {
				m=len;
				answer=tmp;
			}
			str=str.substring(pos+1);
		}
		if(str.length()>m)
			answer=str;
		return answer;
	}

	public static void main(String[] args) {
		String_3 str3 = new String_3();
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine(); //한 줄을 입력받음
		System.out.println(str3.solution(str));
		
		

	}

}
