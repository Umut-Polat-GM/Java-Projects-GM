public class Match {
    Fighter f1;
    Fighter f2;
    int maxWeight;
    int minWeight;

    public Match(Fighter f1, Fighter f2, int maxWeight, int minWeight) {

        this.f1 = f1;
        this.f2 = f2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
    }


    boolean isStart() {

        return (f1.weight >= this.minWeight && f1.weight <= this.maxWeight) && (f1.weight >= this.minWeight && f1.weight <= this.maxWeight);
    }

    void run() {                                        //--------------------------------------------------------------
        if (isStart()) {

            while (f1.health > 0 && f2.health > 0) {

                //Bir sans faktori ile kimin baskayacagını belirledim.
                int whoStart= (int) (Math.random()*2);

                if (whoStart==0) {
                    System.out.println("=====RAUND=====");

                    f2.health = hit1();

                    if (isWin()) {                                       //Genel operasyon yani macın isleyisi bu operasyon uzerinden
                        break;                                          //gerceklesiyor.
                    }
                    System.out.println(f2.name + " Sagligi:" + f2.health);
                }
                if (whoStart==1) {

                    System.out.println("=====RAUND=====");

                    f1.health = hit2();

                    if (isWin()) {
                        break;
                    }
                    System.out.println(f1.name + " Sagligi:" + f1.health);
                }


            }

        } else {
            System.out.println("Sporcularin sikletleri uyusmuyor.");
        }                                                                //---------------------------------------------
    }

    int hit1() {                                                        //-----------------------------------------------

        System.out.println(f1.name + "=>" + f2.name + " " + f1.damage + " vurdu.");

        if (f1.isDodge()){

            System.out.println(f2.name+" hasari blokladi");
            return f2.health;

        }

        return f2.health - f1.damage;                               //Bu kısımda sporcuların vuus yapma operasyonu var.
    }                                                               //Damage puanına göre rakibin can puanı düsüyor.

    int hit2() {

        System.out.println(f2.name + "=>" + f1.name + " " + f2.damage + " vurdu.");
        if (f2.isDodge()){

            System.out.println(f1.name+" hasari blokladi");
            return f1.health;

        }

        return f1.health - f2.damage;
    }                                                                   //----------------------------------------------

    boolean isWin() {                                       //----------------------------------------------

        if (f1.health <= 0) {

            System.out.println(f2.name + " kazandi !");

            return true;
        }                                                   //Bu kısımda sporcuların can puanının - düsmesi durumunda olacak operasyon var.
        if (f2.health <= 0){

            System.out.println(f1.name + " kazandi !");

            return true;
        }
        return false;
    }                                                       //------------------------------------


}