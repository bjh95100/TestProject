package kr.co.ezenac.bjhbjh.testproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

import kr.co.ezenac.bjhbjh.testproject.model.Room;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    ArrayList<Room>


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.searchpage_layout);
    }
}
