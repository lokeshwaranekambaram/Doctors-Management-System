package com.system.doctors.model;


import jakarta.persistence.*;


@Entity
@Table(name = "doctorslist")
public class Doctors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private int age;
    @Column(name = "specialization")
    private String Specialization;
    @Column(name = "yearofexperinece")
    private int yearofExperience;
    @Column(name = "address")
    private String address;
    @Column(name = "city")
    private String city;

    public Doctors() {
    }

    public Doctors(int id, String name, int age, String specialization, int yearofExperience, String address, String city) {
        this.id = id;
        this.name = name;
        this.age = age;
        Specialization = specialization;
        this.yearofExperience = yearofExperience;
        this.address = address;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecialization() {
        return Specialization;
    }

    public void setSpecialization(String specialization) {
        Specialization = specialization;
    }

    public int getYearofExperience() {
        return yearofExperience;
    }

    public void setYearofExperience(int yearofExperience) {
        this.yearofExperience = yearofExperience;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
