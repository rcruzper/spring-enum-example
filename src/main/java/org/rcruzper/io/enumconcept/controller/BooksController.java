package org.rcruzper.io.enumconcept.controller;

import org.rcruzper.io.enumconcept.controller.dto.request.CreateBookRequest;
import org.rcruzper.io.enumconcept.controller.dto.response.BookResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/books")
@Api(tags = "/books")
public class BooksController {

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public BookResponse createBook(@RequestBody CreateBookRequest request) {
        return new BookResponse.Builder().title(request.getTitle()).genre(request.getGenre().name()).build();
    }

}
