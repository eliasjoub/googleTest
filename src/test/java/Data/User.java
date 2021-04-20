package Data;

import com.google.gson.annotations.Expose;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.annotation.JsonIgnore;

public class User {

    private double id;
    private String email;
    private String first_name;
    private String last_name;

    @Expose(serialize = false, deserialize = false)
    private transient String avatar;

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

}
