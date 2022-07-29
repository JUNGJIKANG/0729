import java.util.Scanner;

public class DoWhileDemo_1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String Y_N;
		do {			
		System.out.print("숫자를 입력하세요 : ");
			int su=sc.nextInt();
			sc.nextLine();
			System.out.println(su+"는(은)"+((su%2==0)?"짝수입니다.":"홀수입니다."));
			System.out.print("Again(Y/N)?");
			Y_N=sc.next();
		}while(Y_N.equals("y")||Y_N.equals("Y"));
		System.out.println("Program Over");
	}
}
//수를 입력하고 정수인지 실수인지 확인하는 코딩