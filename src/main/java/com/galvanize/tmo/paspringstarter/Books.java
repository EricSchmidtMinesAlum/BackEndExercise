
package com.galvanize.tmo.paspringstarter;


import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//create class with:
//id
//title
//author
//yearpublished

@Entity
public class Books {
    //can't delete individual books, so no need to keep track of vacant ids
    private @Id @GeneratedValue Long id;
    private String author;
    private String title;
    private int yearPublished;

    Books(){};
    Books(String givenAuthor,String givenTitle, int givenYearPublished){
        this.author=givenAuthor;
        this.title=givenTitle;
        this.yearPublished=givenYearPublished;
    }

    //temp settters adn getters below
    public void setTitle(String newTitle){
        this.title=newTitle;
    }
    public String getTitle(){
        return this.title;
    }
    public void setAuthor(String newAuthor){
        this.author=newAuthor;
    }
    public String getAuthor(){
        return this.author;
    }
    public void setYear(int newYear){
        this.yearPublished=newYear;
    }
    public int getYear(){
        return this.yearPublished;
    }




    @Override
    public String toString() {
    return "{" + "id=" + this.id + ", author='" + this.author + ", title='" + this.title +", yearPublished='" + this.yearPublished +'}';
    }

    // over ride sort to sort by title    
}