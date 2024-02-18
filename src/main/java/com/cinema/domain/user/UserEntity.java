package com.cinema.domain.user;

import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
@Builder
public record UserEntity(

        @Id
        ObjectId id,
        @NotBlank
        String name,
        @NotBlank
        String surname,
        @NotBlank
        String email,
        @NotBlank
        String password,
        @NotBlank
        boolean isActive,
        @NotBlank
        boolean legalAge
) {

    public UserEntity(String name, String surname, String email, String password, boolean isActive, boolean hasUnderAge) {
        this(null, name, surname, email, password, isActive, hasUnderAge);
    }
}
