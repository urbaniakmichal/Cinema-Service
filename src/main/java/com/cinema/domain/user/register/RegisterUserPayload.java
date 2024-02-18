package com.cinema.domain.user.register;

import lombok.Builder;

@Builder
public record RegisterUserPayload(

        String name,
        String surname,
        String email,
        String password,
        boolean legalAge
) {
}
