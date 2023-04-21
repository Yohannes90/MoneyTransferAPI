package com.project.moneytransferapi.Utils;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {

    public static Integer calculateAge(LocalDate dateOfBirth, LocalDate currentDate) {
        if (dateOfBirth == null || currentDate == null) {
            return null;
        }
        return Period.between(dateOfBirth, currentDate).getYears();
    }
}
