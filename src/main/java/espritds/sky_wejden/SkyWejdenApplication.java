package espritds.sky_wejden;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SkyWejdenApplication {

	public static void main(String[] args) {
		SpringApplication.run(SkyWejdenApplication.class, args);
	}

}
