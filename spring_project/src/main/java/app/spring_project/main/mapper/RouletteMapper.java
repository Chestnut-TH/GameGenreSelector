package app.spring_project.main.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import app.spring_project.main.accessors.GenreEntity;
import app.spring_project.main.accessors.TargetEntity;
import app.spring_project.main.accessors.FeatureEntity;


@Mapper
public interface RouletteMapper {
    List<GenreEntity> selectGenre();
    List<TargetEntity> selectTarget();
    List<FeatureEntity> selectFeature();
}
