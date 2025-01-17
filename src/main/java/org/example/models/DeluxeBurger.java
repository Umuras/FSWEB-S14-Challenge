package org.example.models;

public class DeluxeBurger extends Hamburger{

    private String chips;
    private String drink;

    public DeluxeBurger(String name, String meat, double price, String breadRollType)
    {
        super(name, meat, 19.10, breadRollType);
        chips = "CURVY";
        drink = "COKE";
    }

    public DeluxeBurger()
    {
        super("Deluxe Burger","Double",19.10,"Double Sandwich");
        this.chips = "CURVY";
        this.drink = "COKE";
    }

    public String getCips()
    {
        return chips;
    }

    public String getDrink()
    {
        return drink;
    }

    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price)
    {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition2(String addition2Name, double addition2Price)
    {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition3(String addition3Name, double addition3Price)
    {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition4(String addition4Name, double addition4Price)
    {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez.");
    }
}
