import java.util.Scanner;
public class ForDemo_1 {
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.print("몇 단? : ");
//		int dan=sc.nextInt();
//		for(int i=1; i<999; i++) {
//			System.out.printf("%dx%d=%d\n",dan,i,dan*i);
		for(int i=1; i<=5; i++) {
			for(int a=1; a<=i; a++) {
				System.out.print("★\t");
			}
			System.out.println();
		}
		for(int i=4; i>0; i--) {
		for(int a=1; a<=i; a++) {
			System.out.print("★\t");
		}
		System.out.println();
	}
	}
	}

