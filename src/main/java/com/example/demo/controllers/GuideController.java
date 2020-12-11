package com.example.demo.controllers;

import com.example.demo.domains.GuideDto;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;
import java.util.HashMap;

@RestController
public class GuideController {
    @PostMapping("/guides")
    public Map<?, ?> register(@RequestBody GuideDto guide) {
        var map = new HashMap<>();
        System.out.println("가이드등록에 전달된 데이터: " + guide.toString());
        return null;
    }
}
