package patika.weatherapplicationapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class WeatherApplicationApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeatherApplicationApiApplication.class, args);
    }

}
