package oop.season1.holiday;

public class Holiday {

        private String name;
        private int day;
        private String month;


        public Holiday(String name, int day, String month) {
            this.name = name;
            this.day = day;
            this.month = month;
        }

        public boolean isInSameMonth(Holiday otherHoliday) {
            return this.month.equals(otherHoliday.month);
        }

        public static double calculateAvgDate(Holiday[] holidays) {
            int totalDays = 0;
            for (Holiday holiday : holidays) {
                totalDays += holiday.day;
            }
            return (double) totalDays / holidays.length;
        }

    public String getName() {
        return name;
    }

    public int getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }
}
