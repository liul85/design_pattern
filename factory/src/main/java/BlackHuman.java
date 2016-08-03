public class BlackHuman implements Human {
    @Override
    public void talk() {
        System.out.println("I am balck man.");
    }

    @Override
    public String getColor() {
        return "black";
    }
}
