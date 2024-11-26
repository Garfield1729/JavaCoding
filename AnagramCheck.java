
import java.util.Arrays;

public class AnagramCheck {

    public static void main(String[] args) {
        
        String s1 ="eat";
        String s2 ="tea";

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase(); 

        char[] lst1 = s1.toCharArray();
        char[] lst2 = s2.toCharArray();

        Arrays.sort(lst1);
        Arrays.sort(lst2);

        if(Arrays.equals(lst2, lst2))
        System.out.println("Yes");
        else
        System.out.println("No");
    }
    
}
