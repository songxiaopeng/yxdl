/*    */ package com.wanniu.game.poes;
/*    */ 
/*    */ import com.wanniu.core.game.entity.GEntity;
/*    */ import com.wanniu.game.DBField;
/*    */ import java.util.Date;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Five2FiveSystemPO
/*    */   extends GEntity
/*    */ {
/*    */   @DBField(isPKey = true, fieldType = "varchar", size = 50)
/*    */   public String id;
/*    */   public int logicServerId;
/*    */   public long teamTotalMatchSuccessCostTime;
/*    */   public long singleTotalMatchSuccessCostTime;
/*    */   public int totalMatchSuccessSingle;
/*    */   public int totalMatchSuccessTeam;
/* 30 */   public Date seasonRefreshTime = new Date();
/*    */   public Map<String, Integer> hasNoReciveRankRewardPlayer;
/*    */ }


/* Location:              D:\Yxdl\xmds-server\mmoarpg-game.jar!\com\wanniu\game\poes\Five2FiveSystemPO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */