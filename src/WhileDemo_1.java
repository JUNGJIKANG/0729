import java.util.Scanner;

public class WhileDemo_1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.print("숫자를 입력하세요 : ");
			int su=sc.nextInt();
			sc.nextLine();
			System.out.println(su+"는(은)"+((su%2==0)?"짝수입니다.":"홀수입니다."));
			System.out.print("Again(Y/N)?");
			String Y_N=sc.nextLine();
			if(Y_N.equals("n")||Y_N.equals("N")) break;
		}
		System.out.println("Program Over");
	}
}
//수를 입력하고 정수인지 실수인지 확인하는 코딩