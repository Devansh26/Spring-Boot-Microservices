package io.javabrains.moviecatalogservice;

public class CatalogueItem {
    private String name;
    private String desc;
    private int rating;

    public CatalogueItem(String name, String desc, int d) {
        this.name = name;
        this.desc = desc;
        this.rating = d;

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }

    
}
