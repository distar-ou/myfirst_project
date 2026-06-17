package Test12;

public class pinponcoach extends coach implements SpeakEnglish {
    public pinponcoach() {
    }

    public pinponcoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void taech() {
        System.out.println("乒乓球教练在教乒乓球");
    }


    @Override
    public void tall() {
        System.out.println("乒乓球教练在说英语");
    }
}
