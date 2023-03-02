package com.muhammet.uber.controller;

import com.muhammet.uber.dto.request.KiralamaSaveRequestDto;
import com.muhammet.uber.repository.entity.Kiralama;
import com.muhammet.uber.service.KiralamaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.muhammet.uber.constants.EndPoints.SAVE;

@RestController
@RequestMapping("/kiralama")
@RequiredArgsConstructor
public class KiralamaController {
    private final KiralamaService kiralamaService;

    @PostMapping(SAVE)
    public ResponseEntity<Kiralama> save(KiralamaSaveRequestDto dto){
      return ResponseEntity.ok(kiralamaService.saveDto(dto));
    }
}
