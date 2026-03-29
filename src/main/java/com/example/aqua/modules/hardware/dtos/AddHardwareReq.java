package com.example.aqua.modules.hardware.dtos;

public class AddHardwareReq {
    private String hardwareId;
    private String hardwareKey;
    private String userId;
    private String config;
    private String metadata;

    public String getHardwareId() { return hardwareId; }
    public String getHardwareKey() { return hardwareKey; }
    public String getUserId() { return userId; }
    public String getConfig() { return config; }
    public String getMetadata() { return metadata; }

    public void setConfig(String config) { this.config = config; }
    public void setMetadata(String metadata) { this.metadata = metadata; }
}