public class Check {
    public static void main(String[] args) {
        // check data
        Integer a= 100;
        Double b = 10.54545;
        String c = "Hello";
        Boolean e;
        Character f;
        Float g = 1.11F;  

        
        boolean result = b.toString() instanceof String;
        System.out.println(result);
    }
}
