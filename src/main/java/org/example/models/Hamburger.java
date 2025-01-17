package org.example.models;

public class Hamburger {
    private String name;
    private String meat;
    private String breadRollType;
    private double price;
    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger()
    {

    }

    public Hamburger(String name, String meat, double price, String breadRollType)
    {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public String getName()
    {
        return name;
    }

    public String getMeat()
    {
        return meat;
    }

    public String getBreadRollType()
    {
        return breadRollType;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public void addHamburgerAddition1(String addition1Name, double addition1Price)
    {
        this.addition1Name = addition1Name;
        this.addition1Price = addition1Price;
        this.price += addition1Price;
    }

    public void addHamburgerAddition2(String addition2Name, double addition2Price)
    {
        this.addition2Name = addition2Name;
        this.addition2Price = addition2Price;
        this.price += addition2Price;
    }

    public void addHamburgerAddition3(String addition3Name, double addition3Price)
    {
        this.addition3Name = addition3Name;
        this.addition3Price = addition3Price;
        this.price += addition3Price;
    }

    public void addHamburgerAddition4(String addition4Name, double addition4Price)
    {
        this.addition4Name = addition4Name;
        this.addition4Price = addition4Price;
        this.price += addition4Price;
    }

    public double itemizeHamburger()
    {
        StringBuilder str = new StringBuilder();
        str.append("Name: ").append(name).append("\n");
        str.append("Meat: ").append(meat).append("\n");
        str.append("BreadRollType: ").append(breadRollType).append("\n");
        if(addition1Name != null)
        {
            str.append("Addition1: ").append(addition1Name).append("\n");
        }
        if(addition2Name != null)
        {
            str.append("Addition2: ").append(addition2Name).append("\n");
        }
        if(addition3Name != null)
        {
            str.append("Addition3: ").append(addition3Name).append("\n");
        }
        if(addition4Name != null)
        {
            str.append("Addition4: ").append(addition4Name).append("\n");
        }
        str.append("Price: ").append(price).append("\n");
        System.out.println(str);
        return price;
    }



}
