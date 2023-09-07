public class Main {
    public static void main(String[] args) {
        MusicStyles popMusic = new PopMusic();
        MusicStyles rockMusic = new RockMusic();
        MusicStyles classicMusic = new ClassicMusic();

        MusicStyles[] musicStylesArray = {popMusic, rockMusic, classicMusic};

        for (MusicStyles musicStyle : musicStylesArray) {
            musicStyle.playMusic();
        }
    }
}

