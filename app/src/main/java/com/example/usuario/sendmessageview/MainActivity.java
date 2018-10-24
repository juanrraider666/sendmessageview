package com.example.usuario.sendmessageview;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

TextView textico;
FloatingActionButton floatingActionButton;
EditText editText;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         textico =  findViewById(R.id.textico);

         floatingActionButton =  findViewById(R.id.floatingActionButton);
         editText =  findViewById(R.id.editText);

       floatingActionButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

              String texto =  editText.getText().toString();
              textico.setText(texto);


              Toast.makeText(getApplicationContext(),"vamo a gueler perico!",Toast.LENGTH_SHORT).show();

           }
       });






    }
}
