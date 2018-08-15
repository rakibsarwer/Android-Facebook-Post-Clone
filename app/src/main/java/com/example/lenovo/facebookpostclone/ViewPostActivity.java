package com.example.lenovo.facebookpostclone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ViewPostActivity extends AppCompatActivity {


    TextView tvUserName, tvShowPost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_post);



        tvUserName = findViewById(R.id.tv_user_name);
        tvShowPost = findViewById(R.id.tv_show_post);

        tvUserName.setText(getIntent().getStringExtra(AppConstants.postName));
        tvShowPost.setText(getIntent().getStringExtra(AppConstants.postStatus));



    }
}
