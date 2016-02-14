package org.rcruzper.io.enumconcept.controller.dto.response;

public class BookResponse {

    private String title;
    private GenreResponse genre;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public GenreResponse getGenre() {
        return genre;
    }

    public void setGenre(GenreResponse genre) {
        this.genre = genre;
    }

    public static class Builder {

        private BookResponse book;

        public Builder() {
            book = new BookResponse();
        }

        public Builder title(String value) {
            book.setTitle(value);
            return this;
        }

        public Builder genre(String value) {
            book.setGenre(GenreResponse.valueOf(value));
            return this;
        }

        public BookResponse build() {
            return book;
        }

    }

}
