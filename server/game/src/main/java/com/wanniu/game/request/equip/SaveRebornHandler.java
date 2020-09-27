/*    */ package com.wanniu.game.request.equip;
/*    */ 
/*    */ import com.wanniu.core.game.LangService;
/*    */ import com.wanniu.core.game.entity.GClientEvent;
/*    */ import com.wanniu.core.game.protocol.PomeloRequest;
/*    */ import com.wanniu.core.game.protocol.PomeloResponse;
/*    */ import com.wanniu.game.equip.EquipManager;
/*    */ import com.wanniu.game.equip.NormalEquip;
/*    */ import com.wanniu.game.item.NormalItem;
/*    */ import com.wanniu.game.player.WNPlayer;
/*    */ import java.io.IOException;
/*    */ import pomelo.area.EquipHandler;
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
/*    */ @GClientEvent("area.equipHandler.saveRebornRequest")
/*    */ public class SaveRebornHandler
/*    */   extends PomeloRequest
/*    */ {
/*    */   public PomeloResponse request() throws Exception {
/* 28 */     final WNPlayer player = (WNPlayer)this.pak.getPlayer();
/* 29 */     final EquipManager equipManager = player.equipManager;
/*    */     
/* 31 */     EquipHandler.SaveRebornRequest req = EquipHandler.SaveRebornRequest.parseFrom(this.pak.getRemaingBytes());
/* 32 */     final String equipId = req.getEquipId();
/*    */     
/* 34 */     return new PomeloResponse()
/*    */       {
/*    */         protected void write() throws IOException {
/* 37 */           EquipHandler.SaveRebornResponse.Builder res = EquipHandler.SaveRebornResponse.newBuilder();
/* 38 */           boolean isDressed = true;
/* 39 */           NormalEquip equip = null;
/* 40 */           int gridIndex = equipManager.getEquipmentById(equipId);
/* 41 */           if (gridIndex > 0) {
/* 42 */             equip = equipManager.getEquipment(gridIndex);
/*    */           }
/*    */           
/* 45 */           if (equip == null) {
/* 46 */             isDressed = false;
/* 47 */             NormalItem item = player.bag.findItemById(equipId);
/* 48 */             if (item != null) {
/* 49 */               equip = (NormalEquip)item;
/* 50 */               gridIndex = player.bag.findPosById(equipId);
/*    */             } 
/*    */           } 
/*    */           
/* 54 */           if (equip == null) {
/* 55 */             res.setS2CCode(500);
/* 56 */             res.setS2CMsg(LangService.getValue("BAG_STACKINDEX_ILLEGALITY"));
/* 57 */             this.body.writeBytes(res.build().toByteArray());
/*    */             
/*    */             return;
/*    */           } 
/* 61 */           equipManager.saveReborn(equip, gridIndex, isDressed);
/*    */           
/* 63 */           res.setS2CCode(200);
/* 64 */           this.body.writeBytes(res.build().toByteArray());
/*    */         }
/*    */       };
/*    */   }
/*    */ }


/* Location:              D:\Yxdl\xmds-server\mmoarpg-game.jar!\com\wanniu\game\request\equip\SaveRebornHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */