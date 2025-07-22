package com.example.restapi.service;

import org.springframework.stereotype.Service;

@Service
public class ApiService {

    public String fetchData() {
        // Logic to fetch data from the database
        return "Fetched data";
    }

    public String saveData(String data) {
        // Logic to save data to the database
        return "Data saved: " + data;
    }
}