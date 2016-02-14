package org.rcruzper.io.enumconcept.controller.dto.request;

public class CreateBookRequest {

    private String title;
    private GenreRequest genre;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public GenreRequest getGenre() {
        return genre;
    }

    public void setGenre(GenreRequest genre) {
        this.genre = genre;
    }

}
