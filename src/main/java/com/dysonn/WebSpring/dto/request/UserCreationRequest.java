package com.dysonn.WebSpring.dto.request;

import com.dysonn.WebSpring.validator.DobConstraint;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;


import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserCreationRequest {
    @Size(min = 3, message = "USERNAME_VALID")
    String username;
    @Size(min = 8, message = "PASSWORD_VALID")
    String password;
    String firstName;
    String lastName;

    @DobConstraint(min=18, message = "INVALID_DOB")
    LocalDate dob;


}
