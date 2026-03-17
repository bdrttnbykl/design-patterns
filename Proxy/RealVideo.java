public class RealVideo implements Video {

    private String videoName;

    public RealVideo(String videoName) {
        this.videoName = videoName;
    }

    public void play() {
        System.out.println(videoName + " oynatiliyor");
    }
}