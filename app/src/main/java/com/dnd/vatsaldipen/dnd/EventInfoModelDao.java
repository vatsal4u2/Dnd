package com.dnd.vatsaldipen.dnd;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface EventInfoModelDao {

    @Query("SELECT * FROM eventInfo")
    List<EventInfoModel> getAll();

    @Query("SELECT COUNT(*) FROM eventInfo")
    int getEventsCount();

    @Insert
    void insertAll(EventInfoModel... events);

    @Insert
    void insertEventModel(EventInfoModel model);

    @Delete
    void delete(EventInfoModel event);

}
