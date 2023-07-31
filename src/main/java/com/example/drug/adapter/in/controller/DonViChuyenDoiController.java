package com.example.drug.adapter.in.controller;

import com.example.drug.adapter.in.dto.request.donvichuyendoi.CreateDonViChuyenDoiRequest;
import com.example.drug.adapter.in.dto.request.donvichuyendoi.DeleteDonViChuyenDoiRequest;
import com.example.drug.adapter.in.dto.request.donvichuyendoi.UpdateDonViChuyenDoiRequest;
import com.example.drug.adapter.in.dto.response.ApiResponse;
import com.example.drug.application.port.in.donvichuyendoi.CreateDonViChuyenDoiUseCase;
import com.example.drug.application.port.in.donvichuyendoi.DeleteDonViChuyenDoiUseCase;
import com.example.drug.application.port.in.donvichuyendoi.UpdateDonViChuyenDoiUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/donvichuyendoi", produces = MediaType.APPLICATION_JSON_VALUE)
public class DonViChuyenDoiController {

    private final CreateDonViChuyenDoiUseCase createDonViChuyenDoiUseCase;
    private final UpdateDonViChuyenDoiUseCase updateDonViChuyenDoiUseCase;
    private final DeleteDonViChuyenDoiUseCase deleteDonViChuyenDoiUseCase;

    @PostMapping
    public ApiResponse<?> create(@RequestBody CreateDonViChuyenDoiRequest createDonViChuyenDoiRequest) {
        return ApiResponse.success(createDonViChuyenDoiUseCase.createDonViChuyenDoi(createDonViChuyenDoiRequest.toCommand()));
    }

    @PutMapping
    public ApiResponse<?> update(@RequestBody UpdateDonViChuyenDoiRequest updateDonViChuyenDoiRequest) {
        return ApiResponse.success(updateDonViChuyenDoiUseCase.updateDonViChuyenDoi(updateDonViChuyenDoiRequest.toCommand()));
    }

    @DeleteMapping
    public ApiResponse<?> delete(@RequestBody DeleteDonViChuyenDoiRequest deleteDonViChuyenDoiRequest) {
        return ApiResponse.success(deleteDonViChuyenDoiUseCase.deleteDonViChuyenDoi(deleteDonViChuyenDoiRequest.toCommand()));
    }
}
