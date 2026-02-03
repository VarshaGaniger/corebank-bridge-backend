package com.corebank.bridge.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class LoanController {

    @GetMapping("/loan")
    public Map<String, Object> getLoan() throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        File file = new File(
                "C:/cobol_setup/home/Admin/cobol-demo/loan-output.json"
        );

        return mapper.readValue(file, Map.class);
    }
}
