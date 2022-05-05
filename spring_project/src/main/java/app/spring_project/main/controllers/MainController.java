package app.spring_project.main.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.spring_project.main.accessors.RouletteResult;

@RestController
@CrossOrigin(origins = {"http://localhost:9000"})
public class MainController {
    @RequestMapping("/roulette")
    public List<RouletteResult> roulette() {
        List<RouletteResult> res = new ArrayList<>();
        RouletteResult data = new RouletteResult();
        data.setNo(1);
        data.setGenre("FPS");
        data.setTarget("男性");
        data.setFeature1("銃");
        data.setFeature2("ゾンビ");
        data.setFeature3("オンライン");
        res.add(data);
        return res;
    }
}
