package com.cinema.domain.user.register;

import com.cinema.domain.user.UserPayload;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping(value = "/api/user/register", produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin(origins = "http://localhost:4200")
@RequiredArgsConstructor
@RestController
@Log4j2
public class RegisterController {

    private final RegisterService registerService;


    @Value("${api.user.register.path}")
    String apiUserRegisterPath;
    @Value("${api.version}")
    public String apiVersion;


    @PostMapping
    public ResponseEntity<UserPayload> register(@Valid @RequestBody RegisterUserPayload registerUserPayload) {
        UserPayload registeredUserPayload = registerService.register(registerUserPayload);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(registeredUserPayload);
    }
}
