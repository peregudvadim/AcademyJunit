//created by Vadim Peregud

import java.time.LocalDate;

public class User extends Person{

  private String login;
  private String password;
  private String email;

    public User(String firstName, String lastName, int age, LocalDate dateOfBirth, String login, String password, String email) {
        super(firstName, lastName, age, dateOfBirth);
        this.login = login;
        this.password = password;
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void printUserInfo(){
        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("Age: " + getAge());
        System.out.println("Date of Birth: " + getDateOfBirth());
        System.out.println("Login: " + getLogin());
        System.out.println("Email: " + getEmail());

    }

    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
