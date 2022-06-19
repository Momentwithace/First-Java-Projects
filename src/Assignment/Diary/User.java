package Assignment.Diary;

import Assignment.Diary.Diary;

import java.util.ArrayList;

public class User {
    private final ArrayList<Diary> newDiary = new ArrayList<>();

    public void createDiary(Diary newNote) {
        newDiary.add(newNote);
    }

    public void viewAllDiaries() {
        for (Diary diary : newDiary) {
            System.out.println(diary);
        }
    }

    public Diary getDiary(int id) {
        for (Diary diary : newDiary) {
            if (id == diary.getId()) {
                return diary;
            }
        }
        throw new IllegalArgumentException(String.format("Diary with id %d not found", id));

    }

    public void deleteDiary(Diary diary) {
        newDiary.remove(diary);
    }

}
