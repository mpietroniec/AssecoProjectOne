package com.example.assecoprojectone;

public class Model {
    private String mModelName;
    private String mThumbnail;
    private String mModel;

    public Model(String mModelName, String mThumbnail, String mModel) {
        this.mModelName = mModelName;
        this.mThumbnail = mThumbnail;
        this.mModel = mModel;
    }

    public String getmModelName() {
        return mModelName;
    }

    public void setmModelName(String mModelName) {
        this.mModelName = mModelName;
    }

    public String getmThumbnail() {
        return mThumbnail;
    }

    public void setmThumbnail(String mThumbnail) {
        this.mThumbnail = mThumbnail;
    }

    public String getmModel() {
        return mModel;
    }

    public void setmModel(String mModel) {
        this.mModel = mModel;
    }
}
