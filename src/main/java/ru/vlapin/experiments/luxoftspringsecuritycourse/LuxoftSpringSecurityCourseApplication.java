package ru.vlapin.experiments.luxoftspringsecuritycourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class LuxoftSpringSecurityCourseApplication {

  public static void main(String[] args) {
    SpringApplication.run(LuxoftSpringSecurityCourseApplication.class, args);
  }

}
