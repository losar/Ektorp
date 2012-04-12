package org.ektorp.http;

import java.net.URI;

import org.apache.http.client.methods.HttpRequestBase;

public final class HttpCopy extends HttpRequestBase {

    public HttpCopy(final String uri) {
        super();
        setURI(URI.create(uri));
    }

	@Override
	public String getMethod() {
		return "COPY";
	}

}
