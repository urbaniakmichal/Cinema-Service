package com.cinema.utils.converter;

import com.cinema.domain.user.UserEntity;
import com.cinema.domain.user.UserPayload;
import org.springframework.stereotype.Component;

@Component
public class PayloadsConverter {

    // USER
    public UserPayload userEntityToPayload(UserEntity userEntity) {
        return UserPayload
                .builder()
                .id(userEntity.id().toString())
                .name(userEntity.name())
                .surname(userEntity.surname())
                .email(userEntity.email())
                .isActive(userEntity.isActive())
                .legalAge(userEntity.legalAge())
                .build();
    }


}
