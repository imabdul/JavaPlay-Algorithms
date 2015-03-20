package JavaPlay;

public class multiThreadingFibCompute extends Thread{

	    private int x;
	    public int answer;
	 
	    public multiThreadingFibCompute(int x) {
	        this.x = x;
	    }
	 
	    public void run() {
	        if (x == 0){ 
	            answer = 0;
	        }else if( x == 1 || x == 2 ) {
	            answer = 1;
	        }else {
	            try {
	                /*
	                 * Below we are invoking 2 threads to compute separate values
	                 * This will for a tree structure
	                 */
	            	multiThreadingFibCompute f1 = new multiThreadingFibCompute(x-1);
	            	multiThreadingFibCompute f2 = new multiThreadingFibCompute(x-2);
	                f1.start();
	                f2.start();
	                f1.join();
	                f2.join();
	                answer = f1.answer + f2.answer;
	            }catch(InterruptedException ex) { 
	                ex.printStackTrace();
	            }
	        }
	    }
	 
	    public static void main(String[] args){
	        try {
	            int inputNum = 8;
	            multiThreadingFibCompute f = new multiThreadingFibCompute(inputNum);
	            f.start();
	            f.join();
	            System.out.println("Fibonacci number at "+inputNum+" position is:"+f.answer);
	        }
	        catch(Exception e) {
	            e.printStackTrace();
	        }
	    }
	 
	
}
