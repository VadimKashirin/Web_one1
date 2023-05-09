package ru.kashirin.test;

public class MusikPlayer{

    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    private Music music;
    public MusikPlayer(Music music){
       this.music = music;

    }
    public MusikPlayer(){

    }

    public void setMusik (Music music){
        this.music = music;
    }

    public void playMusic(){
        System.out.println("Playing = " + music.getSong());
    }
}
