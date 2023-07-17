package com.bridgelabz.find_maximum;

public class FindMaximum {
    public static int findMaximum(int a,int b, int c){
        int max=0;
        if(a>=b && a>=c){
            max=a;
        } else if (a<=b && b>c) {
            max=b;
        }else {
            max=c;
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println("Find maximum among the given numbers.");
    }
}
