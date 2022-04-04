// your solution here
//fix all the errors including package errors
// your solution here
//fix all the errors including package errors
package ru.innopolis.problem3;
class Main{
    public static void main(String[] args) {
        PlayerDevice device = new PlayerDevice();
        mp3player player = new mp3player();
        device.play(new mp3ToMp4Adapter(player));
    }
}
class PlayerDevice{
    public void play(mp4 device){

    }
}

interface mp3{
    void play();
}

interface mp4{
    void play();
}
class mp3ToMp4Adapter implements mp4{
    private mp3 mp3Player;
    @Override
    public void play() {
        mp3Player.play();
    }

    public mp3ToMp4Adapter(mp3 mp3Player) {
        this.mp3Player = mp3Player;
    }
}
class mp3player implements mp3{

    @Override
    public void play() {

    }
}
class mp4player implements mp4{

    @Override
    public void play() {

    }
}