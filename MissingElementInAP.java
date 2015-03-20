package JavaPlay;

//import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
public class MissingElementInAP {
public int MissingElementInAP (int arr1[], int n )
{
    int d,i,j,k;
    k = arr1[2] - arr1[1];
    j = arr1[1] - arr1[0];
    d = (k==j)? arr1[1] - arr1[0] : arr1[3] - arr1[2];
    for (i=0; i<n; i++){
    if (arr1[i+1]-arr1[i] != d){
    	break;
}
 
}
    return (arr1[i]+d); 
}

    
public static void main(String[] args) {
		// TODO Auto-generated method stub
	MissingElementInAP sol = new MissingElementInAP ();
	int n;
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		System.out.print("How many terms in AP? \n -->");
		//get user input for a
		n=reader.nextInt();
		System.out.println("You Entered: "+ n);
		int[] a = new int[n];
		System.out.println("Enter the terms seperated by space...");
		for(int i=0;i<n;i++){
			a[i]=reader.nextInt();
		}
    System.out.println("You Entered: " + Arrays.toString(a));
    int z = sol.MissingElementInAP(a, n);
    System.out.println("Missing Term is: " + z);
	}
}
