import java.util.Scanner;

public class choontong {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int turn = 1;
        char[] board = new char[9];
        board[0] = ' ';
        board[1] = ' ';
        board[2] = ' ';
        board[3] = ' ';
        board[4] = ' ';
        board[5] = ' ';
        board[6] = ' ';
        board[7] = ' ';
        board[8] = ' ';
        printboard(board) ;
        while(turn!=10) {
        System.out.println("Enter a character character (value has to be a number) :");
        int data = scanner.nextInt();
        
        updateboard(board,--data);
        printboard(board);
        }
        scanner.close();
      
    }
    static void updateboard(char[]board,int data) {
    
        
    board[data] = 'x';

    }
    static void printboard(char[]board) {
            
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
        System.out.println();} 
}