public class ChessBoard
{
    private String[][] chess = {{"Rb", "Nb", "Bb", "Qb", "Kb", "Bb", "Nb", "Rb"},
            {"Pb", "Pb", "Pb", "Pb", "Pb", "Pb", "Pb", "Pb"},
            {"","","","","","","",""},
            {"","","","","","","",""},
            {"","","","","","","",""},
            {"","","","","","","",""},
            {"P", "P", "P", "P", "P", "P", "P", "P"},
            {"R", "N", "B", "Q", "K", "B", "N", "R"}};
    /*
        How to access Chessboard:
        chess[row (01234567)][column (01234567)]
        row number to row access: row - 1
        column letter to column access:  (int)(letter.charAt(0)) - 97
     */


    private int[][] posValue = {{0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
            {0,0,.25,.25,.25,.25,0,0},
            {0,0,.25,.5,.5,.25,0,0},
            {0,0,.25,.5,.5,.25,0,0},
            {0,0,.25,.25,.25,.25,0,0},
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0}};
    private int move;
    int[] value = {1,3,3,5,9,100,-1,-3,-3,-5,-9,-100};
    String[] piece = {"P", "N", "B", "R", "Q", "K", "Pb", "Nb", "Bb", "Rb", "Qb", "Kb"};
    //Do not make alterations to this method!
    public ChessBoard()
    {
        move = 0;
    }

    public void print()
    {
        for(String[] row: chess)
        {
            for(String thing: row)
            {
                System.out.print(thing + "\t");
            }
            System.out.println();
        }
    }

    public double evaluatePosition()
    {
        double totalEvaulation = 0;
        String[] row = chess[0];
        String space = "";
        for (int i = 0; i < chess.length; i++) {
            row = chess[i];
            for (int j = 0; j < chess[i].length; j++) {
                space = row[j];
                for (int k = 0; k < value.length; k++) {
                    if (space.equals(piece[k])) {
                        totalEvaluation += value[k];
                    }
                }

            }
        }
    }

    public void executeMove(String move)
    {
        int originalRow;
        int originalColumn;
        move = move.toLowerCase();
        if(move.length() == 2){
            originalColumn = (int)(move.charAt(0)) - 97;
            if(chess[Integer.valueOf(move.subtring(1))][originalColumn].equals("")){
                chess[Integer.valueOf(move.subtring(1))][originalColumn] = "P";
                chess[Integer.valueOf(move.subtring(1))][originalColumn] =
            }

        }