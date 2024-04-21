package com.chunping.springcloud;

import com.chunping.springcloud.domain.Address;
import com.chunping.springcloud.domain.Person;
import com.chunping.springcloud.repository.PeopleRepository;
import com.redis.om.spring.annotations.EnableRedisDocumentRepositories;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.geo.Point;

import java.util.Set;

@EnableRedisDocumentRepositories(basePackages = "com.chunping.springcloud.*")
@SpringBootApplication
public class RedisApplication8082 {

    @Bean
    CommandLineRunner loadTestData(PeopleRepository repo){
        return args -> {

            repo.deleteAll();

            String thorSays = "The Rabbit Is Correct, And Clearly The Smartest One Among You.";

            Address thorsAddress = Address.of("248", "Seven Mile Beach Rd", "Broken Head", "NSW", "2481", "Australia");
            Person thor = Person.of("Chris", "Hemsworth", 38, thorSays, new Point(153.616667, -28.716667), thorsAddress, Set.of("hammer", "biceps", "hair", "heart"));

            repo.save(thor);
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(RedisApplication8082.class, args);
    }
}
