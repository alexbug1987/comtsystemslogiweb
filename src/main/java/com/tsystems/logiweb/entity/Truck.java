package com.tsystems.logiweb.entity;

import com.tsystems.logiweb.entity.enums.TruckStatus;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "truck")
public class Truck {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    @Column(name = "TruckID", nullable = false)
    private int truckId;

    @Column(name = "RegistrationNumber", nullable = false, length = 7)
    private String registrationNumber;

    @Column(name = "Capacity", nullable = false)
    private int capacity;

    @Column(name = "VehicleStatus", nullable = false)
    @Enumerated(EnumType.STRING)
    private TruckStatus truckStatus;

    @Column(name = "AverageSpeed", nullable = false)
    private int averageSpeed;

    //связь с текущим городом
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "CurrentCityID", nullable = false)
    private CountryMap countryTruck;

    // к свяи с с водителем
    @OneToOne(optional = false, mappedBy="driverTruck")
    private Driver driver;

    public int getTruckId() {
        return truckId;
    }

    public void setTruckId(int truckId) {
        this.truckId = truckId;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public TruckStatus getVehicleStatus() {
        return truckStatus;
    }

    public void setVehicleStatus(TruckStatus truckStatus) {
        this.truckStatus = truckStatus;
    }

    public int getAverageSpeed() {
        return averageSpeed;
    }

    public void setAverageSpeed(int averageSpeed) {
        this.averageSpeed = averageSpeed;
    }
    public CountryMap getCountryTruck() {
        return countryTruck;
    }

    public void setCountryTruck(CountryMap countryTruck) {
        this.countryTruck = countryTruck;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

}