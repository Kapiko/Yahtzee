/**
 * This game must work without a proper GUI
 * @author (Muhammad Othman Ghani)
 * @version (v 1.2)
 */
import java.util.Scanner;
class MiniSudoku_InTheTerminalWindow{
    public static final char[] EXTENDED = { 0x00C7, 0x00FC, 0x00E9, 0x00E2,
            0x00E4, 0x00E0, 0x00E5, 0x00E7, 0x00EA, 0x00EB, 0x00E8, 0x00EF,
            0x00EE, 0x00EC, 0x00C4, 0x00C5, 0x00C9, 0x00E6, 0x00C6, 0x00F4,
            0x00F6, 0x00F2, 0x00FB, 0x00F9, 0x00FF, 0x00D6, 0x00DC, 0x00A2,
            0x00A3, 0x00A5, 0x20A7, 0x0192, 0x00E1, 0x00ED, 0x00F3, 0x00FA,
            0x00F1, 0x00D1, 0x00AA, 0x00BA, 0x00BF, 0x2310, 0x00AC, 0x00BD,
            0x00BC, 0x00A1, 0x00AB, 0x00BB, 0x2591, 0x2592, 0x2593, 0x2502,
            0x2524, 0x2561, 0x2562, 0x2556, 0x2555, 0x2563, 0x2551, 0x2557,
            0x255D, 0x255C, 0x255B, 0x2510, 0x2514, 0x2534, 0x252C, 0x251C,
            0x2500, 0x253C, 0x255E, 0x255F, 0x255A, 0x2554, 0x2569, 0x2566,
            0x2560, 0x2550, 0x256C, 0x2567, 0x2568, 0x2564, 0x2565, 0x2559,
            0x2558, 0x2552, 0x2553, 0x256B, 0x256A, 0x2518, 0x250C, 0x2588,
            0x2584, 0x258C, 0x2590, 0x2580, 0x03B1, 0x00DF, 0x0393, 0x03C0,
            0x03A3, 0x03C3, 0x00B5, 0x03C4, 0x03A6, 0x0398, 0x03A9, 0x03B4,
            0x221E, 0x03C6, 0x03B5, 0x2229, 0x2261, 0x00B1, 0x2265, 0x2264,
            0x2320, 0x2321, 0x00F7, 0x2248, 0x00B0, 0x2219, 0x00B7, 0x221A,
            0x207F, 0x00B2, 0x25A0, 0x00A0 };
    public static void printC_or_I(int a, int b){
        for (int n = 0; n <=18; n++){
            if(n==9)
                System.out.printf("%s", getAscii(a));
            else
                System.out.printf("%s", getAscii(195));
            if(n==18)
                System.out.printf("%s", getAscii(b));
        }
    }

    public static final char getAscii(int code) {
        if (code >= 0x80 && code <= 0xFF) {
            return EXTENDED[code - 0x7F];
        }
        return (char) code;
    }

    public static void Instructions(){
        String a[] = {"\nHow to Play  M I N I   S U D O K U.",
                "\n\n- The objective is to fill a 4x4 grid so that each column, each row, ",
                "\n  and each of the four 2x2 boxes (also called blocks or regions)",
                "\n  contains the digits from 1 to 4.",
                "\n\n- Each row, column, and quadret(2x2 box) can contain any number from 1 to 4 only once.\n\n"};
        printAllMembers(a);
    }

    public static boolean runThru(String s, String arr[]){
        for(int i = 0; i<arr.length; i++){
            if (s.compareTo(arr[i]) == 0)
                return true;
        }
        return false;
    }

    public static void gamePrint(String s){
        System.out.println("\n_________________________________________________________________________________________________________________________________________________________\n" +s);
    }

    public static void printAllMembers(String s[]){
        for(int i = 0; i<s.length; i++)
            System.out.print("  "+s[i]);
    }

    public static String getInputLoop(int a, char c){
        String s = "";
        while(s.length()!= a || s.charAt(0)<'1'|| s.charAt(0) > c){
            Scanner sc = new Scanner(System.in);
            s = sc.nextLine();
            if((s.length()==a && s.charAt(0)>='1' && s.charAt(0)<= c) || s.compareTo("i") == 0)
                break;
            System.out.println("Invalid input\n");
        }
        return s;
    }

    public static void waitForEnterKey(){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
    }

    public static int giveFrequency(char a, String s){
        int num = 0;
        for (int i = 0; i<s.length(); i++){
            if(s.charAt(i)==a)
                num++;
        }
        return num;
    }

    public static boolean finCheck(String arr[]){
        double s1 = 0, s2 = 0, p1 = 1, p2 =1;
        for(int a = 0; a<arr.length ;a++){
            //'a' = row/column
            for(int b = 0; b <arr.length; b++){
                //'b' = column/row
                s1 += (arr[a].charAt(b) - 48);
                s2 += (arr[b].charAt(a) - 48);
                p1 *= (arr[a].charAt(b) - 48);
                p2 *= (arr[b].charAt(a) - 48);
            }
        }
        if (s1==s2 && s1 == 40 && p1==p2 && p1== 24*24*24*24)
            return true;
        return false;
    }

