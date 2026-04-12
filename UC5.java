public class UC5{
    public static void main(String[] args) {

        String name;

        // Check if names are provided
        if (args.length > 0) {

            StringBuilder nameBuilder = new StringBuilder();
            boolean first = true;

            // Enhanced for loop
            for (String n : args) {
                if (!first) {
                    nameBuilder.append(", ");
                }
                nameBuilder.append(n);
                first = false;
            }

            name = nameBuilder.toString();

        } else {
            name = "World";
        }

        System.out.println("Hello, " + name + "!");
    }
}