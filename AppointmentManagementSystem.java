import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class AppointmentManagementSystem {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AppointmentManager manager = new AppointmentManager();
        int choice;
        
        do {
            System.out.println("\nAppointment Management System");
            System.out.println("=============================");
            System.out.println("1. Visitors List");
            System.out.println("2. Add new Visitor");
            System.out.println("3. Edit Visitor Details");
            System.out.println("4. View Appointment Schedule for a Day");
            System.out.println("5. Book an Appointment");
            System.out.println("6. Edit/Cancel Appointment");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    manager.printVisitorList();
                    break;
                
                case 2:
                    System.out.print("Enter name: ");
                    String name = scanner.next();
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    System.out.print("Enter phone number: ");
                    String phone = scanner.next();
                    Visitor visitor = new Visitor(name, age, phone);
                    manager.addVisitor(visitor);
                    break;
                
                case 3:
                    System.out.print("Enter name of visitor to edit: ");
                    String nameToEdit = scanner.next();
                    manager.editVisitor(nameToEdit);
                    break;
                
                case 4:
                    System.out.print("Enter date (YYYY-MM-DD): ");
                    String dateString = scanner.next();
                    LocalDate date = LocalDate.parse(dateString);
                    manager.printAppointmentSchedule(date);
                    break;
                
                case 5:
                    System.out.print("Enter name of visitor: ");
                    String visitorName = scanner.next();
                    System.out.print("Enter date (YYYY-MM-DD): ");
                    String appointmentDateString = scanner.next();
                    LocalDate appointmentDate = LocalDate.parse(appointmentDateString);
                    System.out.print("Enter time (HH:MM AM/PM): ");
                    String appointmentTimeString = scanner.next();
                    LocalTime appointmentTime = LocalTime.parse(appointmentTimeString, DateTimeFormatter.ofPattern("h:mm a"));
                    manager.bookAppointment(visitorName, appointmentDate, appointmentTime);
                    break;
                
                case 6:
                    System.out.print("Enter name of visitor: ");
                    String visitorName2 = scanner.next();
                    System.out.print("Enter date (YYYY-MM-DD): ");
                    String appointmentDateString2 = scanner.next();
                    LocalDate appointmentDate2 = LocalDate.parse(appointmentDateString2);
                    System.out.print("Enter time (HH:MM AM/PM): ");
                    String appointmentTimeString2 = scanner.next();
                    LocalTime appointmentTime2 = LocalTime.parse(appointmentTimeString2, DateTimeFormatter.ofPattern("h:mm a"));
                    manager.bookAppointment(visitorName2, appointmentDate2, appointmentTime2);
                    break;
                
                case 7:
                    System.out.println("Exiting Appointment Management System...");
                    break;
                
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 7);
        
        scanner.close();
    }
}

class Visitor {
    private String name;
    private int age;
    private String phone;
    
    // constructor
    public Visitor(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }
    
    // getters and setters
    public void getName() {
        return
