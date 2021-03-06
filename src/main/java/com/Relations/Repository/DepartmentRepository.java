package com.Relations.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Relations.dto.DeptEmpDto;
import com.Relations.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
	
	@Query("SELECT new com.Relations.dto.DeptEmpDto(d.name, e.name, e.email, e.address,d.id) "+ "FROM Department d LEFT JOIN d.employees e")
	List<DeptEmpDto> fetchEmpDeptDataLeftJoin();

	@Query("SELECT new com.Relations.dto.DeptEmpDto(d.name, e.name, e.email, e.address,e.dept_id) "+ "FROM Department d RIGHT JOIN d.employees e")
	List<DeptEmpDto> fetchEmpDeptDataRightJoin();

}
