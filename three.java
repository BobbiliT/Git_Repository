import java.util.HashMap;
import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        System.out.println("enter your name");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        HashMap<Character, Integer> hs = new HashMap<Character, Integer>();
        for(Character ch : name.toCharArray()){
            if(hs.containsKey(ch)){
                hs.put(ch, hs.get(ch)+1);
            }
            else{
                hs.put(ch, 1);
            }
        }
        System.out.println(hs);
    }   
}
