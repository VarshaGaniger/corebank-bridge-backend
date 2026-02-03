package com.corebank.bridge.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class TransactionController {

    @GetMapping("/transactions")
    public List<Map<String, Object>> getTransactions() throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        File file = new File(
                "C:/cobol_setup/home/Admin/cobol-demo/transactions-output.json"
        );

        return mapper.readValue(file, List.class);
    }
}
