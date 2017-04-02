# Recover array

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] file = new int[n];
        for(int file_i=0; file_i < n; file_i++){
            file[file_i] = in.nextInt();
        }
		
		// Counts the lines
        int count = 0;
        if(n == 0){
            System.out.println(count);
        }
        int j=0;
		
		// Iterate till the end
        while(j<n){
            int a=file[j];
            count++;
            j = j+a+1;
        }
        System.out.println(count);
    }
}
