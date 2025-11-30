package h1;

import java.util.Arrays;

public class H1_main {

    public static void main(String[] args){
        //int[] x = {2, 1, 0, 7};
        //int[] y = {7, 0, 1, 2};
    }

    public static boolean isMirrorArray(int[] a, int[] b) {
        boolean bool = true;

        System.out.println("\n" + "A: " + Arrays.toString(a) + ", B: " + Arrays.toString(b));
        if(a.length == b.length) {

            for (int i = 0; i < a.length - 1; i++) {
                if (!(a[i] == b[a.length - i - 1])) {
                    bool = false;
                    break;
                }
            }
        }
        else{
            bool = false;
        }

        return bool;
    }
}
