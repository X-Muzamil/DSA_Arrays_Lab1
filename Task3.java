import java.util.Scanner;

class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        int[][] arr2 = new int[3][3];
        int[][] Addition = new int[3][3];

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
         for(int i = 0; i < arr2.length; i++){
            for(int j = 0; j < arr2.length; j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        

         for(int i = 0; i < Addition.length; i++){
            for(int j = 0; j < Addition.length; j++){
                Addition[i][j] = arr[i][j]+arr2[i][j];
            }
        }

         for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
               System.out.print(Addition[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}