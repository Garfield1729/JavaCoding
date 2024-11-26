import java.util.*;


public class PyramidSum {
    public static int pyramidSum(int array_length, List<Integer> arr) {
        // Write your code here
        
        
        while(arr.size()>1){
            List<Integer> newList = new ArrayList<>();
            for(int i=0; i<arr.size()-1; i++){
                newList.add(arr.get(i)+arr.get(i+1));
            }
            arr=newList;
        }
        return arr.get(0);
        
    
    }

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        int array_length = Integer.parseInt(scan.nextLine().trim());
        
        List<Integer> arr = new ArrayList<>(array_length);
        for(int j=0; j<array_length; j++) {
            arr.add(Integer.parseInt(scan.nextLine().trim()));
        }
    
        int result = pyramidSum(array_length, arr);
    
        System.out.println(result);
    }
}