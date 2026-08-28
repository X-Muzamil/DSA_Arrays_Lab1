class Main{

    static int[][] A = {{1,2},{3,4}};
    static int[][] B = {{5,6},{7,8}};
    static int[][] C = new int[A.length][B[0].length];
    public static void main(String args[]){
        
        
        Main.Multiplication();
        Main.display();

    }

    public static void display(){
          for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[0].length; j++){
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
          for(int i = 0; i < B.length; i++){
            for(int j = 0; j < B[0].length; j++){
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }

        for(int i = 0; i < C.length; i++){
            for(int j = 0; j < C[0].length; j++){
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void Multiplication(){
        
    for(int i = 0; i < A.length; i++){
        for(int j = 0; j < B[0].length; j++){
            for(int k = 0; k < A[0].length; k++){
               C[i][j] += A[i][k] * B[k][j]; 
            }
        }
    }
    }
}