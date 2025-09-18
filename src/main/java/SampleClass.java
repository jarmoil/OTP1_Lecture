public class SampleClass {
    private String value;

    public SampleClass(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public boolean isValueEqual(SampleClass other) {
        return this.value.equals(other.value);
    }

    public static boolean compareIntegers(int val1, int val2) {
        return val1 < val2;
    }

    public static String[] getArray() {
        return new String[]{"one", "two", "three"};
    }
}




