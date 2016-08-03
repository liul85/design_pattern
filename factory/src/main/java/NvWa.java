public class NvWa {
    public static void main(String[] args) {
        AbstractHumanFactory yinYanglu = new HumanFactory();
        Human whiteHuman = yinYanglu.createHuman(WhiteHuman.class);
        Human blackHuman = yinYanglu.createHuman(BlackHuman.class);
        Human yellowHuman = yinYanglu.createHuman(YellowHuman.class);

        whiteHuman.talk();
        blackHuman.talk();
        yellowHuman.talk();
    }
}
