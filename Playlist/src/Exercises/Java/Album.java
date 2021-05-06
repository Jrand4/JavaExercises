package Exercises.Java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration){
        if(findSong(title) != null) return false;
        else{
            songs.add(new Song(title,duration));
            return true;
        }
    }
    private Song findSong(String title){
        for(Song s: songs){
            if(s.getTitle() == title) return s;
        }
        return null;
    }
    public boolean addToPlayList(int n, LinkedList<Song> playList){
        ListIterator<Song> i = playList.listIterator();
        while(i.hasNext()){


        }
    }
    public boolean addToPlayList(String s, LinkedList<Song> playList){
        ListIterator<Song> i = playList.listIterator();
    }
}
