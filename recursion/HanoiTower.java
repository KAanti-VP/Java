public class HanoiTower {
    public static void main(String[] args) {
        int nDisks = 3; // A tornyok száma
        char fromRod = 'A'; // Kiinduló oszlop
        char toRod = 'C'; // Céloszlop
        char helpRod = 'B'; // Segédoszlop

        System.out.println("A következő lépésekkel oldjuk meg a Hanoi-tornyot:");
        solveHanoi(nDisks, fromRod, toRod, helpRod);
    }

    // Rekurzív metódus a Hanoi-torony probléma megoldására
    public static void solveHanoi(int n, char fromRod, char toRod, char helpRod) {
        if (n == 1) {
            System.out.println("Lepes: Mozgas egy lemezt az " + fromRod + " oszloprol a " + toRod + " oszlopra");
            return;
        }
        solveHanoi(n - 1, fromRod, helpRod, toRod);
        System.out.println("Lepes: Mozgas egy lemezt az " + fromRod + " oszloprol a " + toRod + " oszlopra");
        solveHanoi(n - 1, helpRod, toRod, fromRod);
    }
}

