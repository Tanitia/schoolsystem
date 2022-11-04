package com.example.schoolsystem;

import java.util.ArrayList;
import java.util.List;

public class Mocker {
    //username, password, role
    List<List<String>> users;
    //messageid, messagecontent, messageType, sender, recipient
    List<List<String>> messages;
    //classid, code, username
    List<List<String>> classes;
    //classid, studentID
    List<List<String>> attendances;
    //studentID, studentName, parentUsername
    List<List<String>> students;
    public Mocker (){
        this.users = new ArrayList<List<String>>();
        this.messages = new ArrayList<List<String>>();
        this.classes = new ArrayList<List<String>>();
        this.attendances = new ArrayList<List<String>>();
        this.students = new ArrayList<List<String>>();
        List<String> user = new ArrayList<String>();
        user.add("Teacher1");
        user.add("Password1");
        user.add("Teacher");
        this.users.add(user);
        user = new ArrayList<String>();
        user.add("Teacher2");
        user.add("Password2");
        user.add("Teacher");
        this.users.add(user);
        user = new ArrayList<String>();
        user.add("Parent1");
        user.add("Password1");
        user.add("Parent");
        this.users.add(user);
        user = new ArrayList<String>();
        user.add("Parent2");
        user.add("Password2");
        user.add("Parent");
        this.users.add(user);

        List<String> currentClass = new ArrayList<String>();
        currentClass.add("1");
        currentClass.add("CODE1");
        this.classes.add(currentClass);
        currentClass = new ArrayList<String>();
        currentClass.add("2");
        currentClass.add("CODE2");
        this.classes.add(currentClass);

        List<String> attendance = new ArrayList<String>();
        attendance.add("1");
        attendance.add("Teacher1");
        this.attendances.add(attendance);
        attendance = new ArrayList<String>();
        attendance.add("2");
        attendance.add("Teacher2");
        this.attendances.add(attendance);

        List<String> student = new ArrayList<String>();
        student.add("1");
        student.add("StudentName1");
        student.add("Parent1");
        this.students.add(student);
        student = new ArrayList<String>();
        student.add("2");
        student.add("StudentName2");
        student.add("Parent2");
        this.students.add(student);
        }
         void addStudents(String studentName, String parentName){
            List<String> student = new ArrayList<String>();
            int id = Integer.parseInt(this.students.get(this.students.size()-1).get(0))+1;
            student.add(String.valueOf(id));
            student.add(studentName);
            student.add(parentName);
            this.students.add(student);
        }
        //messageid, messagecontent, messageType, sender, recipient
        void addMessages(String messageContent, String messageType, String sender, String recipient){
            List<String> message = new ArrayList<String>();
            int id = 0;
            if (this.messages.size() != 0){
                id = Integer.parseInt(this.messages.get(this.messages.size()-1).get(0))+1;
            }
            message.add(String.valueOf(id));
            message.add(messageContent);
            message.add(messageType);
            message.add(sender);
            message.add(recipient);
            this.messages.add(message);

        }
        //classid, code, username
        void addClasses(String code, String username){
            List<String> currentClass = new ArrayList<String>();
            int id = 0;
            if (this.classes.size() != 0){
                id = Integer.parseInt(this.classes.get(this.classes.size()-1).get(0))+1;
            }
            currentClass.add(String.valueOf(id));
            currentClass.add(code);
            currentClass.add(username);
            this.classes.add(currentClass);
        }
        //classid, studentID
        void addAttendances(String classID, String studentID){
            List<String> attendance = new ArrayList<String>();
            attendance.add(classID);
            attendance.add(studentID);
            this.attendances.add(attendance);
        }
        List<String> readUsers(String username) {
        for (int i=0;i<users.size();i++){
            if (users.get(i).get(0).equals(username)){
                return users.get(i);
            }
        }
        List<String> a = new ArrayList<String>();
        return a;
    }
    List<String> readMessages(String messageID) {
        for (int i=0;i<messages.size();i++){
            if (messages.get(i).get(0).equals(messageID)){
                return messages.get(i);
            }
        }
        List<String> a = new ArrayList<String>();
        return a;
    }
    List<String> readClasses(String classID) {
        for (int i=0;i<classes.size();i++){
            if (classes.get(i).get(0).equals(classID)){
                return classes.get(i);
            }
        }
        List<String> a = new ArrayList<String>();
        return a;
    }
    List<String> readAttendances(String classID, String studentID) {
        for (int i=0;i<attendances.size();i++){
            if (attendances.get(i).get(0).equals(classID) && (attendances.get(i).get(0).equals(studentID))){
                return attendances.get(i);
            }
        }
        List<String> a = new ArrayList<String>();
        return a;
    }
    List<String> readStudents(String studentID) {
        for (int i=0;i<students.size();i++){
            if (students.get(i).get(0).equals(studentID)){
                return students.get(i);
            }
        }
        List<String> a = new ArrayList<String>();
        return a;
    }
    void deleteUsers(String username){
        for (int i=0;i<users.size();i++){
            if (users.get(i).get(0).equals(username)) {
                users.remove(i);
            }
        }
    }
    void deleteMessages(String messageID){
        for (int i=0;i<messages.size();i++){
            if (messages.get(i).get(0).equals(messageID)){
                messages.remove(i);
            }
        }
    }
    void deleteClasses (String classID) {
        for (int i=0;i<classes.size();i++){
            if (classes.get(i).get(0).equals(classID)){
                classes.remove(i);
            }
    }
    }
    void deleteAttendances (String classID, String studentID) {
        for (int i=0;i<attendances.size();i++){
            if (attendances.get(i).get(0).equals(classID) && (attendances.get(i).get(0).equals(studentID))){
                attendances.remove(i);
            }
    }
    }
    void deleteStudents (String studentID){
        for (int i=0;i<students.size();i++) {
            if (students.get(i).get(0).equals(studentID)) {
                students.remove(i);
            }
        }
    }
    }

