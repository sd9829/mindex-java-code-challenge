package com.mindex.challenge.data;

import org.springframework.data.mongodb.core.mapping.DBRef;

import java.time.Instant;

public class Compensation {

    @DBRef(lazy = true)
    private Employee employee;
    private String salary;
    private Instant effectiveDate;

    public Compensation(){
        //constructor
    }

    public Employee getEmployee() {
        return this.employee;
    }

    public void setEmployee(){
        this.employee = employee;
    }

    public String getSalary() {
        return this.salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public Instant getEffectiveDate() {
        return this.effectiveDate;
    }

    public void setEffectiveDate(Instant effectiveDate) {
        this.effectiveDate = effectiveDate;
    }
}
