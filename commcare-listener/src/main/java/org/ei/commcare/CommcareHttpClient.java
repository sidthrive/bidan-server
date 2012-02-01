package org.ei.commcare;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.IOException;

public class CommcareHttpClient {
    private DefaultHttpClient httpClient;

    public CommcareHttpClient() {
        this.httpClient = new DefaultHttpClient();
    }

    public byte[] get(String url, String userName, String password) throws IOException {
        httpClient.getCredentialsProvider().setCredentials(
                new AuthScope("www.commcarehq.org", 443, "DJANGO", "digest"),
                new UsernamePasswordCredentials(userName, password));
        try {
            HttpResponse response = httpClient.execute(new HttpGet(url));
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                return IOUtils.toByteArray(entity.getContent());
            }
        } finally {
            httpClient.getConnectionManager().shutdown();
        }

        return new byte[0];
    }
}
