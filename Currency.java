record Currency(String code, double exchangeRate) {
}

class User {
    private final String firstName;
    private final String lastName;
    private final String email;

    public User(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getEmail() {
        return email;
    }
}

