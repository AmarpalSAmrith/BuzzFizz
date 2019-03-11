package AmarpalAmrith.BuzzFizz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        for (int i = 1; i <= 255; i++) {

            List <String> store = new ArrayList<>();

            if (i % 3 == 0) {
                store.add("Fizz");
            }

            if (i % 5 == 0) {
                store.add("Buzz");
            }

            if (i % 7 == 0) {
                store.add("Bang");
            }

            if (i % 11 == 0) {
                store.clear();
                store.add("Bong");
            }

            if (i % 13 == 0) {
                int indexOfItemContainingB = indexOfItemWithSubString(store,"B");
                if (indexOfItemContainingB != -1) {
                    store.add(indexOfItemContainingB, "Fezz");
                } else {
                    store.add("Fezz");
                }
            }

            if (i % 17 == 0) {
                Collections.reverse(store);
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
