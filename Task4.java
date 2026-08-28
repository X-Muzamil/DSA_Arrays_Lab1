lass Main{
    public static void main(String args[]){

        int[][] arr = {{12,3,43},{3,4,77}};
        int[][] arr2 = new int[3][2];

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr2[j][i] = arr[i][j];
            }
        }
        for(int j = 0; j < arr2.length; j++){
            for(int i = 0; i < arr2[j].length; i++){
                System.out.print(arr2[j][i] +" ");
            }
            System.out.println();
        }
    }
}