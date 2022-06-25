package com.harshamangena.quizzer.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Results")
public class Result {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer resultId;
    private String userName;
    private int correctAnswer;
}
