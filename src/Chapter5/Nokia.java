package Chapter5;

import java.util.Scanner;

public class Nokia {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Welcome to nokia !!!
                Select an Option
                                
                1:Phonebook
                2:Messages
                3:Chat
                4:Call Register
                5:Tones
                6.Settings
                7:Call Divert
                8:Games
                9.Calculator
                10.Remainder
                11:Clock
                12:Profile
                13:Sim Services""");
        int input = scanner.nextInt();
        switch (input) {
            case 1:
                System.out.println("""
                        phonebook
                        Select an Option
                                                
                        1:search
                        2:service nos.
                        3:Add name
                        4:Erase
                        5:Edit
                        6:Assign Tone
                        7:Send b card
                        8:Option
                        9:Speed Dial
                        10:Voice tag
                        """);
                input = scanner.nextInt();
                switch (input) {
                    case 1:
                        System.out.println("search");
                        break;
                    case 2:
                        System.out.println("service nos");
                        break;
                    case 3:
                        System.out.println("Add name");
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
                        System.out.println("Send to card");
                        break;
                    case 8:
                        System.out.println("""
                                Select an Option
                                                                        
                                1:Type of view
                                2:Memory Status
                                """);
                        input = scanner.nextInt();
                        switch (input) {
                            case 1:
                                System.out.println("Type of view");
                                break;
                            case 2:
                                System.out.println("Memory Status");
                                break;
                        }
                    case 9:
                        System.out.println("Speed Dial");
                        break;
                    case 10:
                        System.out.println("Voice Tag");
                        break;
                }
            case 2:
                System.out.println("""
                        1:Write messages
                        2:Inbox
                        3:Outbox
                        4:Picture messages
                        5:Templates
                        6:Smileys
                        7:Message settings
                        8:Info service
                        9:Voice mailbox number
                        10:Service command editor
                        """);
                input = scanner.nextInt();
                switch (input) {
                    case 1:
                        System.out.println("Write messages");
                        break;
                    case 2:
                        System.out.println("Inbox");
                        break;
                    case 3:
                        System.out.println("Outbox");
                        break;
                    case 4:
                        System.out.println("Picture messages");
                        break;
                    case 5:
                        System.out.println("Templates");
                        break;
                    case 6:
                        System.out.println("Smileys");
                        break;
                    case 7:
                        System.out.println("""
                                                                        
