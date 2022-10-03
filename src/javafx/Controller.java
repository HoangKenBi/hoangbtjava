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

    /* Tạo cảnh báo đỏ khi ng dùng k điền đủ thông tin
    public Text noticeFullName;
    public Text noticeEmail;
    public Text noticeAge;
    public Text noticeAddress;
     */

    public void handleSubmit(){
        String fn = txtFullName.getText();
        fullname.setText(fn);
        String e = txtEmail.getText();
        email.setText(e);
        String a = txtAge.getText();
        age.setText(a);
        String ad = txtAddress.getText();
        address.setText(ad);


        /* Bắt buộc ng dùng phải điền vào phần họ tên nếu k điền hiển thị dòng "Vui lòng nhập họ tên"
        String fn = txtFullName.getText();
        if (fn.isEmpty()){
            noticeFullName.setText("Vui lòng nhập họ tên");
            noticeFullName.setVisible(true);
        }else{
        fullname.setText(fn);
        noticeFullName.setVisible(true);
        }
         */

        /* Bắt buộc ng dùng phải điền vào @ k để trông chữ 2 k đầu cũng k ở cuối
        String e = txtEmail.getText();
        if (e.isEmpty() || !e.contains("@") || e.starsWith("@") || e.endsWith("@")){
            noticeEmail.setText("Vui lòng nhập vào một địa chỉ Email");
            noticeEmail.setVisible(true);
        }else{
            noticeEmail.setVisible(false);
            email.setText(e);
        }
         */

        /* Bắt buộc ng dùng phải điền vào số tuổi lớn hơn 0 và nhỏ hơn 100
        String a = txtAge.getText();
        try{
            Interger nAge = Interger.parseInt(ag);
            if (nAge <= 0 || nAge > 100)
                throw new Excption("Vui lòng nhập tuổi hợp lệ");
            age.setText(nAge.toString());
            noticeAge.setVisible(false)
        }catch (Excption e){
            noticeAge.setText(e.getMessage());
            noticeAge.setVisible(true);
        }
         */

        /*  Bắt buộc ng dùng phải điền địa chỉ vào k đk bỏ trống
        String ad = txtAddress.getText();
        if(ad.isEmpty() || ad.length() < 10){
            noticeAddress.setText("Vui lòng nhập vào một địa chỉ");
            noticeAddress.setVisible(true);
        }else{
            noticeAddress.setVisible(false);
            address.setText(ad);
        }
         */
    }




}
