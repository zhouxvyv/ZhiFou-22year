package zhouxv.zhifou.domain;

import java.sql.Timestamp;
import java.util.Objects;

public class Test {
    private int testId;
    private String testName;
    Integer subjectId;
    String subjectName;
    Timestamp uploadTime;
    String sourceUrl;
    int count;
    Float avgGrade;
    int likeCount;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test that = (Test) o;
        return testId == that.testId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(testId, testName, subjectId, uploadTime, sourceUrl, count, avgGrade);
    }

    public Test(){
    }

    public Test(int test_id, String test_name, Integer subject) {
        this.testId = test_id;
        this.testName = test_name;
        this.subjectId = subject;
    }

    public Test(int testId, String testName, Integer subjectId, Timestamp uploadTime, String sourceUrl, int count, Float avgGrade, int likeCount) {
        this.testId = testId;
        this.testName = testName;
        this.subjectId = subjectId;
        this.uploadTime = uploadTime;
        this.sourceUrl = sourceUrl;
        this.count = count;
        this.avgGrade = avgGrade;
        this.likeCount = likeCount;
    }

    public Test(int test_id, String test_name, Integer subject, int count, Float avg_grade) {
        this.testId = test_id;
        this.testName = test_name;
        this.subjectId = subject;
        this.count = count;
        this.avgGrade = avg_grade;
    }

    public Test(int testId) {
        this.testId = testId;
    }

    @Override
    public String toString() {
        return "TestDomain{" +
                "testId=" + testId +
                ", testName='" + testName + '\'' +
                ", subjectId='" + subjectId + '\'' +
                ", uploadTime=" + uploadTime +
                ", sourceUrl='" + sourceUrl + '\'' +
                ", count=" + count +
                ", avgGrade=" + avgGrade +
                '}';
    }

    public int getTestId() {
        return testId;
    }

    public void setTestId(int testId) {
        this.testId = testId;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Timestamp getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Timestamp uploadTime) {
        this.uploadTime = uploadTime;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Float getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(Float avgGrade) {
        this.avgGrade = avgGrade;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }
}
