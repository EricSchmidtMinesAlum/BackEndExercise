
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
    private Integer yearublished;

    Books(){};
    Books(String author,String title, Integer yearublished){
        this.author=author;
        this.title=title;
        this.yearublished=yearublished;
    }

    //temp settters adn getters below
    public Long getId() {
        return this.id;
      }
    
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
    public void setYear(Integer newYear){
        this.yearublished=newYear;
    }
    public Integer getYear(){
        return this.yearublished;
    }




    @Override
    public String toString() {
    return "{" + "id=" + this.id + ", author='" + this.author + ", title='" + this.title +", yearPublished='" + this.yearublished +'}';
    }

    @Override
    public boolean equals(Object o) {
  
      if (this == o)
        return true;
      if (!(o instanceof Books))
        return false;
        Books employee = (Books) o;
      return Objects.equals(this.id, employee.id) && Objects.equals(this.author, employee.author)
          && Objects.equals(this.title, employee.title)&& Objects.equals(this.yearublished, employee.yearublished);
    }
  
    @Override
    public int hashCode() {
      return Objects.hash(this.id, this.author, this.title,this.yearublished);
    }
}