    public static void printLine(String arr, int r, String chck[]){
        System.out.format("\n %d    %s  ",(r+1),getAscii(178));
        for(int i = 0; i< arr.length(); i++){
            char x = 'a', y = '1';
            for(int a = 0; a < i;a++)
                x++;
            for(int a = 0; a < r;a++)
                y++;
            String c = ""+y+x;
            if(runThru(c, chck)==true)
                System.out.format(" %s*", arr.charAt(i));
            else
                System.out.format(" %s ", arr.charAt(i));
            if(i == Math.sqrt(4)-1)
                System.out.printf("  %s  ", getAscii(178));
            else
                System.out.printf(" ");
        }
    }

    public static void printGrid(String arr[], String chck[]){
        String framechange = "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";
        char a = 'a';
        System.out.format("%s          %s   %s       %s   %s\n\n      %s",framechange, a++, a++, a++, a, getAscii(217));
        printC_or_I(193, 190);

        System.out.printf("\n      %s           %s           %s",getAscii(178), getAscii(178), getAscii(178));
        for(int i = 0; i<arr.length; i++){
            printLine(arr[i], i, chck);
            System.out.printf(" %s", getAscii(178));
            if(i==1){
                System.out.printf("\n      %s           %s           %s\n      %s", getAscii(178), getAscii(178), getAscii(178), getAscii(194));
                //System.out.printf("\n        ");
                printC_or_I(196, 179);
                System.out.printf("\n      %s           %s           %s", getAscii(178), getAscii(178), getAscii(178));
            }
            else if(i<(arr.length-1))
                System.out.printf("\n      %s           %s           %s",getAscii(178), getAscii(178), getAscii(178));
            if (i == arr.length-1){
                System.out.printf("\n      %s           %s           %s",getAscii(178), getAscii(178), getAscii(178));
                System.out.printf("\n      %s", getAscii(191));
                printC_or_I(192, 216);
            }
        }
    }

    public static void playGame(String arr[], String arc[]){
        double startTime = System.currentTimeMillis();
        while(finCheck(arr) == false){
            printGrid(arr, arc);
            gamePrint("\n\nEnter the coordinates of the number/space you wish to change\n in the 'numberLetter' format. Eg. '1a'"+
                "\n\nTo read the instructios press 'i'\nYou cannot change:\n");
            printAllMembers(arc);
            System.out.println("\n");
            String c1 = getInputLoop(2, '4');
            if(c1.compareTo("i") == 0){
                Instructions();
                waitForEnterKey();
            }
            else{
                if(runThru(c1, arc)==false){
                    int x = c1.charAt(1) - 97, y = c1.charAt(0) - 49;
                    System.out.println("Enter the number to replace the selected space/number");
                    int c = getInputLoop(1, '4').charAt(0) - 48;
                    String temp = arr[y].substring(0,x) + c + arr[y].substring((x+1),4);
                    arr[y]=temp;
                }
                else{
                    System.out.println("\nInvalid input. This number is permanent, \nyou must finish the game by filling blanks and changing nunbers that do not end with an asterisk(*)\n");
                    waitForEnterKey();
                }
            }
        }
        printGrid(arr, arc);
        double Time = (System.currentTimeMillis() - startTime)/1000;
        gamePrint("CONGRATULATIONS! YOU'VE WON!      ");
        System.out.print("Time taken : " + Time + " s\n Click 'Enter' to return to the main menu");
        waitForEnterKey();
    }

    public static void main(String[]args){
        while(1==1){
            Scanner sc = new Scanner(System.in);
            String gmnum[] = {"1. Game #1", "2. Game #2", "3. Game #3", "4. Game #4"};
            String s[][] = {{"1234", "3412", "2341", "412_"}, {"__4_", "_2__", "___4", "__3_"}};
            String scheck[][] = {{"1d", "2c", "3b", "4a"}, {"1c", "2b", "3d", "4c"}};
            System.out.printf("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"+
                "Welcome to M I N I - S U D O K U!\n%s\n\nPlease select any one of the following options\n\n  1. Play Game\n  2. About\n\n",
                "_________________________________________________________________________________________________________________________________________________");
            String i = getInputLoop(1,'2');
            if(i.compareTo("1") == 0){
                System.out.println("\nSelect any one of the following games:\n");
                printAllMembers(gmnum);
                System.out.println("\n");
                char gamenumber = getInputLoop(1,'2').charAt(0);




                playGame(s[gamenumber-49], scheck[gamenumber-49]);
            }
            else if(i.compareTo("2") == 0){
                System.out.println("                                                           About                                                         \n\n"+
                    "\nThe name Sudoku or more correctly ?? comes from Japan and consists of the Japanese characters Su (meaning 'number'),"+
                    "\nand Doku (meaning 'single') but the puzzle was not invented in Japan.\nSudoku originated in Switzerland and then traveled to Japan by way of America." +
                    "\nSudoku has its deep roots in ancient number puzzles.\n"+
                    "\nIt is from the traditional 9x9 board that this puzzle, M I N I - S U D O K U was derived.\n"+
                    "This simplified version of Sudoku is easier to complete and can be finished by most people in under 2 minutes");
                gamePrint("");
                Instructions();
                waitForEnterKey();
            }
        }
    }
}