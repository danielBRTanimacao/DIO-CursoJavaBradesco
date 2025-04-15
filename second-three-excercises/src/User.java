public class User {
    String name;
    String email;

    private String password;

    boolean isLogin = false;

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public void makeLogin() {
        if (isLogin) {
            System.out.println("Você ja fez login");
        }
        this.isLogin = true;
        System.out.println("Você acabou de fazer login");
    }

    public void logout() {

    }

    public void changePassword(String pastPassword, String newPassword) {
        if (pastPassword == this.password) {
            this.password = newPassword;
            System.out.println("A senha foi alterada");
        }
        System.out.println("Para modificar a senha precisa saber a senha anterior!");
    }

    public void getInfos() {
        throw new UnsupportedOperationException("Unimplemented method 'getInfos'");
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setEmail(String newEmail) {
        this.email = newEmail;
    }

}
