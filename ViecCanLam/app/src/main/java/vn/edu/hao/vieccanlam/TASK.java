package vn.edu.hao.vieccanlam;

import java.io.Serializable;
import java.util.HashMap;

public class TASK implements Serializable {

    private String name;
    private String date;
    private String message;
    private long priority; // FIX: đổi sang long cho đúng Firebase number

    public TASK() {
    }

    public TASK(String name, long priority, String message, String date) {
        this.name = name;
        this.priority = priority;
        this.message = message;
        this.date = date;
    }

    // GETTER - SETTER
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getPriority() {
        return priority;
    }

    public void setPriority(long priority) {
        this.priority = priority;
    }

    // FIREBASE MAP
    public HashMap<String, Object> toFireBaseObject() {
        HashMap<String, Object> taskObject = new HashMap<>();
        taskObject.put("name", name);
        taskObject.put("priority", priority);
        taskObject.put("message", message);
        taskObject.put("date", date);
        return taskObject;
    }
}