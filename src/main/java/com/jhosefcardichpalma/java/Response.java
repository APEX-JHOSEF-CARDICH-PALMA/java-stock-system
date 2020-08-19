package com.jhosefcardichpalma.java;

public class Response {
    private int identifier;
    private boolean status;
    
    public Response(){
        this.identifier=0;
        this.status=false;
    }

    public int getIdentifier() {
        return identifier;
    }

    public boolean isStatus() {
        return status;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
