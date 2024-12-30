import java.util.HashMap;
import java.util.Scanner;

public class conconent_occurance {
    public static void main(String[] args) {
        System.out.println("enter your name ");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        HashMap<Character, Integer> hs = new HashMap<Character, Integer>();
        for(int i=0; i<name.length(); i++){
            char ch = name.charAt(i);
            if(ch>='a'&&ch<='z'){
                if(!(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')){
                    if(hs.containsKey(ch)){
                        hs.put(ch, hs.get(ch)+1);
                    }
                    else{
                        hs.put(ch, 1);
                    }
                }
            }
        }
        System.out.println(hs);
    }
}
