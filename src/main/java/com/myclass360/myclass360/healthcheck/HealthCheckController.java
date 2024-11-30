package com.myclass360.myclass360.healthcheck;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health-check")
public class HealthCheckController {

  @GetMapping
  public ResponseEntity<String> healthCheck() {
    return new ResponseEntity<>("Health Check", HttpStatus.OK);
  }
}