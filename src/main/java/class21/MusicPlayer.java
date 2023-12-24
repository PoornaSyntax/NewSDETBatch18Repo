package class21;

public  class MusicPlayer {

        private String currentTrack;
        private int volume;

        public MusicPlayer(String currentTrack, int volume) {
            this.currentTrack = currentTrack;
            this.volume = volume;
        }
        public  void play(){
            System.out.println("Playing "+currentTrack);
        }
        public void pause() {
            System.out.println("Paused: " + currentTrack);
        }

        public void stop() {
            System.out.println("Stopped: " + currentTrack);
        }
        public String getCurrentTrack() {
            return currentTrack;
        }
        public int getVolume() {
            return volume;
       }
        public void printInfo(){
            System.out.println("THe current track is "+currentTrack);
            System.out.println("Volume is set to "+volume);
        }
    }


    class MP3Player extends MusicPlayer {
        public MP3Player(String currentTrack, int volume) {
            super(currentTrack, volume);
        }
        @Override
        public void play() {
            System.out.println("Playing MP3: " + getCurrentTrack()+" volume "+getVolume());
        }
    }

        class CDPlayer extends MusicPlayer {
        public CDPlayer(String currentTrack, int volume) {
            super(currentTrack, volume);
        }

        @Override
        public void play() {
            System.out.println("Playing CD: " + getCurrentTrack());
        }
        }

        class StreamingPlayer extends MusicPlayer {
        public StreamingPlayer(String currentTrack, int volume) {
            super(currentTrack, volume);
        }
        @Override
        public void play() {
            System.out.println("Streaming from the internet: " + getCurrentTrack());
        }
    }

     class MusicPlayerTester {
        public static void main(String[] args) {



            MusicPlayer[] arr = {new MP3Player("Song1.mp3", 50),
                    new CDPlayer("Song2.mp3", 60),
                    new StreamingPlayer("Song3.mp3", 70)};

            for (int i = 0; i < arr.length ; i++) {
                MusicPlayer m = arr[i];
                m.printInfo();
                m.play();
                m.pause();
                m.stop();

            }





        }
    }


