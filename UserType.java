abstract class UserType {
    abstract void displayUserInfo(User user);
}

class RegularUser extends UserType {
    private final int activityLevel;

    public RegularUser(int activityLevel) {
        this.activityLevel = activityLevel;
    }

    @Override
    void displayUserInfo(User user) {
        System.out.println("Regular User Information:");
        System.out.println("Name: " + user.getFullName());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Activity Level: " + activityLevel);
    }
}
