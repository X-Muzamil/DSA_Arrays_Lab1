lass Main{
    static int[][] arr= {{2,3,4},{5,67,77},{8,9,2}};
    public static void main(String args[]){

        Main.sum();

        

    }

    public static void sum(){
        int[] row = new int[arr.length];
        int[] column = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                row[i] +=arr[i][j];   
            }
        }

           
        for(int j = 0; j < arr.length; j++){
            for(int i = 0; i < arr.length; i++){
                column[j] +=arr[j][i];
            }
        }

        for(int i = 0; i < row.length; i++){
            System.out.print(row[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < column.length; i++){
            System.out.print(column[i] + " ");
        }
        
    }
}