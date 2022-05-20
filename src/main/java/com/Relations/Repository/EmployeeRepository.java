package com.Relations.Repository;

import java.util.List;

import com.Relations.dto.DeptEmpDto;
import com.Relations.entity.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{
	@Query("SELECT new com.Relations.dto.DeptEmpDto(d.name, e.name, e.email, e.address,d.id) "
			+ "FROM Department d INNER JOIN d.employees e")
	List<DeptEmpDto> fetchEmpDeptDataInnerJoin();

	@Query("SELECT new com.Relations.dto.DeptEmpDto(d.name, e.name, e.email, e.address,d.id) "
			+ "FROM Department d, Employee e")
	List<DeptEmpDto> fetchEmpDeptDataCrossJoin();
}
