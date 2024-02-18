package com.cinema.domain.user;

import lombok.Builder;

@Builder
public record UserPayload(

        String id,
        String name,
        String surname,
        String email,
        String password,
        boolean isActive,
        boolean legalAge

) {
}
