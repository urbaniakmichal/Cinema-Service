package com.cinema.utils.runner;

import com.cinema.domain.user.register.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class Runner implements CommandLineRunner {

    private final UserRepository userRepository;
    private final RunnerService runnerService;

    @Override
    public void run(String... args) {
        userRepository.deleteAll();
        userRepository.saveAll(runnerService.prepareBasicUserEntitiesWithoutRelations());
    }
}
