package dev.omoladecodes.employeemanagement.repository;

import dev.omoladecodes.employeemanagement.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
