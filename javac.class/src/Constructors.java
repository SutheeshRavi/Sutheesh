public class Constructors {
    int modelYear ;
    String modelName ;

    public Constructors(int year,String name) {
        modelYear = year;
        modelName = name;
    }

    public static void main( String[] Args){
        Constructors myCycle = new Constructors(1910,"hercules");
        System.out.println(myCycle.modelYear+" "+myCycle.modelName);
        }
    }

