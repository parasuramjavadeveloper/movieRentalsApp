package com.etraveligroup.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@Getter
@AllArgsConstructor
/**
 * The class calculates  rental amount that Customer has to be paid for its MovieRentals
 * @author Parasuram
 * @since 08-03-2021
 */
public class Movie implements Serializable {
    private String title;
    private String code;


}
