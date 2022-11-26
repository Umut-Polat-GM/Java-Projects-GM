public class Employee {
    String name;
    double salary;
    double workHours;
    int hireYear;
    public Employee(String name,int salary,double workHours,int hireYear){

        this.name=name;
        this.salary=salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    public Employee(){

    }
    public void run(){
        toString();
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maas Artisi : " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + (this.salary - tax() + bonus()));
        System.out.println("Toplam Maas : " + (this.salary + raiseSalary()));

    }
    double tax(){
           double netTax=0;
        if (salary>1000){
            netTax=(salary*0.03);
        }

        return netTax;
    }

    double bonus(){
        double netBonus=0;
        if (40<workHours){
            netBonus = (workHours-40)*30;
        }

        return netBonus;

    }
    double raiseSalary(){
        double netSalary=0;
        int workYear =2021-hireYear;
        if (workYear<10){
            netSalary=salary*0.03;
        } else if (workYear>9 && workYear<20) {
            netSalary=salary*0.1;
        } else if (workYear>19) {
            netSalary=salary*0.15;
        }

        return netSalary;
    }
    public String toString(){
        System.out.println("Adi :"+this.name);
        System.out.println("Maasi : "+this.salary);
        System.out.println("Calisma Saati : "+this.workHours);
        System.out.println("Baslangic Yili : "+this.hireYear);
        return null;
    }
}
