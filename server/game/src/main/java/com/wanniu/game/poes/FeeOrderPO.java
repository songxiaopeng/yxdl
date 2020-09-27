package com.wanniu.game.poes;

import com.wanniu.core.game.entity.GEntity;
import com.wanniu.game.DBField;
import java.util.Date;

public class FeeOrderPO extends GEntity {
  @DBField(isPKey = true, fieldType = "varchar", size = 64)
  public String orderId;
  
  public int productId;
  
  public String playerId;
  
  public Date createtime;
  
  public boolean isCard;
  
  public boolean isSuperPackage;
}


/* Location:              D:\Yxdl\xmds-server\mmoarpg-game.jar!\com\wanniu\game\poes\FeeOrderPO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */