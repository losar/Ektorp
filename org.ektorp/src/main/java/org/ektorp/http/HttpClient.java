package org.ektorp.http;

import java.io.*;
import java.util.Map;


public interface HttpClient {

	HttpResponse get(String uri);

	HttpResponse put(String uri, String content);

	HttpResponse put(String uri);

	HttpResponse put(String uri, InputStream data, String contentType,
			long contentLength);

	HttpResponse post(String uri, String content);
	
	HttpResponse post(String uri, InputStream content);

	HttpResponse delete(String uri);
	
	HttpResponse head(String uri);
	
	HttpResponse copy(String uri);
	
	HttpResponse copy(String uri, Map<String, String> headers);
	
	HttpResponse getUncached(String uri);
	
	HttpResponse postUncached(String uri, String content);

	void shutdown();

}
