package com.example.demo.resolve;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestController
public class VersionController {

    @Version({1,1.1})
    @GetMapping("/entity")
    public ResponseEntity findByVersion(HttpServletRequest request) {
        log.info("request URI {}:", request.getRequestURI());
        return ResponseEntity.ok(request.getRequestURI());
    }
}
