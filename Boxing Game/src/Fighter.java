public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;
    public Fighter(String name,int damage,int health,int weight,int dodge){

        this.name=name;
        this.damage=damage;
        this.health=health;
        this.weight=weight;
        if (dodge>=0 && dodge<=100) {
            this.dodge = dodge;
        }else {
            this.dodge=0;
        }

    }
    public Fighter(){       //Bos bir construction method olusturuyorum ki isteyen Fighter istediği degerini eliyle versin.

    }
    Boolean isDodge(){
        double randomNumber = Math.random()*100;     //Rastgele bir sayı üretip onun üzerinden sporcuların bloklama sansı olustudum.
        return randomNumber <= this.dodge;
    }




}
