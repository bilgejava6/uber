package com.muhammet.uber.controller;

import com.muhammet.uber.dto.request.MusteriSaveRequestDto;
import com.muhammet.uber.repository.entity.Musteri;
import com.muhammet.uber.service.MusteriService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

import static com.muhammet.uber.constants.EndPoints.*;

@RestController
@RequestMapping("/musteri")
@RequiredArgsConstructor
public class MusteriController {
    private final MusteriService musteriService;

    @PostMapping(SAVE)
    public ResponseEntity<Musteri> save(
            @RequestBody @Valid  MusteriSaveRequestDto dto){
        Musteri musteri = musteriService.saveDto(dto);
        return ResponseEntity.ok(musteri);
    }
}
