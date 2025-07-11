import java.util.Arrays;

public class Array4 {

    public static void main(String[] args) {

        String[] codes = {"X21", "M10", "X19", "M15"};

        System.out.println();

        Arrays.fill(codes, 0, 2, null);

        if (codes[0] != null) {
            System.out.println("After: " + codes[0].toLowerCase());
        } else {
            System.out.println("After: null");
        }

        System.out.println("Clearing 2 ... count: " + codes.length);
        for (String code : codes) {
            System.out.println("--" + code);
        }
    }
}
