package org.genspark;

import org.springframework.core.io.VfsResource;
import org.springframework.stereotype.Component;

@Component
public class Id implements Vehicle {


    public int id=1;


    public int getId(){return id;}


    public void setId(int id) {this.id=id;}




    @Override
    public void drive() {
        System.out.println(id);
    }
}
