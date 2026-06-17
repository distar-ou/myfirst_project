package Test12;

public class basketballcoach extends coach  {
    public basketballcoach() {
    }

    public basketballcoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void taech() {
        System.out.println("篮球教练在教打篮球");
    }

}
