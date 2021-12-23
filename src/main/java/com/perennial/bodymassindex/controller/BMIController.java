package com.perennial.bodymassindex.controller;

import com.perennial.bodymassindex.service.BMIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class BMIController {

    @Autowired
    private BMIService bmiService;

    @GetMapping("/BMI")
    @ResponseBody
    public double calculateBMI(@RequestParam double height , @RequestParam double weight)
    {
        return bmiService.bodyMassIndex(height,weight);
    }
}
