public class array1 {
    public static void main(String[] args) {
        String[] values = {"21", "22", "23", "24"};

        for (String val : values) {
            if (val.startsWith("2")) {
                System.out.println(val);
            }
        }
    }
}
