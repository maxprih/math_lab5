package com.example.math_lab5.controller;


import com.example.math_lab5.dto.Answer;
import com.example.math_lab5.dto.Point;
import com.example.math_lab5.service.MathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class MathController {

    @Autowired
    private MathService service;

    @PostMapping("/submit")
    public Answer solve(@RequestBody List<Point> points) {
        return service.solve(points);
    }
}
