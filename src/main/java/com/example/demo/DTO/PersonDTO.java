package com.example.demo.DTO;

import java.util.Objects;

public class PersonDTO {

    Long id;

    String fullName;

    String email;

    Double score;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonDTO)) return false;
        PersonDTO personDTO = (PersonDTO) o;
        return Objects.equals(id, personDTO.id) &&
                Objects.equals(fullName, personDTO.fullName) &&
                Objects.equals(email, personDTO.email) &&
                Objects.equals(score, personDTO.score);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, fullName, email, score);
    }

    @Override
    public String toString() {
        return "PersonDTO{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", score=" + score +
                '}';
    }
}
