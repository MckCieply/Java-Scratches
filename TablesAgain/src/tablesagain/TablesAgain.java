
package tablesagain;

public class TablesAgain {
    public static int[] intarray(int[] data){
        for(int i=0; i<data.length; i++){
            for(int j=1; j<data.length;j++){
                if(data[j] < data[j-1]){
                    int temp = data[j];
                    data[j] = data[j-1];
                    data [j-1] = temp;
                }
            }
        }
        return data;
    }
    public static String stringarray(String[] data){
        String output= "";
        for (String element: data){
            output += element;
        }
        System.out.print("\nLenght of connected string is: " + output.length());
        return output;
    }
    public static void main(String[] args) {
        System.out.print("There we have basics of java arrays:\n");
        int[] arr = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};
        String[] arr2 =  new String[]{"a","b","c", "d", "e"};
        int[] results = intarray(arr);
        for(int element: results)
            System.out.print(element+ " ");
        String results2 = stringarray(arr2);
        System.out.println("\n"+results2);
        
    }
    
}
