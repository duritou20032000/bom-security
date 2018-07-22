package com.mr.demo.web.wiremock;

import com.github.tomakehurst.wiremock.client.WireMock;
import org.apache.commons.io.FileUtils;
import org.apache.tomcat.util.buf.StringUtils;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

public class MockServer {
    public static void main(String[] args) throws IOException {
        configureFor(8062);
        removeAllMappings();

        ClassPathResource resource  =  new ClassPathResource("mock/response/01.txt");
        String content = StringUtils.join(FileUtils.readLines(resource.getFile(),"UTF-8"));
        stubFor(get(urlPathEqualTo("/order/1"))
                .willReturn(aResponse()
                .withBody(content)
                .withStatus(200)));
    }
}

