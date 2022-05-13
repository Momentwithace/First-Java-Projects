import java.util.Scanner;

public class NokiaPhone {
    public static void main(String[] args) {
        System.out.println("NOKIA 3310\n\n");
        System.out.println("MAIN MENU");
        System.out.println("1: PhoneBook");
        System.out.println("2: Message");
        System.out.println("3: Chat");
        System.out.println("4: Call Register");
        System.out.println("5: Tones");
        System.out.println("6: Settings");
        System.out.println("7: Call Divert");
        System.out.println("8: Games");
        System.out.println("9: Calculator");
        System.out.println("10: Reminder");
        System.out.println("11: Clock");
        System.out.println("12: Profile");
        System.out.println("13: SIM Services\n\n");


        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        switch (number) {
            case 1:
                System.out.println("NOKIA 3310\n\n");
                System.out.println("PHONE BOOK MENU");
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

                number = input.nextInt();
                switch (number) {
                    case 1:
                        System.out.println("Search");
                        break;
                    case 2:
                        System.out.println("Service Nos");
                        break;
                    case 3:
                        System.out.println("Add Name");
                        break;
                    case 4:
                        System.out.println("Erase");
                        break;
                    case 5:
                        System.out.println("Edit");
                        break;
                    case 6:
                        System.out.println("Assign Tone");
                        break;
                    case 7:
                        System.out.println("Send b'card");
                        break;
                    case 8:
                        System.out.println("1: Type of View");
                        System.out.println("2: Memory Status");
                        number = input.nextInt();
                        switch (number) {
                            case 1:
                                System.out.println("Type of View");
                                break;
                            case 2:
                                System.out.println("Memory Status");
                        }

                        break;
                    case 9:
                        System.out.println("Speed dials");
                        break;
                    case 10:
                        System.out.println("Voice tags");
                        break;


                }
                break;
            case 2:
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
                System.out.println("10: Service command editor\n\n");


                number = input.nextInt();
                switch (number) {
                    case 1:
                        System.out.println("Write Message");
                        break;
                    case 2:
                        System.out.println("Inbox");
                        break;
                    case 3:
                        System.out.println("Outbox");
                        break;
                    case 4:
                        System.out.println("Picture Message");
                        break;
                    case 5:
                        System.out.println("Template");
                        break;
                    case 6:
                        System.out.println("Smileys");
                        break;
                    case 7:
                        System.out.println("1: Set 1");
                        System.out.println("2: Common");
                        number = input.nextInt();
                        switch (number) {
                            case 1:
                                System.out.println("Set");
                                System.out.println("1: Message center number");
                                System.out.println("2: Message sent as");
                                System.out.println("3: Message validity");
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
                                }

                                break;
                            case 2:
                                System.out.println("Common");
                                System.out.println("1: Delivery reports");
                                System.out.println("2: Reply via same center");
                                System.out.println("3: Character support");
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
                                }
                                break;
                            case 8:
                                System.out.println("Info Service");
                            case 9:
                                System.out.println("Voice MailBox Number");
                            case 10:
                                System.out.println("Service Command Editor");

                                break;


                        }

                }
                break;
            case 3:
                System.out.println("CHAT");
                break;


            case 4:
                System.out.println("CALL REGISTER");
                System.out.println("1: Missed calls");
                System.out.println("2: Received calls");
                System.out.println("3: Dialled numbers");
                System.out.println("4: Erase recent call lists");
                System.out.println("5: Show call duration");
                System.out.println("6: Show call costs");
                System.out.println("7: Call cost settings");
                System.out.println("8: Prepaid credit");

