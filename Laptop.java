import java.util.Objects;

public class Laptop {
    private final int ram; // ОЗУ в ГБ
    private final int hdd; // Объем ЖД в ГБ
    private final String os; // Операционная система
    private final String color; // Цвет

    public Laptop(int ram, int hdd, String os, String color) {
        if (ram <= 0 || hdd <= 0) {
            throw new IllegalArgumentException("RAM and HDD size must be positive.");
        }
        if (os == null || os.isEmpty() || color == null || color.isEmpty()) {
            throw new IllegalArgumentException("OS and color cannot be null or empty.");
        }
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
    }

    public int getRam() {
        return ram;
    }

    public int getHdd() {
        return hdd;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "module6.Laptop{" +
                "RAM=" + ram + " GB, " +
                "HDD=" + hdd + " GB, " +
                "OS='" + os + "', " +
                "Color='" + color + "'" +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return ram == laptop.ram && hdd == laptop.hdd &&
                os.equals(laptop.os) && color.equals(laptop.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ram, hdd, os, color);
    }
}
