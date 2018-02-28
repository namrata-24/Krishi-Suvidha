package namrata.hack1;

/**
 * Created by lenovo on 2/3/2018.
 */

public class Equip {
    int id;
    String name;
    String brand;
    String price ;
    public Equip(String title , String brand , String year,int id){
        this.name=title ;
        this.brand= brand;
        this.price = year ;
        this.id=id;
    }
    public String get1(){
        return name;
    }
    public String get2(){
        return brand ;
    }
    public String get3(){
        return price ;
    }
    public void set1(String title){
        this.name = title;
    }
    public void set2(String genre){
        this.brand = genre;
    }
    public void set3(String year){
        this.price = year;
    }
    public int get4(){ return id;}
    public void set4(int id){ this.id=id;}

}
