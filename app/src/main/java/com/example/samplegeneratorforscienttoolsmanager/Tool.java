package com.example.samplegeneratorforscienttoolsmanager;

public class Tool {
    public String name;
    public Long uid;
    public String issue_date;
    public String return_date;

    public Tool(String name, Long uid, String issue_date, String return_date){
        this.name= name;
        this.uid= uid;
        this.issue_date= issue_date;
        this.return_date= return_date;
    }
}
