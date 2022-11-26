public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;

    public Course(String name,String code,String prefix){

        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.note=0;

    }
    public void  printCourse(){
        System.out.println("==========");
        System.out.println("Course:"+this.name);
        System.out.println("Code:"+this.code);
        System.out.println("Prefix:"+this.prefix);
    }
    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.Branch)) {
            this.courseTeacher = t;
            System.out.println(t.Name+" Bu dersi verebilir.");
        } else {
            System.out.println(t.Name + " Akademisyeni bu dersi veremez.");
        }
    }
    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.Name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
}
