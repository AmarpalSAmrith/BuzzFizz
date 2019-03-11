package AmarpalAmrith.BuzzFizz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class FizzBuzzBangStream {

    private int requestModulus;
    private String requestRule;
    private String requestWord;
    private String requestStartingChar;

    public FizzBuzzBangStream(int requestModulus, String requestRule, String requestWord, String requestStartingChar) {
        this.requestModulus = requestModulus;
        this.requestRule = requestRule;
        this.requestWord = requestWord;
        this.requestStartingChar = requestStartingChar;
    }

    public Stream <String> create() {
        return Stream.iterate(1, n -> n + 1).map(this::convert);
    }

    private String convert (int currentNumber) {

        List<String> store = new ArrayList<>();

        if (currentNumber % 3 == 0) {
            store.add("Fizz");
        }

        if (currentNumber % 5 == 0) {
            store.add("Buzz");
        }

        if (currentNumber % 7 == 0) {
            store.add("Bang");
        }

        if (currentNumber % 11 == 0) {
            store.clear();
            store.add("Bong");
        }

        if (currentNumber % 13 == 0) {
            int indexOfItemContainingB = indexOfItemWithSubString(store,"B");
            if (indexOfItemContainingB != -1) {
                store.add(indexOfItemContainingB, "Fezz");
            } else {
                store.add("Fezz");
            }
        }

        if (currentNumber % 17 == 0) {
            Collections.reverse(store);
        }

        if (currentNumber % requestModulus == 0) {
            switch (requestRule.toLowerCase()) {
                case "add text":
                    store.add(requestWord);
                    break;
                case "replace all text":
                    store.clear();
                    store.add(requestWord);
                    break;
                case "reverse":
                    Collections.reverse(store);
                    break;
                case "insert":
                    int indexOfItemContainingB = indexOfItemWithSubString(store,requestStartingChar);
                    if (indexOfItemContainingB != -1) {
                        store.add(indexOfItemContainingB, requestWord);
                    } else {
                        store.add(requestWord);
                    }
            }
        }

        if (store.size() == 0) {
            return String.valueOf(currentNumber);
        } else {
            return String.join("", store);
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
