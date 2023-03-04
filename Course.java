public class Course {
    Teacher courseTeacher;
    String name;
    int credit;
    double note;
    double verbalnote;
    Student course;
    public Course mat,kimya,fizik;

    public Course(String name, String credit){
        this.name=name;
        this.credit=0;
        this.note=0;
        this.verbalnote=0;
    }
    public void addteacher(Teacher A){
        if(this.name.equals(A.branch)){
            this.courseTeacher=A;
            System.out.println("öğretmen başarılı bir şekilde seçidi");
        } else{
            System.out.println("Bu ders bu eğitmen tarafından verilemez");
        }
    }

}
