package com.eaglet.unigo.Store;

public class Questions_Store {

    private boolean check;
    private String question;

    public Questions_Store()
    {

    }

    public Questions_Store(boolean b,String s)
    {

        this.check=b;
        this.question=s;
    }
    public boolean getCheck() {
        return check;
    }

    public String getQuestion() {
        return question;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
