package com.etraveligroup.model;


import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;
import java.util.List;

@Getter
@AllArgsConstructor
/**
 * This class stores Customer information
 * @author Parasuram
 * @since 08-03-2021
 */
public class Customer implements Serializable {
    private String name;
    private List<MovieRental> rentals;


}
