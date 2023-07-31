package com.example.drug.adapter.in.controller;

import com.example.drug.adapter.in.dto.request.loaithuoc.CreateLoaiThuocRequest;
import com.example.drug.adapter.in.dto.response.ApiResponse;
import com.example.drug.application.port.in.loaithuoc.CreateLoaiThuocUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/loaithuoc", produces = MediaType.APPLICATION_JSON_VALUE)
public class LoaiThuocController {

    private final CreateLoaiThuocUseCase createLoaiThuocUseCase;


    @PostMapping
    public ApiResponse<?> create(@RequestBody CreateLoaiThuocRequest createLoaiThuocRequest) {
        return ApiResponse.success(createLoaiThuocUseCase.createLoaiThuoc(createLoaiThuocRequest.toCommand()));
    }
}
