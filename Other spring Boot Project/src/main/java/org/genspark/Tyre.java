package org.genspark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Tyre {




    public String brand="string";

    public int size=1;



   public String getBrand(){return brand;}

   public void setBrand(String brand) {this.brand=brand;}

   public int getSize(){return size;}

   public void setSize(int size) {this.size = size;}
  // public Tyre(String brand, int size){
  //     this.brand=brand;
  //     this.size=size;
  // }

    @Override
    public String toString(){
        return "Tyre{brand ="+brand+", size = "+size+"}";
    }
}
