public class Student {
    Course Math;
    Course Physic;
    Course Chemical;
    String Name;
    String StuNo;
    String Classes;
    double Avarage;

    public Student(String name,String stuNo,String classes,Course Math,Course Physic,Course Chemical){
        this.Name=name;
        this.StuNo=stuNo;
        this.Classes=classes;
        this.Math=Math;
        this.Physic=Physic;
        this.Chemical=Chemical;
    }
    public void addBulkExam(int math,int physic,int chemical){
        if (math>=0 && math<=100){
            this.Math.note=math;
        }
        if (physic>=0 && physic<=100){
            this.Physic.note=physic;
        }
        if (chemical>=0 && chemical<=100){
            this.Chemical.note=chemical;
        }
    }

    public void calavarege(){
        this.Avarage=(this.Math.note+this.Physic.note+this.Chemical.note)/3;
        System.out.println("Avarage:"+Avarage);

    }
    public void isPass(){
        if ((this.Math.note+this.Physic.note+this.Chemical.note)/3>=55.0){
            System.out.println("Passed the Class :D");
        }else{
            System.out.println("Failed");
        }
    }
    public void printNote(){
        System.out.println("====================");
        System.out.println("Student:"+this.Name);
        isPass();
        System.out.println("Math Note:"+this.Math.note);
        System.out.println("Physic Note:"+this.Physic.note);
        System.out.println("Chemical Note:"+this.Chemical.note);
        calavarege();
    }

}
