package com.kharkov.it.basics.array.rotate_2D;

import java.util.Arrays;


class RotateTest {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.deepToString(ArrayUtils.rotateClockwise(arr)));
    }
}

