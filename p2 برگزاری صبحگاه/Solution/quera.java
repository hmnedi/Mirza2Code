import java.util.Scanner;

public class quera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String res = "";

        for (int i=0;i<s.length();i++){
            res += s.charAt(i);

            if (i != s.length() - 1 && s.charAt(i) == s.charAt(i+1)) {
                 i++;
            }
        }
        System.out.println(res);
    }
}
