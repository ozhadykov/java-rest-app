package com.rest.app.setting_scores.rest;

import com.rest.app.setting_scores.ColleagueNotFoundException;
import com.rest.app.setting_scores.entity.Colleague;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ColleagueRestController {

    private List<Colleague> theColleagues = new ArrayList<>();

    @PostConstruct
    public void init() {
        this.theColleagues.add(new Colleague("Omar", "Zhadykov"));
        this.theColleagues.add(new Colleague("John", "Doe"));
        this.theColleagues.add(new Colleague("Paul", "Schmidt"));
    }

    // define endpoint for /colleagues

    @GetMapping("/colleagues")
    public List<Colleague> getColleagues() {

        return this.theColleagues;
    }

    @GetMapping("/colleague/{colleagueId}")
    public Colleague getColleagueById(@PathVariable int colleagueId) {

        // check Colleague ID
        if (colleagueId < 0 || colleagueId >= this.theColleagues.size()){
            throw new ColleagueNotFoundException("Colleague id not found " + colleagueId);
        }

        return theColleagues.get(colleagueId);
    }

    @ExceptionHandler
    public ResponseEntity<ColleagueErrorResponse> handleException(ColleagueNotFoundException e) {

        // create a Colleague response error
        ColleagueErrorResponse response = new ColleagueErrorResponse();

        response.setCode(HttpStatus.NOT_FOUND.value());
        response.setMessage(e.getMessage());
        response.setTimestamp(System.currentTimeMillis());

        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<ColleagueErrorResponse> handleException(Exception exc) {
        ColleagueErrorResponse response = new ColleagueErrorResponse();

        response.setCode(HttpStatus.BAD_REQUEST.value());
        response.setMessage(exc.getMessage());
        response.setTimestamp(System.currentTimeMillis());

        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }
}
