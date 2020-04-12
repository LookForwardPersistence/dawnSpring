package com.dawn.transation;

/**
 * Created by Dawn on 2020-04-12.
 */
public class GoodsMarks {

    private Integer id;


    private String name;

    private Integer nums;

    private Integer gid;

    private String marks;

    private Integer year;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNums() {
        return nums;
    }

    public void setNums(Integer nums) {
        this.nums = nums;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "GoodsMarks{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nums=" + nums +
                ", gid=" + gid +
                ", marks='" + marks + '\'' +
                ", year=" + year +
                '}';
    }
}
