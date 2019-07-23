package net.putut.mysubmissionp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rycleMotor;
    private ArrayList<Motor> listdata = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rycleMotor =findViewById(R.id.view_motor);
        rycleMotor.setHasFixedSize(true);

        listdata.addAll(DataMotor.geListData());
        showRecyclerList();

    }

    private void showRecyclerList() {
        rycleMotor.setLayoutManager(new LinearLayoutManager(this));
        ListMotorAda listMotorAda = new ListMotorAda(listdata);
        rycleMotor.setAdapter(listMotorAda);
    }
}
