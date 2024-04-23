public class P15 {
    public static void main(String[] args) {
        
        int num = 10;

        // Wrapping the int variable num with the Integer class
        Integer wrappedNum = Integer.valueOf(num);

	System.out.println("Prem Gohel");
	System.out.println("220130318003");

        // Printing out the wrapped value
        System.out.println("Wrapped value: " + wrappedNum);

        // Parsing the String "20" into an int
        String strNum = "20";
        int parsedNum = Integer.parseInt(strNum);

        // Printing out the parsed value
        System.out.println("Parsed value: " + parsedNum);
    }
}
