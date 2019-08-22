package java;

public class CodeupCrypt {
    private String password;
    private String hash;

    public CodeupCrypt(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getHash() {
        return hash;
    }
}
