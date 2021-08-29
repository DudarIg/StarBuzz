package ru.dudar.starbuzz;

public class Drink {
    private String name;
    private String description;
    private int imageResourceId;

    //drinks — массив с элементами Drink
    public static final Drink[] drinks = {
            new Drink("Латте", "Легкий кофе со вкусом шоколада", R.drawable.latte),
            new Drink("Капучино", "Капучино эксперессо с молоком или сливками", R.drawable.cappuccino),
            new Drink("Американо", "Классический черный кофе ", R.drawable.filter)
    };
    private Drink(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String toString() {
        return this.name;
    }

}
