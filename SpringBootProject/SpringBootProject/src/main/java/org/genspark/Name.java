package org.genspark;

public class Name {

    public String namestr;

    public String getNamestr(){return namestr;}

    public void setNamestr(String namestr) {this.namestr=namestr;}

    @Override
    public String toString(){
        return namestr;
    }

}
