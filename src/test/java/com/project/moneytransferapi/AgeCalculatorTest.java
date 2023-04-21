package com.project.moneytransferapi;

import com.project.moneytransferapi.Utils.AgeCalculator;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@SpringBootTest
public class AgeCalculatorTest {

    @Test
    void shouldCalculateAgeCorrectly() {
        LocalDate dateOfBirth = LocalDate.of(1987,2,19);
        LocalDate currentDate = LocalDate.of(2023,2,19);
        Integer result = AgeCalculator.calculateAge(dateOfBirth, currentDate);
        assertEquals(36, result);
    }

    @Test
    public void shouldReturnErrorIfDateOfBirthIsNull () {
        LocalDate dateOfBirth = null;
        LocalDate currentDate = LocalDate.of(2023,2,19);
        Integer result = AgeCalculator.calculateAge(dateOfBirth, currentDate);
        assertNull(result);
    }

    @Test
    public void shouldReturnErrorIfCurrentDateIsNull () {
        LocalDate dateOfBirth = LocalDate.of(1987,2,19);
        LocalDate currentDate = null;
        Integer result = AgeCalculator.calculateAge(dateOfBirth, currentDate);
        assertNull(result);
    }

}
