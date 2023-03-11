package com.epam.rd.autotasks;

class CycleSwap {
    static void cycleSwap(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
        }
    }

    static void cycleSwap(int[] array, int shift) {
        if (shift > array.length) {
            } else {
                for (int left = 0, right = array.length - 1 - shift; left < right; left++, right--) {
                    int temp = array[left];
                    array[left] = array[right];
                    array[right] = temp;
                }
                for (int left = array.length - shift, right = array.length - 1; left < right; left++, right--) {
                    int temp = array[left];
                    array[left] = array[right];
                    array[right] = temp;
                }
                for (int left = 0, right = array.length - 1; left < right; left++, right--) {
                    int temp = array[left];
                    array[left] = array[right];
                    array[right] = temp;
                }
            }
        }
    }

