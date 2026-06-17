package mycollection;

public class student2 {
    private String name;
    private int age;
    private double chineseGrade;
    private double mathGrade;
    private double englishGrade;


    public student2() {
    }

    public student2(String name, int age, double chineseGrade, double mathGrade, double englishGrade) {
        this.name = name;
        this.age = age;
        this.chineseGrade = chineseGrade;
        this.mathGrade = mathGrade;
        this.englishGrade = englishGrade;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getChineseGrade() {
        return chineseGrade;
    }

    public void setChineseGrade(double chineseGrade) {
        this.chineseGrade = chineseGrade;
    }

    public double getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(double mathGrade) {
        this.mathGrade = mathGrade;
    }

    public double getEnglishGrade() {
        return englishGrade;
    }

    public void setEnglishGrade(double englishGrade) {
        this.englishGrade = englishGrade;
    }

    public double getsum(){
        return chineseGrade+mathGrade+englishGrade;
    }

    @Override
    public String toString() {
        return "student2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", chineseGrade=" + chineseGrade +
                ", mathGrade=" + mathGrade +
                ", englishGrade=" + englishGrade +
                '}';
    }
}
