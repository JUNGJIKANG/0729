
public class DoWhileDemo {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			System.out.print(i+"\t");
			}
			System.out.println();
			System.out.println("===========================================================================");

			int j=1; //초기치
			while(j<=10) {//조건
				System.out.print(j+"\t");
				j++;
			}
			System.out.println();
			System.out.println("===========================================================================");
			
			int k=1; //초기치
			do { //조건
				System.out.print(k+"\t");
				k++; //증감
			}while(k<11);
	}
}
//1~10까지 출력