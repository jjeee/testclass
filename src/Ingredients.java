public class Ingredients {
    static String unit,name,measure;

    public Ingredients(String measure,String unit,String name) {
        this.measure=measure;
        this.unit=unit;
        this.name=name;
    }

    public static String getMeasure() {
        return measure;
    }

    public static void setMeasure(String measure) {
        Ingredients.measure = measure;
    }

    public static String getUnit() {
        return unit;
    }

    public static void setUnit(String unit) {
        Ingredients.unit = unit;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Ingredients.name = name;
    }

    @Override
    public String toString() {
        return measure+" "+unit+" "+name;
    }
}
