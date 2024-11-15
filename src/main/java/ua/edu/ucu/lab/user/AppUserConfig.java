package ua.edu.ucu.lab.user;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class AppUserConfig {
    private static final AppUser USER_FIRST =
            new AppUser("zavodnik.pn@ucu.edu.ua",
                    LocalDate.of(2003, 2, 2));
    private static final AppUser USER_SECOND =
            new AppUser("vlad.pn@ucu.edu.ua",
                    LocalDate.of(2004, 4, 14));

    @Bean
    CommandLineRunner setupUsers(AppUserRepository userRepository) {
        return args -> {
            userRepository.saveAll(List.of(USER_FIRST, USER_SECOND));
        };
    }
}
