package com.etraveligroup.app;

import com.etraveligroup.model.Customer;
import com.etraveligroup.model.MovieRental;
import com.etraveligroup.service.RentalInfoService;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * This class takes Customer and its MovieRentals as an input and produces the information slip for movie rentals that he has taken
 *
 * @author Parasuram
 * @since 08-03-2021
 */
@Slf4j
public class MovieRentalsApplication {

    public static void main(String[] args) {
        String expected = "Rental Record for C. U. Stomer\n\tYou've Got Mail\t3.5\n\tMatrix\t2.0\nAmount owed is 5.5\nYou earned 2 frequent points\n";
        Customer customer = new Customer("C. U. Stomer", Arrays.asList(new MovieRental("F001", 3), new MovieRental("F002", 1)));
        String result = new RentalInfoService().rentalInformationSlip(customer);
        if (!result.equals(expected)) {
            String message = String.format("%n Expected: %n%s%n%n Got: %n%s",expected,result);
            throw new AssertionError(message);
        }
        log.info("Success");
    }
}
