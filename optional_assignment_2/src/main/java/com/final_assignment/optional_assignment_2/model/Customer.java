package com.final_assignment.optional_assignment_2.model;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="customer_info")
public class Customer {


    @Id
    private  String customer_id;

    @Column(name = "f_name")
    private  String f_name;

    @Column(name = "l_name")
    private  String l_name;

    @Column(name = "city")
    private  String city;

    @Column(name = "country")
    private  String country;

    @Column(name = "personal_phnum")
    private  String personal_phnum;

    @Column(name = "personal_email")
    private  String personal_email;

    public Customer(){}

    public Customer(String customer_id, String f_name, String l_name, String city, String country, String personal_phnum, String personal_email) {
        this.customer_id = customer_id;
        this.f_name = f_name;
        this.l_name = l_name;
        this.city = city;
        this.country = country;
        this.personal_phnum = personal_phnum;
        this.personal_email = personal_email;
    }

    public String getCustomer_id() {
        return customer_id;
    }
    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public String getF_name() {
        return f_name;
    }
    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getL_name() {
        return l_name;
    }
    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    public String getPersonal_phnum() {
        return personal_phnum;
    }
    public void setPersonal_phnum(String personal_phnum) {
        this.personal_phnum = personal_phnum;
    }

    public String getPersonal_email() {
        return personal_email;
    }
    public void setPersonal_email(String personal_email) {
        this.personal_email = personal_email;
    }



}
