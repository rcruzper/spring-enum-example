package org.rcruzper.io.enumconcept.controller.dto.request;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum GenreRequest {

    SCI_FI, FANTASY, COMEDY, DRAMA;

    @JsonCreator
    public static GenreRequest create(String value) {
        return GenreRequest.valueOf(value.toUpperCase());
    }
}
