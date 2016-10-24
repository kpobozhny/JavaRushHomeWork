package com.javarush.test.level17.lesson10.home02;

/* Comparable
Реализуйте интерфейс Comparable<Beach> в классе Beach, который будет использоваться нитями.
*/

public class Beach implements Comparable<Beach> {
    private String name;      //название
    private  float distance;   //расстояние
    private  int quality;    //качество

    public Beach(String name, float distance, int quality) {
        setName(name);
        setDistance(distance);
        setQuality(quality);
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

    @Override
    public synchronized int compareTo(Beach o)
    {
        int result=0;
        if (this.getQuality()>o.getQuality()) result=1;
        else if (this.getQuality()==o.getQuality()){
            if (this.getDistance()<o.getDistance()) result=1;
            else if (this.getDistance()==o.getDistance()) result=0;
            else result=-1;

        } else result=-1;
        return result;
    }
}
