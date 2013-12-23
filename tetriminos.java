import java.awt.*;
import javax.swing.*;

public class tetriminos extends JFrame {

  private static final int I_BLOCK = 1;
  private static final int J_BLOCK = 2;
  private static final int L_BLOCK = 3;
  private static final int T_BLOCK = 4;
  private static final int S_BLOCK = 5;
  private static final int Z_BLOCK = 6;
  private static final int O_BLOCK = 7;

  public int i_block() {
    return I_BLOCK;
  }

  public int j_block() {
    return J_BLOCK;
  }

  public int l_block() {
    return L_BLOCK;
  }

  public int t_block() {
    return T_BLOCK;
  }

  public int s_block() {
    return S_BLOCK;
  }
  public int z_block() {
    return Z_BLOCK;
  }
  public int o_block() {
    return O_BLOCK;
  }
  
  public void start_button() {}

  public void pause_button() {}

  public void quit_button() {}

  public void new_game() {}

  protected void painComponent( Graphics g ) {
    super.paintComponent( g );
  }
}
