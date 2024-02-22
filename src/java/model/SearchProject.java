package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class SearchProject {
    public static void main(String[] args) {
        // Sample data - replace this with your actual data
        List<String> itemList = new ArrayList<>();
        itemList.add("Java");
        itemList.add("Python");
        itemList.add("C++");
        itemList.add("JavaScript");
        itemList.add("Ruby");

        // Create a Scanner for user input
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter search term (type 'exit' to quit): ");
            String searchTerm = scanner.nextLine().toLowerCase();

            if ("exit".equals(searchTerm)) {
                break;
            }

            // Perform search
            List<String> searchResults = performSearch(itemList, searchTerm);

            // Display results
            displayResults(searchResults);
        }

        System.out.println("Exiting the search project.");
    }

    private static List<String> performSearch(List<String> itemList, String searchTerm) {
        List<String> searchResults = new ArrayList<>();

        for (String item : itemList) {
            if (item.toLowerCase().contains(searchTerm)) {
                searchResults.add(item);
            }
        }

        return searchResults;
    }

    private static void displayResults(List<String> searchResults) {
        if (searchResults.isEmpty()) {
            System.out.println("No matching items found.");
        } else {
            System.out.println("Search Results:");
            for (String result : searchResults) {
                System.out.println("- " + result);
            }
        }
    }
}
