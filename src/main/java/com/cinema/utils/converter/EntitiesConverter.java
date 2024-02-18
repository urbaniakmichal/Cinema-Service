package com.cinema.utils.converter;

import com.cinema.domain.user.UserEntity;
import com.cinema.domain.user.UserPayload;
import com.cinema.domain.user.register.RegisterUserPayload;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Component;

@Component
public class EntitiesConverter {

    // USER
    public UserEntity userPayloadToEntity(UserPayload userPayload) {
        return UserEntity
                .builder()
                .id(new ObjectId(userPayload.id()))
                .name(userPayload.name())
                .surname(userPayload.surname())
                .email(userPayload.email())
                .password(userPayload.password())
                .isActive(userPayload.isActive())
                .legalAge(userPayload.legalAge())
                .build();
    }

    public UserEntity registeredUserPayloadToEntity(RegisterUserPayload registerUserPayload) {
        return UserEntity
                .builder()
                .name(registerUserPayload.name())
                .surname(registerUserPayload.surname())
                .email(registerUserPayload.email())
                .password(registerUserPayload.password())
                .isActive(true)
                .legalAge(registerUserPayload.legalAge())
                .build();
    }
}
