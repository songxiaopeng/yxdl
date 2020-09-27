/*    */ package com.wanniu.game.data.ext;
/*    */ 
/*    */ import com.wanniu.game.data.ReBuildCO;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ReBuildExt
/*    */   extends ReBuildCO
/*    */ {
/*    */   public Map<String, Integer> materials;
/*    */   
/*    */   public int getKey() {
/* 19 */     return this.iD;
/*    */   }
/*    */ 
/*    */   
/*    */   public void initProperty() {
/* 24 */     this.materials = new HashMap<>();
/* 25 */     this.materials.put(this.mateCode1, Integer.valueOf(this.mateCount1));
/* 26 */     this.materials.put(this.mateCode2, Integer.valueOf(this.mateCount2));
/* 27 */     this.materials.put(this.mateCode3, Integer.valueOf(this.mateCount3));
/*    */   }
/*    */ }


/* Location:              D:\Yxdl\xmds-server\mmoarpg-game.jar!\com\wanniu\game\data\ext\ReBuildExt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */