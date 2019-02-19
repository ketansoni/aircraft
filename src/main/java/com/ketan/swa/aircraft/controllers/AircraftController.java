package com.ketan.swa.aircraft.controllers;

import com.ketan.swa.aircraft.services.AircraftService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AircraftController {

    private AircraftService aircraftService;

    @GetMapping("/workpackage/{id}/tasks")
    @ResponseBody
    public String findAll(@PathVariable("id") final Long id){
        aircraftService.findAllTasksForWorkPackage();
        return "hello world";
    }
}
