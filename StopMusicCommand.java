public class StopMusicCommand implements Command {

    private MusicPlayer musicPlayer;

    public StopMusicCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute() {
        musicPlayer.stop();
    }
}
