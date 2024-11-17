import java.util.Scanner;

abstract class Robber {
    public void RobbingClass() {
        System.out.println("MScAI&ML");
    }
    
    public void MachineLearning() {
        System.out.println("I love MachineLearning");
    }
    
    public abstract int RowHouses(int[] houses);
    public abstract int RoundHouses(int[] houses);
    public abstract int SquareHouse(int[] houses);
    public abstract int MultiHouseBuilding(int[][] houseTypes);
}

class JAVAProfessionalRobber extends Robber {
    @Override
    public int RowHouses(int[] houses) {
        if (houses == null || houses.length == 0) return 0;
        int prev = 0, curr = 0;
        for (int amount : houses) {
            int temp = curr;
            curr = Math.max(curr, prev + amount);
            prev = temp;
        }
        return curr;
    }

    @Override
    public int RoundHouses(int[] houses) {
        if (houses.length == 1) return houses[0];
        return Math.max(robLine(houses, 0, houses.length - 2), robLine(houses, 1, houses.length - 1));
    }

    private int robLine(int[] houses, int start, int end) {
        int prev = 0, curr = 0;
        for (int i = start; i <= end; i++) {
            int temp = curr;
            curr = Math.max(curr, prev + houses[i]);
            prev = temp;
        }
        return curr;
    }

    @Override
    public int SquareHouse(int[] houses) {
        if (houses == null || houses.length == 0) return 0;
        int prev = 0, curr = 0;
        for (int amount : houses) {
            int temp = curr;
            curr = Math.max(curr, prev + amount);
            prev = temp;
        }
        return curr;
    }

    @Override
    public int MultiHouseBuilding(int[][] houseTypes) {
        int total = 0;
        for (int[] houseType : houseTypes) {
            total += RowHouses(houseType); // Calculate max robbing amount for each house type
        }
        return total;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JAVAProfessionalRobber robber = new JAVAProfessionalRobber();
        robber.RobbingClass();
        robber.MachineLearning();

        // Input for RowHouses
        System.out.print("Enter Row Houses (comma-separated): ");
        String[] rowInput = scanner.nextLine().split(",");
        int[] rowHouses = new int[rowInput.length];
        for (int i = 0; i < rowInput.length; i++) {
            rowHouses[i] = Integer.parseInt(rowInput[i].trim());
        }
        System.out.println("RowHouses: " + robber.RowHouses(rowHouses));

        // Input for RoundHouses
        System.out.print("Enter Round Houses (comma-separated): ");
        String[] roundInput = scanner.nextLine().split(",");
        int[] roundHouses = new int[roundInput.length];
        for (int i = 0; i < roundInput.length; i++) {
            roundHouses[i] = Integer.parseInt(roundInput[i].trim());
        }
        System.out.println("RoundHouses: " + robber.RoundHouses(roundHouses));

        // Input for SquareHouse
        System.out.print("Enter Square Houses (comma-separated): ");
        String[] squareInput = scanner.nextLine().split(",");
        int[] squareHouses = new int[squareInput.length];
        for (int i = 0; i < squareInput.length; i++) {
            squareHouses[i] = Integer.parseInt(squareInput[i].trim());
        }
        System.out.println("SquareHouse: " + robber.SquareHouse(squareHouses));

        // Input for MultiHouseBuilding
        System.out.print("Enter the number of house types for MultiHouseBuilding: ");
        int numTypes = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        int[][] multiHouseTypes = new int[numTypes][];
        for (int i = 0; i < numTypes; i++) {
            System.out.print("Enter amounts for type " + (i + 1) + " (comma-separated): ");
            String[] input = scanner.nextLine().split(",");
            int[] houses = new int[input.length];
            for (int j = 0; j < input.length; j++) {
                houses[j] = Integer.parseInt(input[j].trim());
            }
            multiHouseTypes[i] = houses;
        }
        System.out.println("MultiHouseBuilding: " + robber.MultiHouseBuilding(multiHouseTypes));

        scanner.close();
    }
}
