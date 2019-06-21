package cn.hzw.doodledemo.wlf;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import cn.hzw.doodledemo.R;

//import static android.support.v4.app.FragmentManagerImpl.FragmentTag.Fragment;

public class recyclerviewFragment extends Fragment {

    private List<background> backgroundList = new ArrayList<background>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.recyclerview_fragment,container,false);
        initBackgrounds();
        RecyclerView recyclerView = (RecyclerView)view.findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(view.getContext());
        recyclerView.setLayoutManager(layoutManager);
        backgroundAdapter adapter = new backgroundAdapter(backgroundList);
        recyclerView.setAdapter(adapter);
        return view;
    }

    private void initBackgrounds(){
        for(int i = 0;i<2;i++){
            background b1 = new background("b1",R.drawable.background1);
            backgroundList.add(b1);
            background b2 = new background("b2",R.drawable.background2);
            backgroundList.add(b2);
            background b3 = new background("b3",R.drawable.background3);
            backgroundList.add(b3);
        }
    }
}
