package com.pm.patientservice.dto;


import com.pm.patientservice.dto.validators.CreatePatientValidationGroup;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class PatientRequestDTO {
    @NotBlank(message = "Property, Name is required.")
    @Size(max = 100, message = "Property, Name cannot exceed 100 characters.")
    private String name;

    @NotBlank(message = "Property, Email is required.")
    @Email(message = "Property, Email should be valid.")
    private String email;

    @NotBlank(message = "Property, Address is required.")
    private String address;

    @NotBlank(message = "Property, Date of birth is required.")
    private String dateOfBirth;

    @NotBlank(groups= CreatePatientValidationGroup.class, message = "Property, Registered Date is required.")
    private String registeredDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(String registeredDate) {
        this.registeredDate = registeredDate;
    }
}
