package zhouxv.zhifou.domain;

import com.jayway.jsonpath.JsonPath;

import java.util.ArrayList;
import java.util.List;

public class NoAnswerTopic {
    int topicId;
    String topicTitle;
    String topicImage;
    int userId;
    String type;
    String options;
    List<String> optionls;

    @Override
    public String toString() {
        return "NoAnswerTopicDomain{" +
                "topicId=" + topicId +
                ", topicTitle='" + topicTitle + '\'' +
                ", topicImage='" + topicImage + '\'' +
                ", userId=" + userId +
                ", type='" + type + '\'' +
                ", options='" + options + '\'' +
                ", optionls=" + optionls +
                '}';
    }

    public NoAnswerTopic(){

    }

    public NoAnswerTopic(String topicTitle, String topicImage, int userId, String type, String options) {
        this.topicTitle = topicTitle;
        this.topicImage = topicImage;
        this.userId = userId;
        this.type = type;
        this.options = options;
    }

    public NoAnswerTopic(int topicId, String topicTitle, String topicImage, int userId, String type, String options) {
        this.topicId = topicId;
        this.topicTitle = topicTitle;
        this.topicImage = topicImage;
        this.userId = userId;
        this.type = type;
        this.options = options;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTopicId() {
        return topicId;
    }

    public void setTopicId(int topicId) {
        this.topicId = topicId;
    }

    public String getTopicTitle() {
        return topicTitle;
    }

    public void setTopicTitle(String topicTitle) {
        this.topicTitle = topicTitle;
    }

    public String getTopicImage() {
        return topicImage;
    }

    public void setTopicImage(String topicImage) {
        this.topicImage = topicImage;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
        List<String> list = JsonPath.parse(options).read("$");
        ArrayList<String> optionArrayList = new ArrayList<>();
        for(String option : list){
            optionArrayList.add(option);
        }
        this.optionls=optionArrayList;
    }
}
