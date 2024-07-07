package domain;

import java.util.Date;

public class Vehicle {

    private String brand;

    private String model;

    private int tare;

    private int grossWeight;

    private int currentKm;

    private Date registerDate;

    private Date acquisitionDate;

    private int checkUpFrequency;

    private String plateNumber;

    public Vehicle(String brand, String model, int tare, int grossWeight, int currentKm, Date registerDate, Date acquisitionDate, int checkUpFrequency, String plateNumber) {
        this.brand = brand;
        this.model = model;
        this.tare = tare;
        this.grossWeight = grossWeight;
        this.currentKm = currentKm;
        this.registerDate = registerDate;
        this.acquisitionDate = acquisitionDate;
        this.checkUpFrequency = checkUpFrequency;
        this.plateNumber = plateNumber;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getTare() {
        return tare;
    }

    public int getGrossWeight() {
        return grossWeight;
    }

    public int getCurrentKm() {
        return currentKm;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public Date getAcquisitionDate() {
        return acquisitionDate;
    }

    public int getCheckUpFrequency() {
        return checkUpFrequency;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setTare(int tare) {
        this.tare = tare;
    }

    public void setGrossWeight(int grossWeight) {
        this.grossWeight = grossWeight;
    }

    public void setCurrentKm(int currentKm) {
        this.currentKm = currentKm;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public void setAcquisitionDate(Date acquisitionDate) {
        this.acquisitionDate = acquisitionDate;
    }

    public void setCheckUpFrequency(int checkUpFrequency) {
        this.checkUpFrequency = checkUpFrequency;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

}
