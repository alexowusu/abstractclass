package io.sub.abstractclass;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Register {
    private List<Nameable> nameables;

    public Register(List<Nameable> nameables) {
        this.nameables = nameables;
    }

    public List<String> getRegister(){
        List<String> studentsNames = new ArrayList<>();
        for(Nameable nameable: nameables){
            studentsNames.add(nameable.getName());
        }
        return studentsNames;
    }
    public List<String> getRegisterByLevel(Level level){
        List<String> studentsNames = new ArrayList<>();
        for(Nameable nameable: nameables){
            if (nameable.getLevel().equals(level)){
                studentsNames.add(nameable.getName());
            }
        }
        return studentsNames;
    }

    public String PrintReport(){
        String names = "";
        this.nameables.sort(Comparator.comparing(Nameable::getLevel));
        for(Nameable nameable: nameables){
            names += nameable.getName() + " ";
        }
        return names;
    }
}

