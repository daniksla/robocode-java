import java.util.*;




public class string {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        HashMap<Character, Integer> map = new HashMap<>();
        String string = scanner.next();

        char c = ' ';
        int max = 0;
        int tmp;

        for(int i = 0; i < string.length(); i++){
            if(!map.containsKey(string.charAt(i))){
                map.put(string.charAt(i), 1);
            }
            else{
                tmp = map.get(string.charAt(i)) + 1;
                map.put(string.charAt(i), tmp);
                if(tmp > max){
                    c = string.charAt(i);
                    max = tmp;
                }
            }
        }

        System.out.println(c + " = " + max);
    }
}
