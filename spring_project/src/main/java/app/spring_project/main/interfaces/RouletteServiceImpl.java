package app.spring_project.main.interfaces;

import java.util.List;

import app.spring_project.main.accessors.RouletteResult;

public interface RouletteServiceImpl {
    List<RouletteResult> callService();
}
