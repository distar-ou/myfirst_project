package Test12;

public class pinponspoorter extends sporter implements SpeakEnglish{

    public pinponspoorter() {
    }

    public pinponspoorter(String name, int age) {
        super(name, age);
    }

    @Override
    public void Study() {
        System.out.println("乒乓球运动员在学习");
    }
    public void tall(){
        System.out.println("说英语");
    }
}
