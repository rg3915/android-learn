package com.example.poc01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

//    OkHttpClient client = new OkHttpClient();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText text = findViewById(R.id.text);
        Button button = findViewById(R.id.search);
        ListView listaRepositorios = findViewById(R.id.listaRepositorios);

        Repository repository = new Repository();
        repository.setName("Android");
        repository.setId(2000);

        Repository repository2 = new Repository();
        repository2.setName("Java");
        repository2.setId(4000);

        ArrayList <Repository> repositories = new ArrayList<>();
        repositories.add(repository);
        repositories.add(repository2);

        RepositoryAdapter adapter = new RepositoryAdapter(this, repositories);
        listaRepositorios.setAdapter(adapter);

//        try {
//            Request request = new Request.Builder()
//                    .url("https://api.github.com/users/rg3915/starred")
//                    .build();
//
//            Call call = client.newCall(request);
//            Response response = call.execute();
//
//            Log.e("result", response.body().string());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, text.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
