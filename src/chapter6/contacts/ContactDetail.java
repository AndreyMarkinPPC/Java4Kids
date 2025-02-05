package chapter6.contacts;

public class ContactDetail {

    private String fullName;
    private String facebookID;
    private String phone;
    private String email;

    public String toString(){
        return "Name: " + getFullName() +
                ", Facebook ID: " + getFacebookID() +
                ", phone: " + getPhone() +
                " , email: " + getEmail();
    };

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFacebookID() {
        return facebookID;
    }

    public void setFacebookID(String facebookID) {
        this.facebookID = facebookID;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
