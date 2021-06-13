import java.util.Scanner;

public class quera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i=0;i<n;i++){
            String s = scanner.nextLine();
        }

        if (n%3==0) {
            System.out.println("OK");
        }
        else{
            System.out.println("HELP");
        }
    }
}
