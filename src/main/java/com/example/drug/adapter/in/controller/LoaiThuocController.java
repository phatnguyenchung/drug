package com.example.drug.adapter.in.controller;

import com.example.drug.adapter.in.dto.request.loaithuoc.CreateLoaiThuocRequest;
import com.example.drug.adapter.in.dto.request.loaithuoc.UpdateLoaiThuocRequest;
import com.example.drug.adapter.in.dto.response.ApiResponse;
import com.example.drug.application.port.in.loaithuoc.CreateLoaiThuocUseCase;
import com.example.drug.application.port.in.loaithuoc.UpdateLoaiThuocUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/loaithuoc", produces = MediaType.APPLICATION_JSON_VALUE)
public class LoaiThuocController {

    private final CreateLoaiThuocUseCase createLoaiThuocUseCase;
    private final UpdateLoaiThuocUseCase updateLoaiThuocUseCase;

    @PostMapping
    public ApiResponse<?> create(@RequestBody CreateLoaiThuocRequest createLoaiThuocRequest) {
        return ApiResponse.success(createLoaiThuocUseCase.createLoaiThuoc(createLoaiThuocRequest.toCommand()));
    }

    @PutMapping
    public ApiResponse<?> update(@RequestBody UpdateLoaiThuocRequest updateLoaiThuocRequest) {
        return ApiResponse.success(updateLoaiThuocUseCase.updateLoaiThuoc(updateLoaiThuocRequest.toCommand()));
    }
}
