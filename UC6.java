public class UC6 {
    public static void main(String[] args) {

        String name;

        if (args.length > 0) {

            StringBuilder nameBuilder = new StringBuilder();

            // Add names with comma
            for (String n : args) {
                nameBuilder.append(n).append(", ");
            }

            // Remove last ", "
            name = nameBuilder.substring(0, nameBuilder.length() - 2);

        } else {
            name = "World";
        }

        System.out.println("Hello, " + name + "!");
    }
}