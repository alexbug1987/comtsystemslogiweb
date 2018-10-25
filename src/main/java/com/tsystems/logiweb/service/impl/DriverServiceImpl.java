package com.tsystems.logiweb.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.tsystems.logiweb.entity.Driver;
import com.tsystems.logiweb.repository.DriverRepository;
import com.tsystems.logiweb.service.DriverService;

@Service
@Transactional
public class DriverServiceImpl implements DriverService {

    @Autowired
    private DriverRepository driverRepository;

    @Override
    public Driver addDriver(Driver driver) {

        return driverRepository.saveAndFlush(driver);
    }
    @Override
    public void delete(int id) {
        driverRepository.deleteById(id);
    }

    @Override
    public Driver getByName(String name) {
        return driverRepository.findByName(name);
    }

    @Override
    public Driver editDriver(Driver driver) {
        return driverRepository.saveAndFlush(driver);
    }

    @Override
    public List<Driver> getAll() {
               return driverRepository.findAll();
    }
}
