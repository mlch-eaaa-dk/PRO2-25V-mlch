package maze;

public class MazeSearch {
    private static final int[][] maze = {
            {1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1},
            {1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 0, 1},
            {0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0},
            {1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1},
            {1, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}};

    private static final int Wall = 0;
    private static final int Free = 1;
    private static final int Tried = 3;
    private static final int Path = 7;

    private static final int rOut = maze.length - 1, cOut = maze[rOut].length - 1;

    private static boolean isValidSquare(int row, int col) {
        return 0 <= row && row < maze.length &&
                0 <= col && col < maze[row].length &&
                maze[row][col] == Free;
    }

    private static void printMaze() {
        for (int row = 0; row < maze.length; row++) {
            for (int col = 0; col < maze[0].length; col++) {
                switch (maze[row][col]) {
                    case Wall -> System.out.print('+');
                    case Free -> System.out.print('.');
                    case Tried -> System.out.print('ø');
                    case Path -> System.out.print('o');
                }
            }
            System.out.println();
        }
    }

    public static boolean traverse(int row, int col) {
        if (!isValidSquare(row, col))
            return false;

        if (row == rOut && col == cOut) {
            maze[row][col] = Path;
            return true;
        } else {
            maze[row][col] = Tried;

            boolean done = traverse(row + 1, col);  // down
            if (!done)
                done = traverse(row, col + 1);      // right
            if (!done)
                done = traverse(row - 1, col);      // up
            if (!done)
                done = traverse(row, col - 1);      // left

            if (done)
                maze[row][col] = Path;

            return done;
        }
    }

    public static void main(String[] args) {
        System.out.println("Maze:");
        printMaze();
        System.out.println();

        boolean isTraversable = traverse(0, 0);

        printMaze();
        System.out.println();
        if (isTraversable)
            System.out.println("The maze was successfully traversed!");
        else
            System.out.println("The maze has no possible path.");
    }
}
