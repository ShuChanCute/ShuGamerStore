package com.example.shugamerstore.Domain;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import kotlin.Metadata;

public class ListGame {

    @SerializedName("data")
    @Expose
    private List<Datum> data;
    @SerializedName("metadata")
    @Expose
    private Metadata metadata;

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metada) {
        this.metadata = metadata;
    }

}
