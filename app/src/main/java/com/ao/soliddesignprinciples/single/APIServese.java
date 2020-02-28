package com.ao.soliddesignprinciples.single;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIServese {
	// only one job
	public static String BASE_URL = " ";
	private static Retrofit retrofit;

	public APIServese() {
		//Singleton pattern
	}

	public static Retrofit getRetrofit() {
		if (retrofit == null) {

			retrofit = new Retrofit.Builder()

					//.client(okHttpClient)
					.baseUrl(BASE_URL)
					.addConverterFactory(GsonConverterFactory.create())
					.build();
		}
		return retrofit;
	}

	public static Interface getInterface() {
		return getRetrofit().create(Interface.class);
	}
}

