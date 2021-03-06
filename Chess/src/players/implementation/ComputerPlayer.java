package players.implementation;

import chess.Chessboard;
import chess.Colors;
import pieces.Piece;
import players.Player;
import players.PlayerType;





































public class ComputerPlayer
  implements Player
{
  protected String name;
  protected Colors color;
  protected PlayerType playerType;
  protected boolean goDown;
  
  public ComputerPlayer()
  {
    playerType = PlayerType.COMPUTER;
  }
  





  public ComputerPlayer(String name, String color)
  {
    this(name, Colors.valueOf(color.toUpperCase()));
  }
  





  public ComputerPlayer(String name, Colors color)
  {
    this();
    this.name = name;
    this.color = color;
    goDown = false;
  }
  




  public void setName(String name)
  {
    this.name = name;
  }
  




  public String getName()
  {
    return name;
  }
  




  public void setType(PlayerType type)
  {
    playerType = type;
  }
  




  public Colors getColor()
  {
    return color;
  }
  




  public PlayerType getPlayerType()
  {
    return playerType;
  }
  




  public boolean isGoDown()
  {
    return goDown;
  }
  

  public void setGoDown(boolean goDown)
  {
    this.goDown = goDown;
  }
  
  public Piece getPromotionPiece(Chessboard chessboard)
  {
    return null;
  }
}
