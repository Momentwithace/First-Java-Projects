package Diary;

import java.util.Scanner;

public class DiaryApplicationMain {
    private static final User user = new User();

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int sentinel = 1;
        while (sentinel != -1){
            String menu = """
                        ACE DIARY APPLICATION
                              MAIN MENU
                     
                              
                        1: Create Diary
                        2: View All Diary
                        3: Edit Diary
                        4: Delete Diary
                        5: LogIn to diary
                        0: Exit
                    
                """;
            System.out.println(menu);
            int userInput = input.nextInt();
            switch (userInput){
                case 1 -> createDiary();
                case 2 -> viewAllDiaries();
                case 3 -> editDiary();
                case 4 -> deleteDiary();
                case 5 -> login();
                case 0 -> sentinel = -1;
            }
        }

    }

    private static void login() {

        System.out.println("""
                1 -> Add Entry
                2 -> View An Entry
                3 -> Edit Entry
                4 -> View All Entries
                5 -> Delete Entry
                """);
       int userInput = input.nextInt();
        switch (userInput){
            case 1 -> addEntry();
            case 2 -> viewAnEntry();
            case 3 -> editEntry();
            case 4 -> viewAllEntries();
            case 5 -> deleteEntry();
        }


    }

    private static void editEntry() {
        System.out.println("Enter Diary ID: ");
        int id = input.nextInt();
        Diary diary = user.getDiary(id);
        System.out.println("Enter Entry ID: ");
        int entryId = input.nextInt();
        Entry entry = diary.getEntry(entryId);
        System.out.println("Enter new title: ");
        input.nextLine();
        String newTitle = input.nextLine();
        entry.setTitle(newTitle);
        System.out.println("Type new body: ");
        String newBody = input.nextLine();
        entry.setBody(newBody);

    }

    private static void viewAllEntries() {
        System.out.println("Enter Diary ID: ");
        int id = input.nextInt();
        Diary diary = user.getDiary(id);
        diary.getAllEntries();
    }

    private static void deleteEntry() {
        System.out.println("Enter Diary ID: ");
        int id = input.nextInt();
        Diary diary = user.getDiary(id);
        System.out.println("Enter Entry ID: ");
        int entryId = input.nextInt();
        Entry entry = diary.getEntry(entryId);
        diary.deleteEntry(entry);


    }

    private static void viewAnEntry() {
        System.out.println("Enter Diary ID: ");
        int id = input.nextInt();
        Diary diary = user.getDiary(id);
        diary.getAllEntries();

    }

    private static void addEntry() {
        System.out.print("Enter Diary Id: ");
        int diaryId = input.nextInt();

        System.out.println("Enter title: ");
        input.nextLine();
        String title= input.nextLine();

        System.out.println("Type body: ");
        String body= input.nextLine();


        Entry entry = new Entry(title,body);

        Diary diary = user.getDiary(diaryId);
        diary.addEntry(entry);
        System.out.println("entry created successfully");
    }

    private static void deleteDiary() {
        System.out.println("Enter Diary ID: ");
        int id = input.nextInt();
        Diary diary = user.getDiary(id);
        user.deleteDiary(diary);

    }

    private static void editDiary() {
        System.out.println("Enter Diary ID: ");
        int id = input.nextInt();
        Diary diary = user.getDiary(id);
        System.out.println("Enter new name for yor diary: ");
        input.nextLine();
        String newName = input.nextLine();
        diary.setName(newName);

    }

    private static void viewAllDiaries() {
       user.viewAllDiaries();
        System.out.println();
        System.out.println();
    }

    private static void createDiary() {
        System.out.println("Enter Diary Name: ");
        input.nextLine();
        String name = input.nextLine();
        Diary diary = new Diary(name);
        user.createDiary(diary);
        System.out.println("Diary Successfully Created");
        
    }


}
