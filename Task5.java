class Main{
    public static void main(String args[]){

        int[][] arr = {{12,3,43},{3,4,77},{44,55,66}};
        

        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            sum = sum+arr[i][i];
            System.out.print(sum + " ");
                
        }

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(i == j){
                    System.out.println(arr[i][j]);
                }
            }
        }
       
    }
}