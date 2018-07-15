package mx.com.axity.model;

import javax.persistence.*;

@Entity
@Table(name = "USER")
public class UserDO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;
    @Column(name = "DS_NAME")
    private String name;
    @Column(name = "DS_LASTNAME")
    private String lastName;
    @Column(name = "AGE")
    private int age;

    protected UserDO() {
    }

    public UserDO(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
