package com.example.ddm1_subjectmanager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    private Context context;
    private String[] subjectTitles;
    private int[] subjectImages;
    private String[] subjectDescriptions;
    private LayoutInflater layoutInflater;

    public CustomAdapter(Context context, String[] subjectTitles, int[] subjectImages, String[] subjectDescriptions) {
        this.context = context;
        this.subjectTitles = subjectTitles;
        this.subjectImages = subjectImages;
        this.subjectDescriptions = subjectDescriptions;
        layoutInflater = (LayoutInflater.from(context));
    }



    @Override
    public int getCount() {
        return subjectTitles.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = layoutInflater.inflate(R.layout.activity_listview, null);
        ImageView logo = view.findViewById(R.id.imageLogo);
        TextView title = view.findViewById(R.id.subjectTitle);
        TextView description = view.findViewById(R.id.subjectDescription);

        logo.setImageResource(subjectImages[i]);
        title.setText(subjectTitles[i]);
        description.setText(subjectDescriptions[i]);

        return view;

    }
}
