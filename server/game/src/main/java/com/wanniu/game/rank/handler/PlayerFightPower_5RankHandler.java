/*    */ package com.wanniu.game.rank.handler;
/*    */ 
/*    */ import com.wanniu.game.rank.RankType;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class PlayerFightPower_5RankHandler
/*    */   extends PlayerFightPowerRankHandler
/*    */ {
/*    */   protected String getRedisKey(int logicServerId, int season) {
/* 14 */     return RankType.FIGHTPOWER_5.getRedisKey(logicServerId, season);
/*    */   }
/*    */ }


/* Location:              D:\Yxdl\xmds-server\mmoarpg-game.jar!\com\wanniu\game\rank\handler\PlayerFightPower_5RankHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */