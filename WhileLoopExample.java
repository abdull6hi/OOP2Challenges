public class WhileLoopExample {

    public void countdown() {
        int count = 10;

        while (count > 0) {
            System.out.println(+ count);
            count--;
        }

        System.out.println("BOOM!!!");
    }

    public static void main(String[] args) {
        new WhileLoopExample().countdown();
    }
}

