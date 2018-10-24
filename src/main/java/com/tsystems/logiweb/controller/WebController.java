package com.tsystems.logiweb.controller;


import com.tsystems.logiweb.entity.Driver;
import com.tsystems.logiweb.service.DriverService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
//@RequestMapping("/welcome")
public class WebController {
    private final Logger logger = LoggerFactory.getLogger(WebController.class);


/*    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {

        model.addAttribute("msg", "Spring 3 MVC - Hello World");
        return "hello";

    }*/


/*   @Autowired
   ApplicationContext context;

    //@RequestMapping(value = "/welcome", method = RequestMethod.GET)
    @RequestMapping(method = RequestMethod.GET)
    public String index(ModelMap map) {
        DriverService bean = context.getBean(DriverService.class);
        StringBuilder sb = new StringBuilder("<br>");
        bean.getAll().forEach(it->sb.append(it.toString()).append("<br>"));
        map.put("msg", sb.toString());
        return "hello";
    }*/

    @Autowired
    private DriverService driverService;

    @RequestMapping("/welcome")
    public String listDriver(Map<String, Object> map) {

        map.put("driver", new Driver());
        map.put("driverList", driverService.getAll());
        logger.debug("listDriver()");
        return "driver";
    }
    @RequestMapping("/")
    public String home() {
        return "redirect:/welcome";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addDriver(@ModelAttribute("driver") Driver driver, BindingResult result) {

        driverService.addDriver(driver);
        logger.debug("addDriver()");
        return "redirect:/welcome";
    }

    @RequestMapping("/delete/{driverId}")
    public String deleteDriver(@PathVariable("driverId") Integer driverId) {

        driverService.delete(driverId);
        logger.debug("deleteDriver()");
        return "redirect:/welcome";
    }

}


