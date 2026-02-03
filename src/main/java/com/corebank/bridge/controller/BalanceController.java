package com.corebank.bridge.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.InputStream;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class BalanceController {

    @GetMapping("/balance")
    public Map<String, Object> getBalance() throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        File file = new File(
                "C:/cobol_setup/home/Admin/cobol-demo/cobol-output.json"
        );

        return mapper.readValue(file, Map.class);
    }

}
