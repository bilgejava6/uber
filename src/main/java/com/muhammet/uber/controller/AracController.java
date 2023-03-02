package com.muhammet.uber.controller;

import com.muhammet.uber.dto.request.AracSaveRequestDto;
import com.muhammet.uber.repository.entity.Arac;
import com.muhammet.uber.service.AracService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.muhammet.uber.constants.EndPoints.*;

@RestController
@RequestMapping("/arac")
@RequiredArgsConstructor
public class AracController {
    private final AracService aracService;
    @PostMapping(SAVE)
    public ResponseEntity<Arac> save(@RequestBody AracSaveRequestDto dto){
        return ResponseEntity.ok(aracService.saveDto(dto));
    }
}
