package com.stackroute.seed;

import com.stackroute.domain.Muzix;
import com.stackroute.repository.MuzixRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineListener implements CommandLineRunner {
    @Autowired
    private MuzixRepository muzixRepository;
    @Override
    public void run(String... args) throws Exception {
        muzixRepository.save(new Muzix(2,"Liar",4,"Camilo"));

    }
}
