package Wiederholung.Aufgaben.Aufgabe_002;

public class MusterArray {


    public static void main(String[] args) {
        char[][] array = new char[5][9];
        //  musterZahlenX(array);
        musterAsternAdnan(array);
//        musterLxR(array);
        //    musterAstern(array);
//        musterBc(array);
//        musterZahlenX(array);
        printArray(array);
    }

//    public static void musterX(char[][] array){
//        for(int i = 0; i < array.length; i++){
//            for(int j = 0; j < array[i].length; j++){
//                if(i==j){
//                    array[i][j] = '*';
//                }else if(i + j == array.length - 1){
//                    array[i][j] = '*';
//                }else{
//                    array[i][j] = '.';
//                }
//            }
//        }
//    }

//    public static void musterA(char[][] array){
//        for(int i = 0; i < array.length; i++){
//            for(int j  = 0; j < array[i].length; j++){
//                if(i % 2 == 0 && j % 2 != 0){
//                    array[i][j] = 'A';
//                }else if(j % 2 == 0 && i % 2 != 0){
//                    array[i][j] = 'A';
//                }else{
//                    array[i][j] = ' ';
//                }
//            }
//        }
//    }

//    public static void musterBc(char[][] array){
//        for(int i = 0; i < array.length; i++){
//            for(int j = 0; j < array[i].length; j++){
//                if(i + j == array.length/2){
//                    array[i][j] = 'B';
//                }else if(i + j == array.length + 2) {
//                    array[i][j] = 'B';
//                }else if(i - j == array.length/2){
//                    array[i][j] = 'C';
//                }else if(i - j == array.length/2 - array.length + 1){
//                    array[i][j] = 'C';
//                }else{
//                    array[i][j] = ' ';
//                }
//
//            }
//        }
//    }

    public static void musterZahlenX(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    array[i][j] = '*';
                } else if (i + j == array.length - 1) {
                    array[i][j] = '*';
                } else if (i == i + j) {
                    array[i][j] = '4';
                } else if (j == i + j) {
                    array[i][j] = '1';
                } else if (j == array.length - 1) {
                    array[i][j] = '2';
                } else if (i == array.length - 1) {
                    array[i][j] = '3';
                } else if (j == array.length / 2 && i < array.length / 2) {
                    array[i][j] = '1';
                } else if (i == array.length / 2 && j < array.length / 2) {
                    array[i][j] = '4';
                } else if (i == array.length / 2 && j > array.length / 2) {
                    array[i][j] = '2';
                } else if (j == array.length / 2 && i > array.length / 2) {
                    array[i][j] = '3';
                } else if (i == array.length + 1 - array.length) {
                    array[i][j] = '1';
                } else if (j == array.length + 1 - array.length) {
                    array[i][j] = '4';
                } else if (j == array.length - 2) {
                    array[i][j] = '2';
                } else if (i == array.length - 2) {
                    array[i][j] = '3';
                } else if (j == array.length - 3) {
                    array[i][j] = '2';
                } else if (i == array.length - 3) {
                    array[i][j] = '3';
                } else if (j == array.length + 2 - array.length) {
                    array[i][j] = '4';
                } else {
                    array[i][j] = '1';
                }
            }
        }
    }

    //Ein Sternchen wird nicht angezeigt
    public static void musterAstern(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i + j == array[0].length / 2) {
                    array[i][j] = '*';
                } else if (i - j == array.length / 2 - array.length) {
                    array[i][j] = '*';
                } else if (i == array.length / 2 && array.length / 2 - 2 < j && j < array.length) {
                    array[i][j] = '*';
                } else {
                    array[i][j] = '.';
                }
            }
        }
    }

    public static void musterAsternAdnan(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int length = array[0].length;

                if (j <= length / 2 && i + j == length / 2) {
                    array[i][j] = '*';
                } else if (j > length / 2 && j - i == length / 2) {
                    array[i][j] = '*';
                } else if (i == array.length / 2 && j > array.length / 2 && j < array.length + 1) {
                    array[i][j] = '*';
                } else {
                    array[i][j] = ' ';
                }
            }
        }
    }

    public static void printArray(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

}

