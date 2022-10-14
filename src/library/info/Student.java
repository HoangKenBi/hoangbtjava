package library.info;

public class Student {
    Integer idsd;
    String namesd;
    String email;
    Integer tel;

    public Student() {
    }

    public Student(Integer idsd, String namesd, String email, Integer tel) {
        this.idsd = idsd;
        this.namesd = namesd;
        this.email = email;
        this.tel = tel;
    }

    public Integer getIdsd() {
        return idsd;
    }

    public void setIdsd(Integer idsd) {
        this.idsd = idsd;
    }

    public String getNamesd() {
        return namesd;
    }

    public void setNamesd(String namesd) {
        this.namesd = namesd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String emai) {
        this.email = email;
    }

    public Integer getTel() {
        return tel;
    }

    public void setTel(Integer tel) {
        this.tel = tel;
    }
}
