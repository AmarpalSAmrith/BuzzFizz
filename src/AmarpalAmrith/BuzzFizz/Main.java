package AmarpalAmrith.BuzzFizz;

public class Main {

    public static void main(String[] args) {



        for (int i = 1; i < 100; i++) {
            boolean multipleOf3 = false;
            boolean multipleOf5 = false;
            if (i % 3 == 0) {
                multipleOf3 = true;
            } else if (i % 5 == 0) {
                multipleOf5 = true;
            }

            if (multipleOf3) {
                System.out.println("Fizz");
            } else if (multipleOf5) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
