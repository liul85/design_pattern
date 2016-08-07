public class NvWa {
    public static void main(String[] args) {
        Human whiteHuman = new WhiteHumanFactory().createHuman();
        whiteHuman.talk();

        Human blackHuman = new BlackHumanFactory().createHuman();
        blackHuman.talk();

        Human yellowHuman = new YellowHumanFactory().createHuman();
        yellowHuman.talk();
    }
}
