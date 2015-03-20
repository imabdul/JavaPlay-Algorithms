package JavaPlay;

public class fibonacciRecursion {
	public fibonacciRecursion (){}
	public int calculate (int n){
		if(n == 0)
			return 0;
		if(n == 1 || n==2)
			return 1;
		else
			return calculate(n-1) + calculate(n-2);
	}
	
	public static void main (String[] args){
		int inputVal = 6;
		fibonacciRecursion fb = new fibonacciRecursion();
		System.out.println("For index:" +inputVal+ " Fibonacci value is:"+fb.calculate(inputVal));
	}
}
