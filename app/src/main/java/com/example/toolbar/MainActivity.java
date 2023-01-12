package com.example.toolbar;

import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar1;
    private EditText editText;
    private String msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar1 = findViewById(R.id.toolbar1);
        editText = findViewById(R.id.editText);
        setSupportActionBar(toolbar1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu1,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        switch (item.getItemId()){
            case R.id.menufragmento1:
                //click per posar text
                msg = editText.getText().toString();
                Intent sendIntent = new Intent(getApplicationContext(), NewActivity.class);
                sendIntent.putExtra("msg",msg);
                startActivity(sendIntent);

                return true;
            case R.id.menufragmento2:
                Intent intent = new Intent(getApplicationContext(), NewActivity.class);
                startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}