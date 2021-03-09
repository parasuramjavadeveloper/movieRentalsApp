package com.etraveligroup.app;

import com.etraveligroup.model.Customer;
import com.etraveligroup.model.MovieRental;
import com.etraveligroup.service.RentalInfoService;
import com.etraveligroup.utils.MovieUtils;
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
        String result = RentalInfoService.rentalInformationSlip(new Customer("C. U. Stomer",Arrays.asList(new MovieRental("F001", 3), new MovieRental("F002", 1))));
        if (!result.equals(MovieUtils.expected)) {
            throw new AssertionError("Expected: \n" + String.format(MovieUtils.expected) + "\n\n" + "Got: " + "\n" + result);
        }
        log.info("Success");
    }
}
