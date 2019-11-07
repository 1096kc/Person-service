package com.example.demo.DTO;

import java.util.Objects;

public class PersonDTO {

    private Long id;

    private String fullName;

    private String email;

    private Double score;

    private String userName;

    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonDTO personDTO = (PersonDTO) o;
        return Objects.equals(id, personDTO.id) &&
                Objects.equals(fullName, personDTO.fullName) &&
                Objects.equals(email, personDTO.email) &&
                Objects.equals(score, personDTO.score) &&
                Objects.equals(userName, personDTO.userName) &&
                Objects.equals(password, personDTO.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fullName, email, score, userName, password);
    }

    @Override
    public String toString() {
        return "PersonDTO{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", score=" + score +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
