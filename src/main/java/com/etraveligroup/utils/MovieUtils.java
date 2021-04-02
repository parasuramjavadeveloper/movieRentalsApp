package com.etraveligroup.utils;

import com.etraveligroup.model.Customer;
import com.etraveligroup.model.Movie;

import java.util.HashMap;
import java.util.Map;

/**
 * Utils to store common data used across the application
 *
 * @author Parasuram
 * @since 08-03-2021
 */
public abstract class MovieUtils {

   public static Map<String, Movie> movies() {
        Map<String, Movie> movies = new HashMap();
        movies.put("F001", new Movie("You've Got Mail", MovieTypes.REGULAR));
        movies.put("F002", new Movie("Matrix", MovieTypes.REGULAR));
        movies.put("F003", new Movie("Cars", MovieTypes.CHILDREN));
        movies.put("F004", new Movie("Fast & Furious X", MovieTypes.NEW));
        return movies;
    }

    public String rentalInformationSlip(Customer customer){
       return rentalInformation(customer);
    }

    protected abstract String rentalInformation(Customer customer);

}
