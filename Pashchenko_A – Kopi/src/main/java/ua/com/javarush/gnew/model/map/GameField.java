package ua.com.javarush.gnew.model.map;

import ua.com.javarush.gnew.model.organizm.Organizm;

public class GameField {
    private int width;
    private int height;

    private Cell[][] cells;

    public GameField(int width, int height) {
        this.width = width;
        this.height = height;
        this.cells = new Cell[width][height];
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Cell[][] getCells(){
        return cells;
    }


    public boolean add(Organizm organizm, int x, int y){
        return cells[x][y].add(organizm);
    }


}
