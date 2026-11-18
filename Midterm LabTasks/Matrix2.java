import java.util.Scanner;
public class Matrix2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char option;
        do{
            int [][] matrix = new int [3][3];
            System.out.println("Input 9 elements:");
            for (int r = 0; r < 3; r++){
                for (int c = 0; c < 3; c++){
                    matrix[r][c] = sc.nextInt();
                }
            }
            System.out.println("\nDisplay Here are the Numbers and the required outputs:");
            System.out.println("=====================================================");
            System.out.printf("%n%50s%n", "Row Sum"); //Row Sum
            System.out.println();
 
            for (int r = 0; r < 3; r++){
                int sum = 0;
                for (int c = 0; c < 3; c++) {
                    System.out.printf("%8d", matrix[r][c]);
                    sum += matrix[r][c];
                }
                System.out.printf("%15d%n", sum);
            }                   //Column Sum
            System.out.println("\nColumn Sum:");
            for (int c = 0; c < 3; c++){
                int sum = 0;
                for (int r = 0; r < 3; r++){
                    sum += matrix[r][c];
                }
                System.out.printf("%8d", sum);
            }
            int dia1 = 0;       //Diagonal sums
            int dia2 = 0;
            for (int r = 0; r < 3; r++){
                dia1 += matrix[r][r];
                dia2 += matrix[r][2 - r];
            }
            System.out.println("\n=====================================================");
            System.out.println("\nDiagonal Sum 1:   " + dia1);
            System.out.println("Diagonal Sum 2:    " + dia2);
            System.out.print("\nTry Again [y/n]; ");
            option = sc.next().charAt(0);
        }while (option == 'y' || option == 'Y');
        sc.close();
    }
}