package com.tsystems.logiweb.controller;

import com.tsystems.logiweb.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/welcome")
public class HelloController {

    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {

        model.addAttribute("msg", "Spring MVC - Hello Controller");
        return "hello";

    }

}

    /* @Autowired
    ApplicationContext context;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(ModelMap map) {
        DriverService bean = context.getBean(DriverService.class);
        StringBuilder sb = new StringBuilder("<br>");
        bean.getAll().forEach(it->sb.append(it.toString()).append("<br>"));
        map.put("msg", sb.toString());
        return "hello";
    }*/




