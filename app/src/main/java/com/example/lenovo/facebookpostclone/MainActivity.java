package com.example.lenovo.facebookpostclone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etName, etStatus;
    Button buttonPost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etName = findViewById(R.id.et_name);
        etStatus = findViewById(R.id.et_status);
        buttonPost = findViewById(R.id.btn_post);


        buttonPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = etName.getText().toString();
                String status = etStatus.getText().toString();

                Intent mainActivityIntent = new Intent(MainActivity.this, ViewPostActivity.class);
                mainActivityIntent.putExtra(AppConstants.postName, name);
                mainActivityIntent.putExtra(AppConstants.postStatus, status);
                startActivity(mainActivityIntent);

            }
        });



    }
}
