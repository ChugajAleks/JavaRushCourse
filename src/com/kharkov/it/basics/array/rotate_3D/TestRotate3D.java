package com.kharkov.it.basics.array.rotate_3D;


class TestRotate3D {
    public static void main(String[] args) {
        int[][][] arr = {{
                {1, 2},
                {3, 4},
                {5, 6},
                {7, 8},
        }};
        ArrayUtils.rotateClockwise(arr);
    }
}
