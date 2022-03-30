package org.genspark;

import org.springframework.beans.factory.annotation.Autowired;

public class Car  implements Vehicle{

    public Id d;
    public Id getD(){return d;}
    public Id setD(Id d){return this.d=d;}

    public Name nm;
    public Name getNm(){return nm;}
    public void setNm(Name nm){this.nm = nm;}

    public Tyre ty;
    public Tyre getTy(){return ty;}
    public void setTy(Tyre ty){
        this.ty = ty;
    }

    public Phone mob;
    public Phone getMob(){return mob;}
    public void setMob(Phone mob){
        this.mob = mob;
    }

    public Address ad;
    public Address getAd(){return ad;}
    public void setAd(Address ad){
        this.ad = ad;
    }

    public void drive(){System.out.println("I am driving a car..."+ty+mob+ad+nm);
    }
}
