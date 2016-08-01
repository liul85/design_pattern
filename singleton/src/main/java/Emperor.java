/**
 * Created by twcn on 8/1/16.
 */
public class Emperor {
    private static final Emperor emperor = new Emperor();
    private Emperor() {

    }

    public static Emperor getInstance() {
        return emperor;
    }

    public void say() {
        System.out.println("I am the only emperor...");
    }
}
