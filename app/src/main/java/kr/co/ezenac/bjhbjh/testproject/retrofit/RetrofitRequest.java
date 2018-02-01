package kr.co.ezenac.bjhbjh.testproject.retrofit;

import kr.co.ezenac.bjhbjh.testproject.model.Room;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Administrator on 2018-02-01.
 */

public interface RetrofitRequest {
    @GET("*")
    Call<Room> getJson();
}
