package ua.platform.coding.learning.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.platform.coding.learning.service.HomeApiService;

@RestController
@RequestMapping(("api/home"))
@RequiredArgsConstructor
public class HomeApiController {
    private final HomeApiService homeApiService;

    @GetMapping("/title")
    public ResponseEntity<String> getTitle() {
        return ResponseEntity.ok(homeApiService.getTitle());
    }
    @GetMapping("/description")
    public ResponseEntity<String> getDescription() {
        return ResponseEntity.ok(homeApiService.getDescription());
    }
}
