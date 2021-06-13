import java.util.*;
import java.util.stream.Collectors;

public class quera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        String b = scanner.next();

        String[] al = a.split("");
        List<String> aa = Arrays.asList(al);
        Set<String> seta = aa.stream().collect(Collectors.toSet());


        String[] bl = b.split("");
        List<String> bb = Arrays.asList(bl);
        Set<String> setb = bb.stream().collect(Collectors.toSet());


        int cnt = 0;
        for (String x : seta)
        {
            for (String y : setb) {
                if (x.equals(y)) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);

    }
}
