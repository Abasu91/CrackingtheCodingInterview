/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crackingthecodinginterview.arraysAndStrings;

/**
 *
 * @author Arijit
 */
public class MatrixRowColZero {
 
    public static void main(String args[]) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter row length");
        int rows = sc.nextInt();
        System.out.println("Enter col length");
        int cols = sc.nextInt();
        int[][] mat = new int[rows][cols];
        int[][] tempMat = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int value = sc.nextInt();
                mat[i][j] = value;
                tempMat[i][j] = mat[i][j];
            }
        }
        System.out.println("--------------------- ");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == 0) {
                    
                    /*If, applicable
                    sets elements present downwards in a column wrt to the current element*/
                    for (int k = i; k < rows; k++) {
                        tempMat[k][j] = 0;
                    }
                    /*If, applicable
                    sets elements present upwards in a column wrt to the current element*/
                    for (int l = 0; l <=i; l++) {
                        tempMat[l][j] = 0;
                    }
                    /*If, applicable
                    sets elements present rightwards in a row wrt to the current element*/
                    for (int k1 = i; k1 < cols; k1++) {
                        tempMat[i][k1] = 0;
                    }
                    /*If, applicable
                    sets elements present leftwards in a row wrt to the current element*/
                    for (int l1 = 0; l1 <= j; l1++) {
                        tempMat[i][l1] = 0;
                    }

                }

            }

        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                System.out.println(tempMat[i][j]);
                System.out.println(" ");
            }
            System.out.println("\n");
        }

    }
}
