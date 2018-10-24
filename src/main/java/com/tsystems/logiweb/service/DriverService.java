package com.tsystems.logiweb.service;

import java.util.List;
import com.tsystems.logiweb.entity.Driver;

public interface DriverService {

    Driver addDriver(Driver driver);
    void delete(int id);
    Driver getByName(String name);
    Driver editDriver(Driver driver);
    List<Driver> getAll();

}
