package ua.com.javarush.gnew;

import ua.com.javarush.gnew.model.map.Cell;
import ua.com.javarush.gnew.model.map.GameField;
import ua.com.javarush.gnew.model.organizm.Organizm;
import ua.com.javarush.gnew.model.organizm.animal.predator.Wolf;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GameField gameField = initMap(2, 2);

        Wolf    wolf = new Wolf();

        gameField.add(wolf, 1, 1);

        Arrays.stream(gameField.getCells()).forEach(System.out::println);
    }


    public static GameField initMap(int width, int height){

        GameField gameField = new GameField(width, height);

        Cell[][] cells = gameField.getCells();

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                HashMap<Class<? extends Organizm>, Set<Organizm>> residents = new HashMap<>();
                cells[i][j] = new Cell(residents);
            }
        }

        return gameField;
    }
}