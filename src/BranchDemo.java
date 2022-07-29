import java.util.Scanner;

public class BranchDemo {
	public static void main(String[] args) {
//		for(int i=1; i<=100; i++) {
//			if(i%7==0) System.out.print(i+"\t");
//			else continue; 
//		}
		
		//다중 반복문
//		outer :
//		for(int i=65; 1<=90; i++) {
//			int a=65; //초기치
//			inner :
//			while(a<=i) { //조건
//				System.out.printf("%c\t",a);
//				if(a==70)break outer; //outer를 벗어나겠다는 의미로 break옆에 작성
//				a++; //증감	
//			}
//			System.out.println();
//		}
		String systemPassword="ABCD";
		Scanner sc=new Scanner(System.in);
		System.out.print("Input Password");
		String userPassword=sc.nextLine();
		int i;
		for(i=0; i<4; i++) {
			if(systemPassword.charAt(i)==userPassword.charAt(i))continue;
			else break;
		}
		if(i==4)System.out.println("Success");
		else System.out.println("Fail");
	}
}
