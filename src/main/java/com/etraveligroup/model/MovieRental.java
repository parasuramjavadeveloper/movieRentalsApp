package com.etraveligroup.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@Getter
@AllArgsConstructor
/**
 * This class stores MovieRentals information
 * @author Parasuram
 * @since 08-03-2021
 */
public class MovieRental implements Serializable {
    private String movieId;
    private int days;


}
