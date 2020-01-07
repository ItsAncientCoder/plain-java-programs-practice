package com.plain.java.programs;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws IOException {

		Food food = new Food();
		food.setName("sadya");
		food.setPrice("amogam");

		String payload = "{" + "\"name\": \"admin\", " + "\"price\": \"System\"}";

		StringEntity entity = new StringEntity(payload, ContentType.APPLICATION_JSON);
		HttpClient httpClient = HttpClientBuilder.create().build();
		HttpPost request = new HttpPost("http://localhost:8080/ppost");
		request.setEntity(entity);
		HttpResponse response = httpClient.execute(request);
		System.out.println(response.getStatusLine().getStatusCode());
		// System.out.println(response.toString());
		System.out.println(response.getEntity().getContent().toString());
		System.out.println("bandham");
		System.out.println("revert");
		System.out.println("arun");
		System.out.println("bandha,");
	}

	public void someMethod() throws URISyntaxException {
		String body = "";
		URI completeUrl = new URI("https://google.com");
		HttpClient httpClient = new DefaultHttpClient();
		HttpPost httpPost = new HttpPost(completeUrl);
		httpPost.setHeader("Content-type", "application/json");
		try {
			StringEntity stringEntity = new StringEntity(body);
			httpPost.getRequestLine();
			httpPost.setEntity(stringEntity);

			httpClient.execute(httpPost);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
