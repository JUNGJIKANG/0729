import java.util.Scanner;
import java.util.Scanner;
public class WhileDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=1, a=1;
		
		while(i<=9) {
			
			while(a<=9) {
				System.out.printf("%dx%d=%d\t",a,i,a*i);				
				a++;
			}
//			System.out.println(a);
			System.out.println();
			a = 1;
			i++;
		}
	}
}
