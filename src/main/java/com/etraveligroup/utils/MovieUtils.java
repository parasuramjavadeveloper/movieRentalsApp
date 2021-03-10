package com.etraveligroup.utils;

import com.etraveligroup.model.Movie;

import java.util.HashMap;
import java.util.Map;

/**
 * Utils to store common data used across the application
 *
 * @author Parasuram
 * @since 08-03-2021
 */
public interface MovieUtils {
    String expected = "Rental Record for C. U. Stomer\n\tYou've Got Mail\t3.5\n\tMatrix\t2.0\nAmount owed is 5.5\nYou earned 2 frequent points\n";

    static Map<String, Movie> movies() {
        Map<String, Movie> movies = new HashMap();
        movies.put("F001", new Movie("You've Got Mail", "REGULAR"));
        movies.put("F002", new Movie("Matrix", "REGULAR"));
        movies.put("F003", new Movie("Cars", "CHILDREN"));
        movies.put("F004", new Movie("Fast & Furious X", "NEW"));
        return movies;
    }
}
