package models;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Sergey on 10.01.2016.
 */
public class User {
    private int id ;
    private int age;
    private String email;
    private String telephone;
    private String login;
    private String password;

    private Set<Friend> friends =
            new HashSet<Friend>(0);

    public User() {
    }

    public User(int id, int age, String email, String telephone, String login, String password) {
        this.id = id;
        this.age = age;
        this.email = email;
        this.telephone = telephone;
        this.login = login;
        this.password = password;
    }

    public Set<Friend> getFriends() {
        return friends;
    }

    public void setFriends(Set<Friend> friends) {
        this.friends = friends;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
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

}
