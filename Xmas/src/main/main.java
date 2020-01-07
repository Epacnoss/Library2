package main;

public class main {

    public static final int w = 145;
    public static final int h = 218;

    public static void main(String[] args) {
        String[] cfgs = {"anglesOfAttack.cfg", "chainsOfCommand.cfg", "fieldsOfFire.cfg", "linesOfDeparture.cfg", "pointsOfImpact.cfg", "termsOfEnlistment.cfg"};
//        String[] cfgs = {"chainsOfCommand.cfg"};



        whoKarenWantsToSpeakTo manager = new whoKarenWantsToSpeakTo(cfgs);
    }

}
