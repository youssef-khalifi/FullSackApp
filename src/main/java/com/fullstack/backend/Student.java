package com.fullstack.backend;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    private String firstname;

    @NotEmpty
    private String lastname;

    @Email
    @NotEmpty
    private String email;

    @Enumerated
    @NotNull
    private Gender gender;

    @ManyToOne
    @JoinColumn(name = "university_id")
    @NotNull
    @JsonIgnoreProperties({"students"})
    private University university;

}
