package javafx;

public class FormSv {

    String name;
    String email;
    String point;

    public FormSv(String name, String email, String point) {
        this.name = name;
        this.email = email;
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    public String toString(){
        return getName()+" - " +getEmail()+" - " +getPoint()+"\n" ;

    }
}
