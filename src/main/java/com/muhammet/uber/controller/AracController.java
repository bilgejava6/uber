package com.muhammet.uber.controller;

import com.muhammet.uber.service.AracService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/arac")
@RequiredArgsConstructor
public class AracController {
    private final AracService aracService;
}
