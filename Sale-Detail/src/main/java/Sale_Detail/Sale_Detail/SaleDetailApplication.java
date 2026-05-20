package Sale_Detail.Sale_Detail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SaleDetailApplication {

	public static void main(String[] args) {
		SpringApplication.run(SaleDetailApplication.class, args);
	}

}
