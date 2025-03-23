package com.example.problems.dpk16_mosquito_game.impl3;

public enum MoveStrategy {

    UP(new Up()),
    DOWN(new Down()),
    LEFT(new Left()),
    RIGHT(new Right()),
    DIAGONAL_UP_RIGHT(new DiagonalUpRight()),
    DIAGONAL_UP_LEFT(new DiagonalUpLeft()),
    DIAGONAL_DOWN_RIGHT(new DiagonalDownRight()),
    DIAGONAL_DOWN_LEFT(new DiagonalDownLeft());



    private final MovementApplication application;

    MoveStrategy(MovementApplication application) {
        this.application = application;
    }

    public MovementApplication getApplication() {
        return application;
    }

    private static class Up implements MovementApplication {
        @Override
        public int[] execute(int[] position, int gameRow, int gameColumn) {
            if (position[0] - 1 < 0) {
                position[0] = gameRow - 1;
            } else {
                position[0]--;
            }
            return position;

        }
    }

    private static class Down implements MovementApplication {
        @Override
        public int[] execute(int[] position, int gameRow, int gameColumn) {
            if (position[0] + 1 > gameRow - 1) {
                position[0] = 0;
            } else {
                position[0]++;
            }
            return position;
        }
    }

    private static class Left implements MovementApplication {
        @Override
        public int[] execute(int[] position, int gameRow, int gameColumn) {
            if (position[1] - 1 < 0) {
                position[1] = gameColumn - 1;
            } else {
                position[1]--;
            }
            return position;
        }
    }

    private static class Right implements MovementApplication {
        @Override
        public int[] execute(int[] position, int gameRow, int gameColumn) {
            if (position[1] + 1 > gameColumn - 1) {
                position[1] = 0;
            } else {
                position[1]++;
            }
            return position;
        }
    }


    private static class DiagonalUpRight implements MovementApplication {
        @Override
        public int[] execute(int[] position, int gameRow, int gameColumn) {
            Up up = new Up();
            Right right = new Right();
            return right.execute(up.execute(position, gameRow, gameColumn), gameRow, gameColumn);
        }
    }

    private static class DiagonalUpLeft implements MovementApplication {
        @Override
        public int[] execute(int[] position, int gameRow, int gameColumn) {
            Up up = new Up();
            Left left = new Left();
            return left.execute(up.execute(position, gameRow, gameColumn), gameRow, gameColumn);
        }
    }

    private static class DiagonalDownRight implements MovementApplication {
        @Override
        public int[] execute(int[] position, int gameRow, int gameColumn) {
            Down down = new Down();
            Right right = new Right();
            return right.execute(down.execute(position, gameRow, gameColumn), gameRow, gameColumn);
        }
    }

    private static class DiagonalDownLeft implements MovementApplication {
        @Override
        public int[] execute(int[] position, int gameRow, int gameColumn) {
            Down down = new Down();
            Left left = new Left();
            return left.execute(down.execute(position, gameRow, gameColumn), gameRow, gameColumn);
        }
    }


}
