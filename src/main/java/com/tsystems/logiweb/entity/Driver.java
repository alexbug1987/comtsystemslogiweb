package com.tsystems.logiweb.entity;

import com.tsystems.logiweb.entity.enums.DriverStatus;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;


@Entity
@Table(name = "driver")
public class Driver {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "DriverID", nullable = false)
    private int driverId;

    @Column(name = "Name", nullable = false, length = 35)
    private String name;

    @Column(name = "Sirname", nullable = false, length = 35)
    private String sirname;

    @Column(name = "PersonalNumber", nullable = false)
    private String personalNumber;

    @Column(name = "WorkingHoursThisMonth", nullable = false)
    private short workingHoursThisMonth;

    //@Column(name = "DriverStatus", nullable = false)
    @Column(name = "DriverStatus")
    @Enumerated(EnumType.STRING)
    private DriverStatus driverStatus;

    //связь с текущим городом
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "CurrentCityID")
   // @JoinColumn(name = "CurrentCityID", nullable = false)
    private CountryMap driverCountry;

    //связь с текущей фурой
    @OneToOne(optional = false)
    @JoinColumn(name = "CurrentTruckID", unique = true, updatable = false)
    private Truck driverTruck;

    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSirname() {
        return sirname;
    }

    public void setSirname(String sirname) {
        this.sirname = sirname;
    }

    public String getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(String personalNumber) {
        this.personalNumber = personalNumber;
    }

    public short getWorkingHoursThisMonth() {
        return workingHoursThisMonth;
    }

    public void setWorkingHoursThisMonth(short workingHoursThisMonth) {
        this.workingHoursThisMonth = workingHoursThisMonth;
    }

    public DriverStatus getDriverStatus() {
        return driverStatus;
    }

    public void setDriverStatus(DriverStatus driverStatus) {
        this.driverStatus = driverStatus;
    }

    public CountryMap getDriverCountry() {
        return driverCountry;
    }

    public void setDriverCountry(CountryMap driverCountry) {
        this.driverCountry = driverCountry;
    }

    public Truck getDriverTruck() {
        return driverTruck;
    }

    public void setDriverTruck(Truck driverTruck) {
        this.driverTruck = driverTruck;
    }

}