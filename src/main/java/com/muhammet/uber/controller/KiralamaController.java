package com.muhammet.uber.controller;

import com.muhammet.uber.service.KiralamaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kiralama")
@RequiredArgsConstructor
public class KiralamaController {
    private final KiralamaService kiralamaService;
}
