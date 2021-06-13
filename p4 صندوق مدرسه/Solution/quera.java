import java.util.ArrayList;
import java.util.Scanner;

public class quera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        boolean isOpen = true;

        ArrayList<Integer> v = new ArrayList<Integer>();
        ArrayList<Integer> z = new ArrayList<Integer>();

        while (a!=0 || b!=0) {
            v.add(a%10);
            z.add(b%10);
            a /= 10;
            b /= 10;
        }

        // for (int i=0;i<v.size();i++)

        for (int i=0; i<z.size();i++){
            int cnt = 0;
            for (int j=0;j<v.size();j++) {
                if (v.get(j) % z.get(i) == 0) {
                    cnt++;
                }
            }
            if (cnt == 0) {
                isOpen = false;
            }
        }

        if (isOpen){
            System.out.println("OPEN");
        }
        else {
            System.out.println("LOCKED");
        }
    }
}
