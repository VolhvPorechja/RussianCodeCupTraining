package org.volhvporechja.adv.rcc2016;

/**
 * Created by VolhvPorechja on 02.03.2017.
 */
public class ServerConfiguration {
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        if(!uri.endsWith("/"))
            uri += "/";
        this.uri = uri;
    }

    private String uri;

    @Override
    public String toString() {
        return "ServerConfiguration{" +
                "uri='" + uri + '\'' +
                '}';
    }
}
