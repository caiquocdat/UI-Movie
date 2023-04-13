package com.example.movie.model;

public class MoviesModel {
    private String nameMovie;
    private String kindOfMovie;
    private String nation;
    private String actor;
    private String movieLength;
    private String linkMovie;
    private String linkPicture;

    public MoviesModel(String nameMovie, String kindOfMovie, String nation, String actor, String movieLength, String linkMovie, String linkPicture) {
        this.nameMovie = nameMovie;
        this.kindOfMovie = kindOfMovie;
        this.nation = nation;
        this.actor = actor;
        this.movieLength = movieLength;
        this.linkMovie = linkMovie;
        this.linkPicture = linkPicture;
    }

    public String getNameMovie() {
        return nameMovie;
    }

    public void setNameMovie(String nameMovie) {
        this.nameMovie = nameMovie;
    }

    public String getKindOfMovie() {
        return kindOfMovie;
    }

    public void setKindOfMovie(String kindOfMovie) {
        this.kindOfMovie = kindOfMovie;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getMovieLength() {
        return movieLength;
    }

    public void setMovieLength(String movieLength) {
        this.movieLength = movieLength;
    }

    public String getLinkMovie() {
        return linkMovie;
    }

    public void setLinkMovie(String linkMovie) {
        this.linkMovie = linkMovie;
    }

    public String getLinkPicture() {
        return linkPicture;
    }

    public void setLinkPicture(String linkPicture) {
        this.linkPicture = linkPicture;
    }
}
