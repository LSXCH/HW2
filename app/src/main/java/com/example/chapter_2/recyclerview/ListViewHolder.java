package com.example.chapter_2.recyclerview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.chapter_2.R;
import com.example.chapter_2.R;

/**
 * author : neo
 * time   : 2019/06/18
 * desc   :
 */
public class ListViewHolder extends RecyclerView.ViewHolder {

    private TextView mTextView1, mTextView2, mTextView3, mTextView4;

    public static ListViewHolder create(Context context, ViewGroup root) {
        View v = LayoutInflater.from(context).inflate(R.layout.layout_item_list, root, false);
        return new ListViewHolder(v);
    }

    public ListViewHolder(@NonNull View itemView) {
        super(itemView);
        mTextView1 = itemView.findViewById(R.id.index);
        mTextView2 = itemView.findViewById(R.id.title);
        mTextView3 = itemView.findViewById(R.id.hits);
        mTextView4 = itemView.findViewById(R.id.type);
    }

    public void bind(Data data) {
        if (null == data) return;
        mTextView1.setText(data.getIndex() + ".");
        if(Integer.parseInt(data.getIndex()) <= 3)
            mTextView1.setTextColor(Color.parseColor("#e6face15"));
        else
            mTextView1.setTextColor(Color.parseColor("#99ffffff"));
        if(Integer.parseInt(data.getType()) == 0)
        {
            mTextView4.setBackgroundColor(Color.parseColor("#FF1493"));
            mTextView4.setText("热");
        }
        else if(Integer.parseInt(data.getType()) == 1)
        {
            mTextView4.setBackgroundColor(Color.parseColor("#6495ED"));
            mTextView4.setText("新");
        }
        else
            mTextView4.setVisibility(View.INVISIBLE);
        mTextView2.setText(data.getTitle());
        mTextView3.setText(data.getHits());
    }
}
