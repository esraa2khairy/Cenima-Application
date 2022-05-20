package com.example.cinema;
public class designfilm {

    private String title;
    private  String rating,location, link,card;//p1,p2,p3;
    private int img1 ;
    private float ratebar ;

    public designfilm(String title, String rating,String location , int img1 ,float ratebar, String link,String card) {
        this.title = title;
        this.rating = rating;
        this.img1 = img1;
        this.location=location;
        this.ratebar=ratebar;
        this.link = link;
        this.card= card;
      /*  this.p1 =p1;
        this.p2=p2;
        this.p3=p3;*/
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getLocation() {
        return location;
    }
    public String getRating() {
        return rating;
    }
    public void setRating(String rating) {
        this.rating = rating;
    }
    public int getImg1() {
        return img1;
    }
    public void setImg(int img1) {
        this.img1 = img1;
    }
    public float getRatebar() {
        return ratebar;
    }
    public void setRatebar(float ratebar) {
        this.ratebar = ratebar;
    }
 /*   public String getP1() {
        return p1;
    }
    public void setP1(String p1) {
        this.p1 = p1;
    }

    public String getP2() {
        return p2;
    }

    public void setP2(String p2) {
        this.p2 = p2;
    }

    public String getP3() {
        return p3;
    }

    public void setP3(String p3) {
        this.p3 = p3;
    }*/
}

