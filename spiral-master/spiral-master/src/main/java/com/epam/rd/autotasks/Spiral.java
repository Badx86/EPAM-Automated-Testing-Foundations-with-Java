package com.epam.rd.autotasks;

class Spiral {
    static int[][] spiral(int rows, int columns) {
        int[][] array = new int[rows][columns];
        int num = 1;
        int max = rows * columns;
        int minRow = 0, maxRow = rows - 1;
        int minCol = 0, maxCol = columns - 1;

        while (num <= max) {
            for (int i = minCol; num <= max && i <= maxCol; i++) {
                array[minRow][i] = num++;
            }
            minRow++;
            for (int i = minRow; num <= max && i <= maxRow; i++) {
                array[i][maxCol] = num++;
            }
            maxCol--;
            for (int i = maxCol; num <= max && i >= minCol; i--) {
                array[maxRow][i] = num++;
            }
            maxRow--;
            for (int i = maxRow; num <= max && i >= minRow; i--) {
                array[i][minCol] = num++;
            }
            minCol++;
        }
        return array;
    }

    }
