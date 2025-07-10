public class Ifstatement {

    public void showResults() {
        int marks = 85;

        if (marks > 70 && marks <= 100) {
            System.out.println("You passed with a first class honour");
        } else if (marks >= 40) {
            System.out.println("You passed");
        } else if (marks >= 0 && marks < 40) {
            System.out.println("You fail");
        } else {
            System.out.println("Invalid Marks");
        }
    }

    public static void main(String[] args) {
        new Ifstatement().showResults();
    }
}
