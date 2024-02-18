package com.cinema.domain.user.register;

import com.cinema.domain.user.UserEntity;
import com.cinema.domain.user.UserPayload;
import com.cinema.utils.converter.EntitiesConverter;
import com.cinema.utils.converter.PayloadsConverter;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
@Log4j2
public class RegisterService {

    private final UserRepository userRepository;

    private final EntitiesConverter entitiesConverter;
    private final PayloadsConverter payloadsConverter;


    public UserPayload register(RegisterUserPayload registerUserPayload) {
        log.info("Try to register new user with data: {}", registerUserPayload);
        UserEntity convertedPayloadToUserEntity = entitiesConverter.registeredUserPayloadToEntity(registerUserPayload);

        UserEntity savedUserEntity = userRepository.save(convertedPayloadToUserEntity);
        log.info("Registered new user with data: {}", savedUserEntity);

        return payloadsConverter.userEntityToPayload(savedUserEntity);
    }
}
