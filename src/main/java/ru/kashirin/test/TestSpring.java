package ru.kashirin.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
         //Music music = context.getBean("musicBean",Music.class);

       //  MusikPlayer musikPlayer = new MusikPlayer(music);


        ClassicalMusik classicalMusik = context.getBean("musicBean",ClassicalMusik.class);
        System.out.println(classicalMusik.getSong());

//        MusikPlayer firstMusikPlayer = context.getBean("musicPlayer",MusikPlayer.class);
//        MusikPlayer secondMusikPlayer = context.getBean("musicPlayer",MusikPlayer.class);
//
//        boolean comparison = firstMusikPlayer == secondMusikPlayer;
//        System.out.println(comparison);
//        System.out.println(firstMusikPlayer);
//        System.out.println(secondMusikPlayer);
//
//        firstMusikPlayer.setVolume(5);
//        System.out.println(firstMusikPlayer.getVolume());
//        System.out.println(secondMusikPlayer.getVolume());
//
//
//          MusikPlayer musikPlayer1 = new MusikPlayer();
//        System.out.println(musikPlayer.getName());
//        System.out.println(musikPlayer.getVolume());

        context.close();

        //ALISHEV YOUTUBE

    }
}
