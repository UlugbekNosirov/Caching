package uz.pdp.ehcache;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition
@SpringBootApplication
public class SpringBootEhcacheDemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringBootEhcacheDemoApplication.class, args);
  }

}
