package AmarpalAmrith.BuzzFizz;

public class Main {

    public static void main(String[] args) {
        Utilities.welcomeMsg("Hi, Welcome to FizzBuzz console!");
        int maxNumber = Utilities.requestInt("Please enter a maximum number to print to :)");
        FizzBuzzBangStream.create().limit(maxNumber).forEach(System.out::println);
    }



}
