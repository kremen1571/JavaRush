package com.javarush.task.task17.task1714;

/* 
Comparable
*/

public  class Beach implements Comparable<Beach> {
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    @Override
    public synchronized int compareTo(Beach o) {
        int res = 0;
        if ((o.distance - this.distance) > 0)
            res = -1;
        else res = 1;
        if ((o.quality - this.quality) > 0)
            res = 1 + res;
        else res = -1 + res;
        return res;
    }

    public   Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    public synchronized static void main(String[] args) {

    }
}
