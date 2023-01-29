package Project_MineSweeper;
import java.util.Scanner;
public class MineSweeper {
    int rowNumber;
    int colNumber;
    int selectRow;
    int selectCol;
    String[][] field;
    String[][] bomb;

    MineSweeper(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.field = new String[this.rowNumber][this.colNumber];
        this.bomb = new String[this.rowNumber][this.colNumber];
    }

    void run() {
        generateField(this.field);
        generateBombs();
        System.out.println("======== GAME BOARD ========");
        printField(this.bomb);
        int round = 1;
        do {
            System.out.println("======== ROUND #" + round + " ========");
            printField(this.field);
            newTurn();
            round++;
        }while(isBomb());
        System.out.println("======== GAME OVER ========");
        for(int i=0; i<this.rowNumber; i++) {
            for(int j=0; j<this.colNumber; j++) {
                if(this.bomb[i][j].equals("* "))
                    System.out.print(this.bomb[i][j]);
                else
                    System.out.print(this.field[i][j]);
            }
            System.out.println();
        }


    }

    void generateField(String[][] field) {
        for(int i=0; i<this.rowNumber; i++) {
            for(int j=0; j<this.colNumber; j++) {
                field[i][j] = "- ";
            }
        }
    }

    void generateBombs() {
        generateField(this.bomb);
        int bombNum = (this.rowNumber*this.colNumber)/4;
        while(bombNum != 0) {
            int bombRow = (int) (Math.random() * this.rowNumber);
            int bombCol = (int) (Math.random() * this.colNumber);

            if(!(this.bomb[bombRow][bombCol].equals("* "))) {
                this.bomb[bombRow][bombCol] = "* ";
                bombNum--;
            }

        }

    }
    void newTurn () {
        Scanner input = new Scanner(System.in);
        System.out.print("enter row number: ");
        this.selectRow = input.nextInt();
        while(this.selectRow >= this.rowNumber) {
            System.out.println("Please select valid row.");
            System.out.print("enter row number: ");
            this.selectRow = input.nextInt();
        }
        System.out.print("enter column number: ");
        this.selectCol = input.nextInt();
        while(this.selectCol >= this.colNumber) {
            System.out.println("Please select valid column.");
            System.out.print("enter column number: ");
            this.selectCol = input.nextInt();
        }
        isBlank();
    }
    boolean isBomb() {
        return !this.bomb[this.selectRow][this.selectCol].equals("* ");
    }

    void isBlank() {
        int count = 0;
        if(!(this.bomb[this.selectRow][this.selectCol].equals("* "))) {
            // TOP LINE
            if(this.selectRow != 0) {
                if(this.selectCol != 0) {
                    if(this.bomb[this.selectRow-1][this.selectCol-1].equals("* "))
                        count++;
                }
                if(this.selectCol != (colNumber-1)) {
                    if(this.bomb[this.selectRow-1][this.selectCol+1].equals("* "))
                        count++;
                }
                    if(this.bomb[this.selectRow-1][this.selectCol].equals("* "))
                        count++;

            }
            // SAME LINE
            if(this.selectCol != 0) {
                if(this.bomb[this.selectRow][this.selectCol-1].equals("* "))
                    count++;
            }
            if(this.selectCol != (colNumber-1)) {
                if(this.bomb[this.selectRow][this.selectCol+1].equals("* "))
                    count++;
            }
            // BOTTOM LINE
            if(this.selectRow != (rowNumber-1)) {
                if(this.selectCol != 0) {
                    if(this.bomb[this.selectRow+1][this.selectCol-1].equals("* "))
                        count++;
                }
                if(this.selectCol != (colNumber-1)) {
                    if(this.bomb[this.selectRow+1][this.selectCol+1].equals("* "))
                        count++;
                }

                    if(this.bomb[this.selectRow+1][this.selectCol].equals("* "))
                        count++;

            }
            this.field[this.selectRow][this.selectCol] = count + " ";
        }
    }

    void printField(String[][] field){
        for(int i=0; i<this.rowNumber; i++) {
            for(int j=0; j<this.colNumber; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }
}
