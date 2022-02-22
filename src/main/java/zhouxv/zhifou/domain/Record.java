package zhouxv.zhifou.domain;

import java.sql.Timestamp;

public class Record {
    int recordId;
    int topicId;
    int userId;
    Timestamp recordTime;

    public Record(int topicId, int userId, Timestamp timestamp) {
        this.topicId = topicId;
        this.userId = userId;
        this.recordTime = timestamp;
    }

    @Override
    public String toString() {
        return "RecordDomain{" +
                "recordId=" + recordId +
                ", topicId=" + topicId +
                ", userId=" + userId +
                ", recordTime=" + recordTime +
                '}';
    }

    public int getRecordId() {
        return recordId;
    }

    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }

    public int getTopicId() {
        return topicId;
    }

    public void setTopicId(int topicId) {
        this.topicId = topicId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Timestamp getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Timestamp recordTime) {
        this.recordTime = recordTime;
    }
}
