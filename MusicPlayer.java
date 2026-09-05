public class MusicPlayer {

  private String playlist;

  public MusicPlayer() {
    playlist = "My Playlist";
  }

  public void play() {
    System.out.println("Now Playing: " + playlist);
  }

  public void stop() {
    System.out.println("Music Player stopped.");
  }

  public void setPlaylist() {
    this.playlist = playlist;
    System.out.println("Playlist changed to: " + playlist);
  }
}
