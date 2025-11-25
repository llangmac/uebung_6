package h2;

import java.util.Arrays;

public class H2_main {

    public static void main(String[] args){
        int[] x = {1, 2, 0, 0};
        int[] y = {1, 2, 0, 0};

        System.out.println("Arrays gleich?: " + compareArrays(x, y));

    }

    public static boolean compareArrays(int[] a, int[] b) {
        boolean bool = true;
        System.out.println("\n" + "A: " + Arrays.toString(a) + ", B: " + Arrays.toString(b));

        for(int i = 0; i < a.length; i++) {
            if(!(a[i] == b[i])) {
                bool = false;
                break;
            }
        }

        return bool;
    }

}
