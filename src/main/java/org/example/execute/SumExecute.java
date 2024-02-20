package org.example.execute;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.dto.Sum;
import org.example.dto.User;
import org.example.handlers.ServerHandler;

import java.io.File;

public class SumExecute extends ServerHandler {

    @Override
    public Object execute() throws Exception {
        String filePath = "C:\\Users\\이유환\\Desktop\\개발\\백엔드핵심기술\\webflux\\Spring-Reactive-main\\part3\\ProgramersApiQuiz\\data\\input\\user.json";

        User[] users = new ObjectMapper().readValue(new File(filePath), User[].class);

        int sum = 0;
        for (User user : users) sum += user.getPostCount();

        return new Sum(sum);
    }
}
