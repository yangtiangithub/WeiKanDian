package me.anany.weikandian.retrofit;

import me.anany.weikandian.model.HomeNewsData;
import retrofit.http.GET;
import retrofit.http.Query;
import rx.Observable;

/**
 * 数据接口
 * Created by Berial on 16/1/6.
 */
public interface ApiService {

    String BASE_URL = "http://www.weixinkd.com/";

    /**
     * 首页 【新闻列表数据】
     */
    @GET("v3/article/lists2.json")
    Observable<HomeNewsData> getHomeNewsData(
            @Query("access") String access,
            @Query("app_version") String app_version,
            @Query("catid") String catid,
            @Query("channel") String channel,
            @Query("device_model") String device_model,
            @Query("iid") String iid,
            @Query("openuidi") String openuidi,
            @Query("os_api") String os_api,
            @Query("os_version") String os_version,
            @Query("phone_sim") String phone_sim,
            @Query("request_time") String request_time,
            @Query("uid") String uid,
            @Query("uuid") String uuid,
            @Query("version_code") String version_code,
            @Query("sign") String sign
    );
}