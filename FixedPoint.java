package JavaPlay;

public class FixedPoint {
	
	public static void fixedPoint(int input[] , int n) {
		
		int i=0;
		//int arr[] = int input[];
		for (i=0; i<n; i++){
			if (input[i]==i){
				System.out.println(i);
			}System.out.println(-1);
			}
		
		}
	
	public static void main(String[] s) {
	int arr[] = {5,-9,-8,3,2,1};
	int n = 5;
		fixedPoint(arr, n);
		
		}
}
