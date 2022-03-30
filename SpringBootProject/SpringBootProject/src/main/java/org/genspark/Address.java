package org.genspark;

public class Address {

    public String city;
    public String state;
    public String country;
    public String zipcode;

    public String getCity(){return city;}

    public void setCity(String city) {this.city=city;}

    public String getState(){return state;}

    public void setState(String state) {this.state = state;}

    public String getCountry(){return country;}

    public void setCountry(String country) {this.country=country;}

    public String getZipcode(){return zipcode;}

    public void setZipcode(String zipcode) {this.zipcode = zipcode;}

    @Override
    public String toString(){
        return city+state+country+zipcode;
    }


}
