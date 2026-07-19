package java8.combinationpattern;

import java.time.LocalDate;

public class Customer {
    private String name;
    private String email;
    private String phonumber;
    private LocalDate dob;

    public Customer(String name, String email, String phonumber, LocalDate dob) {
        this.name = name;
        this.email = email;
        this.phonumber = phonumber;
        this.dob = dob;
    }

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

    public String getPhonumber() {
        return phonumber;
    }

    public void setPhonumber(String phonumber) {
        this.phonumber = phonumber;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
}
