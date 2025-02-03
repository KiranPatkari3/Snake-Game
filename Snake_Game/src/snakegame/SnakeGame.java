package snakegame;

import javax.swing.*;

public class SnakeGame extends JFrame {
    
    SnakeGame() {
        super("Snake Game");//use to call super class constructor
        add(new Board());
        pack();//use to refresh frame
        
        setLocationRelativeTo(null);//for centerr aliign
        setResizable(false);
    }

    public static void main(String[] args) {
        new SnakeGame().setVisible(true);
    }
}

    