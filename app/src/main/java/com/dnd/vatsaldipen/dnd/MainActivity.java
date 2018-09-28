package com.dnd.vatsaldipen.dnd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public EventInfoModelDao eventInfoModelDao;
    public final String TAG = MainActivity.class.getSimpleName();
    public List<EventInfoModel> eventsList;
    public int id = 1005;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eventInfoModelDao = DndApp.appDatabase.eventInfoModelDao();
        Log.d("database","Database Initialized "+TAG);

        //eventInfoModelDao.insertEventModel(new EventInfoModel(2003,"testEvent1",true,"I am sleeping now, we will call you later",null,null));
        Log.d("database","Data Inserted Successfully "+TAG);

        eventsList = eventInfoModelDao.getAll();

        MultiViewAdapter adapter = new MultiViewAdapter();
        adapter.setData(eventsList,this);

        RecyclerView parentView = findViewById(R.id.rv_parentView);
        parentView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));
        parentView.setItemAnimator(new DefaultItemAnimator());
        parentView.setAdapter(adapter);

        Toast.makeText(this,"Event ID : " + eventInfoModelDao.getAll().get(0).getEventId() + "Size : " + adapter.getItemCount(),Toast.LENGTH_LONG ).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
