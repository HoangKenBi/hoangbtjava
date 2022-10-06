package multipage.form;

import multipage.list.Controller;

public class Subjects extends Controller {

    String code;
    String name;
    String hours;

    public Subjects(String code, String name, String hours) {
        this.code = code;
        this.name = name;
        this.hours = hours;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return getCode()+"-"+getName()+"-"+getHours();
    }


}
