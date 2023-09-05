package com.example.data.sequencer;

public class ToDoItemIdSequencer {
    private static int currentId;
    public static int nextId()
    {
        return ++currentId;
    }
    public static int getCurrentId(){
        return currentId;

    }
    public static void setCurrentId(int currentId){
        ToDoItemIdSequencer.currentId=currentId;
    }
}
