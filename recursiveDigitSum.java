# Recursive DigitSum

import java.io.*;
import java.util.*;

public class Solution {
    static int sum = 0;
    public static int add(int n)
    {
        if(n<10){
            return n;
        }
        return n%10 + add(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int val = add(n);
        val = val*k;
        while(val > 9){
            val = add(val);
        }
        System.out.println(val);
    }
}