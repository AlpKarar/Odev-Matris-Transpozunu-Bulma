/*
  Ödev - Matris Transpozunu Bulma
  Java dilinde, çok boyutlu diziler ile oluşturulmuş matrisin transpozunu bulan programı yazınız.
  
  Matrix:         Transpose:
  2 3 4     =>    2 5
  5 6 4           3 6
                  4 4      
*/


import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int row, col;
        System.out.print("#row: ");
        row = input.nextInt();
        System.out.print("#col: ");
        col = input.nextInt();
        
        int[][] matrix = new int[row][col];
        
        // create MATRIX
        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        
        // print MATRIX
        System.out.println("Matrix:");
        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
        
        
        System.out.println("");
        
        // create and print TRANSPOSE
        int[][] transpose = new int[col][row];
        
        System.out.println("Transpose:");
        for (int i=0; i<col; i++) {
            for (int j=0; j<row; j++) {
                transpose[i][j] = matrix[j][i];
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
