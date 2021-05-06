public class Hello {
    public static void main(String[] args){
        printConversion(75.114d);
    }
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0) return -1;
        return Math.round(kilometersPerHour / 1.609d);
    }
    public static void printConversion(double kilometersPerHour){
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        if(milesPerHour < 0)
        {
            System.out.println("Invalid Value");
        }
        else
        {
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}
