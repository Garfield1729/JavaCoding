public class BreachCount {
    public static void main(String[] args) {
        
        String input = "adasBreAch;breachafa; req breaCh; BReacHadsd;ads sdads adsreachdfs";

        input = input.toLowerCase();

        String[] words = input.split(";");

        int count = 0;

        for(String word : words){
            if(word.contains("breach")){
                count+=1;
            }
        }

        System.out.println("Result = "+count);
    }
    
}
