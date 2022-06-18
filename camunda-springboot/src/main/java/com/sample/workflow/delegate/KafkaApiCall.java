package com.sample.workflow.delegate;

import com.sample.workflow.dto.PostRequestDto;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import javax.inject.Named;
import java.net.URI;


@Named
public class KafkaApiCall implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        // TODO Auto-generated method stub

        PostRequestDto postRequestDto = new PostRequestDto(11,"aa");
        RestTemplate restTemplate = new RestTemplate();

        final String baseUrl = "http://localhost:8081/testApi/get";
        URI uri = new URI(baseUrl);
        ResponseEntity<Object> result = restTemplate.getForEntity(uri,Object.class);
        System.out.println("get success response"+ result.toString());

    }

}
