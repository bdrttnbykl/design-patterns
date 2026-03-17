public class VideoProxy implements Video {

    private RealVideo realVideo;
    private String videoName;

    public VideoProxy(String videoName) {
        this.videoName = videoName;
    }

    public void play() {
        if (realVideo == null) {
            realVideo = new RealVideo(videoName);
        }
        realVideo.play();
    }
}
