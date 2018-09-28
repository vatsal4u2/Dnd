package com.dnd.vatsaldipen.dnd;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class MultiViewAdapter extends RecyclerView.Adapter {

    private List<EventInfoModel> dataset;
    private Context context;

    public static class EventCardViewHolder extends RecyclerView.ViewHolder{

        Switch isActivated;
        TextView tvEventId;

        public EventCardViewHolder(View itemView) {
            super(itemView);
            this.isActivated = itemView.findViewById(R.id.sv_activated);
            this.tvEventId = itemView.findViewById(R.id.tv_eventId);
        }
    }

    MultiViewAdapter() {}

    public MultiViewAdapter(List<EventInfoModel> dataset, Context context){
        this.dataset = dataset;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.sub_activity_homescreen, parent, false);
        return new EventCardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        EventInfoModel model = dataset.get(position);
        ((EventCardViewHolder)holder).isActivated.setChecked(model.isStatus());
        ((EventCardViewHolder)holder).tvEventId.setText("Event Id : " + model.getEventId());
    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }

    public void setData(List<EventInfoModel> mData, Context context){
        this.dataset = mData;
        this.context = context;
        notifyDataSetChanged();
    }
}
