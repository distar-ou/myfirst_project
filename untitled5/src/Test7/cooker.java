package Test7;

public class cooker extends Employee {
    public cooker(String id, String name, int pay) {
        super(id, name, pay);
    }

    public cooker() {
    }

    public void work(){
        System.out.println("厨师在炒菜");
    }

}
