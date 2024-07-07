package domain;

import enums.IdDocType;

import java.util.Date;

public class Collaborator {

    private String name;

    private Date birthday;

    private Date admissionDate;

    private Address address;

    private int phoneNumber;

    private String email;

    private IdDocType idDocType;

    private int idNumber;

    private Job job;

    public Collaborator(String name, Date birthday, Date admissionDate, Address address, int phoneNumber, String email, IdDocType idDocType, int idNumber, Job job) {
        this.name = name;
        this.birthday = birthday;
        this.admissionDate = admissionDate;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.idDocType = idDocType;
        this.idNumber = idNumber;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public Date getAdmissionDate() {
        return admissionDate;
    }

    public Address getAddress() {
        return address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public IdDocType getIdDocType() {
        return idDocType;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public Job getJob() {
        return job;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIdDocType(IdDocType idDocType) {
        this.idDocType = idDocType;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public void setJob(Job job) {
        this.job = job;
    }

}
