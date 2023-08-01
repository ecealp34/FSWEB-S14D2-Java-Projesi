package com.workintech.main;

import com.workintech.enums.Direction;
import com.workintech.enums.LampType;
import com.workintech.enums.PaintColor;
import com.workintech.model.*;

public class Main {
    public static void main(String[] args) {

        Bedroom bedroom = new Bedroom("Mert",
                new Wall(Direction.NORTH),
                new Wall(Direction.EAST),
                new Wall(Direction.WEST),
                new Wall(Direction.SOUTH),
                new Ceiling(2, PaintColor.RED),
                new Lamp(LampType.NORMAL, true, 3),
                new Wardrobe(2,5,50),
                new Carpet(3, 8, PaintColor.BLUE),
                new Bed("Tek kişilik", 1, 2, 1, 2));


        bedroom.getBed().make();
        bedroom.getLamp().turnOn();
        bedroom.getWardrobe().add();
        bedroom.getCarpet().lying();
        System.out.println(bedroom.getCarpet());
        System.out.println(bedroom.getWardrobe());

    }
}