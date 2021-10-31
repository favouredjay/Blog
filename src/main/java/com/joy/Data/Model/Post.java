package com.joy.Data.Model;


import java.time.LocalDateTime;
import java.util.List;

public class Post {
    private String title;
    private String description;
    private String article;
    private LocalDateTime localDateTime;

    private List<Comment>comments;

    public Post(String title, String description, String article, LocalDateTime localDateTime, List<Comment>comments) {
        this.title = title;
        this.description = description;
        this.article = article;
        this.localDateTime = localDateTime;
        this.comments = comments;
    }

    public void setComment (List<Comment>comments){
        this.comments = comments;

    }
    public List<Comment> getComments(){
        return comments;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }
}
