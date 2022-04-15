package com.example.ROI.ROI.controller;

import com.example.ROI.ROI.models.TaskData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoiController {
    @PostMapping("/roi")
    public ResponseEntity<?> roi(@RequestBody TaskData taskData){
        try {
            Thread.sleep(1000);
            return new ResponseEntity<>(taskData, HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
