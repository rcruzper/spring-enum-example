package org.rcruzper.io.enumconcept.controller.dto.response;

import com.fasterxml.jackson.annotation.JsonValue;

public enum GenreResponse {

    SCI_FI, FANTASY, COMEDY, DRAMA;

    @JsonValue
    public String get() {
        return this.name().toLowerCase();
    }

}
