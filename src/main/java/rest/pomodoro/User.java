package rest.pomodoro;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
    
public class User {
    @Id private String id;
    public String firstname;
    public String lastname;
    public long score;

    public User() {
    }

    public User(String firstname, String lastname, long score) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.score = score;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public long getScore() {
        return this.score;
    }

    public void setScore(long score) {
        this.score = score;
    }
}