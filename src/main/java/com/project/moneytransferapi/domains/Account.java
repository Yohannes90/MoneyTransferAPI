package com.project.moneytransferapi.domains;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Size(max = 15, min = 3)
    @NotBlank(message = "First name can't be empty")
    @Column(nullable = false)
    private String firstName;

    @Size(max = 15, min = 3)
    @NotBlank(message = "Last name can't be empty")
    @Column(nullable = false)
    private String lastName;

    @NotNull(message = "Date of birth must be set")
    @Column(nullable = false)
    private LocalDate dateOfBirth;

    @NotBlank(message = "Phone number can not be empty")
    @Size(max = 13, min = 10, message = "Phone number should be of 10 to 13 digits")
    @Column(nullable = false, unique = true)
    private String phoneNumber;

    @NotBlank(message = "email address can not be empty")
    @Email
    @Column(nullable = false, unique = true)
    private String email;

    @NotNull(message = "Pin must be set")
    @Column(nullable = false)
    private Integer pin;

    @Column
    private Double Balance = 0.0;

    @Column
    private LocalDate openingDate = LocalDate.now();

}
