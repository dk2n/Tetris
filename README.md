Tetris
======

Tetris - README

The purpose of this programming assignment is to implement the famous game Tetris by using the java frameworks. 

Function prototypes of the java interface that we will write:

------Tetriminos.java:

	/** Game display */
	void i_block();		// Create an i block image.
	void j_block();		// Create an j block image.
	void l_block();		// Create an l block image.	
	void t_block();		// Create an t block image.
	void s_block();		// Create an s block image.
	void z_block();		// Create an z block image.
	void o_block();		// Create an o block image.

  	/** Control buttons */
  	void start_button();		
  	void pause_button();	
  	void quit_button();
  	void new_game();


------Gameplay.java:

  	/** Game actions */
	boolean spin_left();		// Rotate the block image 90 degree to the left.
  	boolean spin_right();		// Rotate the block image 90 degree to the right.
	boolean gravity();		// Block floating. 
	boolean push_down();		// Push down the block.
	boolean block_connected();	// Connect the blocks. 
	int line_destroy();		// Number of lines will be destroyed.
	
	/** Game controls */
  	boolean start_game();		// Start the game.
	boolean pause_game();		// Pause the game.
	boolean quit_game();		// Quit the game.

	/** Score award */
	int score_award( int lines );	// Score earns. 
		
