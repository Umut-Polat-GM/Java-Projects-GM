//Amac 2 sporcunun mac esnasında olan etkilesimini simule etmek sporcuların nitelikleri ve mac operasyonları
// Fighter ve Match calss ları üzerinden gerceklesiyor.
public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Umut",15,100,95,20){};
        Fighter f2 = new Fighter("Mehmet",13,100,95,10){};

        Match match1 = new Match(f1,f2,100,85);

        match1.run();





    }
}
