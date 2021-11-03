import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOfDepartures {
    List<Departures> listDepartures = new ArrayList<>();

    public void insertDepartures(){
        Scanner scanner = new Scanner(System.in);
        Scanner scannerNumber = new Scanner(System.in);
        String nameFlight;
        byte loadingInterval;
        String date;
        char anotherDeparture;
        do {
            System.out.print("Introdu nume zbor : ");
            nameFlight = scanner.nextLine();
            System.out.print("Enter loading interval :");
            loadingInterval = scannerNumber.nextByte();
            System.out.print("Enter predicted departure date in format \"dd-MM-yyyy HH:mm\" :");
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
            LocalDateTime dateTime = LocalDateTime.parse(scanner.nextLine(), formatter);
            listDepartures.add(new Departures(nameFlight,loadingInterval,dateTime));
            System.out.print("Do you want to enter another departure ? (y/n) : ");
            anotherDeparture = scanner.nextLine().charAt(0);
        }while (anotherDeparture == 'y' || anotherDeparture == 'Y' );
    }
    public void showDeparture(){
        listDepartures.forEach(System.out::println);
    }

}
