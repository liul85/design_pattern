/**
 * Created by twcn on 8/2/16.
 */
public abstract class AbstractHumanFactory {
    public abstract <T extends Human> T createHuman(Class<T> klass);
}
