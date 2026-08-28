  class Main{
            static int[][] arr= {{11,22,10,12},{77,88,99,33},{34,23,1,2},{5,6,3,4}};
            // static int min;
        public static void main(String args[]){
            Main.sort();
            Main.min();

            for(int i = 0; i < arr.length; i++){
                for(int j = 0; j < arr.length; j++){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println("\n");
            }

        }

        public static void sort(){
            for(int i = 0; i < arr.length; i++){
                for(int j = 0; j < arr.length-1; j++){
                    for(int k = j+1; k < arr.length; k++){
                        if(arr[i][j] < arr[i][k]){
                            int temp = arr[i][j];
                            arr[i][j] = arr[i][k];
                            arr[i][k] = temp;
                        }
                    }
                }
            }
        }
        public static void min(){
            int min = arr[0][0];
            for(int i = 0; i < arr.length; i++){
                for(int j = 0; j < arr[i].length; j++){
                    if(arr[i][j] > min){
                         min = arr[i][j] ;
                    }
                }
            }
            System.out.println("minimum value : " + min);
        }
    }