Tetris
======

Tetris - README

The purpose of this programming assignment is to implement the famous 
game Tetris by using the java frameworks. 

Function prototypes of the java interface that we will write:

------Tetriminos.java:

/** Game display */
1) public void i_block();		// Create an i block image.
2) public void j_block();		// Create an j block image.
3) public void l_block();		// Create an l block image.	
4) public void t_block();		// Create an t block image.
5) public void s_block();		// Create an s block image.
6) public void z_block();		// Create an z block image.
7) public void o_block();		// Create an o block image.

/** Control buttons */
8)  public void start_button();		// Start button.		
9)  public void pause_button();		// Pause button.
10) public void quit_button();		// Quit button.
11) public void new_game();		// Create a new game.


------Gameplay.java:

/** Game actions */
1) public boolean spin_left();		// Rotate the block image 90 degree to the left.
2) public boolean spin_right();		// Rotate the block image 90 degree to the right.
3) public boolean gravity();		// Block floating. 
4) public boolean push_down();		// Push down the block.
5) public boolean block_connected();	// Connect the blocks. 
6) public int line_destroy();		// Number of lines will be destroyed.

/** Game controls */
7) public boolean start_game();		// Start the game.
8) public boolean pause_game();		// Pause the game.
9) public boolean quit_game();		// Quit the game.

/** Score award */
10) int score_award( int lines );	// Score earns. 
	
