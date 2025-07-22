package com.example.restapi.controller;

import com.example.restapi.model.ApiModel;
import com.example.restapi.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private ApiService apiService;

    @GetMapping("/data")
    public ResponseEntity<List<ApiModel>> getApiData() {
        List<ApiModel> data = apiService.fetchData();
        return ResponseEntity.ok(data);
    }

    @PostMapping("/data")
    public ResponseEntity<ApiModel> createApiData(@RequestBody ApiModel apiModel) {
        ApiModel createdData = apiService.saveData(apiModel);
        return ResponseEntity.status(201).body(createdData);
    }
}