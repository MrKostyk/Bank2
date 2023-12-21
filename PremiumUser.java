class PremiumUser extends UserType {
    private final boolean premiumStatus;

    public PremiumUser(boolean premiumStatus) {
        this.premiumStatus = premiumStatus;
    }

    @Override
    void displayUserInfo(User user) {
        System.out.println("Premium User Information:");
        System.out.println("Name: " + user.getFullName());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Premium Status: " + premiumStatus);
    }
}

