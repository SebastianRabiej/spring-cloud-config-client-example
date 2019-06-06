package config.client.demo.demo_cloud_client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

  private final Properties properties;

  public Controller(Properties properties) {
    this.properties = properties;
  }

  @GetMapping("/")
  public String test() {
    return properties.getFoo();
  }
}
