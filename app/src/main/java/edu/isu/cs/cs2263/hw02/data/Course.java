package edu.isu.cs.cs2263.hw02.data;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;

import java.util.logging.LogManager;
import java.util.logging.Logger;

@Getter @Setter @Log4j2
public class Course {

    public static final String[] CODES = { "CS", "CHEM", "PHYS", "MATH", "BTNY", "ZOO" };
    public static final String[] DEPTS = { "Computer Science", "Chemistry", "Physics", "Mathematics", "Botany", "Zoology" };

   private int number;
    private String name;
   private int credits;
    private String code;

    public Course() {}

    /**
     * @param name Name of Course
     * @param code Course Code
     * @param number Course number
     * @param credits course credit amounts
     */
    public Course(String name, String code, int number, int credits) {
        this.name = name;
        this.code = code;
        this.number = number;
        this.credits = credits;

    }
//
//    public int getNumber() {
//        return number;
//    }
//
//    public void setNumber(int number) {
//        this.number = number;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getCredits() {
//        return credits;
//    }
//
//    public void setCredits(int credits) {
//        this.credits = credits;
//    }
//
//    public String getCode() {
//        return code;
//    }
//
//    public void setCode(String code) {
//        this.code = code;
//    }

    @Override
    public String toString() {


        return String.format("%s %d %s (%d)", code, number, name, credits);
    }
}
