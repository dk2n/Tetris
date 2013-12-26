import java.awt.*;
import javax.swing.*;
import java.lang.*;
import java.util.Scanner;

public class Tetriminos {

  private static final int I_BLOCK = 1;
  private static final int J_BLOCK = 2;
  private static final int L_BLOCK = 3;
  private static final int T_BLOCK = 4;
  private static final int S_BLOCK = 5;
  private static final int Z_BLOCK = 6;
  private static final int O_BLOCK = 7;

  private int row;
  private int col;
  private char theBoard[][];
  private char aChar = ' ';

  /** Default constructor
   * Create 2D array of int which 16-10 dimemsion
   */
  public Tetriminos() {
    this( 16, 10 );
  }

  public Tetriminos( int row, int col ) {
    this.row = row;
    this.col = col;  
    theBoard = new char[row][col];
    for( int i = 0; i < theBoard.length; i++ ) {
      for( int j = 0; j < theBoard[i].length; j++ ) {
        theBoard[i][j] = ' ';
      }
    } 
  }


  public String toString() {
    StringBuilder str = new StringBuilder();
    int number = row - 1;
    for( int i = 0; i < theBoard.length; i++ ) {
      if( number < 10 ) {
        str.append( number-- + "   " );
      } else {
        str.append( number-- + "  " );
      }
      for( int j = 0; j < theBoard[i].length; j++ ) {
        str.append( "|" + theBoard[i][j] );
      }
      str.append( "|\n" );
      
      if( i == theBoard.length - 1 ) {
        int num = 0;
        str.append( "   " );
        for( int j = 0; j < theBoard[i].length; j++ ) {
          str.append( " " + num++ );
        } 
        str.append( " " + num + "\n" );
      }
    } 
    return str.toString();
  }

  public void boardContent( int i, int j, char a ) {
    if( i < 0 || i > this.row || j < 0 || j > this.col  ) {
      System.out.println( "Hey, come back here, dude" );
      System.out.println( "You can't go beyond the bound!" );
      throw new IndexOutOfBoundsException();
    }
    else {
      i = this.row - i - 1;
      theBoard[i][j] = a;
    }
  }

  public void o_block( int col ) {
    int row = this.row - 1;
    while( row-1 >= 0) {
      if( !filled( row, col ) && !filled( row-1, col )
         && !filled( row, col+1 ) && !filled( row-1, col+1 )) {
        
        theBoard[row][col] = 'o';
        theBoard[row-1][col] = 'o';
        theBoard[row][col+1] = 'o';
        theBoard[row-1][col+1] = 'o';
        break;
      }
      else 
        --row;
    }
  }

  public void l_block( int col ) {
    int row = this.row - 1;
    while( row >= 0 && row-3 >= 0 ) {
      if( !filled( row, col ) && !filled( row-1, col )
        && !filled( row-2, col ) && !filled( row-3, col )) {
        
        theBoard[row][col] = 'l';
        theBoard[row-1][col] = 'l';
        theBoard[row-2][col] = 'l';
        theBoard[row-3][col] = 'l';
        break;
      }
      else
        --row;
    }
  }

  

  public void blockIma( int a , int b ) {
    switch( (a % 2) + 1 ) {
      case 1:
        o_block( b );
        break;
      case 2:
        l_block( b );
        break;
      default:
        break;
    }
  }
  public boolean filled( int row, int col ) {
    if( theBoard[row][col] == ' ' )
      return false;
    else return true;
  }
  

  public static void  main( String args[] ) {
    Tetriminos myGame = new Tetriminos();
    while( true ) {
      Scanner input = new Scanner( System.in );
      int a = input.nextInt();
      int b = input.nextInt();
      myGame.blockIma( a, b );
   
      System.out.println( myGame );
    }
  }
}
