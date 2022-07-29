
public class ArrayDemo {
	public static void main(String[] args) {
//		int a; //declaration(선언)
//		a=10; //Assignment
//		int b=5; //Initializaition(각각의 선언을 할 때 사용)
//		
//		int []array;  //배열은 heap에 만들어지는 주소라서 new를 선언해주는거다.
//		//Declaration(선언), 배열을 선언 [] 넣어줘야함, 배열은 주소로 친다, 배열은 여러개의 데이터를 핸들링한다(동시에 여러개 가능).
//		array=new int[4]; //객체인지, 주소인지 물어보는것이기 때문에 new 선언, int 4개의 주소를 array에게 넘겨준 것
//		int[]array1= {1,2,3,4}; // 
		
		//첫 번째 방법, 방을 미리 만들고 그 방에 주소를 일일이 넣어주는 방법.
//		int []array;
//		array=new int[4];
//		array[0]=4; array[1]=2; array[2]=9; array[3]=5;
		
		//두 번째 방법, 방이 많을 때 사용하는 방법.
//		int[]array;
//		array=new int[]{4,2,9,5}; //방의 갯수를 정했다가 주소가 많이 들어오면 오류가 날것에 대비하여 방의 갯수를 정하지 않는다.
		
		//세 번째 방법, 선언하면서 주소를 직접 주는 방법.
//		int array[]= {4,2,9,5}; //치명적인 단점이 있다_initalization이 아니기 때문에 따로 선언하게 될 경우 오류발생 / 값이 정해져있지않으면 사용불가.
		
//		double[]array;
//		array=new double[3];
//		array[0]=60.5; array{1]=70.5; array[3]=80.5;  
		
//		double[]array;
//		array=new double[] {60.5,70.5,80.5};
		
//		double array[]= {60.5,70.5,80.5};
		
//		char array[];
//		array=new char[2];
//		array[0]='a'; array[1]='b';
		
//		char[]array;
//		array=new char[] {'a','b'};
		
//		char array[]= {'a','b'};
		
//		boolean array[];
//		array=new boolean[2];
//		array[0]=true; array[1]=false; 

//		boolean[]array;
//		array = new boolean[]{true,false};
		
		boolean []array= {true, false,false};
		
		for(int i=0; i<=2; i++) {
			System.out.println("array["+i+"]="+array[i]);
		}
		
//		String []array;
//		array = new String[2];
//		array[0]="정지강"; array[1]="정강지";
//		
//		String[]array;
//		array=new String[] {"글자", "숫자"};
	}
}
