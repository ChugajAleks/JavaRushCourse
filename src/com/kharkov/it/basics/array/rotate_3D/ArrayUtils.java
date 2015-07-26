package com.kharkov.it.basics.array.rotate_3D;

/**
 * Реализуйте метод rotateClockwise класса ArrayUtils, который
 * 1) проверяет, что метод получил "кубическую" матрицу (допустимые размеры 1x1x1, 2x2x2, 3x3x3, ...)
 * иначе выбрасывает исключение
 * throw new IllegalArgumentException(); (возможные ошибки: аргумент равен null, "длина" / "ширина" / "высота"
 * не равны,
 * есть строки разной длины, есть строки с null вместо одномерных/двумерных массивов ...)
 * 2) "проворачивает куб" относительно главной диагонали проходящей от элемента [0][0][0]
 * до элемента [L-1][L-1][L-1]
 * (L - длина "грани куба") массив по часовой стрелке на 120 градусов (по часовой стрелке - если смотреть
 * вдоль оси от
 * элемента [L-1][L-1][L-1] в сторону элемента [0][0][0]), то есть
 *
 * [[[1]]]
 * ->
 * [[[1]]]
 *
 * [
 * [[1, 2],
 * [3, 4]],
 * [[5, 6],
 * [7, 8]],
 * ]
 * ->
 * [
 * [[1, 3],
 * [5, 7]],
 * [[2, 4],
 * [6, 8]],
 * ]
 *
 * [
 * [[10, 11, 12],
 * [20, 21, 22],
 * [30, 31, 32]],
 *
 * [[40, 41, 42],
 * [50, 51, 52],
 * [60, 61, 62]],
 *
 * [[70, 71, 72],
 * [80, 81, 82],
 * [90, 91, 92]]
 * ]
 * ->
 * [
 * [[10, 40, 70],
 * [11, 41, 71],
 * [12, 42, 72]],
 *
 * [[20, 50, 80],
 * [21, 51, 81],
 * [22, 52, 82]],
 *
 * [[30, 60, 90],
 * [31, 61, 91],
 * [32, 62, 92]]
 * ]
 * ...
 */
public class ArrayUtils {
    public static int[][][] rotateClockwise(int[][][] arg) {

        if (arg == null || arg.length == 0 || arg[0] == null || arg[0][0] == null
                || arg[0].length != arg.length || arg[0][0].length != arg.length){
            throw new IllegalArgumentException();
        }

        final int w = arg.length;
        final int h = arg[0].length;
        final int d = arg[0].length;

        for(int i = 0; i < w; i++){
            if(arg[i] == null || arg[i].length != h){
                throw new IllegalArgumentException();
            }
        }

        int[][][] result = new int[h][w][d];
        // rotate
        for (int i = 0; i < h; ++i) {
            for (int j = 0; j < w; ++j) {
                result[i][j] = arg[w - j - 1][i];
            }
        }

        return result;
    }
}
