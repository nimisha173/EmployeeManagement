package com.UST.EmployeeManagement.repo;

import com.UST.EmployeeManagement.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {

    Optional<Object> findEmployeeById(Long id);

    void deleteEmployeeById(Long id);
}
