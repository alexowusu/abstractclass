package io.sub.abstractclass;

import java.util.List;

public class Students implements Nameable,HasLevel {

        private List<Double> grade;
        private String name;
        private Level level;


    public Students(String name,Level level,List<Double> grade) {

        this.grade = grade;
        this.name = name;
        this.level = level;
    }


    public Level getLevel() {
       return level;
    }

    @Override
    public String getName() {
        return name;
    }
}

