package com.developing.jobportal.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.developing.jobportal.Enum.JobType;
import com.developing.jobportal.Service.JobPostService;
import com.developing.jobportal.DTO.JobPostDTO;
import com.developing.jobportal.Entity.JobPost;

@RestController
@RequestMapping("/api/jobposts")
public class JobPostController {

    @Autowired
    private JobPostService jobPostService;

    // Create a new job
    @PostMapping
    public ResponseEntity<JobPost> createJobs(@RequestBody JobPostDTO dto) {
        return ResponseEntity.ok(jobPostService.createJob(dto));
    }

    // Get all jobs
    @GetMapping
    public ResponseEntity<List<JobPost>> getAllJobs() {
        return ResponseEntity.ok(jobPostService.getAllJobs());
    }

    // Get jobs by recruiter email
    @GetMapping("/recruiters/{recruiterEmail}")
    public ResponseEntity<List<JobPost>> getJobByRecruiter(@PathVariable String recruiterEmail) {
        return ResponseEntity.ok(jobPostService.getJobByRecruiter(recruiterEmail));
    }

    // Get jobs by company name
    @GetMapping("/search/company/{companyName}")
    public ResponseEntity<List<JobPost>> getJobByCompanyName(@PathVariable String companyName) {
        return ResponseEntity.ok(jobPostService.searchJobByCompanyName(companyName));
    }

    // Get jobs by job title
    @GetMapping("/search/title/{jobTitle}")
    public ResponseEntity<List<JobPost>> getJobByJobTitle(@PathVariable String jobTitle) {
        return ResponseEntity.ok(jobPostService.searchJobByJobTitle(jobTitle));
    }

    // Get jobs by job location
    @GetMapping("/search/location/{jobLocation}")
    public ResponseEntity<List<JobPost>> getJobByJobLocation(@PathVariable String jobLocation) {
        return ResponseEntity.ok(jobPostService.searchJobByJobLocation(jobLocation));
    }

    // Get jobs by job type
    @GetMapping("/search/type/{jobType}")
    public ResponseEntity<List<JobPost>> getJobByJobType(@PathVariable JobType jobType) {
        return ResponseEntity.ok(jobPostService.searchJobByJobType(jobType));
    }
}

