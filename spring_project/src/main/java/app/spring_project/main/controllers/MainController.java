package app.spring_project.main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.spring_project.main.accessors.RouletteResult;
import app.spring_project.main.interfaces.RouletteServiceImpl;

@RestController
@CrossOrigin(origins = {"http://localhost:9000"})
public class MainController {
    @Autowired
    RouletteServiceImpl service;
    @RequestMapping("/roulette")
    public List<RouletteResult> roulette() {
        return service.callService();
    }
}
