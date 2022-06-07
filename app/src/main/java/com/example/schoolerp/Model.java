package com.example.schoolerp;

import java.util.ArrayList;
import java.util.List;

public class Model {
    int resId;
    String title;

    Model(int resId, String title) {
        this.resId = resId;
        this.title = title;
    }

    public List<Model> getListModel() {
        List<Model> list =  new ArrayList<>();
        list.add(new Model(R.drawable.ic_quiz, "Play Quiz"));
        list.add(new Model(R.drawable.ic_assignment, "Assignment"));
        list.add(new Model(R.drawable.ic_school_holiday, "School Holiday"));
        list.add(new Model(R.drawable.ic_calendar, "Time Table"));
        list.add(new Model(R.drawable.ic_results, "Result"));
        list.add(new Model(R.drawable.ic_date_sheet, "Date Sheet"));
        list.add(new Model(R.drawable.ic_doubts, "Ask Douts"));
        list.add(new Model(R.drawable.ic_gallery, "School Gallery"));
        list.add(new Model(R.drawable.ic_leave, "Leave Application"));
        list.add(new Model(R.drawable.ic_password, "Change Password"));
        list.add(new Model(R.drawable.ic_events, "Events"));
        list.add(new Model(R.drawable.ic_logout, "Logout"));
        return list;
    }
}
