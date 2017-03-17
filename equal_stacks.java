# Equal Stacks

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int h1[] = new int[n1];
        int height1 = 0;
        int height2 = 0;
        int height3 = 0;
        for(int h1_i=0; h1_i < n1; h1_i++){
            h1[h1_i] = in.nextInt();
            height1 = height1 + h1[h1_i];
        }
        int h2[] = new int[n2];
        for(int h2_i=0; h2_i < n2; h2_i++){
            h2[h2_i] = in.nextInt();
            height2 = height2 + h2[h2_i];
        }
        int h3[] = new int[n3];
        for(int h3_i=0; h3_i < n3; h3_i++){
            h3[h3_i] = in.nextInt();
            height3 = height3 + h3[h3_i];
        }
        if(height1 == height2 && height2 == height3){
            System.out.println(height1);
        }
        else{
            int p1 = 0;
            int p2 = 0;
            int p3 = 0;
            while(height1 != height2 || height2 != height3 || height1 != height3){
                if(height1 > height2 || height1 > height3){
                    height1 = height1 -  h1[p1];
                    p1++;
                }
                else if(height2 > height1 || height2 > height3){
                    height2 = height2 -  h2[p2];
                    p2++;
                }
                else if(height3 > height1 || height3 > height2){
                    height3 = height3 -  h3[p3];
                    p3++;
                }
            }
            System.out.println(height1);
        }
    }
}
