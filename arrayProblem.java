package JavaPlay;
import java.util.Arrays;

public class arrayProblem {
	
	public static void arrayProblem(int input[] , int n) {
		
	int l=input.length; 
	int ol=(l*l)-1;
	int [] outArray = new int[ol];
    int i,j,k;
		for (i=0; i<l; i++){
			outArray[i] = input[i];
		}
		for (j=0; j<l; j++){
			for (k=0; k<l; k++){
				int v = input[j]*input[k];
				if (v < n && !haveValue(outArray, v)){
					outArray[i] = v;
					i++;
				}
			}			
		}
		System.out.println(Arrays.toString(outArray));
	}
	
	 public static boolean haveValue(int [] outArray, int a){
		int m;
		for (m=0; m<outArray.length; m++){
			if(outArray[m]==a){
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
	int arr[] = {1,2,3,4};
	int n = 17;
	arrayProblem(arr, n);
		
		}
}
