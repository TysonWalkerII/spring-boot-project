package org.genspark;

import org.springframework.stereotype.Component;

@Component
public class Name {

    public String namestr ="name";

    public String getNamestr(){return namestr;}

    public void setNamestr(String namestr) {this.namestr=namestr;}

    @Override
    public String toString(){
        return namestr;
    }

}
