package JavaPlay;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class powerOfTwo {
	
	/*
	 * Complete the function below.
	 */

	static int[] countTwos(int[] arr) {
		int len = arr.length;
		int resArr[] = new int[len];
		for (int i=0; i<=len; i++){
			int val=arr[i];
				  if (val == 0){
				    resArr[i]=0;}
				  while (arr[i] != 1)
				  {
				    if (val%2 != 0)
				    	resArr[i]=0;
				    val = val/2;
				  } resArr[i]= 1;
				
		} return resArr;
			    }		
	   

	    
	    
	    public static void main(String[] args) throws IOException{
	        Scanner in = new Scanner(System.in);
	        final String fileName = System.getenv("OUTPUT_PATH");
	        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
	        int[] res;
	        
	        int _arr_size = Integer.parseInt(in.nextLine());
	        int[] _arr = new int[_arr_size];
	        int _arr_item;
	        for(int _arr_i = 0; _arr_i < _arr_size; _arr_i++) {
	            _arr_item = Integer.parseInt(in.nextLine());
	            _arr[_arr_i] = _arr_item;
	        }
	        
	        res = countTwos(_arr);
	        for(int res_i=0; res_i < res.length; res_i++) {
	            bw.write(String.valueOf(res[res_i]));
	            bw.newLine();
	        }
	        
	        bw.close();
	    }
	}
