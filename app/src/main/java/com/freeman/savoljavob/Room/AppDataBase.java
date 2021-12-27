package com.freeman.savoljavob.Room;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
@Database(entities = {Question.class},version = 1)
public abstract class AppDataBase extends RoomDatabase {
    public abstract QuestionDao getQuestionDao();
    static AppDataBase dataBase;
    public AppDataBase() {
    }

    public static AppDataBase getDataBase(Context context) {
        if (dataBase==null){
            dataBase= Room.databaseBuilder(context,AppDataBase.class,"savol.db").createFromAsset("Savollar.db").allowMainThreadQueries().build();
        }
        return  dataBase;
    }
}
