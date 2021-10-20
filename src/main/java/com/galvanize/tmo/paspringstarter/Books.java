
package com.galvanize.tmo.paspringstarter;

//create class with:
//id
//title
//author
//yearpublished

public class Books {
    //can't delete individual books, so no need to keep track of vacant ids
    private static int count = 0;
    private int id=count++;

    private String author;
    private String title;
    private String yearPublished;

    public Books(String givenAuthor,String givenTitle,String givenYearPublished){
        this.author=givenAuthor;
        this.title=givenTitle;
        this.yearPublished=givenYearPublished;
    }
    

    // over ride sort to sort by title    
}