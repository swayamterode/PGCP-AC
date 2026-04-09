  package assignments;

  import java.util.Scanner;

  public class SortArrayInDesc {                                                                                   
   
      public void sortArray(int arr[]) {                                                                           
          int n = arr.length;        
          for (int i = 0; i < n - 1; i++) {
              for (int j = 0; j < n - i - 1; j++) {
                  if (arr[j] < arr[j + 1]) {                                     
                      int temp = arr[j];
                      arr[j] = arr[j + 1];                                                                         
                      arr[j + 1] = temp;
                  }                                                                                                
              }                      
          }
      }

      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the size of array: ");                                                           
          int size = sc.nextInt();
          int[] arr = new int[size];                                                                               
                                     
          System.out.println("Enter the elements in array!");                                                      
          for (int i = 0; i < size; i++) {
              System.out.print("Enter " + i + " element of array: ");                                              
              arr[i] = sc.nextInt(); 
          }
          sc.close();                                                                                              
   
          SortArrayInDesc obj = new SortArrayInDesc();                                                             
          obj.sortArray(arr);        

          System.out.println("Array in Descending Order:");                                                        
          for (int i = 0; i < arr.length; i++) {
              System.out.print(arr[i] + " ");                                                                      
          }                          
      }
  }