package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class TimeBetween {

    public static void main(String[] args) {
        String dateFormat = "MMMM d, yyyy";
        LocalDate aDate = null;
        // Create a formatter to accept date entries using the USA common standard,
        // month day, year = for example, April 8, 1970
        boolean validStr = false;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dateFormat);
        // Create a formatter
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (!validStr) {
            System.out.print("Enter a date: (" + dateFormat + "): ");
            try {
                String dateEntered = br.readLine();
                aDate = LocalDate.parse(dateEntered, formatter);
                validStr = true;
            } catch (IOException | DateTimeParseException ex) {
                validStr = false;
            }
        }

        // Print the date out
        System.out.println("Date entered: " + aDate.format(formatter));
        LocalDate now = LocalDate.now();
        Period between;
        if (aDate.isBefore(now)) {
            between = Period.between(aDate, now);
        } else {
            between = Period.between(now, aDate);
        }

        // Calculate the years, months and days between now and the date entered
        // Print out the 
        int years = between.getYears();
        int months = between.getMonths();
        int days = between.getDays();
        System.out.println("There are " + years + " years, "
                + months + " months, "
                + days + " days between now and the date entered.");
    }
}