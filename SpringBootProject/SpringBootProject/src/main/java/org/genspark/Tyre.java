package org.genspark;

public class Tyre {


    public String brand;
    public int size;


    public String getBrand(){return brand;}

    public void setBrand(String brand) {this.brand=brand;}

    public int getSize(){return size;}

    public void setSize(int size) {this.size = size;}

    @Override
    public String toString(){
        return "Tyre{brand ="+brand+", size = "+size+"}";
    }
}
