package oop.holiday;

public class HolidayTest {
    public static void main(String[] args) {

        Holiday independenceDay = new Holiday("Independence Day", 4, "July");
        System.out.println("Holiday: " + independenceDay.getName() +
                ", Day: " + independenceDay.getDay() +
                ", Month: " + independenceDay.getMonth());

        // Example usage of inSameMonth method
        Holiday christmas = new Holiday("Christmas", 25, "December");
        System.out.println("Same month as Christmas: " + independenceDay.isInSameMonth(christmas));

        // Example usage of avgDate method
        Holiday[] holidays = {
                new Holiday("New Year's Day", 1, "January"),
                new Holiday("Independence Day", 4, "July"),
                new Holiday("Christmas", 25, "December")
        };
        System.out.println("Average day: " + Holiday.calculateAvgDate(holidays));
    }
}
