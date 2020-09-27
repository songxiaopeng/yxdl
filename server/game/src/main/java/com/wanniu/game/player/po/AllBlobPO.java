/*    */ package com.wanniu.game.player.po;
/*    */ 
/*    */ import com.wanniu.game.common.Const;
/*    */ import com.wanniu.game.poes.AchievementDataPO;
/*    */ import com.wanniu.game.poes.CdksUsePO;
/*    */ import com.wanniu.game.poes.Five2FivePO;
/*    */ import com.wanniu.game.poes.Five2FivePlayerBtlReportPO;
/*    */ import com.wanniu.game.poes.HookSetPO;
/*    */ import com.wanniu.game.poes.PlayerAttachPO;
/*    */ import com.wanniu.game.poes.PlayerBasePO;
/*    */ import com.wanniu.game.poes.PlayerChouRenPO;
/*    */ import com.wanniu.game.poes.PlayerPO;
/*    */ import com.wanniu.game.poes.PlayerTempPO;
/*    */ import com.wanniu.game.poes.TaskListPO;
/*    */ import com.wanniu.game.poes.XianYuanPO;
/*    */ import java.util.List;
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
/*    */ public class AllBlobPO
/*    */ {
/*    */   public PlayerPO player;
/*    */   public PlayerBasePO playerBase;
/*    */   public PlayerAttachPO playerAttachPO;
/*    */   public PlayerTempPO playerTemp;
/*    */   public TaskListPO tasks;
/*    */   public AchievementDataPO achievements;
/*    */   public HookSetPO hookSetData;
/*    */   public PlayerChouRenPO chouRens;
/*    */   public XianYuanPO xianYuan;
/*    */   public Five2FivePO five2FivePo;
/*    */   public List<Five2FivePlayerBtlReportPO> five2FiveBtlReportPO;
/*    */   public CdksUsePO cdksUserPo;
/*    */   public Map<Const.PlayerBtlData, Integer> robotAttr;
/*    */   
/*    */   public AllBlobPO() {}
/*    */   
/*    */   public AllBlobPO(PlayerPO player, PlayerBasePO playerBase, PlayerTempPO playerTemp) {
/* 62 */     this.player = player;
/* 63 */     this.playerBase = playerBase;
/* 64 */     this.playerTemp = playerTemp;
/*    */   }
/*    */ }


/* Location:              D:\Yxdl\xmds-server\mmoarpg-game.jar!\com\wanniu\game\player\po\AllBlobPO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */