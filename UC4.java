public class UC4{
    public static void main(String[] args) {

        String name;

        // Check if names are provided
        if (args.length > 0) {

            StringBuilder nameBuilder = new StringBuilder();

            for (int i = 0; i < args.length; i++) {
                nameBuilder.append(args[i]);

                // Add comma except last name
                if (i < args.length - 1) {
                    nameBuilder.append(", ");
                }
            }

            name = nameBuilder.toString();

        } else {
            name = "World";
        }

        System.out.println("Hello, " + name + "!");
    }
}