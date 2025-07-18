package com.developing.jobportal.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.developing.jobportal.Enum.Role;
import com.developing.jobportal.Entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Long> {

    List<Admin>findByRole(Role role);
    Optional<Admin>findById(Long id);

}
