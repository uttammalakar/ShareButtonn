  package com.example.sharebutton;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

  public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

      @Override
      public boolean onCreateOptionsMenu(Menu menu) {

          MenuInflater menuInflater=getMenuInflater();
          menuInflater.inflate(R.menu.melulayout,menu);
          return super.onCreateOptionsMenu(menu);
      }

      @Override
      public boolean onOptionsItemSelected(@NonNull MenuItem item) {

          if (item.getItemId()==R.id.shareid)
          {
             // Toast.makeText(this, "share tost", Toast.LENGTH_SHORT).show();
              Intent intent=new Intent(Intent.ACTION_SEND);
              intent.setType("text/plain");
              String subject="c progrmming app";
              String body="this is very usefull";
              intent.putExtra(Intent.EXTRA_SUBJECT,subject);
              intent.putExtra(Intent.EXTRA_SUBJECT,body);
              startActivity(Intent.createChooser(intent,"share with"));
          }
          return super.onOptionsItemSelected(item);
      }
  }