package com.skultech.sham.penion.activities;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.skultech.sham.penion.utils.ListViewAct;
import com.skultech.sham.penion.R;

import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

public class ExamListActivity extends ListActivity {

    public String[] list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam_list);

        setListAdapter(new ListViewAct(this, list));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {

        //get selected items
        String selectedValue = (String) getListAdapter().getItem(position);
        Toast.makeText(this, selectedValue, Toast.LENGTH_SHORT).show();

    }

}
