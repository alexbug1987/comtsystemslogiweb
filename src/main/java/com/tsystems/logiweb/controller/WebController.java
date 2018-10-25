package com.tsystems.logiweb.controller;


import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tsystems.logiweb.entity.Driver;
import com.tsystems.logiweb.service.DriverService;

@Controller
//@RequestMapping("/welcome")
public class WebController {
    private final Logger logger = LoggerFactory.getLogger(WebController.class);

    @Autowired
    private DriverService driverService;

    @RequestMapping("/welcome")
    public String listDriver(Map<String, Object> map) {

        map.put("driverList", driverService.getAll());
        logger.debug("listDriver()");
        return "driver";
    }
    @RequestMapping("/")
    public String home() {
        return "redirect:/welcome";
    }

    @RequestMapping(value = "/welcome/adddriver", method = RequestMethod.POST)
    public String addDriver(@ModelAttribute("adddriver") Driver driver, BindingResult result) {

        driverService.addDriver(driver);
        logger.debug("addDriver()");
        return "redirect:/welcome";
    }

    @RequestMapping(value = "/welcome/delete/{driverId}", method = RequestMethod.GET)
    public String deleteDriver(@PathVariable("driverId") Integer driverId) {

        driverService.delete(driverId);
        logger.debug("deleteDriver()");
        return "redirect:/welcome";
    }

}


