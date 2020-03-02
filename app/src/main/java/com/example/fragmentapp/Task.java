package com.example.fragmentapp;

import java.util.Date;

public class Task {
    private String titleTugs, detailTugas, levelTugas;
    private Date deadLineTugas;

    public Task(String title, String detail, String level, Date deadline){
        this.titleTugs = title;
        this.detailTugas = detail;
        this.levelTugas = level;
        this.deadLineTugas = deadline;
    }
    public Task() {}

    public String getTitleTugs() {
        return titleTugs;
    }

    public String getDetailTugas() {
        return detailTugas;
    }

    public String getLevelTugas() {
        return levelTugas;
    }

    public Date getDeadLineTugas() {
        return deadLineTugas;
    }

    public void setTitleTugs(String titleTugs) {
        this.titleTugs = titleTugs;
    }

    public void setDetailTugas(String detailTugas) {
        this.detailTugas = detailTugas;
    }

    public void setDeadLineTugas(Date deadLineTugas) {
        this.deadLineTugas = deadLineTugas;
    }

    public void setLevelTugas(String levelTugas) {
        this.levelTugas = levelTugas;
    }
}
