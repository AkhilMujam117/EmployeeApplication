package com.example.demo.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class EmployeeController {

    @GetMapping("/Employees")
    public ResponseEntity<String> getEmployee()
    {
        return new ResponseEntity<>("employee ", HttpStatus.OK);
    }
}
