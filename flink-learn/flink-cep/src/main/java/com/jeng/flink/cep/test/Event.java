package com.jeng.flink.cep.test;

public class Event {
    private String eventType;
    private String userId;
    private String behaviorInfo;

    public Event(String eventType, String userId, String behaviorInfo) {
        this.eventType = eventType;
        this.userId = userId;
        this.behaviorInfo = behaviorInfo;
    }

    public Event(String eventType, String userId) {
        this(eventType,userId,null);
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getBehaviorInfo() {
        return behaviorInfo;
    }

    public void setBehaviorInfo(String behaviorInfo) {
        this.behaviorInfo = behaviorInfo;
    }

    @Override
    public String toString() {
        return "[" + eventType + "," + userId + "," + behaviorInfo + "]";
//        return ReflectionToStringBuilder.toString(this);
    }
}
