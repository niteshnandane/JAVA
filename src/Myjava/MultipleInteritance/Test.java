package Myjava.MultipleInteritance;

public class Test {
    static void main() {
        SmartPhone sp = new SmartPhone();
         sp.makeCall();
         sp.endCall();
         sp.playMusic();
         sp.stopMusic();
         sp.recordVideos();
         sp.takePhoto();

//         Note:- we can write static method in interface
    }
}
