
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        ArrayList<Song> top10 = new ArrayList<Song>();
        top10.add(new Song(1, "Running up that hill", "Kate Bush", "Fish People"));
        top10.add(new Song(2, "Afraid to feel", "LF System", "Warner Records"));
        top10.add(new Song(3, "As it was", "Harry Styles", "Columbia"));
        top10.add(new Song(4, "Break my soul", "Beyonce", "Columbia"));
        top10.add(new Song(5, "Green green grass", "George Ezra", "Columbia"));
        top10.add(new Song(6, "Go", "Cat Burns", "RCA"));
        top10.add(new Song(7, "About Damn Time", "Lizzo", "Atlantic"));
        top10.add(new Song(8, "Massive", "Drake", "OVO"));
        top10.add(new Song(9, "IFTK", "Tion Wyne * LA Roux", "Atlantic"));
        top10.add(new Song(10, "Late Night Talking", "Harry Styles", "Columbia"));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a chart position between 1 & 10: ");
        int input = scanner.nextInt();
        System.out.println(top10.get(input));

        scanner.close();
    }

    
}

//where you have the scanner, name it sc, makes it easier so you dont get mixed up with caps
// also make sure all your calls to the scanner use the same name   Thank yu :) should I try run this now? yes boss
// good shit lou, all working now?
//all working now. seriously thanks everyone! legends :):)