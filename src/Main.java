import java.util.*;
import java.util.HashSet;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String s = sc.nextLine();
        List<String> result = new ArrayList<>();
        HashSet<String> hs = new HashSet<>();
        hs.add("aw");
        hs.add("aa");
        hs.add("dd");
        hs.add("ee");
        hs.add("oo");
        hs.add("ow");

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'w') {
                result.add("w");
            } else if (i < s.length() - 1) {
                if (hs.contains(s.substring(i, i + 2))) {
                    result.add(s.substring(i, i + 2));
                    i+=1;
                }
            }
        }
        System.out.print("Output: " + result.size()+" (");
        for (String r : result) {
            System.out.print(r + ", ");
        }
        System.out.println(")");
    }
}
