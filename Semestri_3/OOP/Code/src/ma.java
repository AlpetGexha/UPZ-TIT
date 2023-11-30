public class ma {
    public static void main(String[] args) {
        int totalPeople = 4;

        long totalArrangements = factorial(totalPeople);

        // Calculate the number of arrangements where the bride is next to the groom
        long invalidArrangements = countInvalidArrangements(totalPeople);

        // Calculate the final result
        long validArrangements = totalArrangements - invalidArrangements;

        System.out.println("Total number of arrangements: " + totalArrangements);
        System.out.println("Invalid arrangements (bride next to groom): " + invalidArrangements);
        System.out.println("Valid arrangements: " + validArrangements);
    }

    // Factorial function to calculate n!
    private static long factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // Function to count the number of invalid arrangements (bride next to groom)
    private static long countInvalidArrangements(int totalPeople) {
        // Considering the bride and groom as a single entity
        int entities = totalPeople - 1;

        // Arrange the entities in (entities - 1)! ways
        long arrangementsWithoutRestriction = factorial(entities - 1);

        // Within the bride-groom entity, they can be arranged in 2! ways
        long arrangementsWithinEntity = factorial(2);

        // Calculate the total invalid arrangements
        return arrangementsWithoutRestriction * arrangementsWithinEntity;
    }
}

