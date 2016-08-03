/**
 * Created by twcn on 8/2/16.
 */
public class YellowHuman implements Human {
    @Override
    public void talk() {
        System.out.println("I am yellow human.");
    }

    @Override
    public String getColor() {
        return "Yello";
    }
}
