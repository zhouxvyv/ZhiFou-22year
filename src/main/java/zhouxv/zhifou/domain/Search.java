package zhouxv.zhifou.domain;

import java.sql.Timestamp;

public class Search {
    int id;
    int userId;
    String image;
    Timestamp datetime;
    String title;

    public Search(){

    }

    public Search(int userId, String image, Timestamp datetime, String title) {
        this.userId = userId;
        this.image = image;
        this.datetime = datetime;
        this.title = title;
    }

    @Override
    public String toString() {
        return "SearchDomain{" +
                "id=" + id +
                ", userId=" + userId +
                ", image='" + image + '\'' +
                ", datetime=" + datetime +
                ", title='" + title + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Timestamp getDatetime() {
        return datetime;
    }

    public void setDatetime(Timestamp datetime) {
        this.datetime = datetime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
