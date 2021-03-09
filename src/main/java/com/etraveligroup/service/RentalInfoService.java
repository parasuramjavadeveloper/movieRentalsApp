package com.etraveligroup.service;

import com.etraveligroup.model.Customer;
import com.etraveligroup.model.Movie;
import com.etraveligroup.model.MovieRental;
import com.etraveligroup.utils.MovieUtils;

import java.util.Map;

/**
 * This class calculates  rental amount that Customer has to be paid for its MovieRentals
 *
 * @author Parasuram
 * @since 08-03-2021
 */
public class RentalInfoService {


    /**
     * Calculates the rental information for the given Customer movieRentals
     * @param customer it has customer name and its movieRentals list
     * @return result it returns the total amount of all the movie rentals of a customer as a string
     */
     public static String rentalInformationSlip(Customer customer) {
        StringBuffer result = new StringBuffer();
        Map<String, Movie> movies = MovieUtils.movies();
        double totalAmount = 0;
        int frequentEnterPoints = 0;
        result.append("Rental Record for ").append(customer.getName()).append("\n");
        for (MovieRental movieRental : customer.getRentals()) {
            double thisAmount = 0;
            if(movieRental==null || movieRental.getMovieId()==null) continue;
            // determine amount for each movie
            if (MovieUtils.REGULAR.equalsIgnoreCase(movies.get(movieRental.getMovieId()).getCode())) {
                thisAmount = 2;
                if (movieRental.getDays() > 2) {
                    thisAmount = ((movieRental.getDays() - 2) * 1.5) + thisAmount;
                }
            } else if (MovieUtils.NEW.equalsIgnoreCase(movies.get(movieRental.getMovieId()).getCode())) {
                thisAmount = movieRental.getDays() * 3;
            } else {
                thisAmount = 1.5;
                if (movieRental.getDays() > 3) {
                    thisAmount = ((movieRental.getDays() - 3) * 1.5) + thisAmount;
                }
            }

            //add frequent bonus points
            frequentEnterPoints++;
            // add bonus for a two day new release rental
            if (MovieUtils.NEW.equalsIgnoreCase(movies.get(movieRental.getMovieId()).getCode()) && movieRental.getDays() > 2) frequentEnterPoints++;

            //print figures for this rental
            result.append("\t").append(movies.get(movieRental.getMovieId()).getTitle()).append("\t").append(thisAmount).append("\n");
            totalAmount = totalAmount + thisAmount;
        }
        // add footer lines
        result.append("Amount owed is ").append(totalAmount).append("\n");
        result.append("You earned ").append(frequentEnterPoints).append(" ").append("frequent points\n");

        return result.toString();
    }
}
