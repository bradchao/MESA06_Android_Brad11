package com.example.user.brad11;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private MyDBHelper dbHelper;
    private SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView)findViewById(R.id.tv);

        dbHelper = new MyDBHelper(this, "iii", null, 1);
        db = dbHelper.getReadableDatabase();

    }

    public void query(View v){
        // SELECT * FROM cust
        // db.execSQL("SELECT * FROM cust");
        Cursor cursor = db.query("cust",null,null,null,null,null,null);

    }


}
