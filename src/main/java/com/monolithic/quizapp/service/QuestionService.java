package com.monolithic.quizapp.service;


import com.monolithic.quizapp.Question;
import com.monolithic.quizapp.controller.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class QuestionService {

    @Autowired
    QuestionDao questionDao;

    public List<Question> getAllQuestions(){
         return questionDao.findAll();

    }


}
