import java.util.HashMap;
import java.util.Map;

public class Main {
    static int max;
    static int min = 1000;
    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        char[] textCharecters = text.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for (int i=0; i< textCharecters.length;i++) {
            if (Character.isLetter(textCharecters[i])) {
                if(map.containsKey(textCharecters[i])){
                    int a = (map.get(textCharecters[i])+1);
                    map.put(textCharecters[i],a);
                }
                else{
                    map.put(textCharecters[i],1);
                }
            }
        }
        for (Map.Entry<Character,Integer> kv: map.entrySet()){
            if (kv.getValue()>max){
                max=kv.getValue();
            }
            if(kv.getValue()<min){
                min = kv.getValue();
            }
        }
        System.out.println(map);
        System.out.println(max);
        System.out.println(min);
    }
}