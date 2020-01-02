package com.example.samplegeneratorforscienttoolsmanager;

import java.util.List;

public class ClubProfile {

    public String name;
    public List<Tool> tools_history;

    public ClubProfile() {

    }

    public ClubProfile(String Name, List<Tool> tools_history) {
        this.name= Name;
        this.tools_history= tools_history;
    }

    public String getname() {
        return name;
    }

    public List<Tool> getTools_history() {return tools_history;}
}
