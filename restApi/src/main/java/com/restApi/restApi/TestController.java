package com.restApi.restApi;


import com.restApi.restApi.dto.PostRequestDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/testApi")
public class TestController {

    @GetMapping(path="/get", produces = "application/json")
    public  ResponseEntity<Object> kafkaApicall() {
        return new ResponseEntity<>(new PostRequestDto(11,"aa",""), HttpStatus.OK);
    }

    @PostMapping(path= "/post", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> hadoopAPiCall(@RequestBody PostRequestDto postRequestDto){
        return new ResponseEntity<>(postRequestDto, HttpStatus.OK);
    }

    @PostMapping(path= "/aws", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> awsApiCall(@RequestBody PostRequestDto postRequestDto){
        return new ResponseEntity<>(postRequestDto, HttpStatus.OK);
    }

}
