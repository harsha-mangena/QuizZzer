package com.harshamangena.quizzer.Entity;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Quiz {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer quizId;

    private List<Question> questionList;

}
