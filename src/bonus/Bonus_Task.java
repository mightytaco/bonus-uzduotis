package bonus;

public class Bonus_Task {

    static void printBonusDatesBetween(int fromYear, int toYear){

        if (toYear > fromYear) {
            while (fromYear != toYear+1) {
                String menesis = String.valueOf(fromYear % 100);
                String dienos = String.valueOf(fromYear / 100);
                String reversedMen = new StringBuffer(menesis).reverse().toString();
                String reversedDien = new StringBuffer(dienos).reverse().toString();
                System.out.println(fromYear + "-" + reversedMen + "-" + reversedDien);
                fromYear++;
            }
        }else{
            System.out.println("Netinkami metai.");
            return;
        }

    }

    public static void main(String[] args) {
        printBonusDatesBetween(2010, 2015);
    }
}
