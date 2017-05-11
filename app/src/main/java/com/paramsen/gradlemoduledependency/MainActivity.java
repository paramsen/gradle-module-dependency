package com.paramsen.gradlemoduledependency;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.greasemonk.timetable.AbstractGridItem;
import com.greasemonk.timetable.FixedGridLayoutManager;
import com.greasemonk.timetable.TimeRange;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new FixedGridLayoutManager();
    }
}
