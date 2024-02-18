package com.cinema.utils.runner;

import com.cinema.domain.user.UserEntity;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
@Log4j2
public class RunnerService {

    public List<UserEntity> prepareBasicUserEntitiesWithoutRelations() {
        return List.of(
//                new UserEntity("Name 1", "Suername 1", "name1@surname1", new BCryptPasswordEncoder().encode("pass"), true, null),
                new UserEntity("Name 1", "Suername 1", "name1@surname1", "password 1", true, true),
                new UserEntity("Name 2", "Suername 2", "name2@surname2", "password 2", true, true),
                new UserEntity("Name 3", "Suername 3", "name3@surname3", "password 3", true, true),
                new UserEntity("Name 4", "Suername 4", "name4@surname4", "password 4", true, true)
        );
    }
}
