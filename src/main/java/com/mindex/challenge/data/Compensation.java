package com.mindex.challenge.data;

import org.springframework.data.mongodb.core.mapping.DBRef;

import java.time.Instant;
import java.util.Objects;

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

    public Compensation employee(Employee employee) {
        this.employee = employee;
        return this;
    }

    public Compensation salary(String salary) {
        this.salary = salary;
        return this;
    }

    public Compensation effectiveDate(Instant effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Compensation)) {
            return false;
        }
        Compensation compensation = (Compensation) object;
        return Objects.equals(employee, compensation.employee)
                && Objects.equals(salary, compensation.salary)
                && Objects.equals(effectiveDate, compensation.effectiveDate);
    }
}
