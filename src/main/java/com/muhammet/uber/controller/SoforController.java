package com.muhammet.uber.controller;

import com.muhammet.uber.dto.request.SoforSaveRequestDto;
import com.muhammet.uber.repository.entity.Sofor;
import com.muhammet.uber.service.SoforService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.muhammet.uber.constants.EndPoints.*;

@RestController
@RequestMapping("/sofor")
@RequiredArgsConstructor
public class SoforController {
    private final SoforService soforService;

    @PostMapping(SAVE)
    public ResponseEntity<Sofor> save(@RequestBody SoforSaveRequestDto dto){
        return ResponseEntity.ok(soforService.saveDto(dto));
    }
}
