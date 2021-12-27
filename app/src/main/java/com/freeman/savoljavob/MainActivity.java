package com.freeman.savoljavob;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.freeman.savoljavob.Room.AppDataBase;
import com.freeman.savoljavob.UI.QuestionFragment;
import com.freeman.savoljavob.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    AppDataBase dataBase;
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        dataBase=AppDataBase.getDataBase(getApplicationContext());
        getQuestionCount();
//        getSupportFragmentManager().beginTransaction().replace(R.id.main_container,new QuestionFragment()).commit();

    }
    void getQuestionCount(){
        Toast.makeText(getApplicationContext(),dataBase.getQuestionDao().getQuestions().size()+"",Toast.LENGTH_LONG).show();
    }
}