package com.bridgelabz.find_maximum;

public class FindMaximum {
    /*
    public static int findMaximumInteger(int a,int b, int c){
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
    public static float findMaximumFloat(float a, float b, float c){
        float max =0;
        if(a>=b && a>=c){
            max=a;
        } else if (a<=b && b>c) {
            max=b;
        }else {
            max=c;
        }
        return max;
    }
    public static String findMaximumString(String a, String b, String c){
        String max="";
        if(a.compareTo(b)>=0 &&a.compareTo(c)>=0 ){
            max = a;
        } else if (b.compareTo(a)>0 && b.compareTo(c)>0) {
            max=b;
        }else {
            max=c;
        }
        return max;
    }

*/
    //Refactored code 2


  //Refactored code 1
    public static <T extends Comparable<T>> T findMaximum(T a, T b, T c) {
        T max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Find maximum among the given numbers.");
    }
}
