import java.util.Scanner;
public class ForDemo_3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int i=1; i<=9; i++) {
		for(int j=2; j<=9; j++) {
			System.out.printf("%dx%d=%d\t\t",j,i,j*i);
		}System.out.println();
	}
}
}