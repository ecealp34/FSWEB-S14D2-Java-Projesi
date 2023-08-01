package com.workintech.model;

public class Bedroom extends Room{
    private Wardrobe wardrobe;
    private Carpet carpet;
    private Bed bed;

    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Lamp lamp, Wardrobe wardrobe, Carpet carpet, Bed bed) {
        super(name, wall1, wall2, wall3, wall4, ceiling, lamp);
        this.wardrobe = wardrobe;
        this.carpet = carpet;
        this.bed = bed;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    public Carpet getCarpet() {
        return carpet;
    }

    public Bed getBed() {
        return bed;
    }

    @Override
    public String toString() {
        return "Bedroom{" +
                "wardrobe=" + wardrobe +
                ", carpet=" + carpet +
                ", bed=" + bed +
                '}';
    }
}
