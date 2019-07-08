package com.example.antora.splash;

/**
 * Created by Chaity on 2/12/2018.
 */

public class Questions {

    public String mQuestions[]={
            "How Humans manage complexity?",
            "Find out the following word-strictfp,transient,volatile.Identify them! ",
            " Java does not support unsigned, positive-only integer-Are you agree by these statement?",
            "00101010  ^ 00001111 = ?",
            "for(type itr-var : collection) statement-block -What is the name this for loop?",
            "How to declare reference to object?",
            "Who initializes an object immediately upon creation?",
            "Static methods can refer to this or super in any way?ARE YOU AGREE?",
            " Who allows the creation of hierarchical classifications?"

    };

    private String mChoices[][]={
            {"Encapsulation","abstraction","Inheritance","Polymorphism"},
            {"Literals","Keywords","Liberies","Data Types"},
            {"No","Yes","Nothing","All"},
            {"37","No answer","80","94"},
            {"for-each","for","for-ever","All"},
            {"Box a","Box a=new Box","Class.Box","All"},
            {"Method","Class","Object","Constructor"},
            {"No","Yes","Its works","All"},
            {"Encapsulation","abstraction","Inheritance","Polymorphism"}

    };

    private String mCorrectAnswers[]={
            "abstraction",
            "Keywords",
            "Yes",
            "37",
            "for-each",
            "Box a",
            "Constructor",
            "No",
            "Inheritance"
    };

    public String getQuestion(int a){
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a){
        String choice = mChoices[a][0];
        return choice;
    }

    public String getChoice2(int a){
        String choice = mChoices[a][1];
        return choice;
    }

    public String getChoice3(int a){
        String choice = mChoices[a][2];
        return choice;
    }

    public String getChoice4(int a){
        String choice = mChoices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswers[a];
        return answer;
    }

}
