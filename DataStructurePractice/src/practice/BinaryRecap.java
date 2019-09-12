package practice;

public class BinaryRecap {

	public static void main(String[] args) {
	
	int num=8;
	System.out.println(fibo(num));
	
}

	public static int fibo(int num) {
		if(num==0 || num==1)
			return 1;
	return	fibo(num-1)+fibo(num-2);
	}
}