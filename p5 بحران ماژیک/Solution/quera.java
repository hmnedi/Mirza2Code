import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class quera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();

        String[] al = a.split(" ");
        List<String> aa = Arrays.asList(al);
        Set<String> seta = aa.stream().collect(Collectors.toSet());

        int[] res = {0, 0, 0, 0, 0};
        int i =0;
        for (String x : seta)
        {
            res[i] = Integer.valueOf(x);
            i++;
        }

        Arrays.sort(res);
        a = "";
        for (int j=0;j<5;j++){
            a += Integer.toString(res[j]) + " ";
        }
        System.out.println(a);

    }
}
