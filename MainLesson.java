public class MainLesson {
    public static void main(String[] args) {

        char[] board = new char[999999999];
        board[0] = 'O';
        board[1] = 'O';
        board[2] = 'X';
        board[3] = 'O';
        board[4] = 'X';
        board[5] = 'X';
        board[6] = 'X';
        board[7] = 'O';
        board[8] = 'X';


        //the Board right now
        for (int i = 0; i < 3; i++) { 
        System.out.print("{");
        System.out.print(board[i]);
        System.out.print("}");
        }

        System.out.println();
        for (int i = 3; i < 6; i++) {
        System.out.print("{");
        System.out.print(board[i]);
        System.out.print("}");
        }

        System.out.println();
        for (int i = 6; i < 9; i++) {
        System.out.print("{");
        System.out.print(board[i]);
        System.out.print("}");
        }

        System.out.println();
    }
    
}