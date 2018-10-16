package com.tsystems.logiweb.entity;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "countrymap")
public class CountryMap {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    @Column(name = "cityId", nullable = false)
    private int cityId;

    @Column(name = "City", nullable = false, length = 35)
    private String city;

    @Column(name = "XPosition", nullable = false)
    private int xPosition;

    @Column(name = "YPosition", nullable = false)
    private int yPosition;

    // к свяи с фурами
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "countryTruck")
    private Set<Truck> trucks;

    // к свяи с водителеми
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "driverCountry")
    private Set<Driver> drivers;

    // к свяи с с заказами
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "cityOfLoadingOrder")
    private Set<Order> ordersLoad;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "cityOfDischargeOrder")
    private Set<Order> ordersDischarge;


    //get-set

    public Set<Order> getOrdersLoad() {
        return ordersLoad;
    }

    public void setOrdersLoad(Set<Order> ordersLoad) {
        this.ordersLoad = ordersLoad;
    }

    public Set<Order> getOrdersDischarge() {
        return ordersDischarge;
    }

    public void setOrdersDischarge(Set<Order> ordersDischarge) {
        this.ordersDischarge = ordersDischarge;
    }

    public Set<Truck> getTrucks() {
        return trucks;
    }

    public void setTrucks(Set<Truck> trucks) {
        this.trucks = trucks;
    }

    public Set<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(Set<Driver> drivers) {
        this.drivers = drivers;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public CountryMap(String city, int xPosition, int yPosition) {
        this.city = city;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }
    public CountryMap(String city) {
        this.city = city;
    }

}