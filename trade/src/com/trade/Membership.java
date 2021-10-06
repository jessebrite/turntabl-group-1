package com.trade;

public class Membership {
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Membership{" +
                "status='" + status + '\'' +
                '}';
    }
}
