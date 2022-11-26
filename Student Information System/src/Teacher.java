public class Teacher {
    String Name;
    String Mpno;
    String Branch;

    public Teacher(String name,String mpname,String branch){
        this.Name=name;
        this.Mpno=mpname;
        this.Branch=branch;
    }
    public void infoTeacher(){
        System.out.println("============");
        System.out.println("Name of Teacher:"+this.Name);
        System.out.println("Phone Number:"+this.Mpno);
        System.out.println("Branch:"+this.Branch);
    }

}
