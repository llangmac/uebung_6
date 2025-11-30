package h3;

import java.util.Arrays;
import java.util.List;

public class H3_main {

    public static void main(String[] args){
        //Arrays
        //int[] x = {1, 2, 3};
        //int[] y = {2, 2, 3};

    }

    public static boolean compareArraysVal(int[] a, int[] b) {
        System.out.println("\n" + "A: " + Arrays.toString(a) + ", B: " + Arrays.toString(b));
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }

}
