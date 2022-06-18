package com.sample.workflow.delegate;

import com.sample.workflow.dto.PostRequestDto;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import javax.inject.Named;
import java.net.URI;


@Named
public class HadoopApiCall implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        // TODO Auto-generated method stub

        int intValue = (int) delegateExecution.getVariableTyped("testVal").getValue();

        PostRequestDto postRequestDto = new PostRequestDto(11,"aa");
        RestTemplate restTemplate = new RestTemplate();

        final String baseUrl = "http://localhost:8081/testApi/post";
        URI uri = new URI(baseUrl);
        ResponseEntity<Object>  result = restTemplate.postForEntity(uri, postRequestDto, Object.class);
        System.out.println("post success response"+ result.toString());

    }

}