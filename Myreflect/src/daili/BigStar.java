package daili;

public class BigStar implements Star{
    private String name;

    public BigStar() {
    }
    public String Sing(String name){
        System.out.println(this.name+"正在唱"+name);
        return "谢谢";
    }



    public void Dance(){

        System.out.println(this.name+"正在跳舞");
    }


    public BigStar(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
