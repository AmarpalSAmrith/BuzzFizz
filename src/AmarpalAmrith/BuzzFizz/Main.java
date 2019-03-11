package AmarpalAmrith.BuzzFizz;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Utilities.welcomeMsg("Hi, Welcome to FizzBuzz console!");
        int maxNumber = Utilities.requestInt("Please enter a maximum number to print to :)");

        String customRules = Utilities.requestString("Would you like to only perform the default arguments or custom ones?");
        int requestModulus = 0;
        String requestRuleType = "";
        String requestReplacementString = "";

        if (customRules.equalsIgnoreCase("custom")) {
            requestModulus = Utilities.requestInt("Please provide modulus");
            requestRuleType = Utilities.requestString("Please provide what type of rule to be applied: Add Text, replace all text, reverse. ");
            requestReplacementString = Utilities.requestString("Please provide string to replace number");

        }

        for (int i = 1; i <= maxNumber; i++) {

            List <String> store = new ArrayList<>();

            if (i % 3 == 0 && Arrays.asList(args).contains("3")) {
                store.add("Fizz");
            }

            if (i % 5 == 0 && Arrays.asList(args).contains("5")) {
                store.add("Buzz");
            }

            if (i % 7 == 0 && Arrays.asList(args).contains("7")) {
                store.add("Bang");
            }

            if (i % 11 == 0 && Arrays.asList(args).contains("11")) {
                store.clear();
                store.add("Bong");
            }

            if (i % 13 == 0 && Arrays.asList(args).contains("13")) {
                int indexOfItemContainingB = indexOfItemWithSubString(store,"B");
                if (indexOfItemContainingB != -1) {
                    store.add(indexOfItemContainingB, "Fezz");
                } else {
                    store.add("Fezz");
                }
            }

            if (i % 17 == 0 && Arrays.asList(args).contains("17")) {
                Collections.reverse(store);
            }
            if (i % requestModulus == 0) {
                switch (requestRuleType.toLowerCase()) {
                    case "add text":
                        store.add(requestReplacementString);
                        break;
                    case "replace all text":
                        store.clear();
                        store.add(requestReplacementString);
                        break;
                    case "reverse":
                        Collections.reverse(store);
                        break;
                }
            }
            if (store.size() == 0) {
                System.out.println(i);
            } else {
                System.out.println(String.join("", store));
            }

        }
    }

    private static int indexOfItemWithSubString(List <String> list, String criteria) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains(criteria)) {
                return i;
            }
        }
        return -1;
    }

}
