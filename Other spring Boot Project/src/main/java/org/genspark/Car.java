package org.genspark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier
public class Car  implements Vehicle{

    @Autowired
    public Id d;
    public Id getD(){return d;}
    public Id setD(Id d){return this.d=d;}

  //  @Autowired
  //  public Bike b;
  //  public Bike getBikestr(){return b;}
  //  public Bike setBikestr(Bike b){return this.b=b;}

    @Autowired
    public Name nm;
    public Name getNm(){return nm;}
    public void setNm(Name nm){this.nm = nm;}

    @Autowired
    public Tyre ty;
    public Tyre getTy(){return ty;}
    public void setTy(Tyre ty){
        this.ty = ty;
    }

    @Autowired
    public Phone mob;
    public Phone getMob(){return mob;}
    public void setMob(Phone mob){
        this.mob = mob;
    }

    @Autowired
    public Address ad;
    public Address getAd(){return ad;}
    public void setAd(Address ad){
        this.ad = ad;
    }

    public void drive(){System.out.println("I am driving a car..."+ty+mob+ad+nm);
    }
}
