package com.example.sagoo.students.Model;

import android.provider.ContactsContract;

/**
 * Created by sagoo on 2/3/2018.
 */

public class DataModel {

    public String name,age;

    public DataModel(){}
    public DataModel(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }


}
