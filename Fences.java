import java.util.*;

public class Fences {
    
    public static int maxHeight(int N, int K, List<Integer> A) {

        int result=0;
        int m = Collections.max(A);
        for(int i=1; i<=m; i++){
            if(possible(i,K,A)){
                result=i;
            }
            else{
                break;
            }
        }
        return result;
    }
    private static boolean possible(int i, int K, List<Integer> A) {
        int count = 0;
        for(int j : A){
            count += j/i;
        }
        return count>=K;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int N = Integer.parseInt(scan.nextLine().trim());
        int K = Integer.parseInt(scan.nextLine().trim());
        
        List<Integer> A = new ArrayList<>(N);
        for (int j = 0; j < N; j++) {
            A.add(Integer.parseInt(scan.nextLine().trim()));
        }
        
        int result = maxHeight(N, K, A);
        System.out.println(result);
        
        scan.close();
    }

    
}
