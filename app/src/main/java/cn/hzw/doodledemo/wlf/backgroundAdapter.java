package cn.hzw.doodledemo.wlf;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import cn.hzw.doodledemo.R;

public class backgroundAdapter extends RecyclerView.Adapter<backgroundAdapter.ViewHolder>{

    private List<background> mbackgroundList;

    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView backgroundImage;
        TextView backgroundName;
        public ViewHolder(View view){
            super(view);
            backgroundImage = (ImageView)view.findViewById(R.id.background_image);
            backgroundName = (TextView)view.findViewById(R.id.background_name);
        }
    }

    public backgroundAdapter(List<background> backgroundList){
        mbackgroundList = backgroundList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent,int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.background_item,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder,int position){
        background background = mbackgroundList.get(position);
        holder.backgroundImage.setImageResource(background.getImageId());
        holder.backgroundName.setText(background.getName());
    }

    @Override
    public int getItemCount(){
        return mbackgroundList.size();
    }

}
