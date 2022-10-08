package assignmentJava;

import java.util.Scanner;

public class tinhTienLai {
    public static void main(String args[]){
        double d,l, sinterest;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập số dư: ");
        d = scan.nextDouble();
        System.out.println("Nhập lãi xuất: ");
        l = scan.nextDouble();
        scan.close();
        sinterest = d * (l/1200);
        System.out.println("Sô tiền lãi hàng tháng là: " +Math.round(sinterest*100.0)/100.0);
    }
}
