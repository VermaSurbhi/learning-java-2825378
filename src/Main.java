public class Main {
    public static double calculateEmployeeGrossSalary(int numberOfHoursPerWeek,
                                                      double amountPerHour,
                                                      int numberOfVacationDays){
        if (numberOfHoursPerWeek < 0 ){
            return -1;
        }
        if (amountPerHour < 0) {
            return -1;
        }
        double vacationDayIncome = (numberOfVacationDays * 8) * amountPerHour;
        double grossSalary = (numberOfHoursPerWeek * amountPerHour * 52) - vacationDayIncome;
        return grossSalary;
    }
    public static void main(String[] args) {

        double totalSalary = calculateEmployeeGrossSalary(40, 15, 8);
        System.out.println("Employee's total salary is " + totalSalary);


        
    }

}