                                Set 1 option
                                1:Message centre number
                                2:Message sent as 
                                3:Message validity
                                """);
                        input = scanner.nextInt();
                        switch (input) {
                            case 1:
                                System.out.println("Message centre number");
                            case 2:
                                System.out.println("Message sent as");
                                break;
                            case 3:
                                System.out.println("Message validity");
                                break;
                        }


                        System.out.println("""
                                common 3
                                1:Delivery report
                                2:Reply via same centre
                                2:Character support""");

                        input = scanner.nextInt();
                        switch (input) {
                            case 1:
                                System.out.println("Delivery report");
                                break;
                            case 2:
                                System.out.println("Reply via same centre");
                                break;
                            case 3:
                                System.out.println("Character support");
                                break;
                        }
                    case 8:
                        System.out.println("Info service");
                        break;
                    case 9:
                        System.out.println("Voice mailbox number");
                        break;
                    case 10:
                        System.out.println("Service command editor");
                        break;
                }
            case 3:
                System.out.println("""
                        1:Chat""");

                input = scanner.nextInt();
                switch (input) {
                    case 1:
                        System.out.println("Chat");
                        break;
                }
            case 4:
                System.out.println("""
                        Call register
                        1:Missed calls
                        2:Received calls
                        3:Dialed numbers
                        4:Erase numbers
                        5:Show call duratiom
                        """);
                input = scanner.nextInt();
                switch (input) {
                    case 1:
                        System.out.println("Missed calls");
                        break;
                    case 2:
                        System.out.println("Received calls");
                        break;
                    case 3:
                        System.out.println("Dialed numbers");
                        break;
                    case 4:
                        System.out.println("Erase numbers");
                        break;
                    case 5:
                        System.out.println("""
                                Choose option to show call numbers
                                1:Last call duration
                                2:All call duration
                                3:Received call duration
                                4:Dialed calls duration
                                5:Clear timers""");
                        input = scanner.nextInt();
                        switch (input) {
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
                                System.out.println("Dialed call duration");
                                break;
                            case 5:
                                System.out.println("Clear Timers");
                                break;
                        }
                    case 6:
                        System.out.println("""
                                Choose option to show call cost
                                1:Last call cost
                                2:All call cost
                                3:Clear counters
                                """);
                        input = scanner.nextInt();
                        switch (input) {
                            case 1:
                                System.out.println("Last call cost");
                                break;
                            case 2:
                                System.out.println("All call cost");
                                break;
                            case 3:
                                System.out.println("Clear counters");
                                break;
                        }
                    case 7:
                        System.out.println("""
                                Choose option to show call cost settings
                                1:Call cost settings
                                2:Show costs in""");
                        input = scanner.nextInt();
                        switch (input) {
                            case 1:
                                System.out.println("Call cost limit");
                                break;
                            case 2:
                                System.out.println("Show cost in");
                                break;
                        }
                    case 8:
                        System.out.println("""
                                1:Prepaid credit""");
                        input = scanner.nextInt();
                        switch (input) {
                            case 1:
                                System.out.println("Prepaid credit");
                                break;
                        }
                }
            case 5:
                System.out.println("""
                        1:Ringing Tone
                        2:Ringing volume
                        3:Incoming call alert
                        4:Composer
                        5:Message alert Tone
                        6:Keypard Tone
                        7:Warning and game tone
                        8:Vibrating alert
                        9:Screen saver""");
                input = scanner.nextInt();
                switch (input) {
                    case 1:
                        System.out.println("Ringing Tone");
                        break;
                    case 2:
                        System.out.println("Ringing volume");
                        break;
                    case 3:
                        System.out.println("Incoming call alert");
                        break;
                    case 4:
                        System.out.println("COmposer");
                        break;
                    case 5:
                        System.out.println("Message alert tone");
                        break;
                    case 6:
                        System.out.println("Keypard Tone");
                        break;
                    case 7:
                        System.out.println("Warning and game tone");
                        break;
                    case 8:
                        System.out.println("Vibrating alert");
                        break;
                    case 9:
                        System.out.println("Screen saver");
                        break;
                }
            case 6:
                System.out.println("""
                        settings
                        1:Call settings
                        2:Phone settings
                        3:Security settings
                        4:Restore factory settings""");
                input = scanner.nextInt();
                switch (input) {
                    case 1:
                        System.out.println("""
                                Select option in Settings
                                1:Automatic redial
                                2:Speed dialing
                                3:Call waiting option
                                4:Own number settings
                                5:Phone line in use
                                6:Automatic answer""");
                        input = scanner.nextInt();
                        switch (input) {
                            case 1:
                                System.out.println("Automatic redial");
                                break;
                            case 2:
                                System.out.println("Speed dialing");
                                break;
                            case 3:
                                System.out.println("Call waiting option");
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
                    case 2:
                        System.out.println("""
                                Phone settings
                                1:Language
                                2:Cell info displays
                                3:Welcome note
                                4:Network selection
                                5:Light
                                6:Confirm Sim service actions""");
                        input = scanner.nextInt();
                        switch (input) {
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
                                System.out.println("Light");
                                break;
                            case 6:
                                System.out.println("Confirm sim service action");
                        }
                    case 3:
                        System.out.println("""
                                Security settings
                                1:Pin code request
                                2:Call barring service
                                3:Fixed dialing
                                4:Closed user group
                                5:Phone security
                                6:Change access node""");
                        input = scanner.nextInt();
                        switch (input) {
                            case 1:
                                System.out.println("Pin code request");
                                break;
                            case 2:
                                System.out.println("Call barring service");
                                break;
                            case 3:
                                System.out.println("Fixed dialing");
                                break;
                            case 4:
                                System.out.println("Closed user group");
                                break;
                            case 5:
                                System.out.println("Phone security");
                                break;
                            case 6:
                                System.out.println("Change access node");
                                break;
                        }
                    case 4:
                        System.out.println("""
                                1:Restore factory settings""");
                        input = scanner.nextInt();
                        switch (input) {
                            case 1:
                                System.out.println("Restore factory settings");
                                break;
                        }

                }
            case 7:
                System.out.println("""
                        1:Call divert""");
                input = scanner.nextInt();
                switch (input) {
                    case 1:
                        System.out.println("Call divert");
                        break;
                }
            case 8:
                System.out.println("""
                        1:Games""");
                input = scanner.nextInt();
                switch (input) {
                    case 1:
                        System.out.println("Games");
                        break;
                }
            case 9:
                System.out.println("""
                        1:Calculator""");
                input = scanner.nextInt();
                switch (input) {
                    case 1:
                        System.out.println("Calculator");
                        break;
                }
            case 10:
                System.out.println("""
                        1:Reminders""");
                input = scanner.nextInt();
                switch (input) {
                    case 1:
                        System.out.println("Reminders");
                        break;
                }
            case 11:
                System.out.println("""
                        1:Clock""");
                input = scanner.nextInt();
                switch (input) {
                    case 1:
                        System.out.println("""
                                Choose option from lists
                                1:Alarm clock
                                2:Clock settings
                                3:Date settings
                                4:Stopwatch
                                5:Countdown timer
                                6:Auto update of date and time""");
                        input = scanner.nextInt();
                        switch (input) {
                            case 1:
                                System.out.println("Alarm clock");
                                break;
                            case 2:
                                System.out.println("Clock settings");
                                break;
                            case 3:
                                System.out.println("Date settings");
                                break;
                            case 4:
                                System.out.println("Stopwatch");
                                break;
                            case 5:
                                System.out.println("Countdown timer");
                                break;
                            case 6:
                                System.out.println("Auto update of date and time");
                                break;
                        }
                }
            case 12:
                System.out.println("""
                        1:Profiles""");
                input = scanner.nextInt();
                switch (input) {
                    case 1:
                        System.out.println("Profiles");
                        break;
                }
            case 13:
                System.out.println("""
                        1:Sim services""");
                input = scanner.nextInt();
                switch (input) {
                    case 1:
                        System.out.println("Profiles");
                        break;
                }
        }
    }
}