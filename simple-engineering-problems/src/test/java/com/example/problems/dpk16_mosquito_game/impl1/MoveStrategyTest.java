package com.example.problems.dpk16_mosquito_game.impl1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveStrategyTest {

    private Game game;

    @BeforeEach
    void setUp() {
        this.game = new Game(10, 10, 0, 0);
    }

    @Test
    void upShouldBeSuccess() {
        //up
        assertArrayEquals(new int[]{1, 0}, MoveStrategy.UP.getApplication().execute(new int[]{0, 0}, game));
        assertArrayEquals(new int[]{0, 0}, MoveStrategy.UP.getApplication().execute(new int[]{game.getRow(), 0}, game));
    }

    @Test
    void downShouldBeSuccess() {
        //down
        assertArrayEquals(new int[]{game.getRow(), 0}, MoveStrategy.DOWN.getApplication().execute(new int[]{0, 0}, game));
        assertArrayEquals(new int[]{game.getRow() - 1, 0}, MoveStrategy.DOWN.getApplication().execute(new int[]{game.getRow(), 0}, game));
    }

    @Test
    void leftShouldBeSuccess() {
        //left
        assertArrayEquals(new int[]{0, game.getColumn()}, MoveStrategy.LEFT.getApplication().execute(new int[]{0, 0}, game));
        assertArrayEquals(new int[]{0, game.getColumn() - 1}, MoveStrategy.LEFT.getApplication().execute(new int[]{0, game.getColumn()}, game));
    }

    @Test
    void rightShouldBeSuccess() {
        //right
        assertArrayEquals(new int[]{0, 1}, MoveStrategy.RIGHT.getApplication().execute(new int[]{0, 0}, game));
        assertArrayEquals(new int[]{0, 0}, MoveStrategy.RIGHT.getApplication().execute(new int[]{0, game.getColumn()}, game));
    }

    @Test
    void diagonalUpRightShouldBeSuccess() {
        //diagonal - up right
        assertArrayEquals(new int[]{1, 1}, MoveStrategy.DIAGONAL_UP_RIGHT.getApplication().execute(new int[]{0, 0}, game));
        assertArrayEquals(new int[]{0, 0}, MoveStrategy.DIAGONAL_UP_RIGHT.getApplication().execute(new int[]{game.getRow(), game.getColumn()}, game));
    }

    @Test
    void diagonalUpLeftShouldBeSuccess() {
        //diagonal - up left
        assertArrayEquals(new int[]{1, game.getColumn()}, MoveStrategy.DIAGONAL_UP_LEFT.getApplication().execute(new int[]{0, 0}, game));
        assertArrayEquals(new int[]{0, game.getColumn() - 1}, MoveStrategy.DIAGONAL_UP_LEFT.getApplication().execute(new int[]{game.getRow(), game.getColumn()}, game));
    }

    @Test
    void diagonalDownRightShouldBeSuccess() {
        //diagonal - down right
        assertArrayEquals(new int[]{game.getRow(), 1}, MoveStrategy.DIAGONAL_DOWN_RIGHT.getApplication().execute(new int[]{0, 0}, game));
        assertArrayEquals(new int[]{game.getRow() - 1, 0}, MoveStrategy.DIAGONAL_DOWN_RIGHT.getApplication().execute(new int[]{game.getRow(), game.getColumn()}, game));
    }

    @Test
    void diagonalDownLeftShouldBeSuccess() {
        //diagonal - down left
        assertArrayEquals(new int[]{game.getRow(), game.getColumn()}, MoveStrategy.DIAGONAL_DOWN_LEFT.getApplication().execute(new int[]{0, 0}, game));
        assertArrayEquals(new int[]{game.getRow() - 1, game.getColumn() - 1}, MoveStrategy.DIAGONAL_DOWN_LEFT.getApplication().execute(new int[]{game.getRow(), game.getColumn()}, game));
    }
}

