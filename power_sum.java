# The Power Sum

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
        int ans = Number(X, N, 1);
        System.out.println(ans);
        
    }
    public static int Number(int X, int N, int val){
        if(X == 0){
            return 1;
        }
        int count = 0;
        for(int i=val; (int)Math.pow(i,N)<=X; i++){
            count = count+Number((int)(X-Math.pow(i,N)), N, i+1);
        }
        return count;
    }
}