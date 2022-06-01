import java.util.Scanner;

public class NokiaPhone {
    public static void main(String[] args) {
        mainMenu();


        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        switch (number) {
            case 1:

                PhonebookMenu();

                number = input.nextInt();
                switch (number) {
                    case 1: {
                        System.out.println("Search");
                        System.out.println("0: Back");
                        number = input.nextInt();
                        if (number == 1) PhonebookMenu();
                    }
                    break;
                    case 2: {
                        System.out.println("Service Nos");
                        System.out.println("1: Back");
                        number = input.nextInt();
                        switch (number) {
                            case 1:
                                PhonebookMenu();
                                break;
                        }

                    }
                    break;
                    case 3:
                        System.out.println("Add Name");
                        System.out.println("1: Back");
                        number = input.nextInt();
                        switch (number) {
                            case 1:
                                PhonebookMenu();
                                break;
                        }
                        break;
                    case 4:
                        System.out.println("Erase");
                        System.out.println("1: Back");
                        number = input.nextInt();
                        switch (number) {
                            case 1:
                                PhonebookMenu();
                                break;
                        }
                        break;
                    case 5:
                        System.out.println("Edit");
                        System.out.println("1: Back");
                        number = input.nextInt();
                        switch (number) {
                            case 1:
                                PhonebookMenu();
                                break;
                        }
                        break;
                    case 6:
                        System.out.println("Assign Tone");
                        System.out.println("1: Back");
                        number = input.nextInt();
                        switch (number) {
                            case 1:
                                PhonebookMenu();
                                break;
                        }
                        break;
                    case 7:
                        System.out.println("Send b'card");
                        System.out.println("1: Back");
                        number = input.nextInt();
                        switch (number) {
                            case 1:
                                PhonebookMenu();
                                break;
                        }
                        break;
                    case 8:
                        optionsMenu();

                        number = input.nextInt();
                        switch (number) {
                            case 1:
                                System.out.println("Type of View");
                                System.out.println("1: Back");
                                number = input.nextInt();
                                switch (number) {
                                    case 1:
                                        optionsMenu();
                                        break;
                                }
                                break;
                            case 2:
                                System.out.println("Memory Status");
                                System.out.println("1: Back");
                                number = input.nextInt();
                                switch (number) {
                                    case 1:
                                        optionsMenu();
                                        break;
                                }
                                break;
                            case 3:
                                PhonebookMenu();
                                break;
                        }

                        break;
                    case 9:
                        System.out.println("Speed dials");
                        System.out.println("1: Back");
                        number = input.nextInt();
                        switch (number) {
                            case 1:
                                PhonebookMenu();
                                break;
                        }
                        break;
                    case 10:{
                        System.out.println("Voice tags");
                        System.out.println("1: Back");
                        number = input.nextInt();
                        switch (number) {
                            case 1:
                                PhonebookMenu();
                                //break;
                            }
                        }
                        //break;
                    case 11:
                        mainMenu();
                       // number = input.nextInt();
                       // if(number == 11)PhonebookMenu();
                        //break;

                }
                break;
            case 2:
                Message();


                number = input.nextInt();
                switch (number) {
                    case 1:
                        System.out.println("Write Message");
                        System.out.println("1: Back");
                        number = input.nextInt();
                        switch (number) {
                            case 1:
                                Message();
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("Inbox");
                        System.out.println("1: Back");
                        number = input.nextInt();
                        switch (number) {
                            case 1:
                                Message();
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("Outbox");
                        System.out.println("1: Back");
                        number = input.nextInt();
                        switch (number) {
                            case 1:
                                Message();
                                break;
                        }
                        break;
                    case 4:
                        System.out.println("Picture Message");
                        System.out.println("1: Back");
                        number = input.nextInt();
                        switch (number) {
                            case 1:
                                Message();
                                break;
                        }
                        break;
                    case 5:
                        System.out.println("Template");
                        System.out.println("1: Back");
                        number = input.nextInt();
                        switch (number) {
                            case 1:
                                Message();
                                break;
                        }
                        break;
                    case 6:
                        System.out.println("Smileys");
                        System.out.println("1: Back");
                        number = input.nextInt();
                        switch (number) {
                            case 1:
                                Message();
                                break;
                        }
                        break;
                    case 7:
                        messageSettingsMenu();
                        number = input.nextInt();
                        switch (number) {
                            case 1:
                                System.out.println("Set");
                                System.out.println("1: Message center number");
                                System.out.println("2: Message sent as");
                                System.out.println("3: Message validity");
                                System.out.println("4: Back");
                                number = input.nextInt();
                                switch (number) {
                                    case 1:
                                        System.out.println("Message center number");
                                        break;
                                    case 2:
                                        System.out.println("Message sent as");
                                        break;
                                    case 3:
                                        System.out.println("Message validity");
                                        break;
                                    case 4:
                                        messageSettingsMenu();
                                        break;
                                }

                                break;
                            case 2:
                                System.out.println("Common");
                                System.out.println("1: Delivery reports");
                                System.out.println("2: Reply via same center");
                                System.out.println("3: Character support");
                                System.out.println("4: Back");
                                number = input.nextInt();
                                switch (number) {
                                    case 1:
                                        System.out.println("Delivery reports");
                                        break;
                                    case 2:
                                        System.out.println("Reply via same center");
                                        break;
                                    case 3:
                                        System.out.println("Character support");
                                        break;
                                    case 4:
                                        messageSettingsMenu();
                                        break;


                                }
                                break;
                            case 3:
                                Message();
                            break;
                        }
                        break;



                    case 8:
                        System.out.println("Info Service");
                        System.out.println("1: Back");
                        number = input.nextInt();
                        switch (number) {
                            case 1:
                                Message();
                                break;
                        }
                        break;
                    case 9:
                        System.out.println("Voice MailBox Number");
                        System.out.println("1: Back");
                        number = input.nextInt();
                        switch (number) {
                            case 1:
                                Message();
                                break;
                        }
                    case 10:
                        System.out.println("Service Command Editor");
                        System.out.println("1: Back");
                        number = input.nextInt();
                        switch (number) {
                            case 1:
                                Message();
                                break;
                        }

                        break;
                    case 11:
                        messageSettingsMenu();
                       // number = input.nextInt();
                       // if(number == 1)mainMenu();
                        break;


                }
                break;
            case 3:
                chatMenu();
                number = input.nextInt();
               // switch (number){
                    //case 1:
                        //chatMenu();
                        if(number == 1)mainMenu();
                       // break;
                //}
                break;


            case 4:
                callRegisterMenu();

                number = input.nextInt();
                switch (number) {
                    case 1:
                        System.out.println("Miss calls");
                        System.out.println("1: Back");
                        number = input.nextInt();
                        switch (number) {
                            case 1:
                                callRegisterMenu();
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("Received calls");
                        System.out.println("1: Back");
                        number = input.nextInt();
                        switch (number) {
                            case 1:
                                callRegisterMenu();
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("Dialled number");
                        System.out.println("1: Back");
                        number = input.nextInt();
                        switch (number) {
                            case 1:
                                callRegisterMenu();
                                break;
                        }
                        break;
                    case 4:
                        System.out.println("Erase recent call lists");
                        System.out.println("1: Back");
                        number = input.nextInt();
                        switch (number) {
                            case 1:
                                callRegisterMenu();
                                break;
                        }
                        break;
                    case 5:
                        callDurationMenu();
                        number = input.nextInt();
                        switch (number) {
                            case 1:
                                System.out.println("Last call duration");
                                System.out.println("1: Back");
                                number = input.nextInt();
                                switch (number) {
                                    case 1:
                                        callDurationMenu();
                                        break;
                                }
                                break;
                            case 2:
                                System.out.println("All call duration");
                                System.out.println("1: Back");
                                number = input.nextInt();
                                switch (number) {
                                    case 1:
                                        callDurationMenu();
                                        break;
                                }
                                break;
                            case 3:
                                System.out.println("Received call duration");
                                System.out.println("1: Back");
                                number = input.nextInt();
                                switch (number) {
                                    case 1:
                                        callDurationMenu();
                                        break;
                                }
                                break;
                            case 4:
                                System.out.println("Dialled call duration");
                                System.out.println("1: Back");
                                number = input.nextInt();
                                switch (number) {
                                    case 1:
                                        callDurationMenu();
                                        break;
                                }
                                break;
                            case 5:
                                System.out.println("Clear timers");
                                System.out.println("1: Back");
                                number = input.nextInt();
                                switch (number) {
                                    case 1:
                                        callDurationMenu();
                                        break;
                                }
                                break;
                            case 6:
                                callRegisterMenu();
                                break;


                        }
                        break;
                    case 6:
                        showCallCostMenu();

                        number = input.nextInt();
                        switch (number) {
                            case 1:
                                System.out.println("Last call call");
                                System.out.println("1: Back");
                                number = input.nextInt();
                                switch (number) {
                                    case 1:
                                        showCallCostMenu();
                                        break;
                                }
                                break;
                            case 2:
                                System.out.println("All calls cost");
                                System.out.println("1: Back");
                                number = input.nextInt();
                                switch (number) {
                                    case 1:
                                        showCallCostMenu();
                                        break;
                                }
                                break;
                            case 3:
                                System.out.println("Clear counter");
                                System.out.println("1: Back");
                                number = input.nextInt();
                                switch (number) {
                                    case 1:
                                        showCallCostMenu();
                                        break;
                                }
                                break;
                            case 4:
                                callRegisterMenu();
                                break;
                        }
                        break;
                    case 7:
                        callCostSettingsMenu();

                        number = input.nextInt();
                        switch (number) {
                            case 1:
                                System.out.println("Call cost limit");
                                System.out.println("1: Back");
                                number = input.nextInt();
                                switch (number) {
                                    case 1:

                                }
                                break;
                            case 2:
                                System.out.println("Show cost in");
                                break;
                            case 3:

                        }
                        break;
                    case 8:
                        System.out.println("PREPAID CREDIT");
                        break;
                    case 9:
                        PhonebookMenu();
                        break;

                }
                break;
            case 5:
                System.out.println("TONES");
                System.out.println("1: Ringing tone");
                System.out.println("2: Ringing volume");
                System.out.println("3: Incorrect call alert");
                System.out.println("4: Composer");
                System.out.println("5: Message alert tone");
                System.out.println("6: Keypad tones");
                System.out.println("7: Warning and game tones");
                System.out.println("8: Vibrating alert");
                System.out.println("9: Screen saver");

                number = input.nextInt();
                switch (number) {
                    case 1:
                        System.out.println("Ringing tone");
                        break;
                    case 2:
                        System.out.println("Ringing volume");
                        break;
                    case 3:
                        System.out.println("Incorrect call alert");
                        break;
                    case 4:
                        System.out.println("Composer");
                        break;
                    case 5:
                        System.out.println("Message alert tone");
                        break;
                    case 6:
                        System.out.println("Keypad tones");
                        break;
                    case 7:
                        System.out.println("Warming and game tones");
                        break;
                    case 8:
                        System.out.println("Vibrating alert");
                        break;
                    case 9:
                        System.out.println("Screen saver");
                        break;
                }
                break;
            case 6:
                settingsMenu();

                number = input.nextInt();
                switch (number) {
                    case 1:
                        System.out.println("CALL SETTINGS");
                        System.out.println("1: Automatic redial");
                        System.out.println("2: Speed dialling");
                        System.out.println("3: Call waiting options");
                        System.out.println("4: Own number sending");
                        System.out.println("5: Phone line in use");
                        System.out.println("6: Automatic answer");
                        number = input.nextInt();
                        switch (number) {
                            case 1:
                                System.out.println("Automatic redial");
                                break;
                            case 2:
                                System.out.println("Speed dialling");
                                break;
                            case 3:
                                System.out.println("Call waiting options");
                                break;
                            case 4:
                                System.out.println("Own number sending");
                                break;
                            case 5:
                                System.out.println("Phone line in use");
                                break;
                            case 6:
                                System.out.println("Automatic answer");
                                break;

                        }
                        break;
                    case 2:
                        System.out.println("PHONE SETTINGS");
                        System.out.println("1: Language");
                        System.out.println("2: Cell info display");
                        System.out.println("3: Welcome note");
                        System.out.println("4: Network selection");
                        System.out.println("5: Lights");
                        System.out.println("6: Confirm SIM service actions");
                        System.out.println("7: Back");
                        number = input.nextInt();
                        switch (number) {
                            case 1:
                                System.out.println("Language");
                                break;
                            case 2:
                                System.out.println("Cell info display");
                                break;
                            case 3:
                                System.out.println("Welcome note");
                                break;
                            case 4:
                                System.out.println("Network selection");
                                break;
                            case 5:
                                System.out.println("Lights");
                                break;
                            case 6:
                                System.out.println("Confirm SIM service actions");
                                break;
                            case 7:


                        }
                        break;
                    case 3:
                        securitySettingsMenu();

                        number = input.nextInt();
                        switch (number) {
                            case 1:
                                System.out.println("Pin code request");
                                System.out.println("1: Back");
                                number = input.nextInt();
                                if(number == 1)securitySettingsMenu();
                                break;
                            case 2:
                                System.out.println("Call barring service");
                                System.out.println("1: Back");
                                number = input.nextInt();
                                if(number == 1)securitySettingsMenu();
                                break;
                            case 3:
                                System.out.println("Fixed dialling");
                                System.out.println("1: Back");
                                number = input.nextInt();
                                if(number == 1)securitySettingsMenu();
                                break;
                            case 4:
                                System.out.println("Closed user group");
                                System.out.println("1: Back");
                                number = input.nextInt();
                                if(number == 1)securitySettingsMenu();
                                break;
                            case 5:
                                System.out.println("Phone security");
                                System.out.println("1: Back");
                                number = input.nextInt();
                                if(number == 1)securitySettingsMenu();
                                break;
                            case 6:
                                System.out.println("Change access code");
                                System.out.println("1: Back");
                                number = input.nextInt();
                                if(number == 1)securitySettingsMenu();
                                break;
                            case 7:
                                securitySettingsMenu();
                                break;

                        }
                        break;
                    case 4:
                        System.out.println("RESTORE FACTORY SETTINGS");
                        System.out.println("1: Back");
                        number = input.nextInt();
                        if(number == 1)securitySettingsMenu();
                        break;
                    case 5:
                        settingsMenu();
                        break;



                }
                break;
            case 7:
                System.out.println("CALL DIVERT");
                System.out.println("1: Back");
                number = input.nextInt();
                if(number == 1)mainMenu();
                break;
            case 8:
                System.out.println("GAMES");
                System.out.println("1: Back");
                number = input.nextInt();
                if(number == 1)mainMenu();
                break;
            case 9:
                System.out.println("CALCULATOR");
                System.out.println("1: Back");
                number = input.nextInt();
                if(number == 1)mainMenu();
                break;
            case 10:
                System.out.println("REMINDERS");
                System.out.println("1: Back");
                number = input.nextInt();
                if(number == 1)mainMenu();
                break;
            case 11:
                clockMenu();

                number = input.nextInt();
                switch (number) {
                    case 1:
                        System.out.println("Alarm clock");
                        System.out.println("1: Back");
                        number = input.nextInt();
                        if(number == 1)clockMenu();
                        break;
                    case 2:
                        System.out.println("Clock settings");
                        System.out.println("1: Back");
                        number = input.nextInt();
                        if(number == 1)clockMenu();
                        break;
                    case 3:
                        System.out.println("3: Date setting");
                        System.out.println("1: Back");
                        number = input.nextInt();
                        if(number == 1)clockMenu();
                        break;
                    case 4:
                        System.out.println("4: Stopwatch");
                        System.out.println("1: Back");
                        number = input.nextInt();
                        if(number == 1)clockMenu();
                        break;
                    case 5:
                        System.out.println("5: Countdown timer");
                        System.out.println("1: Back");
                        number = input.nextInt();
                        if(number == 1)clockMenu();
                        break;
                    case 6:
                        System.out.println("6: Auto update of date and time");
                        System.out.println("1: Back");
                        number = input.nextInt();
                        if(number == 1)clockMenu();
                        break;
                    case 7:
                        mainMenu();
                        break;


                }
                break;
            case 12:
                System.out.println("PROFILE");
                System.out.println("1: Back");
                number = input.nextInt();
                if(number == 1)mainMenu();
                break;
            case 13:
                System.out.println("SIM service");
                System.out.println("1: Back");
                number = input.nextInt();
                if(number == 1)mainMenu();
               // break;
            case 14:
            default:
                //break;
        }


    }

    private static void settingsMenu() {
        System.out.println("SETTINGS");
        System.out.println("1: Call settings");
        System.out.println("2: Phone settings");
        System.out.println("3: Security settings");
        System.out.println("4: Restore factory setting");
        System.out.println("5: Back");
    }

    private static void securitySettingsMenu() {
        System.out.println("SECURITY SETTINGS");
        System.out.println("1: Pin code request");
        System.out.println("2: Call barring service");
        System.out.println("3: Fixed dialling");
        System.out.println("4: Closed user group");
        System.out.println("5: Phone security");
        System.out.println("6: Change access code");
        System.out.println("7: Back");
    }

    private static void clockMenu() {
        System.out.println("CLOCK");
        System.out.println("1: Alarm clock");
        System.out.println("2: Clock settings");
        System.out.println("3: Date setting");
        System.out.println("4: Stopwatch");
        System.out.println("5: Countdown timer");
        System.out.println("6: Auto update of date and time");
        System.out.println("7: 1: back");
    }

    private static void callCostSettingsMenu() {
        System.out.println("CALL COST SETTINGS");
        System.out.println("1: Call cost settings");
        System.out.println("2: Show cost in");
        System.out.println("3: Back");
    }

    private static void showCallCostMenu() {
        System.out.println("SHOW CALL COSTS");
        System.out.println("1: Last call cost");
        System.out.println("2: All calls cost");
        System.out.println("3: Clear counter");
        System.out.println("4: Back");
    }

    private static void callDurationMenu() {
        System.out.println("Show call duration");
        System.out.println("1: Last call duration");
        System.out.println("2: All calls duration");
        System.out.println("3: Received calls duration");
        System.out.println("4: dialled calls duration");
        System.out.println("5: Clear timers");
        System.out.println("6: Back");
    }

    private static void callRegisterMenu() {
        System.out.println("CALL REGISTER");
        System.out.println("1: Missed calls");
        System.out.println("2: Received calls");
        System.out.println("3: Dialled numbers");
        System.out.println("4: Erase recent call lists");
        System.out.println("5: Show call duration");
        System.out.println("6: Show call costs");
        System.out.println("7: Call cost settings");
        System.out.println("8: Prepaid credit");
        System.out.println("9: Back");
    }

    private static void chatMenu() {
        System.out.println("CHAT");
        System.out.println("1: Back");
    }

    private static void optionsMenu() {
        System.out.println("1: Type of view");
        System.out.println("2: Memory status");
        System.out.println("3: Back");
    }

    private static void messageSettingsMenu() {
        System.out.println("1: Set 1");
        System.out.println("2: Common");
        System.out.println("3: Back");
    }

    private static void Message() {
        System.out.println("MESSAGES");
        System.out.println("1: Write Message");
        System.out.println("2: Inbox");
        System.out.println("3: Outbox");
        System.out.println("4: Picture Message");
        System.out.println("5: Template");
        System.out.println("6: Smileys");
        System.out.println("7: Message Settings");
        System.out.println("8: Info Service");
        System.out.println("9: Voice mailbox number");
        System.out.println("10: Service command editor");
        System.out.println("11: Previous Menu");
    }

    private static void PhonebookMenu() {
        System.out.println("PHONEBOOK MENU");
        System.out.println("1: Search");
        System.out.println("2: Service Nos");
        System.out.println("3: Add Name");
        System.out.println("4: Erase");
        System.out.println("5: Edit");
        System.out.println("6: Assign Tone");
        System.out.println("7: Send B'card");
        System.out.println("8: Options");
        System.out.println("9: Speed dial");
        System.out.println("10: Voice tags");
        System.out.println("11: Previous Menu");
    }

    private static void mainMenu() {
        System.out.println("NOKIA 3310");
        System.out.println("MAIN MENU");
        System.out.println("1: PhoneBook");
        System.out.println("2: Message");
        System.out.println("3: Chat");
        System.out.println("4: Call Register");
        System.out.println("5: Tones");
        System.out.println("6: Settings");
        System.out.println("7: Call Divert");
        System.out.println("8: Games");
        System.out.println("9: Chapter3.Calculator");
        System.out.println("10: Reminder");
        System.out.println("11: Clock");
        System.out.println("12: Profile");
        System.out.println("13: SIM Services");
        System.out.println("14: Exist");
    }
}

