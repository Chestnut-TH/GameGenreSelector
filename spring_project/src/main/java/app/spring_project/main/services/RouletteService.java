package app.spring_project.main.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.spring_project.main.accessors.FeatureEntity;
import app.spring_project.main.accessors.GenreEntity;
import app.spring_project.main.accessors.RouletteResult;
import app.spring_project.main.accessors.TargetEntity;
import app.spring_project.main.interfaces.RouletteServiceImpl;
import app.spring_project.main.mapper.RouletteMapper;

@Service
public class RouletteService implements RouletteServiceImpl{
    @Autowired
    RouletteMapper mapper;
    @Override
    public List<RouletteResult> callService() {
        
        List<GenreEntity> genres = mapper.selectGenre();
        List<TargetEntity> targets = mapper.selectTarget();
        List<FeatureEntity> features = mapper.selectFeature();
        
        List<RouletteResult> res = new ArrayList<>();
        RouletteResult data = new RouletteResult();
        data.setNo(1);
        data.setGenre(genres.get(0).getGenre());
        data.setTarget(targets.get(0).getTarget());
        data.setFeature1(features.get(0).getFeature());
        data.setFeature2(features.get(1).getFeature());
        data.setFeature3(features.get(2).getFeature());
        res.add(data);
        return res;
    }
    
}
