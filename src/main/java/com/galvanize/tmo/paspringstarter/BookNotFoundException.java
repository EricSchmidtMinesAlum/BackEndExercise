package com.galvanize.tmo.paspringstarter;

class BookNotFoundException extends RuntimeException {

  BookNotFoundException(int id) {
    super("Could not find Book " + id);
  }
}