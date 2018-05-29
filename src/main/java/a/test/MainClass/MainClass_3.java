package a.test.MainClass;

import java.util.Arrays;

public class MainClass_3 {

    public static void main(String[] args) {

        int[] A = {5, 8};
        System.out.println(myMethod(A));

    }

    private static int myMethod(int[] A) {

        int result = 0;

//        for (int i = 0; i < A.length-1; i++){
//
//            result += Math.abs(A[i] - A[i+1]);
//        }

        for(int i = 0; i < A.length-1; i++){
            if(i>0){
                if(A[i-1] > A[i] && (A[i] <= A[i+1])){

                }
            }
        }

        return result + Arrays.stream(A).min().getAsInt();
    }

}
