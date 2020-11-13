package com.jeng.design.pattern.behavioral.observer;

import com.jeng.design.pattern.behavioral.observer.observable.AsyncTimetable;
import com.jeng.design.pattern.behavioral.observer.observer.Student;
import com.jeng.design.pattern.behavioral.observer.observer.Teacher;

public class Client {

    public static void main(String[] args) {
        AsyncObservable timetable = new AsyncTimetable("2019年时间表");

        timetable.registerObserver(new Teacher());
        timetable.registerObserver(new Student());

        timetable.changeStateAndNotify("2020年时间表");
    }
}
