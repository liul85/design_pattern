/**
 * Created by twcn on 8/2/16.
 */
public class WhiteHuman implements Human {
    @Override
    public void talk() {
        System.out.println("I am white human");
    }

    @Override
    public String getColor() {
        return "White";
    }
}
