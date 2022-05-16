import java.util.Scanner;

public class Nokia3310 {
    static Scanner number = new Scanner(System.in);

    public static void main(String... args) {
        int userInput;
        String menu = """
                        NOKIA 3310
                        MAIN MENU
                        1: PhoneBook
                        2: Message
                        3: Chat
                        4: Call Register
                        5: Tones
                        6: Settings
                        7: Call Divert
                        8: Games
                        9: Calculator
                        10: Reminder
                        11: Clock
                        12: Profile
                        13: SIM Services
                        0: Exit
                    
                """;
        System.out.println(menu);
        userInput = number.nextInt();
        switch (userInput) {
            case 1 -> showPhonebook();
            case 2 -> showMessage();
            case 3 -> {
                print("Chat");
                print("0: Back");
                userInput = number.nextInt();
                if (userInput == 0) main();
            }
            case 4 -> showCallRegister();
            case 5 -> showTones();
            case 6 -> showSettings();
            case 7 -> {
                print("Call Divert");
                print("0: Back");
                userInput = number.nextInt();
                if (userInput == 0) main();
            }
            case 8 -> {
                print("Games");
                print("0: Back");
                userInput = number.nextInt();
                if (userInput == 0) main();
            }
            case 9 -> {
                print("Calculate");
                print("0: Back");
                userInput = number.nextInt();
                if (userInput == 0) main();
            }
            case 10 -> {
                print("Reminder");
                print("0: Back");
                userInput = number.nextInt();
                if (userInput == 0) main();
            }
            case 11 -> {
                showClock();
                print("0: Back");
                userInput = number.nextInt();
                if (userInput == 0) main();
            }
            case 12 -> {
                print("Profile");
                print("0: Back");
                userInput = number.nextInt();
                if (userInput == 0) main();
            }
            case 13 -> {
                print("Sim Service");
                print("0: Back");
                userInput = number.nextInt();
                if (userInput == 0) main();
            }
            case 0 -> System.exit(0);
            default -> print("Wrong Input");

        }


    }
    private static void showClock() {
        String clock = """
                1: Alarm Clock
                2: Clock Settings
                3: Date Settings
                4: Stopwatch
                5: Countdown Timer
                6: Auto Update of Date and Time
                0: Back
                                
                """;
        print(clock);
        int userInput = number.nextInt();
        switch (userInput) {
            case 1 -> {
                print("Alarm Clock");
                print("0: Back");
                userInput = number.nextInt();
                if (userInput == 0) showClock();
            }
            case 2 -> {
                print("Clock settings");
                print("0: Back");
                userInput = number.nextInt();
                if (userInput == 0) showClock();
            }
            case 3 -> {
                print("Date Settings");
                print("0: Back");
                userInput = number.nextInt();
                if (userInput == 0) showClock();
            }
            case 4 -> {
                print("Stopwatch");
                print("0: Back");
                userInput = number.nextInt();
                if (userInput == 0) showClock();
            }
            case 5 -> {
                print("Countdown Timer");
                print("0: Back");
                userInput = number.nextInt();
                if (userInput == 0) showClock();
            }
            case 6 -> {
                print("Auto Update of Date and Time");
                print("0: Back");
                userInput = number.nextInt();
                if (userInput == 0) showClock();
            }
            case 0 -> main();
            default -> print("Wrong Input");
        }
    }
    private static void showSettings() {
        String settings = """
                1: Call Settings
                2: Phone Settings
                3: Security Settings
                4: Restore Factory Settings
                0: Back
                """;
        print(settings);
        int userInput = number.nextInt();
        switch (userInput) {
            case 1 -> {
                showCallRegister();
                print("0: Back");
                userInput = number.nextInt();
                if (userInput == 0) showSettings();
            }
            case 2 -> {
                showPhoneSettings();
                print("0: Back");
                userInput = number.nextInt();
                if (userInput == 0) showSettings();
            }
            case 3 -> {
                showSecuritySettings();
                print("0: Back");
                userInput = number.nextInt();
                if (userInput == 0) showSettings();
            }
            case 4 -> {
                print("Restore Factory Settings");
                print("0: Back");
                userInput = number.nextInt();
                if (userInput == 0) showSettings();
            }
            case 0 -> main();
            default -> print("Wrong Input");
        }
    }
    private static void showSecuritySettings() {
        String main = """
                1: PIN Code Request
                2: Call Barring Service
                3: Fixed Dialling
                4: Closed User Group
                5: Phone Security
                6: Change Access Code
                0: Back
                """;
        print(main);
        int userInput = number.nextInt();
        switch (userInput) {
            case 1 -> {
                print("PIN Code Request");
                print("0: Back");
                userInput = number.nextInt();
                if (userInput == 0) showSecuritySettings();
            }
            case 2 -> {
                print("Call Barring Service");
                print("0: Back");
                userInput = number.nextInt();
                if (userInput == 0) showSecuritySettings();
            }
            case 3 -> {
                print("Fixed Dialling");
                print("0: Back");
                userInput = number.nextInt();
                if (userInput == 0) showSecuritySettings();
            }
            case 4 -> {
                print("Closed User Group");
                print("0: Back");
                userInput = number.nextInt();
                if (userInput == 0) showSecuritySettings();
            }
            case 5 -> {
                print("Phone Security");
                print("0: Back");
                userInput = number.nextInt();
                if (userInput == 0) showSecuritySettings();
            }
            case 6 -> {
                print("Change Access Code");
                print("0: Back");
                userInput = number.nextInt();
                if (userInput == 0) showSecuritySettings();
            }
            case 0 -> main();
            default -> print("Wrong Input");
        }
    }
    private static void showPhoneSettings() {
        String phoneSetting = """
                1: Language
                2: Cell Info Display
                3: welcome Note
                4: Network selection
                5: Lights
                6: Confirm Sim Service Actions
                0: Back
                """;
        print(phoneSetting);
        int userInput = number.nextInt();
        switch (userInput) {
            case 1 -> {
                print("Language");
                print("0: Back");
                userInput = number.nextInt();
                if (userInput == 0) showPhoneSettings();
            }
            case 2 -> {
                print("Cell Info");
                print("0: Back");
                userInput = number.nextInt();
                if (userInput == 0) showPhoneSettings();
            }
            case 3 -> {
                print("Welcome Note");
                print("0: Back");
                userInput = number.nextInt();
                if (userInput == 0) showPhoneSettings();
            }
            case 4 -> {
                print("Network selection");
                print("0: Back");
                userInput = number.nextInt();
                if (userInput == 0) showPhoneSettings();
            }
            case 5 -> {
                print("Lights");
                print("0: Back");
                userInput = number.nextInt();
                if (userInput == 0) showPhoneSettings();
            }
            case 6 -> {
                print("Confirm Sim Service Action");
                print("0: Back");
                userInput = number.nextInt();
                if (userInput == 0) showPhoneSettings();
            }
            case 0 -> main();
            default -> print("Wrong Input");
        }
    }
    private static void showTones() {
        String tones = """
                1: Ringing Tone
                2: Ringing Volume
                3: Incoming Call Alert
                4: Composer
                5: Message Alert Tone
                6: Keypad Tones
                7: Warning and Game Tones
                8: Vibrating Alert
                9: Screen Saver
                0: Back
                """;
        print(tones);
        int userInput = number.nextInt();
        switch (userInput) {
            case 1 -> {
                print("Ringing Tone");
                print("0: Back");
                userInput = number.nextInt();
                if (userInput == 0) showTones();
            }
            case 2 -> {
                print("Ringing Volume");
                print("0: Back");
                userInput = number.nextInt();
                if (userInput == 0) showTones();
            }
            case 3 -> {
                print("Incoming Call Alert");
                print("0: Back");
                userInput = number.nextInt();
                if (userInput == 0) showTones();
            }
            case 4 -> {
                print("Composer");
                print("0: Back");
                userInput = number.nextInt();
                if (userInput == 0) showTones();
            }
            case 5 -> {
                print("Message Alert Tone");
                print("0: Back");
                userInput = number.nextInt();
                if (userInput == 0) showTones();
            }
            case 6 -> {
                print("Keypad Tones");
                print("0: Back");
                userInput = number.nextInt();
                if (userInput == 0) showTones();
            }
            case 7 -> {
                print("Warning and Game Tones");
                print("0: Back");
                userInput = number.nextInt();
                if (userInput == 0) showTones();
            }
            case 8 -> {
                print("Vibrating Alert");
                print("0: Back");
                userInput = number.nextInt();
                if (userInput == 0) showTones();
            }
            case 9 -> {
                print("Screen Saver");
                print("0: Back");
                userInput = number.nextInt();
                if (userInput == 0) showTones();
            }
            case 0 -> main();
            default -> print("Wrong Input");

        }

    }
    private static void showCallRegister() {
        String callRegisterMenu = """
                1: Missed calls
                2: Received calls
                3: Dialled Numbers
                4: Erase Recent Call List
                5: Show Call Duration
                6: Show Call Cost
                7: Call Cost Settings
                8: Prepaid Credit
                0: Back
                """;
        System.out.println(callRegisterMenu);
        int userInput = number.nextInt();
        switch (userInput) {
            case 1 -> {
                print("Missed calls");
                print("0: Back");
                userInput = number.nextInt();
                if (userInput == 0) showCallRegister();
            }
            case 2 -> {
                print("Received calls");
                print("0: Back");
                userInput = number.nextInt();
                if (userInput == 0) showCallRegister();
            }
            case 3 -> {
                print("Dialled Number");
                print("0: Back");
                userInput = number.nextInt();
                if (userInput == 0) showCallRegister();
            }
            case 4 -> {
                print("Erase Recent Call");
                print("0: Back");
                userInput = number.nextInt();
                if (userInput == 0) showCallRegister();
            }
            case 5 -> showCallDuration();

            case 6 -> showCallCost();

            case 7 -> showCallCostSettings();

            case 8 -> {
                print("Prepaid Credit");
                print("0: Back");
                userInput = number.nextInt();
                if (userInput == 0) showCallRegister();
            }
            case 0 -> showCallRegister();
            default -> print("Wrong Input");
        }
    }
    private static void showCallCostSettings() {
        String callCostSetting = """
                1 -> Call Cost Limit
                2 -> Show Cost In
                0 -> Back
                """;
        print(callCostSetting);
        int userInput = number.nextInt();
        switch (userInput){
            case 1 -> print("Call Cost Limit");
            case 2 -> print("Show Cost In");
            case 0 -> showCallRegister();

        }
    }
    private static void showCallCost() {
        String callCost = """
                1 -> Last Call Cost
                2 -> All Call's Cost
                3 -> Clear Counters
                4 -> Back
                """;
        print(callCost);
        int userInput = number.nextInt();
        switch (userInput){
            case 1 -> print("Last Call Cost");
            case 2 -> print("All Call's Cost");
            case 3 -> print("Clear Counter");
            case 4 -> showCallRegister();
        }
    }
    private static void showCallDuration() {
        String callDuration = """
                1 -> Last Call Duration
                2 -> All Call's Duration
                3 -> Received Call's Duration
                4 -> Dialled Call's Duration
                5 -> Clear Timers
                0 -> Back
                """;
        print(callDuration);
        int userInput = number.nextInt();
        switch (userInput) {
            case 1 -> print("Last Call Duration");
            case 2 -> print("All Call's Duration");
            case 3 -> print("Received Call's Duration");
            case 4 -> print("Dialled Call's Duration");
            case 5 -> print("Clear Timers");
            case 6 -> main();
            default -> print("Wrong Input");
        }

    }
    private static void print(String message){
        System.out.println(message);
    }
    private static void showMessage() {
        String messageMenu = """
                1: Write Message
                2: Inbox
                3: Outbox
                4: Picture Message
                5: Template
                6: Smileys
                7: Message Settings
                8: Info Service
                9: Voice mailbox number
                10: Service command editor
                0. Back
                 
                """;
        System.out.println(messageMenu);
        int userInput = number.nextInt();
        switch (userInput){
            case 1 -> {
                print("Write message");
                print("0: Back");
                userInput = number.nextInt();
                if(userInput == 0)showMessage();
            }
            case 2 -> {
                print("Inbox");
                print("0: Back");
                userInput = number.nextInt();
                if(userInput == 0)showMessage();
            }
            case 3 -> {
                print("Outbox");
                print("0: Back");
                userInput = number.nextInt();
                if(userInput == 0)showMessage();
            }
            case 4 -> {
                print("Picture Message");
                print("0: Back");
                userInput = number.nextInt();
                if(userInput == 0)showMessage();
            }
            case 5 -> {
                print("Template");
                print("0: Back");
                userInput = number.nextInt();
                if(userInput == 0)showMessage();
            }
            case 6 -> {
                print("Smiley");
                print("0: Back");
                userInput = number.nextInt();
                if(userInput == 0)showMessage();
            }
            case 7 -> showMessageSettingsMenu();
            case 8 -> {
                print("Info Service");
                print("0: Back");
                userInput = number.nextInt();
                if(userInput == 0)showMessage();
            }
            case 9 -> {
                print("Voice Mailbox Number");
                print("0: Back");
                userInput = number.nextInt();
                if(userInput == 0)showMessage();
            }
            case 10 -> {
                print("Service Command Editor");
                print("0: Back");
                userInput = number.nextInt();
                if(userInput == 0)showMessage();
            }
            case 0 -> main();
            default ->  print("Wrong Input");
        }
    }
    private static void showMessageSettingsMenu() {
        String messageSettingsMenu = """
                1: Set 1
                2: Common
                0: Back
                """;
        print(messageSettingsMenu);
        int userInput = number.nextInt();
        switch (userInput){
            case 1 -> showSet1Menu();
            case 2 -> showCommonMenu();
            case 0 -> showMessage();
        }
    }
    private static void showCommonMenu() {
        String commonMenu = """
                1: Delivery Report
                2: Reply Via SIM Center
                3: Character Support
                0: Back
                """;
        print(commonMenu);
        int userInput = number.nextInt();
        switch (userInput){
            case 1 -> {
                print("Delivery Report");
                print("0: Back");
                userInput = number.nextInt();
                if(userInput == 0)showCommonMenu();
            }
            case 2 -> {
                print("Reply Via SIM Center");
                print("0: Back");
                userInput = number.nextInt();
                if(userInput == 0)showCommonMenu();
            }
            case 3 -> {
                print("Character Support");
                print("0: Back");
                userInput = number.nextInt();
                if(userInput == 0)showCommonMenu();
            }
            case 0 -> showMessageSettingsMenu();
        }
    }
    private static void showSet1Menu() {
        String set1Menu = """
                1: Message Center Number
                2: Message Send As
                3: Message Validity
                0: Back
                """;
        print(set1Menu);
        int userInput = number.nextInt();
        switch (userInput){
            case 1 -> {
                print("Message Center Number");
                print("0: Back");
                userInput = number.nextInt();
                if(userInput == 0)showSet1Menu();
            }
            case 2 -> {
                print("Message Send As");
                print("0: Back");
                userInput = number.nextInt();
                if(userInput == 0)showSet1Menu();
            }
            case 3 -> {
                print("Message Validity");
                print("0: Back");
                userInput = number.nextInt();
                if(userInput == 0)showSet1Menu();
            }
            case 0 -> showMessageSettingsMenu();
        }
    }
    private static void showPhonebook(){
        String phonebookMenu = """
                    1: Search
                    2: Service Nos
                    3: Add Name
                    4: Erase
                    5: Edit
                    6: Assign Tone
                    7: Send B'card
                    8: Options
                    9: Speed dial
                    10: Voice tags
                    0: Back
                    """;
        System.out.println(phonebookMenu);
        int userInput = number.nextInt();
        switch (userInput){
            case 1 -> {
                print("Search");
                print("0: Back");
                userInput = number.nextInt();
                if(userInput == 0)showPhonebook();
            }

            case 2 -> {
                print("Service Nos");
                print("0: Back");
                userInput = number.nextInt();
                if(userInput == 0)showPhonebook();
            }
            case 3 -> {
                print("Add Name");
                print("0: Back");
                userInput = number.nextInt();
                if(userInput == 0)showPhonebook();
            }
            case 4 -> {
                print("Erase");
                print("0: Back");
                userInput = number.nextInt();
                if(userInput == 0)showPhonebook();
            }
            case 5 -> {
                print("Edit");
                print("0: Back");
                userInput = number.nextInt();
                if(userInput == 0)showPhonebook();
            }
            case 6 -> {
                print("Assign Tone");
                print("0: Back");
                userInput = number.nextInt();
                if(userInput == 0)showPhonebook();
            }
            case 7 -> {
                print("Send B'card");
                print("0: Back");
                userInput = number.nextInt();
                if(userInput == 0)showPhonebook();
            }
            case 8 -> {
                showOptionMenu();
                print("0: Back");
                userInput = number.nextInt();
                if(userInput == 0)showPhonebook();
            }
            case 9 -> {
                print("Speed Dial");
                print("0: Back");
                userInput = number.nextInt();
                if(userInput == 0)showPhonebook();
            }
            case 10 -> {
                print("Voice tags");
                print("0: Back");
                userInput = number.nextInt();
                if(userInput == 0)showPhonebook();
            }
            case 0 -> main();
            default ->print("Wrong Input");


        }

    }
    private static void showOptionMenu() {
        String optionMenu = """
                1: Type of view
                2: Memory Status
                0: Back
                """;
        print(optionMenu);
        int userInput = number.nextInt();
        switch (userInput){
            case 1 -> {
                print("Type of View");
                print("0: Back");
                userInput = number.nextInt();
                if(userInput == 0)showOptionMenu();
            }
            case 2 -> {
                print("Memory Status");
                print("0: Back");
                userInput = number.nextInt();
                if(userInput == 0)showOptionMenu();
            }
            case 0 -> main();
        }
    }
}
