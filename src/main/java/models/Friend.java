package models;

import java.util.Date;

/**
 * Created by Sergey on 10.01.2016.
 */
public class Friend {
    private int id;
    private String name;
    private Date birthday;

    public Friend() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    private User user;
    public Friend(int id, User user,String name, Date birthday) {
        this.id = id;
        this.user = user;
        this.name = name;
        this.birthday = birthday;
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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
