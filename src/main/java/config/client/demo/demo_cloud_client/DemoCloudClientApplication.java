package config.client.demo.demo_cloud_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class DemoCloudClientApplication {

  public static void main(String[] args) {
    SpringApplication.run(DemoCloudClientApplication.class, args);
  }

}