class Admin {
    private String adminUsername = "admin";
    private String adminPassword = "admin123";

    public boolean login(String username, String password) {
        return username.equals(adminUsername) && password.equals(adminPassword);
    }
}
