package com.mindex.challenge.dao;

import com.mindex.challenge.data.Compensation;
import com.mindex.challenge.data.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompensationRepository extends MongoRepository<Compensation, String> {
    // Spring query methods
    // https://docs.spring.io/spring-data/mongodb/docs/current/reference/html/#repositories.query-methods
    // Compensation findByEmployee_EmployeeId(String employeeId);
    Compensation findByEmployee(Employee employee);

}
