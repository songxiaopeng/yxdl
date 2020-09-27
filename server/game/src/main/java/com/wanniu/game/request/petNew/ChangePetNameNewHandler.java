/*    */ package com.wanniu.game.request.petNew;
/*    */ 
/*    */ import com.wanniu.core.game.entity.GClientEvent;
/*    */ import com.wanniu.core.game.protocol.PomeloRequest;
/*    */ import com.wanniu.core.game.protocol.PomeloResponse;
/*    */ import com.wanniu.core.tcp.protocol.Packet;
/*    */ import com.wanniu.game.player.WNPlayer;
/*    */ import java.io.IOException;
/*    */ import pomelo.area.PetNewHandler;
/*    */ 
/*    */ 
/*    */ 
/*    */ @GClientEvent("area.petNewHandler.changePetNameNewRequest")
/*    */ public class ChangePetNameNewHandler
/*    */   extends PomeloRequest
/*    */ {
/*    */   public PomeloResponse request() throws Exception {
/* 18 */     final WNPlayer player = (WNPlayer)this.pak.getPlayer();
/*    */     
/* 20 */     return new PomeloResponse() {
/*    */         protected void write() throws IOException {
/* 22 */           PetNewHandler.ChangePetNameNewRequest req = PetNewHandler.ChangePetNameNewRequest.parseFrom(ChangePetNameNewHandler.this.pak.getRemaingBytes());
/* 23 */           int id = req.getC2SId();
/* 24 */           String name = req.getC2SName();
/* 25 */           PetNewHandler.ChangePetNameNewResponse.Builder res = player.petNewManager.changePetName(id, name);
/* 26 */           this.body.writeBytes(res.build().toByteArray());
/*    */         }
/*    */       };
/*    */   }
/*    */ }


/* Location:              D:\Yxdl\xmds-server\mmoarpg-game.jar!\com\wanniu\game\request\petNew\ChangePetNameNewHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */