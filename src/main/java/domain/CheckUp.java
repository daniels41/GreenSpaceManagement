package domain;

import java.util.Date;

public class CheckUp {

    private Vehicle vehicle;

    private Date date;

    private int kms;

    public CheckUp(Vehicle vehicle, Date date, int kms) {
        this.vehicle = vehicle;
        this.date = date;
        this.kms = kms;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Date getDate() {
        return date;
    }

    public int getKms() {
        return kms;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setKms(int kms) {
        this.kms = kms;
    }

}
