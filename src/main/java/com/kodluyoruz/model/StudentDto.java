package com.kodluyoruz.model;

public class StudentDto {
    private long id;
    private String name;
    private int no;
    private long yas;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getYas() {
        return yas;
    }

    public void setYas(long yas) {
        this.yas = yas;
    }
}
