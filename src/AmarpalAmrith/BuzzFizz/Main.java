package AmarpalAmrith.BuzzFizz;

public class Main {

    public static void main(String[] args) {
        Utilities.welcomeMsg("Hi, Welcome to FizzBuzz console!");
        int maxNumber = Utilities.requestInt("Please enter a maximum number to print to :)");
        int getModulus = Utilities.requestInt("Please provide modulus");
        String getRuleType = Utilities.requestString("Please provide what type of rule to be applied: Add Text, replace all text, reverse or insert");
        String getStartingChar = "";
        String getReplacementString = "";
        switch (getRuleType.toLowerCase()) {
            case "insert":
                getStartingChar = Utilities.requestString("Please provide string to insert replacement string before");
            case "add Text":
            case "replace all text":
                getReplacementString = Utilities.requestString("Please provide string to replace number");
                break;
        }

        new FizzBuzzBangStream(getModulus, getRuleType,  getReplacementString, getStartingChar).create().limit(maxNumber).forEach(System.out::println);
    }
}
