/**
 * Created by twcn on 8/7/16.
 */
public class BlackHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createHuman() {
        return new BlackHuman();
    }
}
