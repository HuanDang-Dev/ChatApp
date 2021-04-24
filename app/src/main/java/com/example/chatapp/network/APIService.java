package com.example.chatapp.network;

import com.example.chatapp.Notifications.MyResponse;
import com.example.chatapp.Notifications.Sender;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAWzf9Jq8:APA91bGztVvBkos7YoyafuwWRd8Ep0rziEqZ6rTTHmUks-XT_M0mVen3NwMJBHRoE1G-DgWm0AisvnUXYkrbeEo5GVARP-SCljRv5WfZCXTO1AnELO2q4QF9NkXukqswCasGNFupKEr2"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);

    @POST("send")
    Call<String> sendRemoteMessage (
            @HeaderMap HashMap<String, String> headers,
            @Body String remoteBody
            );
}
