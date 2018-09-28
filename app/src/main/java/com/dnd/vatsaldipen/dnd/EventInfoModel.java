package com.dnd.vatsaldipen.dnd;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "eventInfo")

public class EventInfoModel {

    @PrimaryKey
    @ColumnInfo(name = "eventId")
    private int eventId;

    @ColumnInfo(name = "event")
    private String event;

    @ColumnInfo(name = "status")
    private boolean status;

    @ColumnInfo(name = "message")
    private String message;

    @ColumnInfo(name = "startTime")
    private Long startTime;

    @ColumnInfo(name = "endTime")
    private Long endTime;

    public EventInfoModel(int eventId, String event, boolean status, String message, Long startTime, Long endTime) {
        this.eventId = eventId;
        this.event = event;
        this.status = status;
        this.message = message;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }
}
