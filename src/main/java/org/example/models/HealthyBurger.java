package org.example.models;

public class HealthyBurger extends Hamburger{

    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String name, double price, String breadRollType)
    {
        super(name,"Tofu",price,breadRollType);
    }

    public void addHealthyAddition1(String healthyExtra1Name, double healthyExtra1Price)
    {
        this.healthyExtra1Name = healthyExtra1Name;
        this.healthyExtra1Price = healthyExtra1Price;
    }

    public void addHealthyAddition2(String healthyExtra2Name, double healthyExtra2Price)
    {
        this.healthyExtra2Name = healthyExtra2Name;
        this.healthyExtra2Price = healthyExtra2Price;
    }

    @Override
    public double itemizeHamburger()
    {
        StringBuilder str = new StringBuilder();
        str.append("Name: ").append(getName()).append("\n");
        str.append("Meat: ").append(getMeat()).append("\n");
        str.append("BreadRollType: ").append(getBreadRollType()).append("\n");
        if(healthyExtra1Name != null)
        {
            str.append("Addition1: ").append(healthyExtra1Name).append("\n");
        }
        if(healthyExtra2Name != null)
        {
            str.append("Addition2: ").append(healthyExtra2Name).append("\n");
        }
        setPrice(getPrice() + healthyExtra1Price + healthyExtra2Price);
        str.append("Price: ").append(getPrice()).append("\n");
        System.out.println(str);
        return getPrice();
    }
}
