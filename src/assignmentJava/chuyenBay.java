package assignmentJava;

public class chuyenBay {
    public int number;
    public String destination;

    public chuyenBay() {
        this.number = 0;
        this.destination = " ";
    }

    public chuyenBay(int flightNumber, String destination) {
        if (flightNumber > 0){
            if(destination != "") {
                this.number = flightNumber;
                this.destination = destination;
            } else {
                this.number = 0;
                this.destination = "";
            }
        } else {
            this.number = 0;
            this.destination = "";
        }
    }

    public int getNumber() {
        return number;
    }

    public String getDestination() {
        return destination;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    void display () {
        System.out.println("Thông tin chuyến bay: ");
        System.out.println("Số hiệu: " + number);
        System.out.println("Chuyến bay: " + destination);
    }
}
