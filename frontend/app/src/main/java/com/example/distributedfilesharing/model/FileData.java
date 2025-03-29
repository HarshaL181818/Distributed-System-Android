package com.example.distributedfilesharing.model;

public class FileData {
    private String fileId;
    private int qrImageId;

    public FileData(String fileId, int qrImageId) {
        this.fileId = fileId;
        this.qrImageId = qrImageId;
    }


    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public int getQrImageId() {
        return qrImageId;
    }

    public void setQrImageId(int qrImageId) {
        this.qrImageId = qrImageId;
    }
}
