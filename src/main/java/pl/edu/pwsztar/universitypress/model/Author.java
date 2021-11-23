package pl.edu.pwsztar.universitypress.model;

import java.io.Serializable;
import java.text.MessageFormat;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.annotations.NaturalId;

@Entity
public class Author implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @NaturalId
    private String firstName;
    private String middleName;
    private String lastName;
    private LocalDate dateOfBirth;

    public Author() {
    }

    public Author(String firstName, String middleName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dateOfBirth  = dateOfBirth;
    }

    @Override
    public String toString() {
        return MessageFormat.format("Autor [ID={0}, Imię={1}, Drugie imię={2}, Nazwisko={3}, Data urodzenia={4}]", id, firstName, middleName, lastName, dateOfBirth);
    }
}