package com.example.drug.adapter.in.controller;

import com.example.drug.adapter.in.dto.request.thuoc.CreateThuocRequest;
import com.example.drug.adapter.in.dto.request.thuoc.DeleteThuocRequest;
import com.example.drug.adapter.in.dto.request.thuoc.UpdateThuocRequest;
import com.example.drug.adapter.in.dto.response.ApiResponse;
import com.example.drug.application.port.in.thuoc.CreateThuocUseCase;
import com.example.drug.application.port.in.thuoc.DeleteThuocUseCase;
import com.example.drug.application.port.in.thuoc.UpdateThuocUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/thuoc", produces = MediaType.APPLICATION_JSON_VALUE)
public class ThuocController {

    private final CreateThuocUseCase createThuocUseCase;
    private final UpdateThuocUseCase updateThuocUseCase;
    private final DeleteThuocUseCase deleteThuocUseCase;

    @PostMapping
    public ApiResponse<?> create(@RequestBody CreateThuocRequest createThuocRequest) {
        return ApiResponse.success(createThuocUseCase.createThuoc(createThuocRequest.toCommand()));
    }

    @PutMapping
    public ApiResponse<?> update(@RequestBody UpdateThuocRequest updateThuocRequest) {
        return ApiResponse.success(updateThuocUseCase.updateThuoc(updateThuocRequest.toCommand()));
    }

    @DeleteMapping
    public ApiResponse<?> delete(@RequestBody DeleteThuocRequest deleteThuocRequest) {
        return ApiResponse.success(deleteThuocUseCase.deleteThuoc(deleteThuocRequest.toCommand()));
    }
}
