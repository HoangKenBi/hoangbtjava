package javafx;

import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {
    public TextField txtFullName;
    public TextField txtEmail;
    public TextField txtAge;
    public TextField txtAddress;
    public Text fullname;
    public Text email;
    public Text age;
    public Text address;

    public void handleSubmit(){
        String fn = txtFullName.getText();
        fullname.setText(fn);
        String e = txtEmail.getText();
        email.setText(e);
        String a = txtAge.getText();
        age.setText(a);
        String ad = txtAddress.getText();
        address.setText(ad);
    }




}
