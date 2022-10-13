package BTVNJP2;

import java.sql.Time;
import java.util.Date;

public class information {
    Integer maSach;
    String tenSach;
    Integer id;
    String name;
    Integer sdt;
    String email;
    String nameMuon;
    String tenSachmuon;
    Date ngayMuon;
    Date ngayTra;
    Time giơMuon;
    Time gioTra;

    public information(Integer maSach, String tenSach, Integer id, String name, Integer sdt, String email, String nameMuon, String tenSachmuon, Date ngayMuon, Date ngayTra, Time giơMuon, Time gioTra) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.id = id;
        this.name = name;
        this.sdt = sdt;
        this.email = email;
        this.nameMuon = nameMuon;
        this.tenSachmuon = tenSachmuon;
        this.ngayMuon = ngayMuon;
        this.ngayTra = ngayTra;
        this.giơMuon = giơMuon;
        this.gioTra = gioTra;
    }

    public Integer getMaSach() {
        return maSach;
    }

    public void setMaSach(Integer maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSdt() {
        return sdt;
    }

    public void setSdt(Integer sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNameMuon() {
        return nameMuon;
    }

    public void setNameMuon(String nameMuon) {
        this.nameMuon = nameMuon;
    }

    public String getTenSachmuon() {
        return tenSachmuon;
    }

    public void setTenSachmuon(String tenSachmuon) {
        this.tenSachmuon = tenSachmuon;
    }

    public Date getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(Date ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public Date getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(Date ngayTra) {
        this.ngayTra = ngayTra;
    }

    public Time getGiơMuon() {
        return giơMuon;
    }

    public void setGiơMuon(Time giơMuon) {
        this.giơMuon = giơMuon;
    }

    public Time getGioTra() {
        return gioTra;
    }

    public void setGioTra(Time gioTra) {
        this.gioTra = gioTra;
    }
}
