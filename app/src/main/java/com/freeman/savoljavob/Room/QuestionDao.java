package com.freeman.savoljavob.Room;

import androidx.room.Dao;
import androidx.room.Query;

import java.util.List;

@Dao
public interface QuestionDao {
    @Query("Select * From Question")
    public List<Question> getQuestions();
}
