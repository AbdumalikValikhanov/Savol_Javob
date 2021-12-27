package com.freeman.savoljavob.Room;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.ArrayList;
import java.util.Collections;

@Entity
public class Question {
    @PrimaryKey(autoGenerate = true)
    int id;
    @ColumnInfo(name="Savol")
    @NonNull
    String savol;
    @ColumnInfo(name = "Togri javob")
    @NonNull
    String togrijavob;
    @ColumnInfo(name = "Asavol")
    @NonNull
    String asavol;
    @ColumnInfo(name = "Bsavol")
    @NonNull
    String bsavol;
    @ColumnInfo(name = "Dsavol")
    @NonNull
    String dsavol;
    ArrayList<String> javoblar=new ArrayList<>();



    public Question(int id, String savol, String togrijavob, String asavol, String bsavol, String dsavol) {
        this.id = id;
        this.savol = savol;
        this.togrijavob = togrijavob;
        this.asavol = asavol;
        this.bsavol = bsavol;
        this.dsavol = dsavol;
        javoblar.add(asavol);
        javoblar.add(bsavol);
        javoblar.add(dsavol);
        Collections.shuffle(javoblar);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSavol() {
        return savol;
    }

    public void setSavol(String savol) {
        this.savol = savol;
    }

    public String getTogrijavob() {
        return togrijavob;
    }

    public void setTogrijavob(String togrijavob) {
        this.togrijavob = togrijavob;
    }

    public String getAsavol() {
        return asavol;
    }

    public void setAsavol(String asavol) {
        this.asavol = asavol;
    }

    public String getBsavol() {
        return bsavol;
    }

    public void setBsavol(String bsavol) {
        this.bsavol = bsavol;
    }

    public String getDsavol() {
        return dsavol;
    }

    public void setDsavol(String dsavol) {
        this.dsavol = dsavol;
    }
}
