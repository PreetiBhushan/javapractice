public class matrices {
  public static void main(String[] args){
    int arr1 [] [] = {{1,3,4},{2,4,3},{3,4,5}}; 
    int arr2 [] [] = {{1,3,4},{2,4,3},{1,2,4}};
    for (int m = 0; m <3; m++){
       for (int n = 0; n <3; n++){
         System.out.print (arr1 [m][n] +" ");
          System.out.print (arr2 [m][n] +" ");
       }
    }
  }
}
