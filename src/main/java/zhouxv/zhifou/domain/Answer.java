package zhouxv.zhifou.domain;

public class Answer {
    int answerId;
    String answer;
    String image;
    int userId;
    int topicId;

    public Answer(){

    }

    public Answer(String answer, String image, int userId, int topicId) {
        this.answer = answer;
        this.image = image;
        this.userId = userId;
        this.topicId = topicId;
    }

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getTopicId() {
        return topicId;
    }

    public void setTopicId(int topicId) {
        this.topicId = topicId;
    }
}
