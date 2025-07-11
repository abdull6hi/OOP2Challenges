import java.util.Random;

public class array2 {

    public static void main(String[] args) {

        Random rand = new Random();
        String[] itemCodes = new String[5];

        for (int i = 0; i < itemCodes.length; i++) {

            char letter = (char) (rand.nextInt(5) + 65);
            int digits = rand.nextInt(999) + 1;
            String code = String.format("%03d", digits);

            itemCodes[i] = letter + code;
        }

        for (String code : itemCodes) {
            System.out.println(code);
        }
    }
}
