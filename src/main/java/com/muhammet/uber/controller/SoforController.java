package com.muhammet.uber.controller;

import com.muhammet.uber.service.SoforService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sofor")
@RequiredArgsConstructor
public class SoforController {
    private final SoforService soforService;
}
