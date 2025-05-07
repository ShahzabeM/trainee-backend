package com.example.trainee.controller;

import com.example.trainee.model.Trainee;
import com.example.trainee.repository.TraineeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*") // Allow frontend access from any origin
public class TraineeController {

    private final TraineeRepository repo;

    public TraineeController(TraineeRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/trainees")
    public List<Trainee> getAllTrainees() {
        return repo.findAll();
    }
}
