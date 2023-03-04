public class Student {
    String name;
    int classes;
    Course mat;
    Course kimya;
    Course fizik;
    double average;
    boolean ispass;
    public Student(String name,int classes,Course mat,Course kimya,Course fizik){
        this.name=name;
        this.classes=classes;
        this.mat=mat;
        this.kimya=kimya;
        this.fizik=fizik;
        Average();
        this.ispass=false;
    }
    public void examcourse(int mat,int kimya,int fizik,int matverbalnote,int kimverbalnote,int fzkverbalnote){
            this.mat.verbalnote = matverbalnote;
        this.kimya.verbalnote=kimverbalnote;
        this.fizik.verbalnote=fzkverbalnote;
        if(mat>=0||mat<=100){
            this.mat.note=mat;
        }if(kimya>=0||kimya<=100){
            this.kimya.note=kimya;
    }if(fizik>=0||fizik<=100){
            this.fizik.note=fizik;}}

    public void Average(){
        this.average=((mat.note*0.80)+(mat.verbalnote*0.20)+(kimya.note*0.70)+(kimya.verbalnote*0.30)+(fizik.note*0.60)+(fizik.verbalnote*0.40))/3;
    }
    public void ispass(){
        if(this.average>55){
            System.out.println("Sınfı geçtiniz.Ortalamanız:  "+this.average);
        }else{
            System.out.println("Sınıfı geçemediniz.Ortalamanız: "+this.average);
        }
    }
    public void printcourse(){
        System.out.println("Matematik ders notu: "+this.mat.note);
        System.out.println("Kimya ders notu: "+this.kimya.note);
        System.out.println("Fizk ders notu: "+this.fizik.note);




    }
}
