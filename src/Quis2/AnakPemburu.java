package Quis2;
public class AnakPemburu extends Pemburu implements IMengambilTelur{
    @Override
    public void mengambilTelur(Dinosaurus dino){
        System.out.println("Anak pemburu ini mengambil telur dinosaurus Trex");
    }
    @Override
    public void berburu(TyrannosaurusRex trex){
        System.out.println("Anak pemburu ini sedang memburu dinosaurus trex");
    }
}
