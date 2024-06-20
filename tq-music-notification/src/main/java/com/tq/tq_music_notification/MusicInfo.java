package com.tq.tq_music_notification;

public class MusicInfo {
    private String title;
    private String artist;
    private String albumUrl;
    private String albumArtUrl;
    private String cover;

    public MusicInfo(String title, String artist, String albumUrl, String albumArtUrl, String cover) {
        this.title = title;
        this.artist = artist;
        this.albumUrl = albumUrl;
        this.albumArtUrl = albumArtUrl;
        this.cover = cover;
    }

    @Override
    public String toString() {
        return "MusicInfo{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", albumUrl='" + albumUrl + '\'' +
                ", albumArtUrl='" + albumArtUrl + '\'' +
                ", cover='" + cover + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbumUrl() {
        return albumUrl;
    }

    public void setAlbumUrl(String albumUrl) {
        this.albumUrl = albumUrl;
    }

    public String getAlbumArtUrl() {
        return albumArtUrl;
    }

    public void setAlbumArtUrl(String albumArtUrl) {
        this.albumArtUrl = albumArtUrl;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }
}
