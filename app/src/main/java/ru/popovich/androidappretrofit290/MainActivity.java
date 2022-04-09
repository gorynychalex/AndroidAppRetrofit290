package ru.popovich.androidappretrofit290;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import ru.popovich.androidappretrofit290.model.Quiz;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView =
                findViewById(R.id.textView);

        NetworkService.getInstance()
                .getAPI().getQuizById(1)
                .enqueue(new Callback<Quiz>() {
                    @Override
                    public void onResponse(Call<Quiz> call, Response<Quiz> response) {

                        textView.setText(response.body().getName());

                        Log.d("MainActivity",
                                "Test name: " + response.body().getName());
                    }

                    @Override
                    public void onFailure(Call<Quiz> call, Throwable t) {

                    }
                });
    }
}