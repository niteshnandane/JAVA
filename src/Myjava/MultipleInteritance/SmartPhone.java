package Myjava.MultipleInteritance;

public class SmartPhone implements Camera,MusicPlayer,Phone  {

    @Override
    public void takePhoto() {
        System.out.println(" take Photo");
    }

    @Override
    public void recordVideos() {
        System.out.println("record Video");
    }

    @Override
    public void playMusic() {
        System.out.println("Play Music");
    }

    @Override
    public void stopMusic() {
        System.out.println("Stop Music");
    }

    @Override
    public void makeCall() {
        System.out.println("call");

    }

    @Override
    public void endCall() {
        System.out.println("End Call");
    }
}
