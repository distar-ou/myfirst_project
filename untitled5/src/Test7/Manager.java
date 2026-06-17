package Test7;

public class Manager extends Employee{
    private double bouns;

    public Manager() {

    }

    public Manager(String id, String name, int salary, double bouns) {
        super(id, name, salary);
        this.bouns = bouns;
    }

    public double getBouns() {
        return bouns;
    }

    public void setBouns(double bouns) {
        this.bouns = bouns;
    }
    public void work(){
        System.out.println("管理其他人");
    }
}
