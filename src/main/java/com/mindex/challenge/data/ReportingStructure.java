package com.mindex.challenge.data;

import java.util.Objects;

public class ReportingStructure {
    private Employee employee;
    private int numberOfReports;

    public ReportingStructure(Employee employee, int numberOfReports) {
        this.employee = employee;
        this.numberOfReports = numberOfReports;
    }

    public Employee getEmployee(){
            return this.employee;
        }

    public void setEmployee(Employee employee){
        this.employee = employee;
    }

    public int getNumberOfReports() {
        return this.numberOfReports;
    }

    public void setNumberOfReports(int numberOfReports) {
        this.numberOfReports = numberOfReports;
    }

    public ReportingStructure employee(Employee employee) {
        this.employee = employee;
        return this;
    }

    public ReportingStructure numberOfReports(int numberOfReports) {
        this.numberOfReports = numberOfReports;
        return this;
    }

    @Override
    public boolean equals(Object object) {
        if (object == this)
            return true;
        if (!(object instanceof ReportingStructure)) {
            return false;
        }
        ReportingStructure reportingStructure = (ReportingStructure) object;
        return Objects.equals(employee, reportingStructure.employee)
                && numberOfReports == reportingStructure.numberOfReports;
    }

    @Override
    public int hashCode() {
        return Objects.hash(employee, numberOfReports);
    }

    @Override
    public String toString() {
        return "{" +
                " employee='" + getEmployee() + "'" +
                ", numberOfReports='" + getNumberOfReports() + "'" +
                "}";
    }
}
