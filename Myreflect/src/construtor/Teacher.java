package construtor;

public class Teacher {
    private String name;
    private int hight;

    public Teacher() {
    }

    public Teacher(String name, int hight) {
        this.name = name;
        this.hight = hight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }
}