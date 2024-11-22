package ua.com.javarush.gnew.model.map;

import ua.com.javarush.gnew.model.organizm.Organizm;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Cell {

    private final Map<Class<? extends Organizm>, Set<Organizm>> residents;

    public Cell(Map<Class<? extends Organizm>, Set<Organizm>> residents) {
        this.residents = residents;
    }

    public Map<Class<? extends Organizm>, Set<Organizm>> getResidents() {
        return residents;
    }

    public boolean add (Organizm organizm){
        Class<? extends Organizm> organizmClass = organizm.getClass();
        residents.putIfAbsent(organizmClass, new HashSet<>());
        return residents.get(organizmClass).add(organizm);
    }
}
