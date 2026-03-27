package org.herb.controller;

import org.herb.pojo.Result;
import org.herb.service.AiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ai")
public class AiController {
    
    @Autowired
    private AiService aiService;

    @GetMapping("/herb-qa")
    public Result<String> herbQA(
            @RequestParam String herbName,
            @RequestParam String question) {
        String answer = aiService.herbQA(herbName, question);
        return Result.success(answer);
    }

    @PostMapping("/prescription-analysis")
    public Result<String> prescriptionAnalysis(@RequestBody String prescriptionData) {
        String analysis = aiService.prescriptionAnalysis(prescriptionData);
        return Result.success(analysis);
    }

    @PostMapping("/diagnosis")
    public Result<String> diagnosis(@RequestBody String symptoms) {
        String result = aiService.diagnosis(symptoms);
        return Result.success(result);
    }
}
