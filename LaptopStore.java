import java.util.*;

// Make sure the Laptop class is defined either here or in a separate file and imported correctly.
class Laptop {
    private int ram;
    private int hdd;
    private String os;
    private String color;

    public Laptop(int ram, int hdd, String os, String color) {
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
    }

    public int getRam() { return ram; }
    public int getHdd() { return hdd; }
    public String getOs() { return os; }
    public String getColor() { return color; }

    @Override
    public String toString() {
        return "Laptop{" +
                "ram=" + ram +
                ", hdd=" + hdd +
                ", os='" + os + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}


public class LaptopStore {
    public static void main(String[] args) {
        // ... (Laptop creation and criteria map remain unchanged) ...

        Scanner scanner = new Scanner(System.in);
        Map<String, Object> filters = new HashMap<>();
        boolean continueFiltering = true;

        while (continueFiltering) {
            // ... (criterion selection remains unchanged) ...

            switch (criterion) {
                case 1:
                    System.out.print("Введите минимальное значение ОЗУ (в ГБ): ");
                    try {
                        int ram = scanner.nextInt();
                        filters.put("ram", ram);
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input for RAM. Please enter a number.");
                        scanner.next(); // Consume the invalid input
                    }
                    scanner.nextLine(); // Consume newline
                    break;
                case 2:
                    System.out.print("Введите минимальное значение объема ЖД (в ГБ): ");
                    try {
                        int hdd = scanner.nextInt();
                        filters.put("hdd", hdd);
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input for HDD. Please enter a number.");
                        scanner.next(); // Consume the invalid input
                    }
                    scanner.nextLine(); // Consume newline
                    break;
                case 3:
                    System.out.print("Введите операционную систему: ");
                    String os = scanner.nextLine();
                    filters.put("os", os);
                    break;
                case 4:
                    System.out.print("Введите цвет: ");
                    String color = scanner.nextLine();
                    filters.put("color", color);
                    break;
                default:
                    System.out.println("Некорректный критерий.");
            }

            System.out.print("Хотите добавить еще один критерий? (да/нет): ");
            String response = scanner.nextLine();
            continueFiltering = response.equalsIgnoreCase("да");
        }

        filterLaptops(Laptop, filters);
        scanner.close();
    }

    // ... (filterLaptops method remains the same) ...
}