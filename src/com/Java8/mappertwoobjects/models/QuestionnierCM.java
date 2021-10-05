package com.Java8.mappertwoobjects.models;

public class QuestionnierCM {

    private String questionnierId;
    private String usage;
    private String type;
    private String name;

    public QuestionnierCM(String questionnierId, String usage, String type, String name) {
        this.questionnierId = questionnierId;
        this.usage = usage;
        this.type = type;
        this.name = name;
    }

    public String getQuestionnierId() {
        return questionnierId;
    }

    public void setQuestionnierId(String questionnierId) {
        this.questionnierId = questionnierId;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "QuestionnierCM{" +
                "questionnierId='" + questionnierId + '\'' +
                ", usage='" + usage + '\'' +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
