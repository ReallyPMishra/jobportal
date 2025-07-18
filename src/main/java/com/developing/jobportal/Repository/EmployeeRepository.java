package com.developing.jobportal.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.developing.jobportal.Entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{

    Employee findByEmail(String email);

}
