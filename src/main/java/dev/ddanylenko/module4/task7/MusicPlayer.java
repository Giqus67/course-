package dev.ddanylenko.module4.task7;

import java.util.List;

public class MusicPlayer implements Playable{
    @Override
    public void play() {
        System.out.println("Playing music on player");
    }

    public static void main(String[] args){
        List<Playable> players = List.of(new MusicPlayer(), new VideoPlayer());
        players.forEach(Playable::play);
    }
}
