/*    */ package com.wanniu.game.five2Five;
/*    */ 
/*    */ import java.util.Date;
/*    */ import java.util.List;
/*    */ import java.util.concurrent.CopyOnWriteArrayList;
/*    */ import java.util.concurrent.atomic.AtomicBoolean;
/*    */ import java.util.concurrent.atomic.AtomicInteger;
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
/*    */ public class Five2FiveMatchTeamVo
/*    */ {
/*    */   public String tempTeamId;
/*    */   public String oppoTempTeamId;
/*    */   public Date joinTime;
/*    */   public CopyOnWriteArrayList<Five2FiveTempTeamMember> tempTeamMember;
/*    */   public int teamScore;
/*    */   public List<Five2FiveTeamApplyVo> teamMatchVos;
/*    */   public List<Five2FiveSingleApplyVo> singleMatchVos;
/* 29 */   public AtomicBoolean isAllChoice = new AtomicBoolean(false);
/*    */   
/* 31 */   public AtomicInteger useNumber = new AtomicInteger(0);
/*    */ }


/* Location:              D:\Yxdl\xmds-server\mmoarpg-game.jar!\com\wanniu\game\five2Five\Five2FiveMatchTeamVo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */