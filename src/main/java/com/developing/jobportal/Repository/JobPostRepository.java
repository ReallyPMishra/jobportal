package com.developing.jobportal.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.developing.jobportal.Enum.JobType;
import com.developing.jobportal.Entity.JobPost;

@Repository
public interface JobPostRepository extends JpaRepository<JobPost, Long> {
    List<JobPost>findByCompanyName(String companyName);
    List<JobPost>findByJobTitle(String jobTitle);
    List<JobPost>findByJobType(JobType jobType);
    List<JobPost>findByJobLocation(String jobLocation);
    List<JobPost>findByRecruiterEmail(String recruiterEmail);

}

