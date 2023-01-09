package Ch06;

import java.util.Scanner;

public class C02ElseIf {
	public static void main(String[] args) {
		
		/**
		 * 국어, 영어, 수학
		 * 각 과목당 40점 미만 불합격,
		 * 평균이 60점 미만이면 불합격,
		 * 그게 아니라면 합격
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어, 영어, 수학 점수를 각각 입력해주세요.");
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		
		double avg = (double)(kor + eng + math)/3;
		
		if(kor < 40) {
			System.out.println("국어점수 미달 불합격, 국어점수 : " + kor);
		}else if(eng < 40) {
			System.out.println("영어점수 미달 불합격, 영어점수 : " + eng);
		}else if(math < 40) {
			System.out.println("수학점수 미달 불합격, 수학점수 : " + math);
		}else if(avg < 60) {
			System.out.println("평균점수 미달 불합격, 평균점수 : " + avg);
		}else {
			System.out.println("축하합니다. 합격입니다. 평균점수 : " + avg);
		}
		
		sc.close();
		
		
	}
}
