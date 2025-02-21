package com.example.problems.dpk16_mosquito_game.impl1;

import java.util.Random;

class Mosquito {

    private int[] position;
    private Random random;
    public int moves;

    private Game game;


    public Mosquito(Random random, int[] position, Game game) {
        this.random = random;
        this.position = position;
        this.moves = 0;
        this.game = game;
    }


    public int[] getPosition() {
        return position;
    }

    public int getMoves() {
        return moves;
    }

    private MoveStrategy getNextMove() {
        int randomIndex = random.nextInt(MoveStrategy.values().length);
        return MoveStrategy.values()[randomIndex];
    }

    public void move() {
        MoveStrategy moveStrategy = getNextMove();
        position = moveStrategy.getApplication().execute(position, game);
    }



    public boolean hasMosquitoNearby() {
        for (MoveStrategy strategy : MoveStrategy.values()) {
            int[] positionToCheck = strategy.getApplication().execute(new int[]{position[0], position[1]}, game);
            Object possibleMosquito = game.getGrid()[positionToCheck[0]][positionToCheck[1]];
            if (null != possibleMosquito && possibleMosquito instanceof Mosquito) {
                return true;
            }
        }
        return false;
    }
}