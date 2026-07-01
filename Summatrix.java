import java.util.Scanner;
class Summatrix{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of rows:");
        int rows = sc.nextInt();
        System.out.println("enter no of columns:");
        int columns = sc.nextInt();
        System.out.println("enter the matrix1:");
        int matrix1[][] = new int[rows][columns];
        int matrix2[][] = new int[rows][columns];
        int matrix3[][] = new int[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter the matrix2:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                matrix2[i][j] = sc.nextInt();
            }
        }
        System.out.println("the sum of the two matrix is:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(matrix3[i][j]+" ");
            }
            System.out.println("\n");
        }
    }
}
