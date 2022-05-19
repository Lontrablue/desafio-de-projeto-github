package arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayMulti {
    public static void arrayMulti(){
        Random random = new Random();
        int[][] M = new int[4][4];
        for (int i = 0; i < M.length; i++ ){
            for (int j = 0;j < M[i].length; j++){
                M[i][j] = random.nextInt(9);
            }
        }

        for (int[] linha : M){
            System.out.println(Arrays.toString(linha));
        }
    }
}
