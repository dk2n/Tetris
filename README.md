Tetris
======

Tetris - README

The purpose of this programming assignment is to implement the famous 
game Tetris by using the java frameworks. 

Function prototypes of the java interface that we will write:

------Tetriminos.java:

/** Game display */
1) void i_block();		// Create an i block image.
2) void j_block();		// Create an j block image.
3) void l_block();		// Create an l block image.	
4) void t_block();		// Create an t block image.
5) void s_block();		// Create an s block image.
6) void z_block();		// Create an z block image.
7) void o_block();		// Create an o block image.

/** Control buttons */
8)  void start_button();	// Start button.		
9)  void pause_button();	// Pause button.
10) void quit_button();		// Quit button.
11) void new_game();		// Create a new game.


------Gameplay.java:

/** Game actions */
1) boolean spin_left();		// Rotate the block image 90 degree to the left.
2) boolean spin_right();	// Rotate the block image 90 degree to the right.
3) boolean gravity();		// Block floating. 
4) boolean push_down();		// Push down the block.
5) boolean block_connected();	// Connect the blocks. 
6) int line_destroy();		// Number of lines will be destroyed.

/** Game controls */
7) boolean start_game();	// Start the game.
8) boolean pause_game();	// Pause the game.
9) boolean quit_game();		// Quit the game.

/** Score award */
10) int score_award( int lines );	// Score earns. 
	
