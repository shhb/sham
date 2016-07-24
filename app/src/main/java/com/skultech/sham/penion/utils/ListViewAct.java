package com.skultech.sham.penion.utils;

import android.widget.ArrayAdapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.skultech.sham.penion.R;
/**
 * Created by shhb on 2016-07-17.
 */
public class ListViewAct  extends ArrayAdapter<String>{

    private final Context context;
    private final String[] values1;

    public ListViewAct(Context context, String[] objects) {
        super(context, R.layout.activity_main, objects);
        this.context = context;
        this.values1 = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.activity_exam_list, parent, false);

        TextView textView1 = (TextView) rowView.findViewById(R.id.list1);
        textView1.setText(values1[position]);

        return rowView;
    }

}
