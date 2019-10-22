package com.example.projectraptor.BlockChain;

public class Target {

    //First define the fields in the Target transaction POJO
    private String objectName, date, time, location, status;

    //Now start setters and getters
    public String getObjectName() {return objectName;}
    public void setObjetName(String _ObjN) {this.objectName = _ObjN;}
    public String getDate() {return date;}
    public void setDate(String _Date) {this.date = _Date;}
    public String getTime() {return time;}
    public void setTime(String _Time) {this.time = _Time;}
    public String getLocation() {return location;}
    public void setLocation(String _Lctn) {this.location = _Lctn;}
    public String getStatus() {return status;}
    public void setStatus(String _Status) {this.status = _Status;}
}

