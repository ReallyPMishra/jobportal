package com.developing.jobportal.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.developing.jobportal.Service.RecruiterService;
import com.developing.jobportal.DTO.RecruiterDTO;
import com.developing.jobportal.Entity.Recruiter;

@RestController
@RequestMapping("/api/recruiters")
public class RecruiterController {

    @Autowired
    private RecruiterService recruiterService;


    @PostMapping("/save")
    public ResponseEntity<Recruiter>saveRecruiter(@RequestBody RecruiterDTO dto){
        return ResponseEntity.ok(recruiterService.createOrUpdateRecruiter(dto));
    }
    @GetMapping("/{recruiterEmail}")
    public ResponseEntity<Recruiter>getRecruiter(@PathVariable String recruiterEmail){
        return ResponseEntity.ok(recruiterService.getRecruiterByEmail(recruiterEmail));
    }

}