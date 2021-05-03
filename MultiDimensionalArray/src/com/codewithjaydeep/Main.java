package com.codewithjaydeep;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        /* --For 2D array-- */
	    int[][] numbers2D = new int[2][3];  // 2 rows and 3 columns
        numbers2D[0][0] = 1;
        System.out.println(Arrays.toString(numbers2D)); // we get some weird output
        // so for Multi-Dimensional array we have to call another method called deepToStrings
        System.out.println(Arrays.deepToString(numbers2D));

        /* --Alter Way to Define 2D Array-- */
        int[][] alter_number2D = {{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(alter_number2D));

        /* --For 3D array-- */
        int[][][] numbers3D = new int[2][3][5];
        numbers3D[0][0][0] = 1;
        // so for Multi-Dimensional array we have to call another method called deepToStrings
        System.out.println(Arrays.deepToString(numbers3D));
    }
}
/*
*       --Multi-Dimensional-Array--
*   In java we can also create multiDimensionalArrays for example we can create a two-dimensional array to store
*   a matrix or we can create a three-dimensional array to store data for cube these are useful in scientific
*   computations
* */