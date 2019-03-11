package AmarpalAmrith.BuzzFizz;

public class Main {

    public static void main(String[] args) {

        String s = "";
        for (int i = 1; i <= 200; i++) {
            boolean multipleOf3 = false;
            boolean multipleOf5 = false;
            boolean multipleOf7 = false;
            boolean multipleOf11 = false;
            boolean multipleOf13 = false;

            if (i % 3 == 0) {
                multipleOf3 = true;
            }

            if (i % 5 == 0) {
                multipleOf5 = true;
            }

            if (i % 7 == 0) {
                multipleOf7 = true;
            }

            if (i % 11 == 0) {
                multipleOf11 = true;
            }
            if (i % 13 == 0){
                multipleOf13 = true;
            }

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

            if (multipleOf11) {
                builder = new StringBuilder();
                builder.append("Bong");
            }
            if (multipleOf13) {
                int containsB = builder.indexOf("B");
                if (containsB > 0) {
                    builder.insert(containsB, "Fezz");
                } else {
                    builder.append("Fezz");
                }
            }
            if (builder.length() == 0) {
                builder.append(i);
            }

            System.out.println(builder);
        }
    }
}
