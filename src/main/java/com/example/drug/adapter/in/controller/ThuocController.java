package com.example.drug.adapter.in.controller;

import com.example.drug.adapter.in.dto.request.thuoc.CreateThuocRequest;
import com.example.drug.adapter.in.dto.response.ApiResponse;
import com.example.drug.application.port.in.thuoc.CreateThuocUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/thuoc", produces = MediaType.APPLICATION_JSON_VALUE)
public class ThuocController {

    private final CreateThuocUseCase createThuocUseCase;

    @PostMapping
    public ApiResponse<?> create(@RequestBody CreateThuocRequest createThuocRequest) {
        return ApiResponse.success(createThuocUseCase.createThuoc(createThuocRequest.toCommand()));
    }
}
