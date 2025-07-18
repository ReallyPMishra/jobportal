package com.developing.jobportal.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.developing.jobportal.Service.EmployeeService;
import com.developing.jobportal.DTO.EmployeeDTO;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {


    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/{email}")
    public ResponseEntity<EmployeeDTO>getEmployee(@PathVariable String email){
        return ResponseEntity.ok(employeeService.getEmployeeByEmail(email));
    }

    @PostMapping("/update")
    public ResponseEntity<EmployeeDTO>getUpdateProfile(@RequestBody  EmployeeDTO dto){
        return ResponseEntity.ok(employeeService.updateProfile(dto));
    }

}
