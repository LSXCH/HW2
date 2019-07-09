package com.example.chapter_2.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.example.chapter_2.R;
import com.example.chapter_2.recyclerview.Data;
import com.example.chapter_2.recyclerview.ListAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {
    private RecyclerView mListView;
    private ListAdapter mAdapter;
    private Button mInsertButton, mInsertRangeButton, mDeleteButton, mDeleteRangeButton, mChangeButton, mChangeRangeButton;
    private List<Data> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        mListView = findViewById(R.id.rl_list);
        mListView.setLayoutManager(new LinearLayoutManager(this));
        mAdapter = new ListAdapter();
        mListView.setAdapter(mAdapter);
        String[] titles = {"火箭总冠军", "我们不一Young", "珍“eye”每一天",
                "请平安出行", "现在是怀旧时间", "纸短情长", "田馥甄",
                "我们一起学猫叫", "敬礼我们的超级英雄", "轻轻牵着你的耳朵","快速塑身",
                "耿哥的发明竟然有用了","迪迦奥特曼"
        };
        String[] hits = {"1059574", "925847", "904582", "892474", "824057", "774584",
                        "745845","725487", "704589", "695471","674851","654871","604857"};
        for (int i = 1; i <= 13; i++) {
            Data data = new Data(i + "", titles[i - 1], hits[i - 1] + "", (int)(Math.random() * 100) % 3 + "");
            list.add(data);
        }
        mAdapter.setDataList(list);
        mAdapter.notifyDataSetChanged();
    }
}
