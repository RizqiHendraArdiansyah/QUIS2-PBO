package Quis2;
public class Oviraptor extends Dinosaurus implements IBertelur{
    @Override
    public void bertelur(){
        System.out.println("Dinosaurus ini berkembang biak dengan cara bertelur");
    }
    @Override
    public void makan(){
        System.out.println("Dinosaurus ini memakan telur mentah dari hewan lain");
    }
    @Override
    public void berjalan(){
        System.out.println("Dinosaurus ini Berjalan sangat cepat dengan 2 kaki yang panjang");
    }
}