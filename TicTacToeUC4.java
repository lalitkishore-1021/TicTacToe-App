public class TicTacToeUC4 {

    public static void main(String[] args) {
        int slot = 7; 
        int row = getRowFromSlot(slot);
        int col = getColFromSlot(slot);
        System.out.println("Slot: " + slot);
        System.out.println("Row: " + row);
        System.out.println("Column: " + col);
    }
    static int getRowFromSlot(int slot) {
        return (slot - 1) / 3;
    }
    static int getColFromSlot(int slot) {
        return (slot - 1) % 3;
    }
}