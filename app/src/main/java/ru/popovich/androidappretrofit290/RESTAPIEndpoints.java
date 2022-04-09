package ru.popovich.androidappretrofit290;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import ru.popovich.androidappretrofit290.model.Quiz;
import ru.popovich.androidappretrofit290.model.User;

public interface RESTAPIEndpoints {

    @GET("/api/v1/quiz/{id}")
    Call<Quiz> getQuizById(@Path("id") int id);

    @GET("/api/v1/user/{id}")
    Call<User> getUserById(@Path("id") int id);
}
