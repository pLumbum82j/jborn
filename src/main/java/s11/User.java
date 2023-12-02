package s11;

public class User {
    private String firstName;
    private String secondName;

    @Override
    public String toString() {
        return "User{" +
                ", secondName='" + secondName + '\'' +
                "firstName='" + firstName + '\'' +
                '}'+'\n';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
}
