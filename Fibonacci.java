package JavaPlay;

public class Fibonacci {
	static int Fibonacci(int n){
		if (n==0){
			return 0;
		}
		if (n==1){
			return 1;
		}
		else {
			int v1 = 0;
	        int v2=1;
	        int v3;
	        for (int i=2; i<=n; i++){
	    	v3 = v2+v1;
	    	    v1=v2;
	    	    v2=v3;
	    }return v2;
	}
	}
	
	public static void main (String[] args){
	int result = Fibonacci(5);
	System.out.println(result);
	}
}
