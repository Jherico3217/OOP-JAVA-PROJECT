class User {
    private String username = "user";
    private String password = "user123";

    public boolean login(String username, String password) {
        return username.equals(this.username) && password.equals(this.password);
    }
}