                number = input.nextInt();
                switch (number) {
                    case 1:
                        System.out.println("Miss calls");
                        break;
                    case 2:
                        System.out.println("Received calls");
                        break;
                    case 3:
                        System.out.println("Dialled number");
                        break;
                    case 4:
                        System.out.println("Erase recent call lists");
                        break;
                    case 5:
                        System.out.println("Show call duration");
                        System.out.println("1: Last call duration");
                        System.out.println("2: All calls duration");
                        System.out.println("3: Received calls duration");
                        System.out.println("4: dialled calls duration");
                        System.out.println("5: Clear timers");
                        number = input.nextInt();
                        switch (number) {
                            case 1:
                                System.out.println("Last call duration");
                                break;
                            case 2:
                                System.out.println("All call duration");
                                break;
                            case 3:
                                System.out.println("Received call duration");
                                break;
                            case 4:
                                System.out.println("Dialled call duration");
                                break;
                            case 5:
                                System.out.println("Clear timers");
                                break;


                        }
                        break;
                    case 6:
                        System.out.println("SHOW CALL COSTS");
                        System.out.println("1: Last call cost");
                        System.out.println("2: All calls cost");
                        System.out.println("3: Clear counter");

                        number = input.nextInt();
                        switch (number) {
                            case 1:
                                System.out.println("Last call call");
                                break;
                            case 2:
                                System.out.println("All calls cost");
                                break;
                            case 3:
                                System.out.println("Clear counter");
                                break;
                        }
                        break;
                    case 7:
                        System.out.println("CALL COST SETTINGS");
                        System.out.println("1: Call cost settings");
                        System.out.println("2: Show cost in");

                        number = input.nextInt();
                        switch (number) {
                            case 1:
                                System.out.println("Call cost limit");
                                break;
                            case 2:
                                System.out.println("Show cost in");
                                break;
                        }
                        break;
                    case 8:
                        System.out.println("PREPAID CREDIT");
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
                System.out.println("SETTINGS");
                System.out.println("1: Call settings");
                System.out.println("2: Phone settings");
                System.out.println("3: Security settings");
                System.out.println("4: Restore factory setting");

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

                        }
                        break;
                    case 3:
                        System.out.println("SECURITY SETTINGS");
                        System.out.println("1: Pin code request");
                        System.out.println("2: Call barring service");
                        System.out.println("3: Fixed dialling");
                        System.out.println("4: Closed user group");
                        System.out.println("5: Phone security");
                        System.out.println("6: Change access code");

                        number = input.nextInt();
                        switch (number) {
                            case 1:
                                System.out.println("Pin code request");
                                break;
                            case 2:
                                System.out.println("Call barring service");
                                break;
                            case 3:
                                System.out.println("Fixed dialling");
                                break;
                            case 4:
                                System.out.println("Closed user group");
                                break;
                            case 5:
                                System.out.println("Phone security");
                                break;
                            case 6:
                                System.out.println("Change access code");
                                break;

                        }
                        break;
                    case 4:
                        System.out.println("RESTORE FACTORY SETTINGS");
                        break;


                }break;
            case 7:
                System.out.println("CALL DIVERT");
                break;
            case 8:
                System.out.println("GAMES");
                break;
            case 9:
                System.out.println("CALCULATOR");
                break;
            case 10:
                System.out.println("REMINDERS");
                break;
            case 11:
                System.out.println("CLOCK");
                System.out.println("1: Alarm clock");
                System.out.println("2: Clock settings");
                System.out.println("3: Date setting");
                System.out.println("4: Stopwatch");
                System.out.println("5: Countdown timer");
                System.out.println("6: Auto update of date and time");

                number = input.nextInt();
                switch (number){
                    case 1:
                        System.out.println("Alarm clock");
                        break;
                    case 2:
                        System.out.println("Clock settings");
                        break;
                    case 3:
                        System.out.println("3: Date setting");
                        break;
                    case 4:
                        System.out.println("4: Stopwatch");
                        break;
                    case 5:
                        System.out.println("5: Countdown timer");
                        break;
                    case 6:
                        System.out.println("6: Auto update of date and time");
                        break;

                }break;
            case 12:
                System.out.println("PROFILE");
                break;
            case 13:
                System.out.println("SIM service");
                break;
        }


    }
}

