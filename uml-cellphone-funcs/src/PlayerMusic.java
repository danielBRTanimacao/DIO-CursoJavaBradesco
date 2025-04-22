public record PlayerMusic(boolean isPlay) {
    public void play() { System.out.println("Musica tocando!");}
    public void pause() { System.out.println("Musica pausada!");}
    public void selectMusic(String name) {}
}
