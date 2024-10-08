package com.dysonn.WebSpring.dto.request;

import com.dysonn.WebSpring.validator.DobConstraint;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;


import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserUpdateRequest {
    @Size(min = 8, message = "PASSWORD_VALID")
    String password;
    String firstName;
    String lastName;
    @DobConstraint(min=2, message = "INVALID_DOB")
    LocalDate dob;
    List<String> roles;
}
