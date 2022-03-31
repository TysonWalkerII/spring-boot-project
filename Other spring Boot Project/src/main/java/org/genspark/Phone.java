package org.genspark;

import org.springframework.stereotype.Component;

@Component
public class Phone {



    public String mob="phone";

    public String getMob(){return mob;}

    public void setMob(String mob) {this.mob=mob;}
//
//
//
//
    @Override
    public String toString(){
        return "idk tire"+mob;
    }


}
