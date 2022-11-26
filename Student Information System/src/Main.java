public class Main {
    public static void main(String[] args) {

        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Ayse Hoca", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Hoca", "90550000002", "KMY");

        t1.infoTeacher();
        mat.printCourse();
        mat.addTeacher(t1);

        t2.infoTeacher();
        fizik.printCourse();
        fizik.addTeacher(t2);

        t3.infoTeacher();
        kimya.printCourse();
        kimya.addTeacher(t3);

        Student s1=new Student("Mehmet","404","4",mat,fizik,kimya);
        s1.addBulkExam(50,20,40);
        s1.printNote();


        Student s2=new Student("Umut","408","4",mat,fizik,kimya);
        s2.addBulkExam(70,40,60);
        s2.printNote();

        Student s3=new Student("Fatma","508","3",mat,fizik,kimya);
        s3.addBulkExam(80,70,50);
        s3.printNote();





    }
}
