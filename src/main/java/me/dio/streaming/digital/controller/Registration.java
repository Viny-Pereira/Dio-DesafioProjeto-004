package me.dio.streaming.digital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import me.dio.streaming.digital.entity.Registration;
import me.dio.streaming.digital.entity.form.RegistrationForm;
import me.dio.streaming.digital.service.impl.RegistrationServiceImpl;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/registrations")
public class RegistrationController {

    @Autowired
    private RegistrationServiceImpl service;

    @PostMapping
    public Registration create(@Valid @RequestBody RegistrationForm form) {
        return service.create(form);
    }

    @GetMapping
    public List<Registration> getAll(@RequestParam(value = "country", required = false) String country) {
        return service.getAll(country);
    }

}
