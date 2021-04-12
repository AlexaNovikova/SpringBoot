package ru.geekbrains.spring.one.model;

public class Product {
    private Long id;
    private String name;
    private double coast;


    public Product(){}

    public Product(Long id, String name, double coast) {
        this.id = id;
        this.name = name;
        this.coast = coast;
    }

    @Override
    public String toString() {
        return
                "id = " + id +", "+
                " name: " + name  + ", "+
                " coast:" + coast;
    }

    public String getName() {
        return name;
    }

    public double getCoast() {
        return coast;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCoast(double coast) {
        this.coast = coast;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
