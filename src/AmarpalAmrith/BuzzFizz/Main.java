package AmarpalAmrith.BuzzFizz;

public class Main {

    public static void main(String[] args) {

        String s = "";
        for (int i = 1; i <= 105; i++) {
            boolean multipleOf3 = false;
            boolean multipleOf5 = false;
            boolean multipleOf7 = false;
            multipleOf3 = multipleOf(i, 3);
            multipleOf5 = multipleOf(i, 5);
            multipleOf7 = multipleOf(i, 7);
            StringBuilder builder = new StringBuilder();
            if (multipleOf3) {
                builder.append("Fizz");
            }
            if (multipleOf5) {
                builder.append("Buzz");
            }
            if (multipleOf7) {
                builder.append("Bang");
            }
            if (builder.length() == 0) {
                builder.append(i);
            }
            System.out.println(builder);
        }
    }
    private static boolean multipleOf(int numberToTest, int getMultipleOf) {
        return numberToTest % getMultipleOf == 0;
    }
}
