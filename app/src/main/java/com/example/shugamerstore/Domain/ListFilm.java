package com.example.shugamerstore.Domain;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import kotlin.Metadata;

public class ListFilm {

    @SerializedName("data")
    @Expose
    private List<com.example.shugamerstore.Domain.Datum> data;
    @SerializedName("metadata")
    @Expose
    private Metadata metadata;

    public List<com.example.shugamerstore.Domain.Datum> getData() {
        return data;
    }

    public void setData(List<com.example.shugamerstore.Domain.Datum> data) {
        this.data = data;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

}
