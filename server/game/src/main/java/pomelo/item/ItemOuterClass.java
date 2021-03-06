package pomelo.item;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.RepeatedFieldBuilder;
import com.google.protobuf.UnknownFieldSet;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import pomelo.Common;

public final class ItemOuterClass {
    public static void registerAllExtensions(ExtensionRegistry registry) {
    }

    public enum BindType implements ProtocolMessageEnum {
        UN_BIND(0, 0),


        BIND(1, 1),


        EQUIP_BIND(2, 2),


        BIND_AFTER_GET(3, 3),


        EQUIP_BIND_AFTER_GET(4, 4);


        public static final int UN_BIND_VALUE = 0;


        public static final int BIND_VALUE = 1;


        public static final int EQUIP_BIND_VALUE = 2;


        public static final int BIND_AFTER_GET_VALUE = 3;


        public static final int EQUIP_BIND_AFTER_GET_VALUE = 4;


        private static Internal.EnumLiteMap<BindType> internalValueMap = new Internal.EnumLiteMap<BindType>() {
            public ItemOuterClass.BindType findValueByNumber(int number) {
                return ItemOuterClass.BindType.valueOf(number);
            }
        };


        private static final BindType[] VALUES = values();
        private final int index;
        private final int value;

        public final int getNumber() {
            return this.value;
        }

        public static Internal.EnumLiteMap<BindType> internalGetValueMap() {
            return internalValueMap;
        }

        static {

        }

        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            return getDescriptor().getValues().get(this.index);
        }

        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return ItemOuterClass.getDescriptor().getEnumTypes().get(0);
        }

        BindType(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }


    public static final class Item
            extends GeneratedMessage
            implements ItemOrBuilder {
        private static final Item defaultInstance = new Item(true);
        private final UnknownFieldSet unknownFields;

        private Item(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private Item(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static Item getDefaultInstance() {
            return defaultInstance;
        }

        public Item getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private Item(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    ByteString bs;
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 10:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x1;
                            this.id_ = bs;
                            break;
                        case 18:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x2;
                            this.code_ = bs;
                            break;
                        case 24:
                            this.bitField0_ |= 0x4;
                            this.itemType_ = input.readInt32();
                            break;
                        case 32:
                            this.bitField0_ |= 0x8;
                            this.itemSecondType_ = input.readInt32();
                            break;
                        case 40:
                            this.bitField0_ |= 0x10;
                            this.qColor_ = input.readInt32();
                            break;
                        case 48:
                            this.bitField0_ |= 0x20;
                            this.maxGroupCount_ = input.readInt32();
                            break;
                        case 56:
                            this.bitField0_ |= 0x40;
                            this.groupCount_ = input.readInt32();
                            break;
                        case 64:
                            this.bitField0_ |= 0x80;
                            this.isNew_ = input.readInt32();
                            break;
                        case 74:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x100;
                            this.icon_ = bs;
                            break;
                        case 80:
                            this.bitField0_ |= 0x200;
                            this.enLevel_ = input.readInt32();
                            break;
                        case 88:
                            this.bitField0_ |= 0x400;
                            this.star_ = input.readInt32();
                            break;
                        case 98:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x800;
                            this.cdTime_ = bs;
                            break;
                        case 104:
                            this.bitField0_ |= 0x1000;
                            this.bindType_ = input.readInt32();
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ItemOuterClass.internal_static_pomelo_item_Item_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return ItemOuterClass.internal_static_pomelo_item_Item_fieldAccessorTable.ensureFieldAccessorsInitialized(Item.class, Builder.class);
        }

        public static Parser<Item> PARSER = (Parser<Item>) new AbstractParser<Item>() {
            public ItemOuterClass.Item parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new ItemOuterClass.Item(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int ID_FIELD_NUMBER = 1;
        private Object id_;
        public static final int CODE_FIELD_NUMBER = 2;
        private Object code_;
        public static final int ITEMTYPE_FIELD_NUMBER = 3;
        private int itemType_;
        public static final int ITEMSECONDTYPE_FIELD_NUMBER = 4;
        private int itemSecondType_;
        public static final int QCOLOR_FIELD_NUMBER = 5;
        private int qColor_;
        public static final int MAXGROUPCOUNT_FIELD_NUMBER = 6;
        private int maxGroupCount_;
        public static final int GROUPCOUNT_FIELD_NUMBER = 7;
        private int groupCount_;
        public static final int ISNEW_FIELD_NUMBER = 8;
        private int isNew_;
        public static final int ICON_FIELD_NUMBER = 9;
        private Object icon_;
        public static final int ENLEVEL_FIELD_NUMBER = 10;
        private int enLevel_;
        public static final int STAR_FIELD_NUMBER = 11;
        private int star_;
        public static final int CDTIME_FIELD_NUMBER = 12;
        private Object cdTime_;
        public static final int BINDTYPE_FIELD_NUMBER = 13;
        private int bindType_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<Item> getParserForType() {
            return PARSER;
        }

        public boolean hasId() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public String getId() {
            Object ref = this.id_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.id_ = s;
            return s;
        }

        public ByteString getIdBytes() {
            Object ref = this.id_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.id_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public boolean hasCode() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        public String getCode() {
            Object ref = this.code_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.code_ = s;
            return s;
        }

        public ByteString getCodeBytes() {
            Object ref = this.code_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.code_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public boolean hasItemType() {
            return ((this.bitField0_ & 0x4) == 4);
        }

        public int getItemType() {
            return this.itemType_;
        }

        public boolean hasItemSecondType() {
            return ((this.bitField0_ & 0x8) == 8);
        }

        public int getItemSecondType() {
            return this.itemSecondType_;
        }

        public boolean hasQColor() {
            return ((this.bitField0_ & 0x10) == 16);
        }

        public int getQColor() {
            return this.qColor_;
        }

        public boolean hasMaxGroupCount() {
            return ((this.bitField0_ & 0x20) == 32);
        }

        public int getMaxGroupCount() {
            return this.maxGroupCount_;
        }

        public boolean hasGroupCount() {
            return ((this.bitField0_ & 0x40) == 64);
        }

        public int getGroupCount() {
            return this.groupCount_;
        }

        public boolean hasIsNew() {
            return ((this.bitField0_ & 0x80) == 128);
        }

        public int getIsNew() {
            return this.isNew_;
        }

        public boolean hasIcon() {
            return ((this.bitField0_ & 0x100) == 256);
        }

        public String getIcon() {
            Object ref = this.icon_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.icon_ = s;
            return s;
        }

        public ByteString getIconBytes() {
            Object ref = this.icon_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.icon_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public boolean hasEnLevel() {
            return ((this.bitField0_ & 0x200) == 512);
        }

        public int getEnLevel() {
            return this.enLevel_;
        }

        public boolean hasStar() {
            return ((this.bitField0_ & 0x400) == 1024);
        }

        public int getStar() {
            return this.star_;
        }

        public boolean hasCdTime() {
            return ((this.bitField0_ & 0x800) == 2048);
        }

        public String getCdTime() {
            Object ref = this.cdTime_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.cdTime_ = s;
            return s;
        }

        public ByteString getCdTimeBytes() {
            Object ref = this.cdTime_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.cdTime_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public boolean hasBindType() {
            return ((this.bitField0_ & 0x1000) == 4096);
        }

        public int getBindType() {
            return this.bindType_;
        }

        private void initFields() {
            this.id_ = "";
            this.code_ = "";
            this.itemType_ = 0;
            this.itemSecondType_ = 0;
            this.qColor_ = 0;
            this.maxGroupCount_ = 0;
            this.groupCount_ = 0;
            this.isNew_ = 0;
            this.icon_ = "";
            this.enLevel_ = 0;
            this.star_ = 0;
            this.cdTime_ = "";
            this.bindType_ = 0;
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            if (!hasId()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasCode()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasItemType()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasItemSecondType()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasQColor()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasMaxGroupCount()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasGroupCount()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasIsNew()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasIcon()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) output.writeBytes(1, getIdBytes());
            if ((this.bitField0_ & 0x2) == 2) output.writeBytes(2, getCodeBytes());
            if ((this.bitField0_ & 0x4) == 4) output.writeInt32(3, this.itemType_);
            if ((this.bitField0_ & 0x8) == 8) output.writeInt32(4, this.itemSecondType_);
            if ((this.bitField0_ & 0x10) == 16) output.writeInt32(5, this.qColor_);
            if ((this.bitField0_ & 0x20) == 32) output.writeInt32(6, this.maxGroupCount_);
            if ((this.bitField0_ & 0x40) == 64) output.writeInt32(7, this.groupCount_);
            if ((this.bitField0_ & 0x80) == 128) output.writeInt32(8, this.isNew_);
            if ((this.bitField0_ & 0x100) == 256) output.writeBytes(9, getIconBytes());
            if ((this.bitField0_ & 0x200) == 512) output.writeInt32(10, this.enLevel_);
            if ((this.bitField0_ & 0x400) == 1024) output.writeInt32(11, this.star_);
            if ((this.bitField0_ & 0x800) == 2048) output.writeBytes(12, getCdTimeBytes());
            if ((this.bitField0_ & 0x1000) == 4096) output.writeInt32(13, this.bindType_);
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) size += CodedOutputStream.computeBytesSize(1, getIdBytes());
            if ((this.bitField0_ & 0x2) == 2) size += CodedOutputStream.computeBytesSize(2, getCodeBytes());
            if ((this.bitField0_ & 0x4) == 4) size += CodedOutputStream.computeInt32Size(3, this.itemType_);
            if ((this.bitField0_ & 0x8) == 8) size += CodedOutputStream.computeInt32Size(4, this.itemSecondType_);
            if ((this.bitField0_ & 0x10) == 16) size += CodedOutputStream.computeInt32Size(5, this.qColor_);
            if ((this.bitField0_ & 0x20) == 32) size += CodedOutputStream.computeInt32Size(6, this.maxGroupCount_);
            if ((this.bitField0_ & 0x40) == 64) size += CodedOutputStream.computeInt32Size(7, this.groupCount_);
            if ((this.bitField0_ & 0x80) == 128) size += CodedOutputStream.computeInt32Size(8, this.isNew_);
            if ((this.bitField0_ & 0x100) == 256) size += CodedOutputStream.computeBytesSize(9, getIconBytes());
            if ((this.bitField0_ & 0x200) == 512) size += CodedOutputStream.computeInt32Size(10, this.enLevel_);
            if ((this.bitField0_ & 0x400) == 1024) size += CodedOutputStream.computeInt32Size(11, this.star_);
            if ((this.bitField0_ & 0x800) == 2048) size += CodedOutputStream.computeBytesSize(12, getCdTimeBytes());
            if ((this.bitField0_ & 0x1000) == 4096) size += CodedOutputStream.computeInt32Size(13, this.bindType_);
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static Item parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (Item) PARSER.parseFrom(data);
        }

        public static Item parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Item) PARSER.parseFrom(data, extensionRegistry);
        }

        public static Item parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (Item) PARSER.parseFrom(data);
        }

        public static Item parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Item) PARSER.parseFrom(data, extensionRegistry);
        }

        public static Item parseFrom(InputStream input) throws IOException {
            return (Item) PARSER.parseFrom(input);
        }

        public static Item parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Item) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Item parseDelimitedFrom(InputStream input) throws IOException {
            return (Item) PARSER.parseDelimitedFrom(input);
        }

        public static Item parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Item) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static Item parseFrom(CodedInputStream input) throws IOException {
            return (Item) PARSER.parseFrom(input);
        }

        public static Item parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Item) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(Item prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements ItemOuterClass.ItemOrBuilder {
            private int bitField0_;
            private Object id_;
            private Object code_;
            private int itemType_;
            private int itemSecondType_;
            private int qColor_;
            private int maxGroupCount_;
            private int groupCount_;
            private int isNew_;
            private Object icon_;
            private int enLevel_;
            private int star_;
            private Object cdTime_;
            private int bindType_;

            public static final Descriptors.Descriptor getDescriptor() {
                return ItemOuterClass.internal_static_pomelo_item_Item_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return ItemOuterClass.internal_static_pomelo_item_Item_fieldAccessorTable.ensureFieldAccessorsInitialized(ItemOuterClass.Item.class, Builder.class);
            }

            private Builder() {
                this.id_ = "";
                this.code_ = "";
                this.icon_ = "";
                this.cdTime_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.id_ = "";
                this.code_ = "";
                this.icon_ = "";
                this.cdTime_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (ItemOuterClass.Item.alwaysUseFieldBuilders) ;
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.id_ = "";
                this.bitField0_ &= 0xFFFFFFFE;
                this.code_ = "";
                this.bitField0_ &= 0xFFFFFFFD;
                this.itemType_ = 0;
                this.bitField0_ &= 0xFFFFFFFB;
                this.itemSecondType_ = 0;
                this.bitField0_ &= 0xFFFFFFF7;
                this.qColor_ = 0;
                this.bitField0_ &= 0xFFFFFFEF;
                this.maxGroupCount_ = 0;
                this.bitField0_ &= 0xFFFFFFDF;
                this.groupCount_ = 0;
                this.bitField0_ &= 0xFFFFFFBF;
                this.isNew_ = 0;
                this.bitField0_ &= 0xFFFFFF7F;
                this.icon_ = "";
                this.bitField0_ &= 0xFFFFFEFF;
                this.enLevel_ = 0;
                this.bitField0_ &= 0xFFFFFDFF;
                this.star_ = 0;
                this.bitField0_ &= 0xFFFFFBFF;
                this.cdTime_ = "";
                this.bitField0_ &= 0xFFFFF7FF;
                this.bindType_ = 0;
                this.bitField0_ &= 0xFFFFEFFF;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return ItemOuterClass.internal_static_pomelo_item_Item_descriptor;
            }

            public ItemOuterClass.Item getDefaultInstanceForType() {
                return ItemOuterClass.Item.getDefaultInstance();
            }

            public ItemOuterClass.Item build() {
                ItemOuterClass.Item result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public ItemOuterClass.Item buildPartial() {
                ItemOuterClass.Item result = new ItemOuterClass.Item(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.id_ = this.id_;
                if ((from_bitField0_ & 0x2) == 2) to_bitField0_ |= 0x2;
                result.code_ = this.code_;
                if ((from_bitField0_ & 0x4) == 4) to_bitField0_ |= 0x4;
                result.itemType_ = this.itemType_;
                if ((from_bitField0_ & 0x8) == 8) to_bitField0_ |= 0x8;
                result.itemSecondType_ = this.itemSecondType_;
                if ((from_bitField0_ & 0x10) == 16) to_bitField0_ |= 0x10;
                result.qColor_ = this.qColor_;
                if ((from_bitField0_ & 0x20) == 32) to_bitField0_ |= 0x20;
                result.maxGroupCount_ = this.maxGroupCount_;
                if ((from_bitField0_ & 0x40) == 64) to_bitField0_ |= 0x40;
                result.groupCount_ = this.groupCount_;
                if ((from_bitField0_ & 0x80) == 128) to_bitField0_ |= 0x80;
                result.isNew_ = this.isNew_;
                if ((from_bitField0_ & 0x100) == 256) to_bitField0_ |= 0x100;
                result.icon_ = this.icon_;
                if ((from_bitField0_ & 0x200) == 512) to_bitField0_ |= 0x200;
                result.enLevel_ = this.enLevel_;
                if ((from_bitField0_ & 0x400) == 1024) to_bitField0_ |= 0x400;
                result.star_ = this.star_;
                if ((from_bitField0_ & 0x800) == 2048) to_bitField0_ |= 0x800;
                result.cdTime_ = this.cdTime_;
                if ((from_bitField0_ & 0x1000) == 4096) to_bitField0_ |= 0x1000;
                result.bindType_ = this.bindType_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof ItemOuterClass.Item) return mergeFrom((ItemOuterClass.Item) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(ItemOuterClass.Item other) {
                if (other == ItemOuterClass.Item.getDefaultInstance()) return this;
                if (other.hasId()) {
                    this.bitField0_ |= 0x1;
                    this.id_ = other.id_;
                    onChanged();
                }
                if (other.hasCode()) {
                    this.bitField0_ |= 0x2;
                    this.code_ = other.code_;
                    onChanged();
                }
                if (other.hasItemType()) setItemType(other.getItemType());
                if (other.hasItemSecondType()) setItemSecondType(other.getItemSecondType());
                if (other.hasQColor()) setQColor(other.getQColor());
                if (other.hasMaxGroupCount()) setMaxGroupCount(other.getMaxGroupCount());
                if (other.hasGroupCount()) setGroupCount(other.getGroupCount());
                if (other.hasIsNew()) setIsNew(other.getIsNew());
                if (other.hasIcon()) {
                    this.bitField0_ |= 0x100;
                    this.icon_ = other.icon_;
                    onChanged();
                }
                if (other.hasEnLevel()) setEnLevel(other.getEnLevel());
                if (other.hasStar()) setStar(other.getStar());
                if (other.hasCdTime()) {
                    this.bitField0_ |= 0x800;
                    this.cdTime_ = other.cdTime_;
                    onChanged();
                }
                if (other.hasBindType()) setBindType(other.getBindType());
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasId()) return false;
                if (!hasCode()) return false;
                if (!hasItemType()) return false;
                if (!hasItemSecondType()) return false;
                if (!hasQColor()) return false;
                if (!hasMaxGroupCount()) return false;
                if (!hasGroupCount()) return false;
                if (!hasIsNew()) return false;
                if (!hasIcon()) return false;
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                ItemOuterClass.Item parsedMessage = null;
                try {
                    parsedMessage = (ItemOuterClass.Item) ItemOuterClass.Item.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ItemOuterClass.Item) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasId() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public String getId() {
                Object ref = this.id_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) this.id_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getIdBytes() {
                Object ref = this.id_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.id_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setId(String value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x1;
                this.id_ = value;
                onChanged();
                return this;
            }

            public Builder clearId() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.id_ = ItemOuterClass.Item.getDefaultInstance().getId();
                onChanged();
                return this;
            }

            public Builder setIdBytes(ByteString value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x1;
                this.id_ = value;
                onChanged();
                return this;
            }

            public boolean hasCode() {
                return ((this.bitField0_ & 0x2) == 2);
            }

            public String getCode() {
                Object ref = this.code_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) this.code_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getCodeBytes() {
                Object ref = this.code_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.code_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setCode(String value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.code_ = value;
                onChanged();
                return this;
            }

            public Builder clearCode() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.code_ = ItemOuterClass.Item.getDefaultInstance().getCode();
                onChanged();
                return this;
            }

            public Builder setCodeBytes(ByteString value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.code_ = value;
                onChanged();
                return this;
            }

            public boolean hasItemType() {
                return ((this.bitField0_ & 0x4) == 4);
            }

            public int getItemType() {
                return this.itemType_;
            }

            public Builder setItemType(int value) {
                this.bitField0_ |= 0x4;
                this.itemType_ = value;
                onChanged();
                return this;
            }

            public Builder clearItemType() {
                this.bitField0_ &= 0xFFFFFFFB;
                this.itemType_ = 0;
                onChanged();
                return this;
            }

            public boolean hasItemSecondType() {
                return ((this.bitField0_ & 0x8) == 8);
            }

            public int getItemSecondType() {
                return this.itemSecondType_;
            }

            public Builder setItemSecondType(int value) {
                this.bitField0_ |= 0x8;
                this.itemSecondType_ = value;
                onChanged();
                return this;
            }

            public Builder clearItemSecondType() {
                this.bitField0_ &= 0xFFFFFFF7;
                this.itemSecondType_ = 0;
                onChanged();
                return this;
            }

            public boolean hasQColor() {
                return ((this.bitField0_ & 0x10) == 16);
            }

            public int getQColor() {
                return this.qColor_;
            }

            public Builder setQColor(int value) {
                this.bitField0_ |= 0x10;
                this.qColor_ = value;
                onChanged();
                return this;
            }

            public Builder clearQColor() {
                this.bitField0_ &= 0xFFFFFFEF;
                this.qColor_ = 0;
                onChanged();
                return this;
            }

            public boolean hasMaxGroupCount() {
                return ((this.bitField0_ & 0x20) == 32);
            }

            public int getMaxGroupCount() {
                return this.maxGroupCount_;
            }

            public Builder setMaxGroupCount(int value) {
                this.bitField0_ |= 0x20;
                this.maxGroupCount_ = value;
                onChanged();
                return this;
            }

            public Builder clearMaxGroupCount() {
                this.bitField0_ &= 0xFFFFFFDF;
                this.maxGroupCount_ = 0;
                onChanged();
                return this;
            }

            public boolean hasGroupCount() {
                return ((this.bitField0_ & 0x40) == 64);
            }

            public int getGroupCount() {
                return this.groupCount_;
            }

            public Builder setGroupCount(int value) {
                this.bitField0_ |= 0x40;
                this.groupCount_ = value;
                onChanged();
                return this;
            }

            public Builder clearGroupCount() {
                this.bitField0_ &= 0xFFFFFFBF;
                this.groupCount_ = 0;
                onChanged();
                return this;
            }

            public boolean hasIsNew() {
                return ((this.bitField0_ & 0x80) == 128);
            }

            public int getIsNew() {
                return this.isNew_;
            }

            public Builder setIsNew(int value) {
                this.bitField0_ |= 0x80;
                this.isNew_ = value;
                onChanged();
                return this;
            }

            public Builder clearIsNew() {
                this.bitField0_ &= 0xFFFFFF7F;
                this.isNew_ = 0;
                onChanged();
                return this;
            }

            public boolean hasIcon() {
                return ((this.bitField0_ & 0x100) == 256);
            }

            public String getIcon() {
                Object ref = this.icon_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) this.icon_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getIconBytes() {
                Object ref = this.icon_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.icon_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setIcon(String value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x100;
                this.icon_ = value;
                onChanged();
                return this;
            }

            public Builder clearIcon() {
                this.bitField0_ &= 0xFFFFFEFF;
                this.icon_ = ItemOuterClass.Item.getDefaultInstance().getIcon();
                onChanged();
                return this;
            }

            public Builder setIconBytes(ByteString value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x100;
                this.icon_ = value;
                onChanged();
                return this;
            }

            public boolean hasEnLevel() {
                return ((this.bitField0_ & 0x200) == 512);
            }

            public int getEnLevel() {
                return this.enLevel_;
            }

            public Builder setEnLevel(int value) {
                this.bitField0_ |= 0x200;
                this.enLevel_ = value;
                onChanged();
                return this;
            }

            public Builder clearEnLevel() {
                this.bitField0_ &= 0xFFFFFDFF;
                this.enLevel_ = 0;
                onChanged();
                return this;
            }

            public boolean hasStar() {
                return ((this.bitField0_ & 0x400) == 1024);
            }

            public int getStar() {
                return this.star_;
            }

            public Builder setStar(int value) {
                this.bitField0_ |= 0x400;
                this.star_ = value;
                onChanged();
                return this;
            }

            public Builder clearStar() {
                this.bitField0_ &= 0xFFFFFBFF;
                this.star_ = 0;
                onChanged();
                return this;
            }

            public boolean hasCdTime() {
                return ((this.bitField0_ & 0x800) == 2048);
            }

            public String getCdTime() {
                Object ref = this.cdTime_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) this.cdTime_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getCdTimeBytes() {
                Object ref = this.cdTime_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.cdTime_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setCdTime(String value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x800;
                this.cdTime_ = value;
                onChanged();
                return this;
            }

            public Builder clearCdTime() {
                this.bitField0_ &= 0xFFFFF7FF;
                this.cdTime_ = ItemOuterClass.Item.getDefaultInstance().getCdTime();
                onChanged();
                return this;
            }

            public Builder setCdTimeBytes(ByteString value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x800;
                this.cdTime_ = value;
                onChanged();
                return this;
            }

            public boolean hasBindType() {
                return ((this.bitField0_ & 0x1000) == 4096);
            }

            public int getBindType() {
                return this.bindType_;
            }

            public Builder setBindType(int value) {
                this.bitField0_ |= 0x1000;
                this.bindType_ = value;
                onChanged();
                return this;
            }

            public Builder clearBindType() {
                this.bitField0_ &= 0xFFFFEFFF;
                this.bindType_ = 0;
                onChanged();
                return this;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class Grid
            extends GeneratedMessage
            implements GridOrBuilder {
        private static final Grid defaultInstance = new Grid(true);
        private final UnknownFieldSet unknownFields;

        private Grid(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private Grid(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static Grid getDefaultInstance() {
            return defaultInstance;
        }

        public Grid getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private Grid(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    ItemOuterClass.Item.Builder subBuilder;
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.bitField0_ |= 0x1;
                            this.gridIndex_ = input.readInt32();
                            break;
                        case 18:
                            subBuilder = null;
                            if ((this.bitField0_ & 0x2) == 2) subBuilder = this.item_.toBuilder();
                            this.item_ = (ItemOuterClass.Item) input.readMessage(ItemOuterClass.Item.PARSER, extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.item_);
                                this.item_ = subBuilder.buildPartial();
                            }
                            this.bitField0_ |= 0x2;
                            break;
                        case 32:
                            this.bitField0_ |= 0x4;
                            this.source_ = input.readInt32();
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ItemOuterClass.internal_static_pomelo_item_Grid_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return ItemOuterClass.internal_static_pomelo_item_Grid_fieldAccessorTable.ensureFieldAccessorsInitialized(Grid.class, Builder.class);
        }

        public static Parser<Grid> PARSER = (Parser<Grid>) new AbstractParser<Grid>() {
            public ItemOuterClass.Grid parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new ItemOuterClass.Grid(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int GRIDINDEX_FIELD_NUMBER = 1;
        private int gridIndex_;
        public static final int ITEM_FIELD_NUMBER = 2;
        private ItemOuterClass.Item item_;
        public static final int SOURCE_FIELD_NUMBER = 4;
        private int source_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<Grid> getParserForType() {
            return PARSER;
        }

        public boolean hasGridIndex() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public int getGridIndex() {
            return this.gridIndex_;
        }

        public boolean hasItem() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        public ItemOuterClass.Item getItem() {
            return this.item_;
        }

        public ItemOuterClass.ItemOrBuilder getItemOrBuilder() {
            return this.item_;
        }

        public boolean hasSource() {
            return ((this.bitField0_ & 0x4) == 4);
        }

        public int getSource() {
            return this.source_;
        }

        private void initFields() {
            this.gridIndex_ = 0;
            this.item_ = ItemOuterClass.Item.getDefaultInstance();
            this.source_ = 0;
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            if (!hasGridIndex()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (hasItem() && !getItem().isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) output.writeInt32(1, this.gridIndex_);
            if ((this.bitField0_ & 0x2) == 2) output.writeMessage(2, (MessageLite) this.item_);
            if ((this.bitField0_ & 0x4) == 4) output.writeInt32(4, this.source_);
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) size += CodedOutputStream.computeInt32Size(1, this.gridIndex_);
            if ((this.bitField0_ & 0x2) == 2) size += CodedOutputStream.computeMessageSize(2, (MessageLite) this.item_);
            if ((this.bitField0_ & 0x4) == 4) size += CodedOutputStream.computeInt32Size(4, this.source_);
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static Grid parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (Grid) PARSER.parseFrom(data);
        }

        public static Grid parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Grid) PARSER.parseFrom(data, extensionRegistry);
        }

        public static Grid parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (Grid) PARSER.parseFrom(data);
        }

        public static Grid parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Grid) PARSER.parseFrom(data, extensionRegistry);
        }

        public static Grid parseFrom(InputStream input) throws IOException {
            return (Grid) PARSER.parseFrom(input);
        }

        public static Grid parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Grid) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Grid parseDelimitedFrom(InputStream input) throws IOException {
            return (Grid) PARSER.parseDelimitedFrom(input);
        }

        public static Grid parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Grid) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static Grid parseFrom(CodedInputStream input) throws IOException {
            return (Grid) PARSER.parseFrom(input);
        }

        public static Grid parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Grid) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(Grid prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements ItemOuterClass.GridOrBuilder {
            private int bitField0_;
            private int gridIndex_;
            private ItemOuterClass.Item item_;
            private SingleFieldBuilder<ItemOuterClass.Item, ItemOuterClass.Item.Builder, ItemOuterClass.ItemOrBuilder> itemBuilder_;
            private int source_;

            public static final Descriptors.Descriptor getDescriptor() {
                return ItemOuterClass.internal_static_pomelo_item_Grid_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return ItemOuterClass.internal_static_pomelo_item_Grid_fieldAccessorTable.ensureFieldAccessorsInitialized(ItemOuterClass.Grid.class, Builder.class);
            }

            private Builder() {
                this.item_ = ItemOuterClass.Item.getDefaultInstance();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.item_ = ItemOuterClass.Item.getDefaultInstance();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (ItemOuterClass.Grid.alwaysUseFieldBuilders) getItemFieldBuilder();
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.gridIndex_ = 0;
                this.bitField0_ &= 0xFFFFFFFE;
                if (this.itemBuilder_ == null) {
                    this.item_ = ItemOuterClass.Item.getDefaultInstance();
                } else {
                    this.itemBuilder_.clear();
                }
                this.bitField0_ &= 0xFFFFFFFD;
                this.source_ = 0;
                this.bitField0_ &= 0xFFFFFFFB;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return ItemOuterClass.internal_static_pomelo_item_Grid_descriptor;
            }

            public ItemOuterClass.Grid getDefaultInstanceForType() {
                return ItemOuterClass.Grid.getDefaultInstance();
            }

            public ItemOuterClass.Grid build() {
                ItemOuterClass.Grid result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public ItemOuterClass.Grid buildPartial() {
                ItemOuterClass.Grid result = new ItemOuterClass.Grid(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.gridIndex_ = this.gridIndex_;
                if ((from_bitField0_ & 0x2) == 2) to_bitField0_ |= 0x2;
                if (this.itemBuilder_ == null) {
                    result.item_ = this.item_;
                } else {
                    result.item_ = (ItemOuterClass.Item) this.itemBuilder_.build();
                }
                if ((from_bitField0_ & 0x4) == 4) to_bitField0_ |= 0x4;
                result.source_ = this.source_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof ItemOuterClass.Grid) return mergeFrom((ItemOuterClass.Grid) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(ItemOuterClass.Grid other) {
                if (other == ItemOuterClass.Grid.getDefaultInstance()) return this;
                if (other.hasGridIndex()) setGridIndex(other.getGridIndex());
                if (other.hasItem()) mergeItem(other.getItem());
                if (other.hasSource()) setSource(other.getSource());
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasGridIndex()) return false;
                if (hasItem() && !getItem().isInitialized()) return false;
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                ItemOuterClass.Grid parsedMessage = null;
                try {
                    parsedMessage = (ItemOuterClass.Grid) ItemOuterClass.Grid.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ItemOuterClass.Grid) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasGridIndex() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public int getGridIndex() {
                return this.gridIndex_;
            }

            public Builder setGridIndex(int value) {
                this.bitField0_ |= 0x1;
                this.gridIndex_ = value;
                onChanged();
                return this;
            }

            public Builder clearGridIndex() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.gridIndex_ = 0;
                onChanged();
                return this;
            }

            public boolean hasItem() {
                return ((this.bitField0_ & 0x2) == 2);
            }

            public ItemOuterClass.Item getItem() {
                if (this.itemBuilder_ == null) return this.item_;
                return (ItemOuterClass.Item) this.itemBuilder_.getMessage();
            }

            public Builder setItem(ItemOuterClass.Item value) {
                if (this.itemBuilder_ == null) {
                    if (value == null) throw new NullPointerException();
                    this.item_ = value;
                    onChanged();
                } else {
                    this.itemBuilder_.setMessage(value);
                }
                this.bitField0_ |= 0x2;
                return this;
            }

            public Builder setItem(ItemOuterClass.Item.Builder builderForValue) {
                if (this.itemBuilder_ == null) {
                    this.item_ = builderForValue.build();
                    onChanged();
                } else {
                    this.itemBuilder_.setMessage(builderForValue.build());
                }
                this.bitField0_ |= 0x2;
                return this;
            }

            public Builder mergeItem(ItemOuterClass.Item value) {
                if (this.itemBuilder_ == null) {
                    if ((this.bitField0_ & 0x2) == 2 && this.item_ != ItemOuterClass.Item.getDefaultInstance()) {
                        this.item_ = ItemOuterClass.Item.newBuilder(this.item_).mergeFrom(value).buildPartial();
                    } else {
                        this.item_ = value;
                    }
                    onChanged();
                } else {
                    this.itemBuilder_.mergeFrom(value);
                }
                this.bitField0_ |= 0x2;
                return this;
            }

            public Builder clearItem() {
                if (this.itemBuilder_ == null) {
                    this.item_ = ItemOuterClass.Item.getDefaultInstance();
                    onChanged();
                } else {
                    this.itemBuilder_.clear();
                }
                this.bitField0_ &= 0xFFFFFFFD;
                return this;
            }

            public ItemOuterClass.Item.Builder getItemBuilder() {
                this.bitField0_ |= 0x2;
                onChanged();
                return (ItemOuterClass.Item.Builder) getItemFieldBuilder().getBuilder();
            }

            public ItemOuterClass.ItemOrBuilder getItemOrBuilder() {
                if (this.itemBuilder_ != null)
                    return (ItemOuterClass.ItemOrBuilder) this.itemBuilder_.getMessageOrBuilder();
                return this.item_;
            }

            private SingleFieldBuilder<ItemOuterClass.Item, ItemOuterClass.Item.Builder, ItemOuterClass.ItemOrBuilder> getItemFieldBuilder() {
                if (this.itemBuilder_ == null) {
                    this.itemBuilder_ = new SingleFieldBuilder(getItem(), getParentForChildren(), isClean());
                    this.item_ = null;
                }
                return this.itemBuilder_;
            }

            public boolean hasSource() {
                return ((this.bitField0_ & 0x4) == 4);
            }

            public int getSource() {
                return this.source_;
            }

            public Builder setSource(int value) {
                this.bitField0_ |= 0x4;
                this.source_ = value;
                onChanged();
                return this;
            }

            public Builder clearSource() {
                this.bitField0_ &= 0xFFFFFFFB;
                this.source_ = 0;
                onChanged();
                return this;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class MiniItem
            extends GeneratedMessage
            implements MiniItemOrBuilder {
        private static final MiniItem defaultInstance = new MiniItem(true);
        private final UnknownFieldSet unknownFields;

        private MiniItem(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private MiniItem(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static MiniItem getDefaultInstance() {
            return defaultInstance;
        }

        public MiniItem getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private MiniItem(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    ByteString bs;
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 10:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x1;
                            this.code_ = bs;
                            break;
                        case 16:
                            this.bitField0_ |= 0x2;
                            this.groupCount_ = input.readInt32();
                            break;
                        case 26:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x4;
                            this.icon_ = bs;
                            break;
                        case 32:
                            this.bitField0_ |= 0x8;
                            this.qColor_ = input.readInt32();
                            break;
                        case 42:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x10;
                            this.name_ = bs;
                            break;
                        case 48:
                            this.bitField0_ |= 0x20;
                            this.star_ = input.readInt32();
                            break;
                        case 56:
                            this.bitField0_ |= 0x40;
                            this.bindType_ = input.readInt32();
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ItemOuterClass.internal_static_pomelo_item_MiniItem_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return ItemOuterClass.internal_static_pomelo_item_MiniItem_fieldAccessorTable.ensureFieldAccessorsInitialized(MiniItem.class, Builder.class);
        }

        public static Parser<MiniItem> PARSER = (Parser<MiniItem>) new AbstractParser<MiniItem>() {
            public ItemOuterClass.MiniItem parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new ItemOuterClass.MiniItem(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int CODE_FIELD_NUMBER = 1;
        private Object code_;
        public static final int GROUPCOUNT_FIELD_NUMBER = 2;
        private int groupCount_;
        public static final int ICON_FIELD_NUMBER = 3;
        private Object icon_;
        public static final int QCOLOR_FIELD_NUMBER = 4;
        private int qColor_;
        public static final int NAME_FIELD_NUMBER = 5;
        private Object name_;
        public static final int STAR_FIELD_NUMBER = 6;
        private int star_;
        public static final int BINDTYPE_FIELD_NUMBER = 7;
        private int bindType_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<MiniItem> getParserForType() {
            return PARSER;
        }

        public boolean hasCode() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public String getCode() {
            Object ref = this.code_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.code_ = s;
            return s;
        }

        public ByteString getCodeBytes() {
            Object ref = this.code_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.code_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public boolean hasGroupCount() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        public int getGroupCount() {
            return this.groupCount_;
        }

        public boolean hasIcon() {
            return ((this.bitField0_ & 0x4) == 4);
        }

        public String getIcon() {
            Object ref = this.icon_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.icon_ = s;
            return s;
        }

        public ByteString getIconBytes() {
            Object ref = this.icon_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.icon_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public boolean hasQColor() {
            return ((this.bitField0_ & 0x8) == 8);
        }

        public int getQColor() {
            return this.qColor_;
        }

        public boolean hasName() {
            return ((this.bitField0_ & 0x10) == 16);
        }

        public String getName() {
            Object ref = this.name_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.name_ = s;
            return s;
        }

        public ByteString getNameBytes() {
            Object ref = this.name_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.name_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public boolean hasStar() {
            return ((this.bitField0_ & 0x20) == 32);
        }

        public int getStar() {
            return this.star_;
        }

        public boolean hasBindType() {
            return ((this.bitField0_ & 0x40) == 64);
        }

        public int getBindType() {
            return this.bindType_;
        }

        private void initFields() {
            this.code_ = "";
            this.groupCount_ = 0;
            this.icon_ = "";
            this.qColor_ = 0;
            this.name_ = "";
            this.star_ = 0;
            this.bindType_ = 0;
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            if (!hasCode()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasGroupCount()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasIcon()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasQColor()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) output.writeBytes(1, getCodeBytes());
            if ((this.bitField0_ & 0x2) == 2) output.writeInt32(2, this.groupCount_);
            if ((this.bitField0_ & 0x4) == 4) output.writeBytes(3, getIconBytes());
            if ((this.bitField0_ & 0x8) == 8) output.writeInt32(4, this.qColor_);
            if ((this.bitField0_ & 0x10) == 16) output.writeBytes(5, getNameBytes());
            if ((this.bitField0_ & 0x20) == 32) output.writeInt32(6, this.star_);
            if ((this.bitField0_ & 0x40) == 64) output.writeInt32(7, this.bindType_);
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) size += CodedOutputStream.computeBytesSize(1, getCodeBytes());
            if ((this.bitField0_ & 0x2) == 2) size += CodedOutputStream.computeInt32Size(2, this.groupCount_);
            if ((this.bitField0_ & 0x4) == 4) size += CodedOutputStream.computeBytesSize(3, getIconBytes());
            if ((this.bitField0_ & 0x8) == 8) size += CodedOutputStream.computeInt32Size(4, this.qColor_);
            if ((this.bitField0_ & 0x10) == 16) size += CodedOutputStream.computeBytesSize(5, getNameBytes());
            if ((this.bitField0_ & 0x20) == 32) size += CodedOutputStream.computeInt32Size(6, this.star_);
            if ((this.bitField0_ & 0x40) == 64) size += CodedOutputStream.computeInt32Size(7, this.bindType_);
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static MiniItem parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (MiniItem) PARSER.parseFrom(data);
        }

        public static MiniItem parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (MiniItem) PARSER.parseFrom(data, extensionRegistry);
        }

        public static MiniItem parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (MiniItem) PARSER.parseFrom(data);
        }

        public static MiniItem parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (MiniItem) PARSER.parseFrom(data, extensionRegistry);
        }

        public static MiniItem parseFrom(InputStream input) throws IOException {
            return (MiniItem) PARSER.parseFrom(input);
        }

        public static MiniItem parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (MiniItem) PARSER.parseFrom(input, extensionRegistry);
        }

        public static MiniItem parseDelimitedFrom(InputStream input) throws IOException {
            return (MiniItem) PARSER.parseDelimitedFrom(input);
        }

        public static MiniItem parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (MiniItem) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static MiniItem parseFrom(CodedInputStream input) throws IOException {
            return (MiniItem) PARSER.parseFrom(input);
        }

        public static MiniItem parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (MiniItem) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(MiniItem prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements ItemOuterClass.MiniItemOrBuilder {
            private int bitField0_;
            private Object code_;
            private int groupCount_;
            private Object icon_;
            private int qColor_;
            private Object name_;
            private int star_;
            private int bindType_;

            public static final Descriptors.Descriptor getDescriptor() {
                return ItemOuterClass.internal_static_pomelo_item_MiniItem_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return ItemOuterClass.internal_static_pomelo_item_MiniItem_fieldAccessorTable.ensureFieldAccessorsInitialized(ItemOuterClass.MiniItem.class, Builder.class);
            }

            private Builder() {
                this.code_ = "";
                this.icon_ = "";
                this.name_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.code_ = "";
                this.icon_ = "";
                this.name_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (ItemOuterClass.MiniItem.alwaysUseFieldBuilders) ;
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.code_ = "";
                this.bitField0_ &= 0xFFFFFFFE;
                this.groupCount_ = 0;
                this.bitField0_ &= 0xFFFFFFFD;
                this.icon_ = "";
                this.bitField0_ &= 0xFFFFFFFB;
                this.qColor_ = 0;
                this.bitField0_ &= 0xFFFFFFF7;
                this.name_ = "";
                this.bitField0_ &= 0xFFFFFFEF;
                this.star_ = 0;
                this.bitField0_ &= 0xFFFFFFDF;
                this.bindType_ = 0;
                this.bitField0_ &= 0xFFFFFFBF;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return ItemOuterClass.internal_static_pomelo_item_MiniItem_descriptor;
            }

            public ItemOuterClass.MiniItem getDefaultInstanceForType() {
                return ItemOuterClass.MiniItem.getDefaultInstance();
            }

            public ItemOuterClass.MiniItem build() {
                ItemOuterClass.MiniItem result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public ItemOuterClass.MiniItem buildPartial() {
                ItemOuterClass.MiniItem result = new ItemOuterClass.MiniItem(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.code_ = this.code_;
                if ((from_bitField0_ & 0x2) == 2) to_bitField0_ |= 0x2;
                result.groupCount_ = this.groupCount_;
                if ((from_bitField0_ & 0x4) == 4) to_bitField0_ |= 0x4;
                result.icon_ = this.icon_;
                if ((from_bitField0_ & 0x8) == 8) to_bitField0_ |= 0x8;
                result.qColor_ = this.qColor_;
                if ((from_bitField0_ & 0x10) == 16) to_bitField0_ |= 0x10;
                result.name_ = this.name_;
                if ((from_bitField0_ & 0x20) == 32) to_bitField0_ |= 0x20;
                result.star_ = this.star_;
                if ((from_bitField0_ & 0x40) == 64) to_bitField0_ |= 0x40;
                result.bindType_ = this.bindType_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof ItemOuterClass.MiniItem) return mergeFrom((ItemOuterClass.MiniItem) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(ItemOuterClass.MiniItem other) {
                if (other == ItemOuterClass.MiniItem.getDefaultInstance()) return this;
                if (other.hasCode()) {
                    this.bitField0_ |= 0x1;
                    this.code_ = other.code_;
                    onChanged();
                }
                if (other.hasGroupCount()) setGroupCount(other.getGroupCount());
                if (other.hasIcon()) {
                    this.bitField0_ |= 0x4;
                    this.icon_ = other.icon_;
                    onChanged();
                }
                if (other.hasQColor()) setQColor(other.getQColor());
                if (other.hasName()) {
                    this.bitField0_ |= 0x10;
                    this.name_ = other.name_;
                    onChanged();
                }
                if (other.hasStar()) setStar(other.getStar());
                if (other.hasBindType()) setBindType(other.getBindType());
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasCode()) return false;
                if (!hasGroupCount()) return false;
                if (!hasIcon()) return false;
                if (!hasQColor()) return false;
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                ItemOuterClass.MiniItem parsedMessage = null;
                try {
                    parsedMessage = (ItemOuterClass.MiniItem) ItemOuterClass.MiniItem.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ItemOuterClass.MiniItem) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasCode() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public String getCode() {
                Object ref = this.code_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) this.code_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getCodeBytes() {
                Object ref = this.code_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.code_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setCode(String value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x1;
                this.code_ = value;
                onChanged();
                return this;
            }

            public Builder clearCode() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.code_ = ItemOuterClass.MiniItem.getDefaultInstance().getCode();
                onChanged();
                return this;
            }

            public Builder setCodeBytes(ByteString value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x1;
                this.code_ = value;
                onChanged();
                return this;
            }

            public boolean hasGroupCount() {
                return ((this.bitField0_ & 0x2) == 2);
            }

            public int getGroupCount() {
                return this.groupCount_;
            }

            public Builder setGroupCount(int value) {
                this.bitField0_ |= 0x2;
                this.groupCount_ = value;
                onChanged();
                return this;
            }

            public Builder clearGroupCount() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.groupCount_ = 0;
                onChanged();
                return this;
            }

            public boolean hasIcon() {
                return ((this.bitField0_ & 0x4) == 4);
            }

            public String getIcon() {
                Object ref = this.icon_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) this.icon_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getIconBytes() {
                Object ref = this.icon_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.icon_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setIcon(String value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x4;
                this.icon_ = value;
                onChanged();
                return this;
            }

            public Builder clearIcon() {
                this.bitField0_ &= 0xFFFFFFFB;
                this.icon_ = ItemOuterClass.MiniItem.getDefaultInstance().getIcon();
                onChanged();
                return this;
            }

            public Builder setIconBytes(ByteString value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x4;
                this.icon_ = value;
                onChanged();
                return this;
            }

            public boolean hasQColor() {
                return ((this.bitField0_ & 0x8) == 8);
            }

            public int getQColor() {
                return this.qColor_;
            }

            public Builder setQColor(int value) {
                this.bitField0_ |= 0x8;
                this.qColor_ = value;
                onChanged();
                return this;
            }

            public Builder clearQColor() {
                this.bitField0_ &= 0xFFFFFFF7;
                this.qColor_ = 0;
                onChanged();
                return this;
            }

            public boolean hasName() {
                return ((this.bitField0_ & 0x10) == 16);
            }

            public String getName() {
                Object ref = this.name_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) this.name_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getNameBytes() {
                Object ref = this.name_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.name_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setName(String value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x10;
                this.name_ = value;
                onChanged();
                return this;
            }

            public Builder clearName() {
                this.bitField0_ &= 0xFFFFFFEF;
                this.name_ = ItemOuterClass.MiniItem.getDefaultInstance().getName();
                onChanged();
                return this;
            }

            public Builder setNameBytes(ByteString value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x10;
                this.name_ = value;
                onChanged();
                return this;
            }

            public boolean hasStar() {
                return ((this.bitField0_ & 0x20) == 32);
            }

            public int getStar() {
                return this.star_;
            }

            public Builder setStar(int value) {
                this.bitField0_ |= 0x20;
                this.star_ = value;
                onChanged();
                return this;
            }

            public Builder clearStar() {
                this.bitField0_ &= 0xFFFFFFDF;
                this.star_ = 0;
                onChanged();
                return this;
            }

            public boolean hasBindType() {
                return ((this.bitField0_ & 0x40) == 64);
            }

            public int getBindType() {
                return this.bindType_;
            }

            public Builder setBindType(int value) {
                this.bitField0_ |= 0x40;
                this.bindType_ = value;
                onChanged();
                return this;
            }

            public Builder clearBindType() {
                this.bitField0_ &= 0xFFFFFFBF;
                this.bindType_ = 0;
                onChanged();
                return this;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class Combine
            extends GeneratedMessage
            implements CombineOrBuilder {
        private static final Combine defaultInstance = new Combine(true);
        private final UnknownFieldSet unknownFields;

        private Combine(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private Combine(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static Combine getDefaultInstance() {
            return defaultInstance;
        }

        public Combine getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private Combine(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    ItemOuterClass.MiniItem.Builder subBuilder;
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 10:
                            subBuilder = null;
                            if ((this.bitField0_ & 0x1) == 1) subBuilder = this.product_.toBuilder();
                            this.product_ = (ItemOuterClass.MiniItem) input.readMessage(ItemOuterClass.MiniItem.PARSER, extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.product_);
                                this.product_ = subBuilder.buildPartial();
                            }
                            this.bitField0_ |= 0x1;
                            break;
                        case 18:
                            if ((mutable_bitField0_ & 0x2) != 2) {
                                this.materials_ = new ArrayList<>();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.materials_.add(input.readMessage(ItemOuterClass.MiniItem.PARSER, extensionRegistry));
                            break;
                        case 24:
                            this.bitField0_ |= 0x2;
                            this.gold_ = input.readInt32();
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                if ((mutable_bitField0_ & 0x2) == 2) this.materials_ = Collections.unmodifiableList(this.materials_);
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ItemOuterClass.internal_static_pomelo_item_Combine_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return ItemOuterClass.internal_static_pomelo_item_Combine_fieldAccessorTable.ensureFieldAccessorsInitialized(Combine.class, Builder.class);
        }

        public static Parser<Combine> PARSER = (Parser<Combine>) new AbstractParser<Combine>() {
            public ItemOuterClass.Combine parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new ItemOuterClass.Combine(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int PRODUCT_FIELD_NUMBER = 1;
        private ItemOuterClass.MiniItem product_;
        public static final int MATERIALS_FIELD_NUMBER = 2;
        private List<ItemOuterClass.MiniItem> materials_;
        public static final int GOLD_FIELD_NUMBER = 3;
        private int gold_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<Combine> getParserForType() {
            return PARSER;
        }

        public boolean hasProduct() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public ItemOuterClass.MiniItem getProduct() {
            return this.product_;
        }

        public ItemOuterClass.MiniItemOrBuilder getProductOrBuilder() {
            return this.product_;
        }

        public List<ItemOuterClass.MiniItem> getMaterialsList() {
            return this.materials_;
        }

        public List<? extends ItemOuterClass.MiniItemOrBuilder> getMaterialsOrBuilderList() {
            return (List) this.materials_;
        }

        public int getMaterialsCount() {
            return this.materials_.size();
        }

        public ItemOuterClass.MiniItem getMaterials(int index) {
            return this.materials_.get(index);
        }

        public ItemOuterClass.MiniItemOrBuilder getMaterialsOrBuilder(int index) {
            return this.materials_.get(index);
        }

        public boolean hasGold() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        public int getGold() {
            return this.gold_;
        }

        private void initFields() {
            this.product_ = ItemOuterClass.MiniItem.getDefaultInstance();
            this.materials_ = Collections.emptyList();
            this.gold_ = 0;
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            if (hasProduct() && !getProduct().isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            for (int i = 0; i < getMaterialsCount(); i++) {
                if (!getMaterials(i).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) output.writeMessage(1, (MessageLite) this.product_);
            for (int i = 0; i < this.materials_.size(); i++)
                output.writeMessage(2, (MessageLite) this.materials_.get(i));
            if ((this.bitField0_ & 0x2) == 2) output.writeInt32(3, this.gold_);
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1)
                size += CodedOutputStream.computeMessageSize(1, (MessageLite) this.product_);
            for (int i = 0; i < this.materials_.size(); i++)
                size += CodedOutputStream.computeMessageSize(2, (MessageLite) this.materials_.get(i));
            if ((this.bitField0_ & 0x2) == 2) size += CodedOutputStream.computeInt32Size(3, this.gold_);
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static Combine parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (Combine) PARSER.parseFrom(data);
        }

        public static Combine parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Combine) PARSER.parseFrom(data, extensionRegistry);
        }

        public static Combine parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (Combine) PARSER.parseFrom(data);
        }

        public static Combine parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Combine) PARSER.parseFrom(data, extensionRegistry);
        }

        public static Combine parseFrom(InputStream input) throws IOException {
            return (Combine) PARSER.parseFrom(input);
        }

        public static Combine parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Combine) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Combine parseDelimitedFrom(InputStream input) throws IOException {
            return (Combine) PARSER.parseDelimitedFrom(input);
        }

        public static Combine parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Combine) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static Combine parseFrom(CodedInputStream input) throws IOException {
            return (Combine) PARSER.parseFrom(input);
        }

        public static Combine parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Combine) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(Combine prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements ItemOuterClass.CombineOrBuilder {
            private int bitField0_;
            private ItemOuterClass.MiniItem product_;
            private SingleFieldBuilder<ItemOuterClass.MiniItem, ItemOuterClass.MiniItem.Builder, ItemOuterClass.MiniItemOrBuilder> productBuilder_;
            private List<ItemOuterClass.MiniItem> materials_;
            private RepeatedFieldBuilder<ItemOuterClass.MiniItem, ItemOuterClass.MiniItem.Builder, ItemOuterClass.MiniItemOrBuilder> materialsBuilder_;
            private int gold_;

            public static final Descriptors.Descriptor getDescriptor() {
                return ItemOuterClass.internal_static_pomelo_item_Combine_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return ItemOuterClass.internal_static_pomelo_item_Combine_fieldAccessorTable.ensureFieldAccessorsInitialized(ItemOuterClass.Combine.class, Builder.class);
            }

            private Builder() {
                this.product_ = ItemOuterClass.MiniItem.getDefaultInstance();
                this.materials_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.product_ = ItemOuterClass.MiniItem.getDefaultInstance();
                this.materials_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (ItemOuterClass.Combine.alwaysUseFieldBuilders) {
                    getProductFieldBuilder();
                    getMaterialsFieldBuilder();
                }
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                if (this.productBuilder_ == null) {
                    this.product_ = ItemOuterClass.MiniItem.getDefaultInstance();
                } else {
                    this.productBuilder_.clear();
                }
                this.bitField0_ &= 0xFFFFFFFE;
                if (this.materialsBuilder_ == null) {
                    this.materials_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFD;
                } else {
                    this.materialsBuilder_.clear();
                }
                this.gold_ = 0;
                this.bitField0_ &= 0xFFFFFFFB;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return ItemOuterClass.internal_static_pomelo_item_Combine_descriptor;
            }

            public ItemOuterClass.Combine getDefaultInstanceForType() {
                return ItemOuterClass.Combine.getDefaultInstance();
            }

            public ItemOuterClass.Combine build() {
                ItemOuterClass.Combine result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public ItemOuterClass.Combine buildPartial() {
                ItemOuterClass.Combine result = new ItemOuterClass.Combine(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                if (this.productBuilder_ == null) {
                    result.product_ = this.product_;
                } else {
                    result.product_ = (ItemOuterClass.MiniItem) this.productBuilder_.build();
                }
                if (this.materialsBuilder_ == null) {
                    if ((this.bitField0_ & 0x2) == 2) {
                        this.materials_ = Collections.unmodifiableList(this.materials_);
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    result.materials_ = this.materials_;
                } else {
                    result.materials_ = this.materialsBuilder_.build();
                }
                if ((from_bitField0_ & 0x4) == 4) to_bitField0_ |= 0x2;
                result.gold_ = this.gold_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof ItemOuterClass.Combine) return mergeFrom((ItemOuterClass.Combine) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(ItemOuterClass.Combine other) {
                if (other == ItemOuterClass.Combine.getDefaultInstance()) return this;
                if (other.hasProduct()) mergeProduct(other.getProduct());
                if (this.materialsBuilder_ == null) {
                    if (!other.materials_.isEmpty()) {
                        if (this.materials_.isEmpty()) {
                            this.materials_ = other.materials_;
                            this.bitField0_ &= 0xFFFFFFFD;
                        } else {
                            ensureMaterialsIsMutable();
                            this.materials_.addAll(other.materials_);
                        }
                        onChanged();
                    }
                } else if (!other.materials_.isEmpty()) {
                    if (this.materialsBuilder_.isEmpty()) {
                        this.materialsBuilder_.dispose();
                        this.materialsBuilder_ = null;
                        this.materials_ = other.materials_;
                        this.bitField0_ &= 0xFFFFFFFD;
                        this.materialsBuilder_ = ItemOuterClass.Combine.alwaysUseFieldBuilders ? getMaterialsFieldBuilder() : null;
                    } else {
                        this.materialsBuilder_.addAllMessages(other.materials_);
                    }
                }
                if (other.hasGold()) setGold(other.getGold());
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (hasProduct() && !getProduct().isInitialized()) return false;
                for (int i = 0; i < getMaterialsCount(); i++) {
                    if (!getMaterials(i).isInitialized()) return false;
                }
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                ItemOuterClass.Combine parsedMessage = null;
                try {
                    parsedMessage = (ItemOuterClass.Combine) ItemOuterClass.Combine.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ItemOuterClass.Combine) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasProduct() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public ItemOuterClass.MiniItem getProduct() {
                if (this.productBuilder_ == null) return this.product_;
                return (ItemOuterClass.MiniItem) this.productBuilder_.getMessage();
            }

            public Builder setProduct(ItemOuterClass.MiniItem value) {
                if (this.productBuilder_ == null) {
                    if (value == null) throw new NullPointerException();
                    this.product_ = value;
                    onChanged();
                } else {
                    this.productBuilder_.setMessage(value);
                }
                this.bitField0_ |= 0x1;
                return this;
            }

            public Builder setProduct(ItemOuterClass.MiniItem.Builder builderForValue) {
                if (this.productBuilder_ == null) {
                    this.product_ = builderForValue.build();
                    onChanged();
                } else {
                    this.productBuilder_.setMessage(builderForValue.build());
                }
                this.bitField0_ |= 0x1;
                return this;
            }

            public Builder mergeProduct(ItemOuterClass.MiniItem value) {
                if (this.productBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) == 1 && this.product_ != ItemOuterClass.MiniItem.getDefaultInstance()) {
                        this.product_ = ItemOuterClass.MiniItem.newBuilder(this.product_).mergeFrom(value).buildPartial();
                    } else {
                        this.product_ = value;
                    }
                    onChanged();
                } else {
                    this.productBuilder_.mergeFrom(value);
                }
                this.bitField0_ |= 0x1;
                return this;
            }

            public Builder clearProduct() {
                if (this.productBuilder_ == null) {
                    this.product_ = ItemOuterClass.MiniItem.getDefaultInstance();
                    onChanged();
                } else {
                    this.productBuilder_.clear();
                }
                this.bitField0_ &= 0xFFFFFFFE;
                return this;
            }

            public ItemOuterClass.MiniItem.Builder getProductBuilder() {
                this.bitField0_ |= 0x1;
                onChanged();
                return (ItemOuterClass.MiniItem.Builder) getProductFieldBuilder().getBuilder();
            }

            public ItemOuterClass.MiniItemOrBuilder getProductOrBuilder() {
                if (this.productBuilder_ != null)
                    return (ItemOuterClass.MiniItemOrBuilder) this.productBuilder_.getMessageOrBuilder();
                return this.product_;
            }

            private SingleFieldBuilder<ItemOuterClass.MiniItem, ItemOuterClass.MiniItem.Builder, ItemOuterClass.MiniItemOrBuilder> getProductFieldBuilder() {
                if (this.productBuilder_ == null) {
                    this.productBuilder_ = new SingleFieldBuilder(getProduct(), getParentForChildren(), isClean());
                    this.product_ = null;
                }
                return this.productBuilder_;
            }

            private void ensureMaterialsIsMutable() {
                if ((this.bitField0_ & 0x2) != 2) {
                    this.materials_ = new ArrayList<>(this.materials_);
                    this.bitField0_ |= 0x2;
                }
            }

            public List<ItemOuterClass.MiniItem> getMaterialsList() {
                if (this.materialsBuilder_ == null) return Collections.unmodifiableList(this.materials_);
                return this.materialsBuilder_.getMessageList();
            }

            public int getMaterialsCount() {
                if (this.materialsBuilder_ == null) return this.materials_.size();
                return this.materialsBuilder_.getCount();
            }

            public ItemOuterClass.MiniItem getMaterials(int index) {
                if (this.materialsBuilder_ == null) return this.materials_.get(index);
                return (ItemOuterClass.MiniItem) this.materialsBuilder_.getMessage(index);
            }

            public Builder setMaterials(int index, ItemOuterClass.MiniItem value) {
                if (this.materialsBuilder_ == null) {
                    if (value == null) throw new NullPointerException();
                    ensureMaterialsIsMutable();
                    this.materials_.set(index, value);
                    onChanged();
                } else {
                    this.materialsBuilder_.setMessage(index, value);
                }
                return this;
            }

            public Builder setMaterials(int index, ItemOuterClass.MiniItem.Builder builderForValue) {
                if (this.materialsBuilder_ == null) {
                    ensureMaterialsIsMutable();
                    this.materials_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    this.materialsBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }

            public Builder addMaterials(ItemOuterClass.MiniItem value) {
                if (this.materialsBuilder_ == null) {
                    if (value == null) throw new NullPointerException();
                    ensureMaterialsIsMutable();
                    this.materials_.add(value);
                    onChanged();
                } else {
                    this.materialsBuilder_.addMessage(value);
                }
                return this;
            }

            public Builder addMaterials(int index, ItemOuterClass.MiniItem value) {
                if (this.materialsBuilder_ == null) {
                    if (value == null) throw new NullPointerException();
                    ensureMaterialsIsMutable();
                    this.materials_.add(index, value);
                    onChanged();
                } else {
                    this.materialsBuilder_.addMessage(index, value);
                }
                return this;
            }

            public Builder addMaterials(ItemOuterClass.MiniItem.Builder builderForValue) {
                if (this.materialsBuilder_ == null) {
                    ensureMaterialsIsMutable();
                    this.materials_.add(builderForValue.build());
                    onChanged();
                } else {
                    this.materialsBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }

            public Builder addMaterials(int index, ItemOuterClass.MiniItem.Builder builderForValue) {
                if (this.materialsBuilder_ == null) {
                    ensureMaterialsIsMutable();
                    this.materials_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    this.materialsBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }

            public Builder addAllMaterials(Iterable<? extends ItemOuterClass.MiniItem> values) {
                if (this.materialsBuilder_ == null) {
                    ensureMaterialsIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.materials_);
                    onChanged();
                } else {
                    this.materialsBuilder_.addAllMessages(values);
                }
                return this;
            }

            public Builder clearMaterials() {
                if (this.materialsBuilder_ == null) {
                    this.materials_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFD;
                    onChanged();
                } else {
                    this.materialsBuilder_.clear();
                }
                return this;
            }

            public Builder removeMaterials(int index) {
                if (this.materialsBuilder_ == null) {
                    ensureMaterialsIsMutable();
                    this.materials_.remove(index);
                    onChanged();
                } else {
                    this.materialsBuilder_.remove(index);
                }
                return this;
            }

            public ItemOuterClass.MiniItem.Builder getMaterialsBuilder(int index) {
                return (ItemOuterClass.MiniItem.Builder) getMaterialsFieldBuilder().getBuilder(index);
            }

            public ItemOuterClass.MiniItemOrBuilder getMaterialsOrBuilder(int index) {
                if (this.materialsBuilder_ == null) return this.materials_.get(index);
                return (ItemOuterClass.MiniItemOrBuilder) this.materialsBuilder_.getMessageOrBuilder(index);
            }

            public List<? extends ItemOuterClass.MiniItemOrBuilder> getMaterialsOrBuilderList() {
                if (this.materialsBuilder_ != null) return this.materialsBuilder_.getMessageOrBuilderList();
                return Collections.unmodifiableList((List) this.materials_);
            }

            public ItemOuterClass.MiniItem.Builder addMaterialsBuilder() {
                return (ItemOuterClass.MiniItem.Builder) getMaterialsFieldBuilder().addBuilder(ItemOuterClass.MiniItem.getDefaultInstance());
            }

            public ItemOuterClass.MiniItem.Builder addMaterialsBuilder(int index) {
                return (ItemOuterClass.MiniItem.Builder) getMaterialsFieldBuilder().addBuilder(index, ItemOuterClass.MiniItem.getDefaultInstance());
            }

            public List<ItemOuterClass.MiniItem.Builder> getMaterialsBuilderList() {
                return getMaterialsFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilder<ItemOuterClass.MiniItem, ItemOuterClass.MiniItem.Builder, ItemOuterClass.MiniItemOrBuilder> getMaterialsFieldBuilder() {
                if (this.materialsBuilder_ == null) {
                    this.materialsBuilder_ = new RepeatedFieldBuilder(this.materials_, ((this.bitField0_ & 0x2) == 2), getParentForChildren(), isClean());
                    this.materials_ = null;
                }
                return this.materialsBuilder_;
            }

            public boolean hasGold() {
                return ((this.bitField0_ & 0x4) == 4);
            }

            public int getGold() {
                return this.gold_;
            }

            public Builder setGold(int value) {
                this.bitField0_ |= 0x4;
                this.gold_ = value;
                onChanged();
                return this;
            }

            public Builder clearGold() {
                this.bitField0_ &= 0xFFFFFFFB;
                this.gold_ = 0;
                onChanged();
                return this;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class CountItem
            extends GeneratedMessage
            implements CountItemOrBuilder {
        private static final CountItem defaultInstance = new CountItem(true);
        private final UnknownFieldSet unknownFields;

        private CountItem(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private CountItem(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static CountItem getDefaultInstance() {
            return defaultInstance;
        }

        public CountItem getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private CountItem(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    ByteString bs;
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 10:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x1;
                            this.code_ = bs;
                            break;
                        case 16:
                            this.bitField0_ |= 0x2;
                            this.num_ = input.readInt32();
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ItemOuterClass.internal_static_pomelo_item_CountItem_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return ItemOuterClass.internal_static_pomelo_item_CountItem_fieldAccessorTable.ensureFieldAccessorsInitialized(CountItem.class, Builder.class);
        }

        public static Parser<CountItem> PARSER = (Parser<CountItem>) new AbstractParser<CountItem>() {
            public ItemOuterClass.CountItem parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new ItemOuterClass.CountItem(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int CODE_FIELD_NUMBER = 1;
        private Object code_;
        public static final int NUM_FIELD_NUMBER = 2;
        private int num_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<CountItem> getParserForType() {
            return PARSER;
        }

        public boolean hasCode() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public String getCode() {
            Object ref = this.code_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.code_ = s;
            return s;
        }

        public ByteString getCodeBytes() {
            Object ref = this.code_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.code_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public boolean hasNum() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        public int getNum() {
            return this.num_;
        }

        private void initFields() {
            this.code_ = "";
            this.num_ = 0;
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            if (!hasCode()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasNum()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) output.writeBytes(1, getCodeBytes());
            if ((this.bitField0_ & 0x2) == 2) output.writeInt32(2, this.num_);
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) size += CodedOutputStream.computeBytesSize(1, getCodeBytes());
            if ((this.bitField0_ & 0x2) == 2) size += CodedOutputStream.computeInt32Size(2, this.num_);
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static CountItem parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (CountItem) PARSER.parseFrom(data);
        }

        public static CountItem parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (CountItem) PARSER.parseFrom(data, extensionRegistry);
        }

        public static CountItem parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (CountItem) PARSER.parseFrom(data);
        }

        public static CountItem parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (CountItem) PARSER.parseFrom(data, extensionRegistry);
        }

        public static CountItem parseFrom(InputStream input) throws IOException {
            return (CountItem) PARSER.parseFrom(input);
        }

        public static CountItem parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (CountItem) PARSER.parseFrom(input, extensionRegistry);
        }

        public static CountItem parseDelimitedFrom(InputStream input) throws IOException {
            return (CountItem) PARSER.parseDelimitedFrom(input);
        }

        public static CountItem parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (CountItem) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static CountItem parseFrom(CodedInputStream input) throws IOException {
            return (CountItem) PARSER.parseFrom(input);
        }

        public static CountItem parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (CountItem) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(CountItem prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements ItemOuterClass.CountItemOrBuilder {
            private int bitField0_;
            private Object code_;
            private int num_;

            public static final Descriptors.Descriptor getDescriptor() {
                return ItemOuterClass.internal_static_pomelo_item_CountItem_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return ItemOuterClass.internal_static_pomelo_item_CountItem_fieldAccessorTable.ensureFieldAccessorsInitialized(ItemOuterClass.CountItem.class, Builder.class);
            }

            private Builder() {
                this.code_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.code_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (ItemOuterClass.CountItem.alwaysUseFieldBuilders) ;
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.code_ = "";
                this.bitField0_ &= 0xFFFFFFFE;
                this.num_ = 0;
                this.bitField0_ &= 0xFFFFFFFD;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return ItemOuterClass.internal_static_pomelo_item_CountItem_descriptor;
            }

            public ItemOuterClass.CountItem getDefaultInstanceForType() {
                return ItemOuterClass.CountItem.getDefaultInstance();
            }

            public ItemOuterClass.CountItem build() {
                ItemOuterClass.CountItem result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public ItemOuterClass.CountItem buildPartial() {
                ItemOuterClass.CountItem result = new ItemOuterClass.CountItem(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.code_ = this.code_;
                if ((from_bitField0_ & 0x2) == 2) to_bitField0_ |= 0x2;
                result.num_ = this.num_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof ItemOuterClass.CountItem) return mergeFrom((ItemOuterClass.CountItem) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(ItemOuterClass.CountItem other) {
                if (other == ItemOuterClass.CountItem.getDefaultInstance()) return this;
                if (other.hasCode()) {
                    this.bitField0_ |= 0x1;
                    this.code_ = other.code_;
                    onChanged();
                }
                if (other.hasNum()) setNum(other.getNum());
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasCode()) return false;
                if (!hasNum()) return false;
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                ItemOuterClass.CountItem parsedMessage = null;
                try {
                    parsedMessage = (ItemOuterClass.CountItem) ItemOuterClass.CountItem.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ItemOuterClass.CountItem) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasCode() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public String getCode() {
                Object ref = this.code_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) this.code_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getCodeBytes() {
                Object ref = this.code_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.code_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setCode(String value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x1;
                this.code_ = value;
                onChanged();
                return this;
            }

            public Builder clearCode() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.code_ = ItemOuterClass.CountItem.getDefaultInstance().getCode();
                onChanged();
                return this;
            }

            public Builder setCodeBytes(ByteString value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x1;
                this.code_ = value;
                onChanged();
                return this;
            }

            public boolean hasNum() {
                return ((this.bitField0_ & 0x2) == 2);
            }

            public int getNum() {
                return this.num_;
            }

            public Builder setNum(int value) {
                this.bitField0_ |= 0x2;
                this.num_ = value;
                onChanged();
                return this;
            }

            public Builder clearNum() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.num_ = 0;
                onChanged();
                return this;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class CountItems
            extends GeneratedMessage
            implements CountItemsOrBuilder {
        private static final CountItems defaultInstance = new CountItems(true);
        private final UnknownFieldSet unknownFields;

        private CountItems(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private CountItems(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static CountItems getDefaultInstance() {
            return defaultInstance;
        }

        public CountItems getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private CountItems(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 10:
                            if ((mutable_bitField0_ & 0x1) != 1) {
                                this.items_ = new ArrayList<>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.items_.add(input.readMessage(ItemOuterClass.CountItem.PARSER, extensionRegistry));
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                if ((mutable_bitField0_ & 0x1) == 1) this.items_ = Collections.unmodifiableList(this.items_);
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ItemOuterClass.internal_static_pomelo_item_CountItems_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return ItemOuterClass.internal_static_pomelo_item_CountItems_fieldAccessorTable.ensureFieldAccessorsInitialized(CountItems.class, Builder.class);
        }

        public static Parser<CountItems> PARSER = (Parser<CountItems>) new AbstractParser<CountItems>() {
            public ItemOuterClass.CountItems parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new ItemOuterClass.CountItems(input, extensionRegistry);
            }
        };
        public static final int ITEMS_FIELD_NUMBER = 1;
        private List<ItemOuterClass.CountItem> items_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<CountItems> getParserForType() {
            return PARSER;
        }

        public List<ItemOuterClass.CountItem> getItemsList() {
            return this.items_;
        }

        public List<? extends ItemOuterClass.CountItemOrBuilder> getItemsOrBuilderList() {
            return (List) this.items_;
        }

        public int getItemsCount() {
            return this.items_.size();
        }

        public ItemOuterClass.CountItem getItems(int index) {
            return this.items_.get(index);
        }

        public ItemOuterClass.CountItemOrBuilder getItemsOrBuilder(int index) {
            return this.items_.get(index);
        }

        private void initFields() {
            this.items_ = Collections.emptyList();
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            for (int i = 0; i < getItemsCount(); i++) {
                if (!getItems(i).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            for (int i = 0; i < this.items_.size(); i++) output.writeMessage(1, (MessageLite) this.items_.get(i));
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            for (int i = 0; i < this.items_.size(); i++)
                size += CodedOutputStream.computeMessageSize(1, (MessageLite) this.items_.get(i));
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static CountItems parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (CountItems) PARSER.parseFrom(data);
        }

        public static CountItems parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (CountItems) PARSER.parseFrom(data, extensionRegistry);
        }

        public static CountItems parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (CountItems) PARSER.parseFrom(data);
        }

        public static CountItems parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (CountItems) PARSER.parseFrom(data, extensionRegistry);
        }

        public static CountItems parseFrom(InputStream input) throws IOException {
            return (CountItems) PARSER.parseFrom(input);
        }

        public static CountItems parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (CountItems) PARSER.parseFrom(input, extensionRegistry);
        }

        public static CountItems parseDelimitedFrom(InputStream input) throws IOException {
            return (CountItems) PARSER.parseDelimitedFrom(input);
        }

        public static CountItems parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (CountItems) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static CountItems parseFrom(CodedInputStream input) throws IOException {
            return (CountItems) PARSER.parseFrom(input);
        }

        public static CountItems parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (CountItems) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(CountItems prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements ItemOuterClass.CountItemsOrBuilder {
            private int bitField0_;
            private List<ItemOuterClass.CountItem> items_;
            private RepeatedFieldBuilder<ItemOuterClass.CountItem, ItemOuterClass.CountItem.Builder, ItemOuterClass.CountItemOrBuilder> itemsBuilder_;

            public static final Descriptors.Descriptor getDescriptor() {
                return ItemOuterClass.internal_static_pomelo_item_CountItems_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return ItemOuterClass.internal_static_pomelo_item_CountItems_fieldAccessorTable.ensureFieldAccessorsInitialized(ItemOuterClass.CountItems.class, Builder.class);
            }

            private Builder() {
                this.items_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.items_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (ItemOuterClass.CountItems.alwaysUseFieldBuilders) getItemsFieldBuilder();
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                if (this.itemsBuilder_ == null) {
                    this.items_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                } else {
                    this.itemsBuilder_.clear();
                }
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return ItemOuterClass.internal_static_pomelo_item_CountItems_descriptor;
            }

            public ItemOuterClass.CountItems getDefaultInstanceForType() {
                return ItemOuterClass.CountItems.getDefaultInstance();
            }

            public ItemOuterClass.CountItems build() {
                ItemOuterClass.CountItems result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public ItemOuterClass.CountItems buildPartial() {
                ItemOuterClass.CountItems result = new ItemOuterClass.CountItems(this);
                int from_bitField0_ = this.bitField0_;
                if (this.itemsBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) == 1) {
                        this.items_ = Collections.unmodifiableList(this.items_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.items_ = this.items_;
                } else {
                    result.items_ = this.itemsBuilder_.build();
                }
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof ItemOuterClass.CountItems) return mergeFrom((ItemOuterClass.CountItems) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(ItemOuterClass.CountItems other) {
                if (other == ItemOuterClass.CountItems.getDefaultInstance()) return this;
                if (this.itemsBuilder_ == null) {
                    if (!other.items_.isEmpty()) {
                        if (this.items_.isEmpty()) {
                            this.items_ = other.items_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        } else {
                            ensureItemsIsMutable();
                            this.items_.addAll(other.items_);
                        }
                        onChanged();
                    }
                } else if (!other.items_.isEmpty()) {
                    if (this.itemsBuilder_.isEmpty()) {
                        this.itemsBuilder_.dispose();
                        this.itemsBuilder_ = null;
                        this.items_ = other.items_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.itemsBuilder_ = ItemOuterClass.CountItems.alwaysUseFieldBuilders ? getItemsFieldBuilder() : null;
                    } else {
                        this.itemsBuilder_.addAllMessages(other.items_);
                    }
                }
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                for (int i = 0; i < getItemsCount(); i++) {
                    if (!getItems(i).isInitialized()) return false;
                }
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                ItemOuterClass.CountItems parsedMessage = null;
                try {
                    parsedMessage = (ItemOuterClass.CountItems) ItemOuterClass.CountItems.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ItemOuterClass.CountItems) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }

            private void ensureItemsIsMutable() {
                if ((this.bitField0_ & 0x1) != 1) {
                    this.items_ = new ArrayList<>(this.items_);
                    this.bitField0_ |= 0x1;
                }
            }

            public List<ItemOuterClass.CountItem> getItemsList() {
                if (this.itemsBuilder_ == null) return Collections.unmodifiableList(this.items_);
                return this.itemsBuilder_.getMessageList();
            }

            public int getItemsCount() {
                if (this.itemsBuilder_ == null) return this.items_.size();
                return this.itemsBuilder_.getCount();
            }

            public ItemOuterClass.CountItem getItems(int index) {
                if (this.itemsBuilder_ == null) return this.items_.get(index);
                return (ItemOuterClass.CountItem) this.itemsBuilder_.getMessage(index);
            }

            public Builder setItems(int index, ItemOuterClass.CountItem value) {
                if (this.itemsBuilder_ == null) {
                    if (value == null) throw new NullPointerException();
                    ensureItemsIsMutable();
                    this.items_.set(index, value);
                    onChanged();
                } else {
                    this.itemsBuilder_.setMessage(index, value);
                }
                return this;
            }

            public Builder setItems(int index, ItemOuterClass.CountItem.Builder builderForValue) {
                if (this.itemsBuilder_ == null) {
                    ensureItemsIsMutable();
                    this.items_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    this.itemsBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }

            public Builder addItems(ItemOuterClass.CountItem value) {
                if (this.itemsBuilder_ == null) {
                    if (value == null) throw new NullPointerException();
                    ensureItemsIsMutable();
                    this.items_.add(value);
                    onChanged();
                } else {
                    this.itemsBuilder_.addMessage(value);
                }
                return this;
            }

            public Builder addItems(int index, ItemOuterClass.CountItem value) {
                if (this.itemsBuilder_ == null) {
                    if (value == null) throw new NullPointerException();
                    ensureItemsIsMutable();
                    this.items_.add(index, value);
                    onChanged();
                } else {
                    this.itemsBuilder_.addMessage(index, value);
                }
                return this;
            }

            public Builder addItems(ItemOuterClass.CountItem.Builder builderForValue) {
                if (this.itemsBuilder_ == null) {
                    ensureItemsIsMutable();
                    this.items_.add(builderForValue.build());
                    onChanged();
                } else {
                    this.itemsBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }

            public Builder addItems(int index, ItemOuterClass.CountItem.Builder builderForValue) {
                if (this.itemsBuilder_ == null) {
                    ensureItemsIsMutable();
                    this.items_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    this.itemsBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }

            public Builder addAllItems(Iterable<? extends ItemOuterClass.CountItem> values) {
                if (this.itemsBuilder_ == null) {
                    ensureItemsIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.items_);
                    onChanged();
                } else {
                    this.itemsBuilder_.addAllMessages(values);
                }
                return this;
            }

            public Builder clearItems() {
                if (this.itemsBuilder_ == null) {
                    this.items_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    onChanged();
                } else {
                    this.itemsBuilder_.clear();
                }
                return this;
            }

            public Builder removeItems(int index) {
                if (this.itemsBuilder_ == null) {
                    ensureItemsIsMutable();
                    this.items_.remove(index);
                    onChanged();
                } else {
                    this.itemsBuilder_.remove(index);
                }
                return this;
            }

            public ItemOuterClass.CountItem.Builder getItemsBuilder(int index) {
                return (ItemOuterClass.CountItem.Builder) getItemsFieldBuilder().getBuilder(index);
            }

            public ItemOuterClass.CountItemOrBuilder getItemsOrBuilder(int index) {
                if (this.itemsBuilder_ == null) return this.items_.get(index);
                return (ItemOuterClass.CountItemOrBuilder) this.itemsBuilder_.getMessageOrBuilder(index);
            }

            public List<? extends ItemOuterClass.CountItemOrBuilder> getItemsOrBuilderList() {
                if (this.itemsBuilder_ != null) return this.itemsBuilder_.getMessageOrBuilderList();
                return Collections.unmodifiableList((List) this.items_);
            }

            public ItemOuterClass.CountItem.Builder addItemsBuilder() {
                return (ItemOuterClass.CountItem.Builder) getItemsFieldBuilder().addBuilder(ItemOuterClass.CountItem.getDefaultInstance());
            }

            public ItemOuterClass.CountItem.Builder addItemsBuilder(int index) {
                return (ItemOuterClass.CountItem.Builder) getItemsFieldBuilder().addBuilder(index, ItemOuterClass.CountItem.getDefaultInstance());
            }

            public List<ItemOuterClass.CountItem.Builder> getItemsBuilderList() {
                return getItemsFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilder<ItemOuterClass.CountItem, ItemOuterClass.CountItem.Builder, ItemOuterClass.CountItemOrBuilder> getItemsFieldBuilder() {
                if (this.itemsBuilder_ == null) {
                    this.itemsBuilder_ = new RepeatedFieldBuilder(this.items_, ((this.bitField0_ & 0x1) == 1), getParentForChildren(), isClean());
                    this.items_ = null;
                }
                return this.itemsBuilder_;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class EquipmentJewelAtt
            extends GeneratedMessage
            implements EquipmentJewelAttOrBuilder {
        private static final EquipmentJewelAtt defaultInstance = new EquipmentJewelAtt(true);
        private final UnknownFieldSet unknownFields;

        private EquipmentJewelAtt(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private EquipmentJewelAtt(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static EquipmentJewelAtt getDefaultInstance() {
            return defaultInstance;
        }

        public EquipmentJewelAtt getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private EquipmentJewelAtt(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    ItemOuterClass.MiniItem.Builder subBuilder;
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.bitField0_ |= 0x1;
                            this.index_ = input.readInt32();
                            break;
                        case 16:
                            this.bitField0_ |= 0x2;
                            this.id_ = input.readInt32();
                            break;
                        case 24:
                            this.bitField0_ |= 0x4;
                            this.value_ = input.readInt32();
                            break;
                        case 34:
                            subBuilder = null;
                            if ((this.bitField0_ & 0x8) == 8) subBuilder = this.gem_.toBuilder();
                            this.gem_ = (ItemOuterClass.MiniItem) input.readMessage(ItemOuterClass.MiniItem.PARSER, extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.gem_);
                                this.gem_ = subBuilder.buildPartial();
                            }
                            this.bitField0_ |= 0x8;
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ItemOuterClass.internal_static_pomelo_item_EquipmentJewelAtt_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return ItemOuterClass.internal_static_pomelo_item_EquipmentJewelAtt_fieldAccessorTable.ensureFieldAccessorsInitialized(EquipmentJewelAtt.class, Builder.class);
        }

        public static Parser<EquipmentJewelAtt> PARSER = (Parser<EquipmentJewelAtt>) new AbstractParser<EquipmentJewelAtt>() {
            public ItemOuterClass.EquipmentJewelAtt parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new ItemOuterClass.EquipmentJewelAtt(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int INDEX_FIELD_NUMBER = 1;
        private int index_;
        public static final int ID_FIELD_NUMBER = 2;
        private int id_;
        public static final int VALUE_FIELD_NUMBER = 3;
        private int value_;
        public static final int GEM_FIELD_NUMBER = 4;
        private ItemOuterClass.MiniItem gem_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<EquipmentJewelAtt> getParserForType() {
            return PARSER;
        }

        public boolean hasIndex() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public int getIndex() {
            return this.index_;
        }

        public boolean hasId() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        public int getId() {
            return this.id_;
        }

        public boolean hasValue() {
            return ((this.bitField0_ & 0x4) == 4);
        }

        public int getValue() {
            return this.value_;
        }

        public boolean hasGem() {
            return ((this.bitField0_ & 0x8) == 8);
        }

        public ItemOuterClass.MiniItem getGem() {
            return this.gem_;
        }

        public ItemOuterClass.MiniItemOrBuilder getGemOrBuilder() {
            return this.gem_;
        }

        private void initFields() {
            this.index_ = 0;
            this.id_ = 0;
            this.value_ = 0;
            this.gem_ = ItemOuterClass.MiniItem.getDefaultInstance();
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            if (!hasIndex()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (hasGem() && !getGem().isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) output.writeInt32(1, this.index_);
            if ((this.bitField0_ & 0x2) == 2) output.writeInt32(2, this.id_);
            if ((this.bitField0_ & 0x4) == 4) output.writeInt32(3, this.value_);
            if ((this.bitField0_ & 0x8) == 8) output.writeMessage(4, (MessageLite) this.gem_);
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) size += CodedOutputStream.computeInt32Size(1, this.index_);
            if ((this.bitField0_ & 0x2) == 2) size += CodedOutputStream.computeInt32Size(2, this.id_);
            if ((this.bitField0_ & 0x4) == 4) size += CodedOutputStream.computeInt32Size(3, this.value_);
            if ((this.bitField0_ & 0x8) == 8) size += CodedOutputStream.computeMessageSize(4, (MessageLite) this.gem_);
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static EquipmentJewelAtt parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (EquipmentJewelAtt) PARSER.parseFrom(data);
        }

        public static EquipmentJewelAtt parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (EquipmentJewelAtt) PARSER.parseFrom(data, extensionRegistry);
        }

        public static EquipmentJewelAtt parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (EquipmentJewelAtt) PARSER.parseFrom(data);
        }

        public static EquipmentJewelAtt parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (EquipmentJewelAtt) PARSER.parseFrom(data, extensionRegistry);
        }

        public static EquipmentJewelAtt parseFrom(InputStream input) throws IOException {
            return (EquipmentJewelAtt) PARSER.parseFrom(input);
        }

        public static EquipmentJewelAtt parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (EquipmentJewelAtt) PARSER.parseFrom(input, extensionRegistry);
        }

        public static EquipmentJewelAtt parseDelimitedFrom(InputStream input) throws IOException {
            return (EquipmentJewelAtt) PARSER.parseDelimitedFrom(input);
        }

        public static EquipmentJewelAtt parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (EquipmentJewelAtt) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static EquipmentJewelAtt parseFrom(CodedInputStream input) throws IOException {
            return (EquipmentJewelAtt) PARSER.parseFrom(input);
        }

        public static EquipmentJewelAtt parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (EquipmentJewelAtt) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(EquipmentJewelAtt prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements ItemOuterClass.EquipmentJewelAttOrBuilder {
            private int bitField0_;
            private int index_;
            private int id_;
            private int value_;
            private ItemOuterClass.MiniItem gem_;
            private SingleFieldBuilder<ItemOuterClass.MiniItem, ItemOuterClass.MiniItem.Builder, ItemOuterClass.MiniItemOrBuilder> gemBuilder_;

            public static final Descriptors.Descriptor getDescriptor() {
                return ItemOuterClass.internal_static_pomelo_item_EquipmentJewelAtt_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return ItemOuterClass.internal_static_pomelo_item_EquipmentJewelAtt_fieldAccessorTable.ensureFieldAccessorsInitialized(ItemOuterClass.EquipmentJewelAtt.class, Builder.class);
            }

            private Builder() {
                this.gem_ = ItemOuterClass.MiniItem.getDefaultInstance();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.gem_ = ItemOuterClass.MiniItem.getDefaultInstance();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (ItemOuterClass.EquipmentJewelAtt.alwaysUseFieldBuilders) getGemFieldBuilder();
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.index_ = 0;
                this.bitField0_ &= 0xFFFFFFFE;
                this.id_ = 0;
                this.bitField0_ &= 0xFFFFFFFD;
                this.value_ = 0;
                this.bitField0_ &= 0xFFFFFFFB;
                if (this.gemBuilder_ == null) {
                    this.gem_ = ItemOuterClass.MiniItem.getDefaultInstance();
                } else {
                    this.gemBuilder_.clear();
                }
                this.bitField0_ &= 0xFFFFFFF7;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return ItemOuterClass.internal_static_pomelo_item_EquipmentJewelAtt_descriptor;
            }

            public ItemOuterClass.EquipmentJewelAtt getDefaultInstanceForType() {
                return ItemOuterClass.EquipmentJewelAtt.getDefaultInstance();
            }

            public ItemOuterClass.EquipmentJewelAtt build() {
                ItemOuterClass.EquipmentJewelAtt result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public ItemOuterClass.EquipmentJewelAtt buildPartial() {
                ItemOuterClass.EquipmentJewelAtt result = new ItemOuterClass.EquipmentJewelAtt(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.index_ = this.index_;
                if ((from_bitField0_ & 0x2) == 2) to_bitField0_ |= 0x2;
                result.id_ = this.id_;
                if ((from_bitField0_ & 0x4) == 4) to_bitField0_ |= 0x4;
                result.value_ = this.value_;
                if ((from_bitField0_ & 0x8) == 8) to_bitField0_ |= 0x8;
                if (this.gemBuilder_ == null) {
                    result.gem_ = this.gem_;
                } else {
                    result.gem_ = (ItemOuterClass.MiniItem) this.gemBuilder_.build();
                }
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof ItemOuterClass.EquipmentJewelAtt)
                    return mergeFrom((ItemOuterClass.EquipmentJewelAtt) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(ItemOuterClass.EquipmentJewelAtt other) {
                if (other == ItemOuterClass.EquipmentJewelAtt.getDefaultInstance()) return this;
                if (other.hasIndex()) setIndex(other.getIndex());
                if (other.hasId()) setId(other.getId());
                if (other.hasValue()) setValue(other.getValue());
                if (other.hasGem()) mergeGem(other.getGem());
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasIndex()) return false;
                if (hasGem() && !getGem().isInitialized()) return false;
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                ItemOuterClass.EquipmentJewelAtt parsedMessage = null;
                try {
                    parsedMessage = (ItemOuterClass.EquipmentJewelAtt) ItemOuterClass.EquipmentJewelAtt.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ItemOuterClass.EquipmentJewelAtt) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasIndex() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public int getIndex() {
                return this.index_;
            }

            public Builder setIndex(int value) {
                this.bitField0_ |= 0x1;
                this.index_ = value;
                onChanged();
                return this;
            }

            public Builder clearIndex() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.index_ = 0;
                onChanged();
                return this;
            }

            public boolean hasId() {
                return ((this.bitField0_ & 0x2) == 2);
            }

            public int getId() {
                return this.id_;
            }

            public Builder setId(int value) {
                this.bitField0_ |= 0x2;
                this.id_ = value;
                onChanged();
                return this;
            }

            public Builder clearId() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.id_ = 0;
                onChanged();
                return this;
            }

            public boolean hasValue() {
                return ((this.bitField0_ & 0x4) == 4);
            }

            public int getValue() {
                return this.value_;
            }

            public Builder setValue(int value) {
                this.bitField0_ |= 0x4;
                this.value_ = value;
                onChanged();
                return this;
            }

            public Builder clearValue() {
                this.bitField0_ &= 0xFFFFFFFB;
                this.value_ = 0;
                onChanged();
                return this;
            }

            public boolean hasGem() {
                return ((this.bitField0_ & 0x8) == 8);
            }

            public ItemOuterClass.MiniItem getGem() {
                if (this.gemBuilder_ == null) return this.gem_;
                return (ItemOuterClass.MiniItem) this.gemBuilder_.getMessage();
            }

            public Builder setGem(ItemOuterClass.MiniItem value) {
                if (this.gemBuilder_ == null) {
                    if (value == null) throw new NullPointerException();
                    this.gem_ = value;
                    onChanged();
                } else {
                    this.gemBuilder_.setMessage(value);
                }
                this.bitField0_ |= 0x8;
                return this;
            }

            public Builder setGem(ItemOuterClass.MiniItem.Builder builderForValue) {
                if (this.gemBuilder_ == null) {
                    this.gem_ = builderForValue.build();
                    onChanged();
                } else {
                    this.gemBuilder_.setMessage(builderForValue.build());
                }
                this.bitField0_ |= 0x8;
                return this;
            }

            public Builder mergeGem(ItemOuterClass.MiniItem value) {
                if (this.gemBuilder_ == null) {
                    if ((this.bitField0_ & 0x8) == 8 && this.gem_ != ItemOuterClass.MiniItem.getDefaultInstance()) {
                        this.gem_ = ItemOuterClass.MiniItem.newBuilder(this.gem_).mergeFrom(value).buildPartial();
                    } else {
                        this.gem_ = value;
                    }
                    onChanged();
                } else {
                    this.gemBuilder_.mergeFrom(value);
                }
                this.bitField0_ |= 0x8;
                return this;
            }

            public Builder clearGem() {
                if (this.gemBuilder_ == null) {
                    this.gem_ = ItemOuterClass.MiniItem.getDefaultInstance();
                    onChanged();
                } else {
                    this.gemBuilder_.clear();
                }
                this.bitField0_ &= 0xFFFFFFF7;
                return this;
            }

            public ItemOuterClass.MiniItem.Builder getGemBuilder() {
                this.bitField0_ |= 0x8;
                onChanged();
                return (ItemOuterClass.MiniItem.Builder) getGemFieldBuilder().getBuilder();
            }

            public ItemOuterClass.MiniItemOrBuilder getGemOrBuilder() {
                if (this.gemBuilder_ != null)
                    return (ItemOuterClass.MiniItemOrBuilder) this.gemBuilder_.getMessageOrBuilder();
                return this.gem_;
            }

            private SingleFieldBuilder<ItemOuterClass.MiniItem, ItemOuterClass.MiniItem.Builder, ItemOuterClass.MiniItemOrBuilder> getGemFieldBuilder() {
                if (this.gemBuilder_ == null) {
                    this.gemBuilder_ = new SingleFieldBuilder(getGem(), getParentForChildren(), isClean());
                    this.gem_ = null;
                }
                return this.gemBuilder_;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class EquipmentDetail
            extends GeneratedMessage
            implements EquipmentDetailOrBuilder {
        private static final EquipmentDetail defaultInstance = new EquipmentDetail(true);
        private final UnknownFieldSet unknownFields;

        private EquipmentDetail(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private EquipmentDetail(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static EquipmentDetail getDefaultInstance() {
            return defaultInstance;
        }

        public EquipmentDetail getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private EquipmentDetail(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    Common.AttributeBase.Builder subBuilder;
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.bitField0_ |= 0x1;
                            this.isIdentfied_ = input.readInt32();
                            break;
                        case 16:
                            this.bitField0_ |= 0x2;
                            this.enLevel_ = input.readInt32();
                            break;
                        case 24:
                            this.bitField0_ |= 0x4;
                            this.score_ = input.readInt32();
                            break;
                        case 34:
                            if ((mutable_bitField0_ & 0x8) != 8) {
                                this.randomAtts_ = new ArrayList<>();
                                mutable_bitField0_ |= 0x8;
                            }
                            this.randomAtts_.add(input.readMessage(Common.AttributeBase.PARSER, extensionRegistry));
                            break;
                        case 42:
                            if ((mutable_bitField0_ & 0x10) != 16) {
                                this.jewelAtts_ = new ArrayList<>();
                                mutable_bitField0_ |= 0x10;
                            }
                            this.jewelAtts_.add(input.readMessage(ItemOuterClass.EquipmentJewelAtt.PARSER, extensionRegistry));
                            break;
                        case 50:
                            if ((mutable_bitField0_ & 0x20) != 32) {
                                this.magicAtts_ = new ArrayList<>();
                                mutable_bitField0_ |= 0x20;
                            }
                            this.magicAtts_.add(input.readMessage(Common.AttributeBase.PARSER, extensionRegistry));
                            break;
                        case 56:
                            this.bitField0_ |= 0x8;
                            this.luckyExp_ = input.readInt32();
                            break;
                        case 72:
                            this.bitField0_ |= 0x10;
                            this.baseScore_ = input.readInt32();
                            break;
                        case 82:
                            if ((mutable_bitField0_ & 0x100) != 256) {
                                this.baseAtts_ = new ArrayList<>();
                                mutable_bitField0_ |= 0x100;
                            }
                            this.baseAtts_.add(input.readMessage(Common.AttributeBase.PARSER, extensionRegistry));
                            break;
                        case 90:
                            if ((mutable_bitField0_ & 0x200) != 512) {
                                this.uniqueAtts_ = new ArrayList<>();
                                mutable_bitField0_ |= 0x200;
                            }
                            this.uniqueAtts_.add(input.readMessage(Common.AttributeBase.PARSER, extensionRegistry));
                            break;
                        case 98:
                            if ((mutable_bitField0_ & 0x400) != 1024) {
                                this.tempBaseAtts_ = new ArrayList<>();
                                mutable_bitField0_ |= 0x400;
                            }
                            this.tempBaseAtts_.add(input.readMessage(Common.AttributeBase.PARSER, extensionRegistry));
                            break;
                        case 106:
                            if ((mutable_bitField0_ & 0x800) != 2048) {
                                this.tempExtAtts_ = new ArrayList<>();
                                mutable_bitField0_ |= 0x800;
                            }
                            this.tempExtAtts_.add(input.readMessage(Common.AttributeBase.PARSER, extensionRegistry));
                            break;
                        case 114:
                            if ((mutable_bitField0_ & 0x1000) != 4096) {
                                this.tempExtAttsSenior_ = new ArrayList<>();
                                mutable_bitField0_ |= 0x1000;
                            }
                            this.tempExtAttsSenior_.add(input.readMessage(Common.AttributeBase.PARSER, extensionRegistry));
                            break;
                        case 122:
                            if ((mutable_bitField0_ & 0x2000) != 8192) {
                                this.tempUniqueAtts_ = new ArrayList<>();
                                mutable_bitField0_ |= 0x2000;
                            }
                            this.tempUniqueAtts_.add(input.readMessage(Common.AttributeBase.PARSER, extensionRegistry));
                            break;
                        case 128:
                            this.bitField0_ |= 0x20;
                            this.refineAttrId_ = input.readInt32();
                            break;
                        case 138:
                            subBuilder = null;
                            if ((this.bitField0_ & 0x40) == 64) subBuilder = this.tempRefineAttr_.toBuilder();
                            this.tempRefineAttr_ = (Common.AttributeBase) input.readMessage(Common.AttributeBase.PARSER, extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.tempRefineAttr_);
                                this.tempRefineAttr_ = subBuilder.buildPartial();
                            }
                            this.bitField0_ |= 0x40;
                            break;
                        case 144:
                            this.bitField0_ |= 0x80;
                            this.remakeScore_ = input.readInt32();
                            break;
                        case 152:
                            this.bitField0_ |= 0x100;
                            this.tempRemakeScore_ = input.readInt32();
                            break;
                        case 162:
                            if ((mutable_bitField0_ & 0x40000) != 262144) {
                                this.starAttr_ = new ArrayList<>();
                                mutable_bitField0_ |= 0x40000;
                            }
                            this.starAttr_.add(input.readMessage(Common.AttributeBase.PARSER, extensionRegistry));
                            break;
                        case 170:
                            if ((mutable_bitField0_ & 0x80000) != 524288) {
                                this.tempstarAttr_ = new ArrayList<>();
                                mutable_bitField0_ |= 0x80000;
                            }
                            this.tempstarAttr_.add(input.readMessage(Common.AttributeBase.PARSER, extensionRegistry));
                            break;
                        case 176:
                            this.bitField0_ |= 0x200;
                            this.seniorTempRemakeScore_ = input.readInt32();
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                if ((mutable_bitField0_ & 0x8) == 8) this.randomAtts_ = Collections.unmodifiableList(this.randomAtts_);
                if ((mutable_bitField0_ & 0x10) == 16) this.jewelAtts_ = Collections.unmodifiableList(this.jewelAtts_);
                if ((mutable_bitField0_ & 0x20) == 32) this.magicAtts_ = Collections.unmodifiableList(this.magicAtts_);
                if ((mutable_bitField0_ & 0x100) == 256) this.baseAtts_ = Collections.unmodifiableList(this.baseAtts_);
                if ((mutable_bitField0_ & 0x200) == 512)
                    this.uniqueAtts_ = Collections.unmodifiableList(this.uniqueAtts_);
                if ((mutable_bitField0_ & 0x400) == 1024)
                    this.tempBaseAtts_ = Collections.unmodifiableList(this.tempBaseAtts_);
                if ((mutable_bitField0_ & 0x800) == 2048)
                    this.tempExtAtts_ = Collections.unmodifiableList(this.tempExtAtts_);
                if ((mutable_bitField0_ & 0x1000) == 4096)
                    this.tempExtAttsSenior_ = Collections.unmodifiableList(this.tempExtAttsSenior_);
                if ((mutable_bitField0_ & 0x2000) == 8192)
                    this.tempUniqueAtts_ = Collections.unmodifiableList(this.tempUniqueAtts_);
                if ((mutable_bitField0_ & 0x40000) == 262144)
                    this.starAttr_ = Collections.unmodifiableList(this.starAttr_);
                if ((mutable_bitField0_ & 0x80000) == 524288)
                    this.tempstarAttr_ = Collections.unmodifiableList(this.tempstarAttr_);
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ItemOuterClass.internal_static_pomelo_item_EquipmentDetail_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return ItemOuterClass.internal_static_pomelo_item_EquipmentDetail_fieldAccessorTable.ensureFieldAccessorsInitialized(EquipmentDetail.class, Builder.class);
        }

        public static Parser<EquipmentDetail> PARSER = (Parser<EquipmentDetail>) new AbstractParser<EquipmentDetail>() {
            public ItemOuterClass.EquipmentDetail parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new ItemOuterClass.EquipmentDetail(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int ISIDENTFIED_FIELD_NUMBER = 1;
        private int isIdentfied_;
        public static final int ENLEVEL_FIELD_NUMBER = 2;
        private int enLevel_;
        public static final int SCORE_FIELD_NUMBER = 3;
        private int score_;
        public static final int RANDOMATTS_FIELD_NUMBER = 4;
        private List<Common.AttributeBase> randomAtts_;
        public static final int JEWELATTS_FIELD_NUMBER = 5;
        private List<ItemOuterClass.EquipmentJewelAtt> jewelAtts_;
        public static final int MAGICATTS_FIELD_NUMBER = 6;
        private List<Common.AttributeBase> magicAtts_;
        public static final int LUCKYEXP_FIELD_NUMBER = 7;
        private int luckyExp_;
        public static final int BASESCORE_FIELD_NUMBER = 9;
        private int baseScore_;
        public static final int BASEATTS_FIELD_NUMBER = 10;
        private List<Common.AttributeBase> baseAtts_;
        public static final int UNIQUEATTS_FIELD_NUMBER = 11;
        private List<Common.AttributeBase> uniqueAtts_;
        public static final int TEMPBASEATTS_FIELD_NUMBER = 12;
        private List<Common.AttributeBase> tempBaseAtts_;
        public static final int TEMPEXTATTS_FIELD_NUMBER = 13;
        private List<Common.AttributeBase> tempExtAtts_;
        public static final int TEMPEXTATTS_SENIOR_FIELD_NUMBER = 14;
        private List<Common.AttributeBase> tempExtAttsSenior_;
        public static final int TEMPUNIQUEATTS_FIELD_NUMBER = 15;
        private List<Common.AttributeBase> tempUniqueAtts_;
        public static final int REFINEATTRID_FIELD_NUMBER = 16;
        private int refineAttrId_;
        public static final int TEMPREFINEATTR_FIELD_NUMBER = 17;
        private Common.AttributeBase tempRefineAttr_;
        public static final int REMAKESCORE_FIELD_NUMBER = 18;
        private int remakeScore_;
        public static final int TEMPREMAKESCORE_FIELD_NUMBER = 19;
        private int tempRemakeScore_;
        public static final int STARATTR_FIELD_NUMBER = 20;
        private List<Common.AttributeBase> starAttr_;
        public static final int TEMPSTARATTR_FIELD_NUMBER = 21;
        private List<Common.AttributeBase> tempstarAttr_;
        public static final int SENIORTEMPREMAKESCORE_FIELD_NUMBER = 22;
        private int seniorTempRemakeScore_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<EquipmentDetail> getParserForType() {
            return PARSER;
        }

        public boolean hasIsIdentfied() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public int getIsIdentfied() {
            return this.isIdentfied_;
        }

        public boolean hasEnLevel() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        public int getEnLevel() {
            return this.enLevel_;
        }

        public boolean hasScore() {
            return ((this.bitField0_ & 0x4) == 4);
        }

        public int getScore() {
            return this.score_;
        }

        public List<Common.AttributeBase> getRandomAttsList() {
            return this.randomAtts_;
        }

        public List<? extends Common.AttributeBaseOrBuilder> getRandomAttsOrBuilderList() {
            return (List) this.randomAtts_;
        }

        public int getRandomAttsCount() {
            return this.randomAtts_.size();
        }

        public Common.AttributeBase getRandomAtts(int index) {
            return this.randomAtts_.get(index);
        }

        public Common.AttributeBaseOrBuilder getRandomAttsOrBuilder(int index) {
            return (Common.AttributeBaseOrBuilder) this.randomAtts_.get(index);
        }

        public List<ItemOuterClass.EquipmentJewelAtt> getJewelAttsList() {
            return this.jewelAtts_;
        }

        public List<? extends ItemOuterClass.EquipmentJewelAttOrBuilder> getJewelAttsOrBuilderList() {
            return (List) this.jewelAtts_;
        }

        public int getJewelAttsCount() {
            return this.jewelAtts_.size();
        }

        public ItemOuterClass.EquipmentJewelAtt getJewelAtts(int index) {
            return this.jewelAtts_.get(index);
        }

        public ItemOuterClass.EquipmentJewelAttOrBuilder getJewelAttsOrBuilder(int index) {
            return this.jewelAtts_.get(index);
        }

        public List<Common.AttributeBase> getMagicAttsList() {
            return this.magicAtts_;
        }

        public List<? extends Common.AttributeBaseOrBuilder> getMagicAttsOrBuilderList() {
            return (List) this.magicAtts_;
        }

        public int getMagicAttsCount() {
            return this.magicAtts_.size();
        }

        public Common.AttributeBase getMagicAtts(int index) {
            return this.magicAtts_.get(index);
        }

        public Common.AttributeBaseOrBuilder getMagicAttsOrBuilder(int index) {
            return (Common.AttributeBaseOrBuilder) this.magicAtts_.get(index);
        }

        public boolean hasLuckyExp() {
            return ((this.bitField0_ & 0x8) == 8);
        }

        public int getLuckyExp() {
            return this.luckyExp_;
        }

        public boolean hasBaseScore() {
            return ((this.bitField0_ & 0x10) == 16);
        }

        public int getBaseScore() {
            return this.baseScore_;
        }

        public List<Common.AttributeBase> getBaseAttsList() {
            return this.baseAtts_;
        }

        public List<? extends Common.AttributeBaseOrBuilder> getBaseAttsOrBuilderList() {
            return (List) this.baseAtts_;
        }

        public int getBaseAttsCount() {
            return this.baseAtts_.size();
        }

        public Common.AttributeBase getBaseAtts(int index) {
            return this.baseAtts_.get(index);
        }

        public Common.AttributeBaseOrBuilder getBaseAttsOrBuilder(int index) {
            return (Common.AttributeBaseOrBuilder) this.baseAtts_.get(index);
        }

        public List<Common.AttributeBase> getUniqueAttsList() {
            return this.uniqueAtts_;
        }

        public List<? extends Common.AttributeBaseOrBuilder> getUniqueAttsOrBuilderList() {
            return (List) this.uniqueAtts_;
        }

        public int getUniqueAttsCount() {
            return this.uniqueAtts_.size();
        }

        public Common.AttributeBase getUniqueAtts(int index) {
            return this.uniqueAtts_.get(index);
        }

        public Common.AttributeBaseOrBuilder getUniqueAttsOrBuilder(int index) {
            return (Common.AttributeBaseOrBuilder) this.uniqueAtts_.get(index);
        }

        public List<Common.AttributeBase> getTempBaseAttsList() {
            return this.tempBaseAtts_;
        }

        public List<? extends Common.AttributeBaseOrBuilder> getTempBaseAttsOrBuilderList() {
            return (List) this.tempBaseAtts_;
        }

        public int getTempBaseAttsCount() {
            return this.tempBaseAtts_.size();
        }

        public Common.AttributeBase getTempBaseAtts(int index) {
            return this.tempBaseAtts_.get(index);
        }

        public Common.AttributeBaseOrBuilder getTempBaseAttsOrBuilder(int index) {
            return (Common.AttributeBaseOrBuilder) this.tempBaseAtts_.get(index);
        }

        public List<Common.AttributeBase> getTempExtAttsList() {
            return this.tempExtAtts_;
        }

        public List<? extends Common.AttributeBaseOrBuilder> getTempExtAttsOrBuilderList() {
            return (List) this.tempExtAtts_;
        }

        public int getTempExtAttsCount() {
            return this.tempExtAtts_.size();
        }

        public Common.AttributeBase getTempExtAtts(int index) {
            return this.tempExtAtts_.get(index);
        }

        public Common.AttributeBaseOrBuilder getTempExtAttsOrBuilder(int index) {
            return (Common.AttributeBaseOrBuilder) this.tempExtAtts_.get(index);
        }

        public List<Common.AttributeBase> getTempExtAttsSeniorList() {
            return this.tempExtAttsSenior_;
        }

        public List<? extends Common.AttributeBaseOrBuilder> getTempExtAttsSeniorOrBuilderList() {
            return (List) this.tempExtAttsSenior_;
        }

        public int getTempExtAttsSeniorCount() {
            return this.tempExtAttsSenior_.size();
        }

        public Common.AttributeBase getTempExtAttsSenior(int index) {
            return this.tempExtAttsSenior_.get(index);
        }

        public Common.AttributeBaseOrBuilder getTempExtAttsSeniorOrBuilder(int index) {
            return (Common.AttributeBaseOrBuilder) this.tempExtAttsSenior_.get(index);
        }

        public List<Common.AttributeBase> getTempUniqueAttsList() {
            return this.tempUniqueAtts_;
        }

        public List<? extends Common.AttributeBaseOrBuilder> getTempUniqueAttsOrBuilderList() {
            return (List) this.tempUniqueAtts_;
        }

        public int getTempUniqueAttsCount() {
            return this.tempUniqueAtts_.size();
        }

        public Common.AttributeBase getTempUniqueAtts(int index) {
            return this.tempUniqueAtts_.get(index);
        }

        public Common.AttributeBaseOrBuilder getTempUniqueAttsOrBuilder(int index) {
            return (Common.AttributeBaseOrBuilder) this.tempUniqueAtts_.get(index);
        }

        public boolean hasRefineAttrId() {
            return ((this.bitField0_ & 0x20) == 32);
        }

        public int getRefineAttrId() {
            return this.refineAttrId_;
        }

        public boolean hasTempRefineAttr() {
            return ((this.bitField0_ & 0x40) == 64);
        }

        public Common.AttributeBase getTempRefineAttr() {
            return this.tempRefineAttr_;
        }

        static {
            defaultInstance.initFields();
        }

        public Common.AttributeBaseOrBuilder getTempRefineAttrOrBuilder() {
            return (Common.AttributeBaseOrBuilder) this.tempRefineAttr_;
        }

        public boolean hasRemakeScore() {
            return ((this.bitField0_ & 0x80) == 128);
        }

        public int getRemakeScore() {
            return this.remakeScore_;
        }

        public boolean hasTempRemakeScore() {
            return ((this.bitField0_ & 0x100) == 256);
        }

        public int getTempRemakeScore() {
            return this.tempRemakeScore_;
        }

        public List<Common.AttributeBase> getStarAttrList() {
            return this.starAttr_;
        }

        public List<? extends Common.AttributeBaseOrBuilder> getStarAttrOrBuilderList() {
            return (List) this.starAttr_;
        }

        public int getStarAttrCount() {
            return this.starAttr_.size();
        }

        public Common.AttributeBase getStarAttr(int index) {
            return this.starAttr_.get(index);
        }

        public Common.AttributeBaseOrBuilder getStarAttrOrBuilder(int index) {
            return (Common.AttributeBaseOrBuilder) this.starAttr_.get(index);
        }

        public List<Common.AttributeBase> getTempstarAttrList() {
            return this.tempstarAttr_;
        }

        public List<? extends Common.AttributeBaseOrBuilder> getTempstarAttrOrBuilderList() {
            return (List) this.tempstarAttr_;
        }

        public int getTempstarAttrCount() {
            return this.tempstarAttr_.size();
        }

        public Common.AttributeBase getTempstarAttr(int index) {
            return this.tempstarAttr_.get(index);
        }

        public Common.AttributeBaseOrBuilder getTempstarAttrOrBuilder(int index) {
            return (Common.AttributeBaseOrBuilder) this.tempstarAttr_.get(index);
        }

        public boolean hasSeniorTempRemakeScore() {
            return ((this.bitField0_ & 0x200) == 512);
        }

        public int getSeniorTempRemakeScore() {
            return this.seniorTempRemakeScore_;
        }

        private void initFields() {
            this.isIdentfied_ = 0;
            this.enLevel_ = 0;
            this.score_ = 0;
            this.randomAtts_ = Collections.emptyList();
            this.jewelAtts_ = Collections.emptyList();
            this.magicAtts_ = Collections.emptyList();
            this.luckyExp_ = 0;
            this.baseScore_ = 0;
            this.baseAtts_ = Collections.emptyList();
            this.uniqueAtts_ = Collections.emptyList();
            this.tempBaseAtts_ = Collections.emptyList();
            this.tempExtAtts_ = Collections.emptyList();
            this.tempExtAttsSenior_ = Collections.emptyList();
            this.tempUniqueAtts_ = Collections.emptyList();
            this.refineAttrId_ = 0;
            this.tempRefineAttr_ = Common.AttributeBase.getDefaultInstance();
            this.remakeScore_ = 0;
            this.tempRemakeScore_ = 0;
            this.starAttr_ = Collections.emptyList();
            this.tempstarAttr_ = Collections.emptyList();
            this.seniorTempRemakeScore_ = 0;
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1)
                return true;
            if (isInitialized == 0)
                return false;
            int i;
            for (i = 0; i < getRandomAttsCount(); i++) {
                if (!getRandomAtts(i).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            for (i = 0; i < getJewelAttsCount(); i++) {
                if (!getJewelAtts(i).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            for (i = 0; i < getMagicAttsCount(); i++) {
                if (!getMagicAtts(i).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            for (i = 0; i < getBaseAttsCount(); i++) {
                if (!getBaseAtts(i).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            for (i = 0; i < getUniqueAttsCount(); i++) {
                if (!getUniqueAtts(i).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            for (i = 0; i < getTempBaseAttsCount(); i++) {
                if (!getTempBaseAtts(i).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            for (i = 0; i < getTempExtAttsCount(); i++) {
                if (!getTempExtAtts(i).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            for (i = 0; i < getTempExtAttsSeniorCount(); i++) {
                if (!getTempExtAttsSenior(i).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            for (i = 0; i < getTempUniqueAttsCount(); i++) {
                if (!getTempUniqueAtts(i).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            if (hasTempRefineAttr() && !getTempRefineAttr().isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            for (i = 0; i < getStarAttrCount(); i++) {
                if (!getStarAttr(i).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            for (i = 0; i < getTempstarAttrCount(); i++) {
                if (!getTempstarAttr(i).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1)
                output.writeInt32(1, this.isIdentfied_);
            if ((this.bitField0_ & 0x2) == 2)
                output.writeInt32(2, this.enLevel_);
            if ((this.bitField0_ & 0x4) == 4)
                output.writeInt32(3, this.score_);
            int i;
            for (i = 0; i < this.randomAtts_.size(); i++)
                output.writeMessage(4, (MessageLite) this.randomAtts_.get(i));
            for (i = 0; i < this.jewelAtts_.size(); i++)
                output.writeMessage(5, (MessageLite) this.jewelAtts_.get(i));
            for (i = 0; i < this.magicAtts_.size(); i++)
                output.writeMessage(6, (MessageLite) this.magicAtts_.get(i));
            if ((this.bitField0_ & 0x8) == 8)
                output.writeInt32(7, this.luckyExp_);
            if ((this.bitField0_ & 0x10) == 16)
                output.writeInt32(9, this.baseScore_);
            for (i = 0; i < this.baseAtts_.size(); i++)
                output.writeMessage(10, (MessageLite) this.baseAtts_.get(i));
            for (i = 0; i < this.uniqueAtts_.size(); i++)
                output.writeMessage(11, (MessageLite) this.uniqueAtts_.get(i));
            for (i = 0; i < this.tempBaseAtts_.size(); i++)
                output.writeMessage(12, (MessageLite) this.tempBaseAtts_.get(i));
            for (i = 0; i < this.tempExtAtts_.size(); i++)
                output.writeMessage(13, (MessageLite) this.tempExtAtts_.get(i));
            for (i = 0; i < this.tempExtAttsSenior_.size(); i++)
                output.writeMessage(14, (MessageLite) this.tempExtAttsSenior_.get(i));
            for (i = 0; i < this.tempUniqueAtts_.size(); i++)
                output.writeMessage(15, (MessageLite) this.tempUniqueAtts_.get(i));
            if ((this.bitField0_ & 0x20) == 32)
                output.writeInt32(16, this.refineAttrId_);
            if ((this.bitField0_ & 0x40) == 64)
                output.writeMessage(17, (MessageLite) this.tempRefineAttr_);
            if ((this.bitField0_ & 0x80) == 128)
                output.writeInt32(18, this.remakeScore_);
            if ((this.bitField0_ & 0x100) == 256)
                output.writeInt32(19, this.tempRemakeScore_);
            for (i = 0; i < this.starAttr_.size(); i++)
                output.writeMessage(20, (MessageLite) this.starAttr_.get(i));
            for (i = 0; i < this.tempstarAttr_.size(); i++)
                output.writeMessage(21, (MessageLite) this.tempstarAttr_.get(i));
            if ((this.bitField0_ & 0x200) == 512)
                output.writeInt32(22, this.seniorTempRemakeScore_);
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1)
                return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1)
                size += CodedOutputStream.computeInt32Size(1, this.isIdentfied_);
            if ((this.bitField0_ & 0x2) == 2)
                size += CodedOutputStream.computeInt32Size(2, this.enLevel_);
            if ((this.bitField0_ & 0x4) == 4)
                size += CodedOutputStream.computeInt32Size(3, this.score_);
            int i;
            for (i = 0; i < this.randomAtts_.size(); i++)
                size += CodedOutputStream.computeMessageSize(4, (MessageLite) this.randomAtts_.get(i));
            for (i = 0; i < this.jewelAtts_.size(); i++)
                size += CodedOutputStream.computeMessageSize(5, (MessageLite) this.jewelAtts_.get(i));
            for (i = 0; i < this.magicAtts_.size(); i++)
                size += CodedOutputStream.computeMessageSize(6, (MessageLite) this.magicAtts_.get(i));
            if ((this.bitField0_ & 0x8) == 8)
                size += CodedOutputStream.computeInt32Size(7, this.luckyExp_);
            if ((this.bitField0_ & 0x10) == 16)
                size += CodedOutputStream.computeInt32Size(9, this.baseScore_);
            for (i = 0; i < this.baseAtts_.size(); i++)
                size += CodedOutputStream.computeMessageSize(10, (MessageLite) this.baseAtts_.get(i));
            for (i = 0; i < this.uniqueAtts_.size(); i++)
                size += CodedOutputStream.computeMessageSize(11, (MessageLite) this.uniqueAtts_.get(i));
            for (i = 0; i < this.tempBaseAtts_.size(); i++)
                size += CodedOutputStream.computeMessageSize(12, (MessageLite) this.tempBaseAtts_.get(i));
            for (i = 0; i < this.tempExtAtts_.size(); i++)
                size += CodedOutputStream.computeMessageSize(13, (MessageLite) this.tempExtAtts_.get(i));
            for (i = 0; i < this.tempExtAttsSenior_.size(); i++)
                size += CodedOutputStream.computeMessageSize(14, (MessageLite) this.tempExtAttsSenior_.get(i));
            for (i = 0; i < this.tempUniqueAtts_.size(); i++)
                size += CodedOutputStream.computeMessageSize(15, (MessageLite) this.tempUniqueAtts_.get(i));
            if ((this.bitField0_ & 0x20) == 32)
                size += CodedOutputStream.computeInt32Size(16, this.refineAttrId_);
            if ((this.bitField0_ & 0x40) == 64)
                size += CodedOutputStream.computeMessageSize(17, (MessageLite) this.tempRefineAttr_);
            if ((this.bitField0_ & 0x80) == 128)
                size += CodedOutputStream.computeInt32Size(18, this.remakeScore_);
            if ((this.bitField0_ & 0x100) == 256)
                size += CodedOutputStream.computeInt32Size(19, this.tempRemakeScore_);
            for (i = 0; i < this.starAttr_.size(); i++)
                size += CodedOutputStream.computeMessageSize(20, (MessageLite) this.starAttr_.get(i));
            for (i = 0; i < this.tempstarAttr_.size(); i++)
                size += CodedOutputStream.computeMessageSize(21, (MessageLite) this.tempstarAttr_.get(i));
            if ((this.bitField0_ & 0x200) == 512)
                size += CodedOutputStream.computeInt32Size(22, this.seniorTempRemakeScore_);
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static EquipmentDetail parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (EquipmentDetail) PARSER.parseFrom(data);
        }

        public static EquipmentDetail parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (EquipmentDetail) PARSER.parseFrom(data, extensionRegistry);
        }

        public static EquipmentDetail parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (EquipmentDetail) PARSER.parseFrom(data);
        }

        public static EquipmentDetail parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (EquipmentDetail) PARSER.parseFrom(data, extensionRegistry);
        }

        public static EquipmentDetail parseFrom(InputStream input) throws IOException {
            return (EquipmentDetail) PARSER.parseFrom(input);
        }

        public static EquipmentDetail parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (EquipmentDetail) PARSER.parseFrom(input, extensionRegistry);
        }

        public static EquipmentDetail parseDelimitedFrom(InputStream input) throws IOException {
            return (EquipmentDetail) PARSER.parseDelimitedFrom(input);
        }

        public static EquipmentDetail parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (EquipmentDetail) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static EquipmentDetail parseFrom(CodedInputStream input) throws IOException {
            return (EquipmentDetail) PARSER.parseFrom(input);
        }

        public static EquipmentDetail parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (EquipmentDetail) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(EquipmentDetail prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements ItemOuterClass.EquipmentDetailOrBuilder {
            private int bitField0_;
            private int isIdentfied_;
            private int enLevel_;
            private int score_;
            private List<Common.AttributeBase> randomAtts_;
            private RepeatedFieldBuilder<Common.AttributeBase, Common.AttributeBase.Builder, Common.AttributeBaseOrBuilder> randomAttsBuilder_;
            private List<ItemOuterClass.EquipmentJewelAtt> jewelAtts_;
            private RepeatedFieldBuilder<ItemOuterClass.EquipmentJewelAtt, ItemOuterClass.EquipmentJewelAtt.Builder, ItemOuterClass.EquipmentJewelAttOrBuilder> jewelAttsBuilder_;
            private List<Common.AttributeBase> magicAtts_;
            private RepeatedFieldBuilder<Common.AttributeBase, Common.AttributeBase.Builder, Common.AttributeBaseOrBuilder> magicAttsBuilder_;
            private int luckyExp_;
            private int baseScore_;
            private List<Common.AttributeBase> baseAtts_;
            private RepeatedFieldBuilder<Common.AttributeBase, Common.AttributeBase.Builder, Common.AttributeBaseOrBuilder> baseAttsBuilder_;
            private List<Common.AttributeBase> uniqueAtts_;
            private RepeatedFieldBuilder<Common.AttributeBase, Common.AttributeBase.Builder, Common.AttributeBaseOrBuilder> uniqueAttsBuilder_;
            private List<Common.AttributeBase> tempBaseAtts_;
            private RepeatedFieldBuilder<Common.AttributeBase, Common.AttributeBase.Builder, Common.AttributeBaseOrBuilder> tempBaseAttsBuilder_;
            private List<Common.AttributeBase> tempExtAtts_;
            private RepeatedFieldBuilder<Common.AttributeBase, Common.AttributeBase.Builder, Common.AttributeBaseOrBuilder> tempExtAttsBuilder_;
            private List<Common.AttributeBase> tempExtAttsSenior_;
            private RepeatedFieldBuilder<Common.AttributeBase, Common.AttributeBase.Builder, Common.AttributeBaseOrBuilder> tempExtAttsSeniorBuilder_;
            private List<Common.AttributeBase> tempUniqueAtts_;
            private RepeatedFieldBuilder<Common.AttributeBase, Common.AttributeBase.Builder, Common.AttributeBaseOrBuilder> tempUniqueAttsBuilder_;
            private int refineAttrId_;
            private Common.AttributeBase tempRefineAttr_;
            private SingleFieldBuilder<Common.AttributeBase, Common.AttributeBase.Builder, Common.AttributeBaseOrBuilder> tempRefineAttrBuilder_;
            private int remakeScore_;
            private int tempRemakeScore_;
            private List<Common.AttributeBase> starAttr_;
            private RepeatedFieldBuilder<Common.AttributeBase, Common.AttributeBase.Builder, Common.AttributeBaseOrBuilder> starAttrBuilder_;
            private List<Common.AttributeBase> tempstarAttr_;
            private RepeatedFieldBuilder<Common.AttributeBase, Common.AttributeBase.Builder, Common.AttributeBaseOrBuilder> tempstarAttrBuilder_;
            private int seniorTempRemakeScore_;

            public static final Descriptors.Descriptor getDescriptor() {
                return ItemOuterClass.internal_static_pomelo_item_EquipmentDetail_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return ItemOuterClass.internal_static_pomelo_item_EquipmentDetail_fieldAccessorTable.ensureFieldAccessorsInitialized(ItemOuterClass.EquipmentDetail.class, Builder.class);
            }

            private Builder() {
                this.randomAtts_ = Collections.emptyList();
                this.jewelAtts_ = Collections.emptyList();
                this.magicAtts_ = Collections.emptyList();
                this.baseAtts_ = Collections.emptyList();
                this.uniqueAtts_ = Collections.emptyList();
                this.tempBaseAtts_ = Collections.emptyList();
                this.tempExtAtts_ = Collections.emptyList();
                this.tempExtAttsSenior_ = Collections.emptyList();
                this.tempUniqueAtts_ = Collections.emptyList();
                this.tempRefineAttr_ = Common.AttributeBase.getDefaultInstance();
                this.starAttr_ = Collections.emptyList();
                this.tempstarAttr_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.randomAtts_ = Collections.emptyList();
                this.jewelAtts_ = Collections.emptyList();
                this.magicAtts_ = Collections.emptyList();
                this.baseAtts_ = Collections.emptyList();
                this.uniqueAtts_ = Collections.emptyList();
                this.tempBaseAtts_ = Collections.emptyList();
                this.tempExtAtts_ = Collections.emptyList();
                this.tempExtAttsSenior_ = Collections.emptyList();
                this.tempUniqueAtts_ = Collections.emptyList();
                this.tempRefineAttr_ = Common.AttributeBase.getDefaultInstance();
                this.starAttr_ = Collections.emptyList();
                this.tempstarAttr_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (ItemOuterClass.EquipmentDetail.alwaysUseFieldBuilders) {
                    getRandomAttsFieldBuilder();
                    getJewelAttsFieldBuilder();
                    getMagicAttsFieldBuilder();
                    getBaseAttsFieldBuilder();
                    getUniqueAttsFieldBuilder();
                    getTempBaseAttsFieldBuilder();
                    getTempExtAttsFieldBuilder();
                    getTempExtAttsSeniorFieldBuilder();
                    getTempUniqueAttsFieldBuilder();
                    getTempRefineAttrFieldBuilder();
                    getStarAttrFieldBuilder();
                    getTempstarAttrFieldBuilder();
                }
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.isIdentfied_ = 0;
                this.bitField0_ &= 0xFFFFFFFE;
                this.enLevel_ = 0;
                this.bitField0_ &= 0xFFFFFFFD;
                this.score_ = 0;
                this.bitField0_ &= 0xFFFFFFFB;
                if (this.randomAttsBuilder_ == null) {
                    this.randomAtts_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFF7;
                } else {
                    this.randomAttsBuilder_.clear();
                }
                if (this.jewelAttsBuilder_ == null) {
                    this.jewelAtts_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFEF;
                } else {
                    this.jewelAttsBuilder_.clear();
                }
                if (this.magicAttsBuilder_ == null) {
                    this.magicAtts_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFDF;
                } else {
                    this.magicAttsBuilder_.clear();
                }
                this.luckyExp_ = 0;
                this.bitField0_ &= 0xFFFFFFBF;
                this.baseScore_ = 0;
                this.bitField0_ &= 0xFFFFFF7F;
                if (this.baseAttsBuilder_ == null) {
                    this.baseAtts_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFEFF;
                } else {
                    this.baseAttsBuilder_.clear();
                }
                if (this.uniqueAttsBuilder_ == null) {
                    this.uniqueAtts_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFDFF;
                } else {
                    this.uniqueAttsBuilder_.clear();
                }
                if (this.tempBaseAttsBuilder_ == null) {
                    this.tempBaseAtts_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFBFF;
                } else {
                    this.tempBaseAttsBuilder_.clear();
                }
                if (this.tempExtAttsBuilder_ == null) {
                    this.tempExtAtts_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFF7FF;
                } else {
                    this.tempExtAttsBuilder_.clear();
                }
                if (this.tempExtAttsSeniorBuilder_ == null) {
                    this.tempExtAttsSenior_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFEFFF;
                } else {
                    this.tempExtAttsSeniorBuilder_.clear();
                }
                if (this.tempUniqueAttsBuilder_ == null) {
                    this.tempUniqueAtts_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFDFFF;
                } else {
                    this.tempUniqueAttsBuilder_.clear();
                }
                this.refineAttrId_ = 0;
                this.bitField0_ &= 0xFFFFBFFF;
                if (this.tempRefineAttrBuilder_ == null) {
                    this.tempRefineAttr_ = Common.AttributeBase.getDefaultInstance();
                } else {
                    this.tempRefineAttrBuilder_.clear();
                }
                this.bitField0_ &= 0xFFFF7FFF;
                this.remakeScore_ = 0;
                this.bitField0_ &= 0xFFFEFFFF;
                this.tempRemakeScore_ = 0;
                this.bitField0_ &= 0xFFFDFFFF;
                if (this.starAttrBuilder_ == null) {
                    this.starAttr_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFBFFFF;
                } else {
                    this.starAttrBuilder_.clear();
                }
                if (this.tempstarAttrBuilder_ == null) {
                    this.tempstarAttr_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFF7FFFF;
                } else {
                    this.tempstarAttrBuilder_.clear();
                }
                this.seniorTempRemakeScore_ = 0;
                this.bitField0_ &= 0xFFEFFFFF;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return ItemOuterClass.internal_static_pomelo_item_EquipmentDetail_descriptor;
            }

            public ItemOuterClass.EquipmentDetail getDefaultInstanceForType() {
                return ItemOuterClass.EquipmentDetail.getDefaultInstance();
            }

            public ItemOuterClass.EquipmentDetail build() {
                ItemOuterClass.EquipmentDetail result = buildPartial();
                if (!result.isInitialized())
                    throw newUninitializedMessageException(result);
                return result;
            }

            public ItemOuterClass.EquipmentDetail buildPartial() {
                ItemOuterClass.EquipmentDetail result = new ItemOuterClass.EquipmentDetail(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1)
                    to_bitField0_ |= 0x1;
                result.isIdentfied_ = this.isIdentfied_;
                if ((from_bitField0_ & 0x2) == 2)
                    to_bitField0_ |= 0x2;
                result.enLevel_ = this.enLevel_;
                if ((from_bitField0_ & 0x4) == 4)
                    to_bitField0_ |= 0x4;
                result.score_ = this.score_;
                if (this.randomAttsBuilder_ == null) {
                    if ((this.bitField0_ & 0x8) == 8) {
                        this.randomAtts_ = Collections.unmodifiableList(this.randomAtts_);
                        this.bitField0_ &= 0xFFFFFFF7;
                    }
                    result.randomAtts_ = this.randomAtts_;
                } else {
                    result.randomAtts_ = this.randomAttsBuilder_.build();
                }
                if (this.jewelAttsBuilder_ == null) {
                    if ((this.bitField0_ & 0x10) == 16) {
                        this.jewelAtts_ = Collections.unmodifiableList(this.jewelAtts_);
                        this.bitField0_ &= 0xFFFFFFEF;
                    }
                    result.jewelAtts_ = this.jewelAtts_;
                } else {
                    result.jewelAtts_ = this.jewelAttsBuilder_.build();
                }
                if (this.magicAttsBuilder_ == null) {
                    if ((this.bitField0_ & 0x20) == 32) {
                        this.magicAtts_ = Collections.unmodifiableList(this.magicAtts_);
                        this.bitField0_ &= 0xFFFFFFDF;
                    }
                    result.magicAtts_ = this.magicAtts_;
                } else {
                    result.magicAtts_ = this.magicAttsBuilder_.build();
                }
                if ((from_bitField0_ & 0x40) == 64)
                    to_bitField0_ |= 0x8;
                result.luckyExp_ = this.luckyExp_;
                if ((from_bitField0_ & 0x80) == 128)
                    to_bitField0_ |= 0x10;
                result.baseScore_ = this.baseScore_;
                if (this.baseAttsBuilder_ == null) {
                    if ((this.bitField0_ & 0x100) == 256) {
                        this.baseAtts_ = Collections.unmodifiableList(this.baseAtts_);
                        this.bitField0_ &= 0xFFFFFEFF;
                    }
                    result.baseAtts_ = this.baseAtts_;
                } else {
                    result.baseAtts_ = this.baseAttsBuilder_.build();
                }
                if (this.uniqueAttsBuilder_ == null) {
                    if ((this.bitField0_ & 0x200) == 512) {
                        this.uniqueAtts_ = Collections.unmodifiableList(this.uniqueAtts_);
                        this.bitField0_ &= 0xFFFFFDFF;
                    }
                    result.uniqueAtts_ = this.uniqueAtts_;
                } else {
                    result.uniqueAtts_ = this.uniqueAttsBuilder_.build();
                }
                if (this.tempBaseAttsBuilder_ == null) {
                    if ((this.bitField0_ & 0x400) == 1024) {
                        this.tempBaseAtts_ = Collections.unmodifiableList(this.tempBaseAtts_);
                        this.bitField0_ &= 0xFFFFFBFF;
                    }
                    result.tempBaseAtts_ = this.tempBaseAtts_;
                } else {
                    result.tempBaseAtts_ = this.tempBaseAttsBuilder_.build();
                }
                if (this.tempExtAttsBuilder_ == null) {
                    if ((this.bitField0_ & 0x800) == 2048) {
                        this.tempExtAtts_ = Collections.unmodifiableList(this.tempExtAtts_);
                        this.bitField0_ &= 0xFFFFF7FF;
                    }
                    result.tempExtAtts_ = this.tempExtAtts_;
                } else {
                    result.tempExtAtts_ = this.tempExtAttsBuilder_.build();
                }
                if (this.tempExtAttsSeniorBuilder_ == null) {
                    if ((this.bitField0_ & 0x1000) == 4096) {
                        this.tempExtAttsSenior_ = Collections.unmodifiableList(this.tempExtAttsSenior_);
                        this.bitField0_ &= 0xFFFFEFFF;
                    }
                    result.tempExtAttsSenior_ = this.tempExtAttsSenior_;
                } else {
                    result.tempExtAttsSenior_ = this.tempExtAttsSeniorBuilder_.build();
                }
                if (this.tempUniqueAttsBuilder_ == null) {
                    if ((this.bitField0_ & 0x2000) == 8192) {
                        this.tempUniqueAtts_ = Collections.unmodifiableList(this.tempUniqueAtts_);
                        this.bitField0_ &= 0xFFFFDFFF;
                    }
                    result.tempUniqueAtts_ = this.tempUniqueAtts_;
                } else {
                    result.tempUniqueAtts_ = this.tempUniqueAttsBuilder_.build();
                }
                if ((from_bitField0_ & 0x4000) == 16384)
                    to_bitField0_ |= 0x20;
                result.refineAttrId_ = this.refineAttrId_;
                if ((from_bitField0_ & 0x8000) == 32768)
                    to_bitField0_ |= 0x40;
                if (this.tempRefineAttrBuilder_ == null) {
                    result.tempRefineAttr_ = this.tempRefineAttr_;
                } else {
                    result.tempRefineAttr_ = (Common.AttributeBase) this.tempRefineAttrBuilder_.build();
                }
                if ((from_bitField0_ & 0x10000) == 65536)
                    to_bitField0_ |= 0x80;
                result.remakeScore_ = this.remakeScore_;
                if ((from_bitField0_ & 0x20000) == 131072)
                    to_bitField0_ |= 0x100;
                result.tempRemakeScore_ = this.tempRemakeScore_;
                if (this.starAttrBuilder_ == null) {
                    if ((this.bitField0_ & 0x40000) == 262144) {
                        this.starAttr_ = Collections.unmodifiableList(this.starAttr_);
                        this.bitField0_ &= 0xFFFBFFFF;
                    }
                    result.starAttr_ = this.starAttr_;
                } else {
                    result.starAttr_ = this.starAttrBuilder_.build();
                }
                if (this.tempstarAttrBuilder_ == null) {
                    if ((this.bitField0_ & 0x80000) == 524288) {
                        this.tempstarAttr_ = Collections.unmodifiableList(this.tempstarAttr_);
                        this.bitField0_ &= 0xFFF7FFFF;
                    }
                    result.tempstarAttr_ = this.tempstarAttr_;
                } else {
                    result.tempstarAttr_ = this.tempstarAttrBuilder_.build();
                }
                if ((from_bitField0_ & 0x100000) == 1048576)
                    to_bitField0_ |= 0x200;
                result.seniorTempRemakeScore_ = this.seniorTempRemakeScore_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof ItemOuterClass.EquipmentDetail)
                    return mergeFrom((ItemOuterClass.EquipmentDetail) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(ItemOuterClass.EquipmentDetail other) {
                if (other == ItemOuterClass.EquipmentDetail.getDefaultInstance())
                    return this;
                if (other.hasIsIdentfied())
                    setIsIdentfied(other.getIsIdentfied());
                if (other.hasEnLevel())
                    setEnLevel(other.getEnLevel());
                if (other.hasScore())
                    setScore(other.getScore());
                if (this.randomAttsBuilder_ == null) {
                    if (!other.randomAtts_.isEmpty()) {
                        if (this.randomAtts_.isEmpty()) {
                            this.randomAtts_ = other.randomAtts_;
                            this.bitField0_ &= 0xFFFFFFF7;
                        } else {
                            ensureRandomAttsIsMutable();
                            this.randomAtts_.addAll(other.randomAtts_);
                        }
                        onChanged();
                    }
                } else if (!other.randomAtts_.isEmpty()) {
                    if (this.randomAttsBuilder_.isEmpty()) {
                        this.randomAttsBuilder_.dispose();
                        this.randomAttsBuilder_ = null;
                        this.randomAtts_ = other.randomAtts_;
                        this.bitField0_ &= 0xFFFFFFF7;
                        this.randomAttsBuilder_ = ItemOuterClass.EquipmentDetail.alwaysUseFieldBuilders ? getRandomAttsFieldBuilder() : null;
                    } else {
                        this.randomAttsBuilder_.addAllMessages(other.randomAtts_);
                    }
                }
                if (this.jewelAttsBuilder_ == null) {
                    if (!other.jewelAtts_.isEmpty()) {
                        if (this.jewelAtts_.isEmpty()) {
                            this.jewelAtts_ = other.jewelAtts_;
                            this.bitField0_ &= 0xFFFFFFEF;
                        } else {
                            ensureJewelAttsIsMutable();
                            this.jewelAtts_.addAll(other.jewelAtts_);
                        }
                        onChanged();
                    }
                } else if (!other.jewelAtts_.isEmpty()) {
                    if (this.jewelAttsBuilder_.isEmpty()) {
                        this.jewelAttsBuilder_.dispose();
                        this.jewelAttsBuilder_ = null;
                        this.jewelAtts_ = other.jewelAtts_;
                        this.bitField0_ &= 0xFFFFFFEF;
                        this.jewelAttsBuilder_ = ItemOuterClass.EquipmentDetail.alwaysUseFieldBuilders ? getJewelAttsFieldBuilder() : null;
                    } else {
                        this.jewelAttsBuilder_.addAllMessages(other.jewelAtts_);
                    }
                }
                if (this.magicAttsBuilder_ == null) {
                    if (!other.magicAtts_.isEmpty()) {
                        if (this.magicAtts_.isEmpty()) {
                            this.magicAtts_ = other.magicAtts_;
                            this.bitField0_ &= 0xFFFFFFDF;
                        } else {
                            ensureMagicAttsIsMutable();
                            this.magicAtts_.addAll(other.magicAtts_);
                        }
                        onChanged();
                    }
                } else if (!other.magicAtts_.isEmpty()) {
                    if (this.magicAttsBuilder_.isEmpty()) {
                        this.magicAttsBuilder_.dispose();
                        this.magicAttsBuilder_ = null;
                        this.magicAtts_ = other.magicAtts_;
                        this.bitField0_ &= 0xFFFFFFDF;
                        this.magicAttsBuilder_ = ItemOuterClass.EquipmentDetail.alwaysUseFieldBuilders ? getMagicAttsFieldBuilder() : null;
                    } else {
                        this.magicAttsBuilder_.addAllMessages(other.magicAtts_);
                    }
                }
                if (other.hasLuckyExp())
                    setLuckyExp(other.getLuckyExp());
                if (other.hasBaseScore())
                    setBaseScore(other.getBaseScore());
                if (this.baseAttsBuilder_ == null) {
                    if (!other.baseAtts_.isEmpty()) {
                        if (this.baseAtts_.isEmpty()) {
                            this.baseAtts_ = other.baseAtts_;
                            this.bitField0_ &= 0xFFFFFEFF;
                        } else {
                            ensureBaseAttsIsMutable();
                            this.baseAtts_.addAll(other.baseAtts_);
                        }
                        onChanged();
                    }
                } else if (!other.baseAtts_.isEmpty()) {
                    if (this.baseAttsBuilder_.isEmpty()) {
                        this.baseAttsBuilder_.dispose();
                        this.baseAttsBuilder_ = null;
                        this.baseAtts_ = other.baseAtts_;
                        this.bitField0_ &= 0xFFFFFEFF;
                        this.baseAttsBuilder_ = ItemOuterClass.EquipmentDetail.alwaysUseFieldBuilders ? getBaseAttsFieldBuilder() : null;
                    } else {
                        this.baseAttsBuilder_.addAllMessages(other.baseAtts_);
                    }
                }
                if (this.uniqueAttsBuilder_ == null) {
                    if (!other.uniqueAtts_.isEmpty()) {
                        if (this.uniqueAtts_.isEmpty()) {
                            this.uniqueAtts_ = other.uniqueAtts_;
                            this.bitField0_ &= 0xFFFFFDFF;
                        } else {
                            ensureUniqueAttsIsMutable();
                            this.uniqueAtts_.addAll(other.uniqueAtts_);
                        }
                        onChanged();
                    }
                } else if (!other.uniqueAtts_.isEmpty()) {
                    if (this.uniqueAttsBuilder_.isEmpty()) {
                        this.uniqueAttsBuilder_.dispose();
                        this.uniqueAttsBuilder_ = null;
                        this.uniqueAtts_ = other.uniqueAtts_;
                        this.bitField0_ &= 0xFFFFFDFF;
                        this.uniqueAttsBuilder_ = ItemOuterClass.EquipmentDetail.alwaysUseFieldBuilders ? getUniqueAttsFieldBuilder() : null;
                    } else {
                        this.uniqueAttsBuilder_.addAllMessages(other.uniqueAtts_);
                    }
                }
                if (this.tempBaseAttsBuilder_ == null) {
                    if (!other.tempBaseAtts_.isEmpty()) {
                        if (this.tempBaseAtts_.isEmpty()) {
                            this.tempBaseAtts_ = other.tempBaseAtts_;
                            this.bitField0_ &= 0xFFFFFBFF;
                        } else {
                            ensureTempBaseAttsIsMutable();
                            this.tempBaseAtts_.addAll(other.tempBaseAtts_);
                        }
                        onChanged();
                    }
                } else if (!other.tempBaseAtts_.isEmpty()) {
                    if (this.tempBaseAttsBuilder_.isEmpty()) {
                        this.tempBaseAttsBuilder_.dispose();
                        this.tempBaseAttsBuilder_ = null;
                        this.tempBaseAtts_ = other.tempBaseAtts_;
                        this.bitField0_ &= 0xFFFFFBFF;
                        this.tempBaseAttsBuilder_ = ItemOuterClass.EquipmentDetail.alwaysUseFieldBuilders ? getTempBaseAttsFieldBuilder() : null;
                    } else {
                        this.tempBaseAttsBuilder_.addAllMessages(other.tempBaseAtts_);
                    }
                }
                if (this.tempExtAttsBuilder_ == null) {
                    if (!other.tempExtAtts_.isEmpty()) {
                        if (this.tempExtAtts_.isEmpty()) {
                            this.tempExtAtts_ = other.tempExtAtts_;
                            this.bitField0_ &= 0xFFFFF7FF;
                        } else {
                            ensureTempExtAttsIsMutable();
                            this.tempExtAtts_.addAll(other.tempExtAtts_);
                        }
                        onChanged();
                    }
                } else if (!other.tempExtAtts_.isEmpty()) {
                    if (this.tempExtAttsBuilder_.isEmpty()) {
                        this.tempExtAttsBuilder_.dispose();
                        this.tempExtAttsBuilder_ = null;
                        this.tempExtAtts_ = other.tempExtAtts_;
                        this.bitField0_ &= 0xFFFFF7FF;
                        this.tempExtAttsBuilder_ = ItemOuterClass.EquipmentDetail.alwaysUseFieldBuilders ? getTempExtAttsFieldBuilder() : null;
                    } else {
                        this.tempExtAttsBuilder_.addAllMessages(other.tempExtAtts_);
                    }
                }
                if (this.tempExtAttsSeniorBuilder_ == null) {
                    if (!other.tempExtAttsSenior_.isEmpty()) {
                        if (this.tempExtAttsSenior_.isEmpty()) {
                            this.tempExtAttsSenior_ = other.tempExtAttsSenior_;
                            this.bitField0_ &= 0xFFFFEFFF;
                        } else {
                            ensureTempExtAttsSeniorIsMutable();
                            this.tempExtAttsSenior_.addAll(other.tempExtAttsSenior_);
                        }
                        onChanged();
                    }
                } else if (!other.tempExtAttsSenior_.isEmpty()) {
                    if (this.tempExtAttsSeniorBuilder_.isEmpty()) {
                        this.tempExtAttsSeniorBuilder_.dispose();
                        this.tempExtAttsSeniorBuilder_ = null;
                        this.tempExtAttsSenior_ = other.tempExtAttsSenior_;
                        this.bitField0_ &= 0xFFFFEFFF;
                        this.tempExtAttsSeniorBuilder_ = ItemOuterClass.EquipmentDetail.alwaysUseFieldBuilders ? getTempExtAttsSeniorFieldBuilder() : null;
                    } else {
                        this.tempExtAttsSeniorBuilder_.addAllMessages(other.tempExtAttsSenior_);
                    }
                }
                if (this.tempUniqueAttsBuilder_ == null) {
                    if (!other.tempUniqueAtts_.isEmpty()) {
                        if (this.tempUniqueAtts_.isEmpty()) {
                            this.tempUniqueAtts_ = other.tempUniqueAtts_;
                            this.bitField0_ &= 0xFFFFDFFF;
                        } else {
                            ensureTempUniqueAttsIsMutable();
                            this.tempUniqueAtts_.addAll(other.tempUniqueAtts_);
                        }
                        onChanged();
                    }
                } else if (!other.tempUniqueAtts_.isEmpty()) {
                    if (this.tempUniqueAttsBuilder_.isEmpty()) {
                        this.tempUniqueAttsBuilder_.dispose();
                        this.tempUniqueAttsBuilder_ = null;
                        this.tempUniqueAtts_ = other.tempUniqueAtts_;
                        this.bitField0_ &= 0xFFFFDFFF;
                        this.tempUniqueAttsBuilder_ = ItemOuterClass.EquipmentDetail.alwaysUseFieldBuilders ? getTempUniqueAttsFieldBuilder() : null;
                    } else {
                        this.tempUniqueAttsBuilder_.addAllMessages(other.tempUniqueAtts_);
                    }
                }
                if (other.hasRefineAttrId())
                    setRefineAttrId(other.getRefineAttrId());
                if (other.hasTempRefineAttr())
                    mergeTempRefineAttr(other.getTempRefineAttr());
                if (other.hasRemakeScore())
                    setRemakeScore(other.getRemakeScore());
                if (other.hasTempRemakeScore())
                    setTempRemakeScore(other.getTempRemakeScore());
                if (this.starAttrBuilder_ == null) {
                    if (!other.starAttr_.isEmpty()) {
                        if (this.starAttr_.isEmpty()) {
                            this.starAttr_ = other.starAttr_;
                            this.bitField0_ &= 0xFFFBFFFF;
                        } else {
                            ensureStarAttrIsMutable();
                            this.starAttr_.addAll(other.starAttr_);
                        }
                        onChanged();
                    }
                } else if (!other.starAttr_.isEmpty()) {
                    if (this.starAttrBuilder_.isEmpty()) {
                        this.starAttrBuilder_.dispose();
                        this.starAttrBuilder_ = null;
                        this.starAttr_ = other.starAttr_;
                        this.bitField0_ &= 0xFFFBFFFF;
                        this.starAttrBuilder_ = ItemOuterClass.EquipmentDetail.alwaysUseFieldBuilders ? getStarAttrFieldBuilder() : null;
                    } else {
                        this.starAttrBuilder_.addAllMessages(other.starAttr_);
                    }
                }
                if (this.tempstarAttrBuilder_ == null) {
                    if (!other.tempstarAttr_.isEmpty()) {
                        if (this.tempstarAttr_.isEmpty()) {
                            this.tempstarAttr_ = other.tempstarAttr_;
                            this.bitField0_ &= 0xFFF7FFFF;
                        } else {
                            ensureTempstarAttrIsMutable();
                            this.tempstarAttr_.addAll(other.tempstarAttr_);
                        }
                        onChanged();
                    }
                } else if (!other.tempstarAttr_.isEmpty()) {
                    if (this.tempstarAttrBuilder_.isEmpty()) {
                        this.tempstarAttrBuilder_.dispose();
                        this.tempstarAttrBuilder_ = null;
                        this.tempstarAttr_ = other.tempstarAttr_;
                        this.bitField0_ &= 0xFFF7FFFF;
                        this.tempstarAttrBuilder_ = ItemOuterClass.EquipmentDetail.alwaysUseFieldBuilders ? getTempstarAttrFieldBuilder() : null;
                    } else {
                        this.tempstarAttrBuilder_.addAllMessages(other.tempstarAttr_);
                    }
                }
                if (other.hasSeniorTempRemakeScore())
                    setSeniorTempRemakeScore(other.getSeniorTempRemakeScore());
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                int i;
                for (i = 0; i < getRandomAttsCount(); i++) {
                    if (!getRandomAtts(i).isInitialized())
                        return false;
                }
                for (i = 0; i < getJewelAttsCount(); i++) {
                    if (!getJewelAtts(i).isInitialized())
                        return false;
                }
                for (i = 0; i < getMagicAttsCount(); i++) {
                    if (!getMagicAtts(i).isInitialized())
                        return false;
                }
                for (i = 0; i < getBaseAttsCount(); i++) {
                    if (!getBaseAtts(i).isInitialized())
                        return false;
                }
                for (i = 0; i < getUniqueAttsCount(); i++) {
                    if (!getUniqueAtts(i).isInitialized())
                        return false;
                }
                for (i = 0; i < getTempBaseAttsCount(); i++) {
                    if (!getTempBaseAtts(i).isInitialized())
                        return false;
                }
                for (i = 0; i < getTempExtAttsCount(); i++) {
                    if (!getTempExtAtts(i).isInitialized())
                        return false;
                }
                for (i = 0; i < getTempExtAttsSeniorCount(); i++) {
                    if (!getTempExtAttsSenior(i).isInitialized())
                        return false;
                }
                for (i = 0; i < getTempUniqueAttsCount(); i++) {
                    if (!getTempUniqueAtts(i).isInitialized())
                        return false;
                }
                if (hasTempRefineAttr() && !getTempRefineAttr().isInitialized())
                    return false;
                for (i = 0; i < getStarAttrCount(); i++) {
                    if (!getStarAttr(i).isInitialized())
                        return false;
                }
                for (i = 0; i < getTempstarAttrCount(); i++) {
                    if (!getTempstarAttr(i).isInitialized())
                        return false;
                }
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                ItemOuterClass.EquipmentDetail parsedMessage = null;
                try {
                    parsedMessage = (ItemOuterClass.EquipmentDetail) ItemOuterClass.EquipmentDetail.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ItemOuterClass.EquipmentDetail) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null)
                        mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasIsIdentfied() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public int getIsIdentfied() {
                return this.isIdentfied_;
            }

            public Builder setIsIdentfied(int value) {
                this.bitField0_ |= 0x1;
                this.isIdentfied_ = value;
                onChanged();
                return this;
            }

            public Builder clearIsIdentfied() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.isIdentfied_ = 0;
                onChanged();
                return this;
            }

            public boolean hasEnLevel() {
                return ((this.bitField0_ & 0x2) == 2);
            }

            public int getEnLevel() {
                return this.enLevel_;
            }

            public Builder setEnLevel(int value) {
                this.bitField0_ |= 0x2;
                this.enLevel_ = value;
                onChanged();
                return this;
            }

            public Builder clearEnLevel() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.enLevel_ = 0;
                onChanged();
                return this;
            }

            public boolean hasScore() {
                return ((this.bitField0_ & 0x4) == 4);
            }

            public int getScore() {
                return this.score_;
            }

            public Builder setScore(int value) {
                this.bitField0_ |= 0x4;
                this.score_ = value;
                onChanged();
                return this;
            }

            public Builder clearScore() {
                this.bitField0_ &= 0xFFFFFFFB;
                this.score_ = 0;
                onChanged();
                return this;
            }

            private void ensureRandomAttsIsMutable() {
                if ((this.bitField0_ & 0x8) != 8) {
                    this.randomAtts_ = new ArrayList<>(this.randomAtts_);
                    this.bitField0_ |= 0x8;
                }
            }

            public List<Common.AttributeBase> getRandomAttsList() {
                if (this.randomAttsBuilder_ == null)
                    return Collections.unmodifiableList(this.randomAtts_);
                return this.randomAttsBuilder_.getMessageList();
            }

            public int getRandomAttsCount() {
                if (this.randomAttsBuilder_ == null)
                    return this.randomAtts_.size();
                return this.randomAttsBuilder_.getCount();
            }

            public Common.AttributeBase getRandomAtts(int index) {
                if (this.randomAttsBuilder_ == null)
                    return this.randomAtts_.get(index);
                return (Common.AttributeBase) this.randomAttsBuilder_.getMessage(index);
            }

            public Builder setRandomAtts(int index, Common.AttributeBase value) {
                if (this.randomAttsBuilder_ == null) {
                    if (value == null)
                        throw new NullPointerException();
                    ensureRandomAttsIsMutable();
                    this.randomAtts_.set(index, value);
                    onChanged();
                } else {
                    this.randomAttsBuilder_.setMessage(index, (GeneratedMessage) value);
                }
                return this;
            }

            public Builder setRandomAtts(int index, Common.AttributeBase.Builder builderForValue) {
                if (this.randomAttsBuilder_ == null) {
                    ensureRandomAttsIsMutable();
                    this.randomAtts_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    this.randomAttsBuilder_.setMessage(index, (GeneratedMessage) builderForValue.build());
                }
                return this;
            }

            public Builder addRandomAtts(Common.AttributeBase value) {
                if (this.randomAttsBuilder_ == null) {
                    if (value == null)
                        throw new NullPointerException();
                    ensureRandomAttsIsMutable();
                    this.randomAtts_.add(value);
                    onChanged();
                } else {
                    this.randomAttsBuilder_.addMessage((GeneratedMessage) value);
                }
                return this;
            }

            public Builder addRandomAtts(int index, Common.AttributeBase value) {
                if (this.randomAttsBuilder_ == null) {
                    if (value == null)
                        throw new NullPointerException();
                    ensureRandomAttsIsMutable();
                    this.randomAtts_.add(index, value);
                    onChanged();
                } else {
                    this.randomAttsBuilder_.addMessage(index, (GeneratedMessage) value);
                }
                return this;
            }

            public Builder addRandomAtts(Common.AttributeBase.Builder builderForValue) {
                if (this.randomAttsBuilder_ == null) {
                    ensureRandomAttsIsMutable();
                    this.randomAtts_.add(builderForValue.build());
                    onChanged();
                } else {
                    this.randomAttsBuilder_.addMessage((GeneratedMessage) builderForValue.build());
                }
                return this;
            }

            public Builder addRandomAtts(int index, Common.AttributeBase.Builder builderForValue) {
                if (this.randomAttsBuilder_ == null) {
                    ensureRandomAttsIsMutable();
                    this.randomAtts_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    this.randomAttsBuilder_.addMessage(index, (GeneratedMessage) builderForValue.build());
                }
                return this;
            }

            public Builder addAllRandomAtts(Iterable<? extends Common.AttributeBase> values) {
                if (this.randomAttsBuilder_ == null) {
                    ensureRandomAttsIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.randomAtts_);
                    onChanged();
                } else {
                    this.randomAttsBuilder_.addAllMessages(values);
                }
                return this;
            }

            public Builder clearRandomAtts() {
                if (this.randomAttsBuilder_ == null) {
                    this.randomAtts_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFF7;
                    onChanged();
                } else {
                    this.randomAttsBuilder_.clear();
                }
                return this;
            }

            public Builder removeRandomAtts(int index) {
                if (this.randomAttsBuilder_ == null) {
                    ensureRandomAttsIsMutable();
                    this.randomAtts_.remove(index);
                    onChanged();
                } else {
                    this.randomAttsBuilder_.remove(index);
                }
                return this;
            }

            public Common.AttributeBase.Builder getRandomAttsBuilder(int index) {
                return (Common.AttributeBase.Builder) getRandomAttsFieldBuilder().getBuilder(index);
            }

            public Common.AttributeBaseOrBuilder getRandomAttsOrBuilder(int index) {
                if (this.randomAttsBuilder_ == null)
                    return (Common.AttributeBaseOrBuilder) this.randomAtts_.get(index);
                return (Common.AttributeBaseOrBuilder) this.randomAttsBuilder_.getMessageOrBuilder(index);
            }

            public List<? extends Common.AttributeBaseOrBuilder> getRandomAttsOrBuilderList() {
                if (this.randomAttsBuilder_ != null)
                    return this.randomAttsBuilder_.getMessageOrBuilderList();
                return (List) Collections.unmodifiableList(this.randomAtts_);
            }

            public Common.AttributeBase.Builder addRandomAttsBuilder() {
                return (Common.AttributeBase.Builder) getRandomAttsFieldBuilder().addBuilder((GeneratedMessage) Common.AttributeBase.getDefaultInstance());
            }

            public Common.AttributeBase.Builder addRandomAttsBuilder(int index) {
                return (Common.AttributeBase.Builder) getRandomAttsFieldBuilder().addBuilder(index, (GeneratedMessage) Common.AttributeBase.getDefaultInstance());
            }

            public List<Common.AttributeBase.Builder> getRandomAttsBuilderList() {
                return getRandomAttsFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilder<Common.AttributeBase, Common.AttributeBase.Builder, Common.AttributeBaseOrBuilder> getRandomAttsFieldBuilder() {
                if (this.randomAttsBuilder_ == null) {
                    this.randomAttsBuilder_ = new RepeatedFieldBuilder(this.randomAtts_, ((this.bitField0_ & 0x8) == 8), getParentForChildren(), isClean());
                    this.randomAtts_ = null;
                }
                return this.randomAttsBuilder_;
            }

            private void ensureJewelAttsIsMutable() {
                if ((this.bitField0_ & 0x10) != 16) {
                    this.jewelAtts_ = new ArrayList<>(this.jewelAtts_);
                    this.bitField0_ |= 0x10;
                }
            }

            public List<ItemOuterClass.EquipmentJewelAtt> getJewelAttsList() {
                if (this.jewelAttsBuilder_ == null)
                    return Collections.unmodifiableList(this.jewelAtts_);
                return this.jewelAttsBuilder_.getMessageList();
            }

            public int getJewelAttsCount() {
                if (this.jewelAttsBuilder_ == null)
                    return this.jewelAtts_.size();
                return this.jewelAttsBuilder_.getCount();
            }

            public ItemOuterClass.EquipmentJewelAtt getJewelAtts(int index) {
                if (this.jewelAttsBuilder_ == null)
                    return this.jewelAtts_.get(index);
                return (ItemOuterClass.EquipmentJewelAtt) this.jewelAttsBuilder_.getMessage(index);
            }

            public Builder setJewelAtts(int index, ItemOuterClass.EquipmentJewelAtt value) {
                if (this.jewelAttsBuilder_ == null) {
                    if (value == null)
                        throw new NullPointerException();
                    ensureJewelAttsIsMutable();
                    this.jewelAtts_.set(index, value);
                    onChanged();
                } else {
                    this.jewelAttsBuilder_.setMessage(index, value);
                }
                return this;
            }

            public Builder setJewelAtts(int index, ItemOuterClass.EquipmentJewelAtt.Builder builderForValue) {
                if (this.jewelAttsBuilder_ == null) {
                    ensureJewelAttsIsMutable();
                    this.jewelAtts_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    this.jewelAttsBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }

            public Builder addJewelAtts(ItemOuterClass.EquipmentJewelAtt value) {
                if (this.jewelAttsBuilder_ == null) {
                    if (value == null)
                        throw new NullPointerException();
                    ensureJewelAttsIsMutable();
                    this.jewelAtts_.add(value);
                    onChanged();
                } else {
                    this.jewelAttsBuilder_.addMessage(value);
                }
                return this;
            }

            public Builder addJewelAtts(int index, ItemOuterClass.EquipmentJewelAtt value) {
                if (this.jewelAttsBuilder_ == null) {
                    if (value == null)
                        throw new NullPointerException();
                    ensureJewelAttsIsMutable();
                    this.jewelAtts_.add(index, value);
                    onChanged();
                } else {
                    this.jewelAttsBuilder_.addMessage(index, value);
                }
                return this;
            }

            public Builder addJewelAtts(ItemOuterClass.EquipmentJewelAtt.Builder builderForValue) {
                if (this.jewelAttsBuilder_ == null) {
                    ensureJewelAttsIsMutable();
                    this.jewelAtts_.add(builderForValue.build());
                    onChanged();
                } else {
                    this.jewelAttsBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }

            public Builder addJewelAtts(int index, ItemOuterClass.EquipmentJewelAtt.Builder builderForValue) {
                if (this.jewelAttsBuilder_ == null) {
                    ensureJewelAttsIsMutable();
                    this.jewelAtts_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    this.jewelAttsBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }

            public Builder addAllJewelAtts(Iterable<? extends ItemOuterClass.EquipmentJewelAtt> values) {
                if (this.jewelAttsBuilder_ == null) {
                    ensureJewelAttsIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.jewelAtts_);
                    onChanged();
                } else {
                    this.jewelAttsBuilder_.addAllMessages(values);
                }
                return this;
            }

            public Builder clearJewelAtts() {
                if (this.jewelAttsBuilder_ == null) {
                    this.jewelAtts_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFEF;
                    onChanged();
                } else {
                    this.jewelAttsBuilder_.clear();
                }
                return this;
            }

            public Builder removeJewelAtts(int index) {
                if (this.jewelAttsBuilder_ == null) {
                    ensureJewelAttsIsMutable();
                    this.jewelAtts_.remove(index);
                    onChanged();
                } else {
                    this.jewelAttsBuilder_.remove(index);
                }
                return this;
            }

            public ItemOuterClass.EquipmentJewelAtt.Builder getJewelAttsBuilder(int index) {
                return (ItemOuterClass.EquipmentJewelAtt.Builder) getJewelAttsFieldBuilder().getBuilder(index);
            }

            public ItemOuterClass.EquipmentJewelAttOrBuilder getJewelAttsOrBuilder(int index) {
                if (this.jewelAttsBuilder_ == null)
                    return this.jewelAtts_.get(index);
                return (ItemOuterClass.EquipmentJewelAttOrBuilder) this.jewelAttsBuilder_.getMessageOrBuilder(index);
            }

            public List<? extends ItemOuterClass.EquipmentJewelAttOrBuilder> getJewelAttsOrBuilderList() {
                if (this.jewelAttsBuilder_ != null)
                    return this.jewelAttsBuilder_.getMessageOrBuilderList();
                return Collections.unmodifiableList((List) this.jewelAtts_);
            }

            public ItemOuterClass.EquipmentJewelAtt.Builder addJewelAttsBuilder() {
                return (ItemOuterClass.EquipmentJewelAtt.Builder) getJewelAttsFieldBuilder().addBuilder(ItemOuterClass.EquipmentJewelAtt.getDefaultInstance());
            }

            public ItemOuterClass.EquipmentJewelAtt.Builder addJewelAttsBuilder(int index) {
                return (ItemOuterClass.EquipmentJewelAtt.Builder) getJewelAttsFieldBuilder().addBuilder(index, ItemOuterClass.EquipmentJewelAtt.getDefaultInstance());
            }

            public List<ItemOuterClass.EquipmentJewelAtt.Builder> getJewelAttsBuilderList() {
                return getJewelAttsFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilder<ItemOuterClass.EquipmentJewelAtt, ItemOuterClass.EquipmentJewelAtt.Builder, ItemOuterClass.EquipmentJewelAttOrBuilder> getJewelAttsFieldBuilder() {
                if (this.jewelAttsBuilder_ == null) {
                    this.jewelAttsBuilder_ = new RepeatedFieldBuilder(this.jewelAtts_, ((this.bitField0_ & 0x10) == 16), getParentForChildren(), isClean());
                    this.jewelAtts_ = null;
                }
                return this.jewelAttsBuilder_;
            }

            private void ensureMagicAttsIsMutable() {
                if ((this.bitField0_ & 0x20) != 32) {
                    this.magicAtts_ = new ArrayList<>(this.magicAtts_);
                    this.bitField0_ |= 0x20;
                }
            }

            public List<Common.AttributeBase> getMagicAttsList() {
                if (this.magicAttsBuilder_ == null)
                    return Collections.unmodifiableList(this.magicAtts_);
                return this.magicAttsBuilder_.getMessageList();
            }

            public int getMagicAttsCount() {
                if (this.magicAttsBuilder_ == null)
                    return this.magicAtts_.size();
                return this.magicAttsBuilder_.getCount();
            }

            public Common.AttributeBase getMagicAtts(int index) {
                if (this.magicAttsBuilder_ == null)
                    return this.magicAtts_.get(index);
                return (Common.AttributeBase) this.magicAttsBuilder_.getMessage(index);
            }

            public Builder setMagicAtts(int index, Common.AttributeBase value) {
                if (this.magicAttsBuilder_ == null) {
                    if (value == null)
                        throw new NullPointerException();
                    ensureMagicAttsIsMutable();
                    this.magicAtts_.set(index, value);
                    onChanged();
                } else {
                    this.magicAttsBuilder_.setMessage(index, (GeneratedMessage) value);
                }
                return this;
            }

            public Builder setMagicAtts(int index, Common.AttributeBase.Builder builderForValue) {
                if (this.magicAttsBuilder_ == null) {
                    ensureMagicAttsIsMutable();
                    this.magicAtts_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    this.magicAttsBuilder_.setMessage(index, (GeneratedMessage) builderForValue.build());
                }
                return this;
            }

            public Builder addMagicAtts(Common.AttributeBase value) {
                if (this.magicAttsBuilder_ == null) {
                    if (value == null)
                        throw new NullPointerException();
                    ensureMagicAttsIsMutable();
                    this.magicAtts_.add(value);
                    onChanged();
                } else {
                    this.magicAttsBuilder_.addMessage((GeneratedMessage) value);
                }
                return this;
            }

            public Builder addMagicAtts(int index, Common.AttributeBase value) {
                if (this.magicAttsBuilder_ == null) {
                    if (value == null)
                        throw new NullPointerException();
                    ensureMagicAttsIsMutable();
                    this.magicAtts_.add(index, value);
                    onChanged();
                } else {
                    this.magicAttsBuilder_.addMessage(index, (GeneratedMessage) value);
                }
                return this;
            }

            public Builder addMagicAtts(Common.AttributeBase.Builder builderForValue) {
                if (this.magicAttsBuilder_ == null) {
                    ensureMagicAttsIsMutable();
                    this.magicAtts_.add(builderForValue.build());
                    onChanged();
                } else {
                    this.magicAttsBuilder_.addMessage((GeneratedMessage) builderForValue.build());
                }
                return this;
            }

            public Builder addMagicAtts(int index, Common.AttributeBase.Builder builderForValue) {
                if (this.magicAttsBuilder_ == null) {
                    ensureMagicAttsIsMutable();
                    this.magicAtts_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    this.magicAttsBuilder_.addMessage(index, (GeneratedMessage) builderForValue.build());
                }
                return this;
            }

            public Builder addAllMagicAtts(Iterable<? extends Common.AttributeBase> values) {
                if (this.magicAttsBuilder_ == null) {
                    ensureMagicAttsIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.magicAtts_);
                    onChanged();
                } else {
                    this.magicAttsBuilder_.addAllMessages(values);
                }
                return this;
            }

            public Builder clearMagicAtts() {
                if (this.magicAttsBuilder_ == null) {
                    this.magicAtts_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFDF;
                    onChanged();
                } else {
                    this.magicAttsBuilder_.clear();
                }
                return this;
            }

            public Builder removeMagicAtts(int index) {
                if (this.magicAttsBuilder_ == null) {
                    ensureMagicAttsIsMutable();
                    this.magicAtts_.remove(index);
                    onChanged();
                } else {
                    this.magicAttsBuilder_.remove(index);
                }
                return this;
            }

            public Common.AttributeBase.Builder getMagicAttsBuilder(int index) {
                return (Common.AttributeBase.Builder) getMagicAttsFieldBuilder().getBuilder(index);
            }

            public Common.AttributeBaseOrBuilder getMagicAttsOrBuilder(int index) {
                if (this.magicAttsBuilder_ == null)
                    return (Common.AttributeBaseOrBuilder) this.magicAtts_.get(index);
                return (Common.AttributeBaseOrBuilder) this.magicAttsBuilder_.getMessageOrBuilder(index);
            }

            public List<? extends Common.AttributeBaseOrBuilder> getMagicAttsOrBuilderList() {
                if (this.magicAttsBuilder_ != null)
                    return this.magicAttsBuilder_.getMessageOrBuilderList();
                return (List) Collections.unmodifiableList(this.magicAtts_);
            }

            public Common.AttributeBase.Builder addMagicAttsBuilder() {
                return (Common.AttributeBase.Builder) getMagicAttsFieldBuilder().addBuilder((GeneratedMessage) Common.AttributeBase.getDefaultInstance());
            }

            public Common.AttributeBase.Builder addMagicAttsBuilder(int index) {
                return (Common.AttributeBase.Builder) getMagicAttsFieldBuilder().addBuilder(index, (GeneratedMessage) Common.AttributeBase.getDefaultInstance());
            }

            public List<Common.AttributeBase.Builder> getMagicAttsBuilderList() {
                return getMagicAttsFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilder<Common.AttributeBase, Common.AttributeBase.Builder, Common.AttributeBaseOrBuilder> getMagicAttsFieldBuilder() {
                if (this.magicAttsBuilder_ == null) {
                    this.magicAttsBuilder_ = new RepeatedFieldBuilder(this.magicAtts_, ((this.bitField0_ & 0x20) == 32), getParentForChildren(), isClean());
                    this.magicAtts_ = null;
                }
                return this.magicAttsBuilder_;
            }

            public boolean hasLuckyExp() {
                return ((this.bitField0_ & 0x40) == 64);
            }

            public int getLuckyExp() {
                return this.luckyExp_;
            }

            public Builder setLuckyExp(int value) {
                this.bitField0_ |= 0x40;
                this.luckyExp_ = value;
                onChanged();
                return this;
            }

            public Builder clearLuckyExp() {
                this.bitField0_ &= 0xFFFFFFBF;
                this.luckyExp_ = 0;
                onChanged();
                return this;
            }

            public boolean hasBaseScore() {
                return ((this.bitField0_ & 0x80) == 128);
            }

            public int getBaseScore() {
                return this.baseScore_;
            }

            public Builder setBaseScore(int value) {
                this.bitField0_ |= 0x80;
                this.baseScore_ = value;
                onChanged();
                return this;
            }

            public Builder clearBaseScore() {
                this.bitField0_ &= 0xFFFFFF7F;
                this.baseScore_ = 0;
                onChanged();
                return this;
            }

            private void ensureBaseAttsIsMutable() {
                if ((this.bitField0_ & 0x100) != 256) {
                    this.baseAtts_ = new ArrayList<>(this.baseAtts_);
                    this.bitField0_ |= 0x100;
                }
            }

            public List<Common.AttributeBase> getBaseAttsList() {
                if (this.baseAttsBuilder_ == null)
                    return Collections.unmodifiableList(this.baseAtts_);
                return this.baseAttsBuilder_.getMessageList();
            }

            public int getBaseAttsCount() {
                if (this.baseAttsBuilder_ == null)
                    return this.baseAtts_.size();
                return this.baseAttsBuilder_.getCount();
            }

            public Common.AttributeBase getBaseAtts(int index) {
                if (this.baseAttsBuilder_ == null)
                    return this.baseAtts_.get(index);
                return (Common.AttributeBase) this.baseAttsBuilder_.getMessage(index);
            }

            public Builder setBaseAtts(int index, Common.AttributeBase value) {
                if (this.baseAttsBuilder_ == null) {
                    if (value == null)
                        throw new NullPointerException();
                    ensureBaseAttsIsMutable();
                    this.baseAtts_.set(index, value);
                    onChanged();
                } else {
                    this.baseAttsBuilder_.setMessage(index, (GeneratedMessage) value);
                }
                return this;
            }

            public Builder setBaseAtts(int index, Common.AttributeBase.Builder builderForValue) {
                if (this.baseAttsBuilder_ == null) {
                    ensureBaseAttsIsMutable();
                    this.baseAtts_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    this.baseAttsBuilder_.setMessage(index, (GeneratedMessage) builderForValue.build());
                }
                return this;
            }

            public Builder addBaseAtts(Common.AttributeBase value) {
                if (this.baseAttsBuilder_ == null) {
                    if (value == null)
                        throw new NullPointerException();
                    ensureBaseAttsIsMutable();
                    this.baseAtts_.add(value);
                    onChanged();
                } else {
                    this.baseAttsBuilder_.addMessage((GeneratedMessage) value);
                }
                return this;
            }

            public Builder addBaseAtts(int index, Common.AttributeBase value) {
                if (this.baseAttsBuilder_ == null) {
                    if (value == null)
                        throw new NullPointerException();
                    ensureBaseAttsIsMutable();
                    this.baseAtts_.add(index, value);
                    onChanged();
                } else {
                    this.baseAttsBuilder_.addMessage(index, (GeneratedMessage) value);
                }
                return this;
            }

            public Builder addBaseAtts(Common.AttributeBase.Builder builderForValue) {
                if (this.baseAttsBuilder_ == null) {
                    ensureBaseAttsIsMutable();
                    this.baseAtts_.add(builderForValue.build());
                    onChanged();
                } else {
                    this.baseAttsBuilder_.addMessage((GeneratedMessage) builderForValue.build());
                }
                return this;
            }

            public Builder addBaseAtts(int index, Common.AttributeBase.Builder builderForValue) {
                if (this.baseAttsBuilder_ == null) {
                    ensureBaseAttsIsMutable();
                    this.baseAtts_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    this.baseAttsBuilder_.addMessage(index, (GeneratedMessage) builderForValue.build());
                }
                return this;
            }

            public Builder addAllBaseAtts(Iterable<? extends Common.AttributeBase> values) {
                if (this.baseAttsBuilder_ == null) {
                    ensureBaseAttsIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.baseAtts_);
                    onChanged();
                } else {
                    this.baseAttsBuilder_.addAllMessages(values);
                }
                return this;
            }

            public Builder clearBaseAtts() {
                if (this.baseAttsBuilder_ == null) {
                    this.baseAtts_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFEFF;
                    onChanged();
                } else {
                    this.baseAttsBuilder_.clear();
                }
                return this;
            }

            public Builder removeBaseAtts(int index) {
                if (this.baseAttsBuilder_ == null) {
                    ensureBaseAttsIsMutable();
                    this.baseAtts_.remove(index);
                    onChanged();
                } else {
                    this.baseAttsBuilder_.remove(index);
                }
                return this;
            }

            public Common.AttributeBase.Builder getBaseAttsBuilder(int index) {
                return (Common.AttributeBase.Builder) getBaseAttsFieldBuilder().getBuilder(index);
            }

            public Common.AttributeBaseOrBuilder getBaseAttsOrBuilder(int index) {
                if (this.baseAttsBuilder_ == null)
                    return (Common.AttributeBaseOrBuilder) this.baseAtts_.get(index);
                return (Common.AttributeBaseOrBuilder) this.baseAttsBuilder_.getMessageOrBuilder(index);
            }

            public List<? extends Common.AttributeBaseOrBuilder> getBaseAttsOrBuilderList() {
                if (this.baseAttsBuilder_ != null)
                    return this.baseAttsBuilder_.getMessageOrBuilderList();
                return (List) Collections.unmodifiableList(this.baseAtts_);
            }

            public Common.AttributeBase.Builder addBaseAttsBuilder() {
                return (Common.AttributeBase.Builder) getBaseAttsFieldBuilder().addBuilder((GeneratedMessage) Common.AttributeBase.getDefaultInstance());
            }

            public Common.AttributeBase.Builder addBaseAttsBuilder(int index) {
                return (Common.AttributeBase.Builder) getBaseAttsFieldBuilder().addBuilder(index, (GeneratedMessage) Common.AttributeBase.getDefaultInstance());
            }

            public List<Common.AttributeBase.Builder> getBaseAttsBuilderList() {
                return getBaseAttsFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilder<Common.AttributeBase, Common.AttributeBase.Builder, Common.AttributeBaseOrBuilder> getBaseAttsFieldBuilder() {
                if (this.baseAttsBuilder_ == null) {
                    this.baseAttsBuilder_ = new RepeatedFieldBuilder(this.baseAtts_, ((this.bitField0_ & 0x100) == 256), getParentForChildren(), isClean());
                    this.baseAtts_ = null;
                }
                return this.baseAttsBuilder_;
            }

            private void ensureUniqueAttsIsMutable() {
                if ((this.bitField0_ & 0x200) != 512) {
                    this.uniqueAtts_ = new ArrayList<>(this.uniqueAtts_);
                    this.bitField0_ |= 0x200;
                }
            }

            public List<Common.AttributeBase> getUniqueAttsList() {
                if (this.uniqueAttsBuilder_ == null)
                    return Collections.unmodifiableList(this.uniqueAtts_);
                return this.uniqueAttsBuilder_.getMessageList();
            }

            public int getUniqueAttsCount() {
                if (this.uniqueAttsBuilder_ == null)
                    return this.uniqueAtts_.size();
                return this.uniqueAttsBuilder_.getCount();
            }

            public Common.AttributeBase getUniqueAtts(int index) {
                if (this.uniqueAttsBuilder_ == null)
                    return this.uniqueAtts_.get(index);
                return (Common.AttributeBase) this.uniqueAttsBuilder_.getMessage(index);
            }

            public Builder setUniqueAtts(int index, Common.AttributeBase value) {
                if (this.uniqueAttsBuilder_ == null) {
                    if (value == null)
                        throw new NullPointerException();
                    ensureUniqueAttsIsMutable();
                    this.uniqueAtts_.set(index, value);
                    onChanged();
                } else {
                    this.uniqueAttsBuilder_.setMessage(index, (GeneratedMessage) value);
                }
                return this;
            }

            public Builder setUniqueAtts(int index, Common.AttributeBase.Builder builderForValue) {
                if (this.uniqueAttsBuilder_ == null) {
                    ensureUniqueAttsIsMutable();
                    this.uniqueAtts_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    this.uniqueAttsBuilder_.setMessage(index, (GeneratedMessage) builderForValue.build());
                }
                return this;
            }

            public Builder addUniqueAtts(Common.AttributeBase value) {
                if (this.uniqueAttsBuilder_ == null) {
                    if (value == null)
                        throw new NullPointerException();
                    ensureUniqueAttsIsMutable();
                    this.uniqueAtts_.add(value);
                    onChanged();
                } else {
                    this.uniqueAttsBuilder_.addMessage((GeneratedMessage) value);
                }
                return this;
            }

            public Builder addUniqueAtts(int index, Common.AttributeBase value) {
                if (this.uniqueAttsBuilder_ == null) {
                    if (value == null)
                        throw new NullPointerException();
                    ensureUniqueAttsIsMutable();
                    this.uniqueAtts_.add(index, value);
                    onChanged();
                } else {
                    this.uniqueAttsBuilder_.addMessage(index, (GeneratedMessage) value);
                }
                return this;
            }

            public Builder addUniqueAtts(Common.AttributeBase.Builder builderForValue) {
                if (this.uniqueAttsBuilder_ == null) {
                    ensureUniqueAttsIsMutable();
                    this.uniqueAtts_.add(builderForValue.build());
                    onChanged();
                } else {
                    this.uniqueAttsBuilder_.addMessage((GeneratedMessage) builderForValue.build());
                }
                return this;
            }

            public Builder addUniqueAtts(int index, Common.AttributeBase.Builder builderForValue) {
                if (this.uniqueAttsBuilder_ == null) {
                    ensureUniqueAttsIsMutable();
                    this.uniqueAtts_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    this.uniqueAttsBuilder_.addMessage(index, (GeneratedMessage) builderForValue.build());
                }
                return this;
            }

            public Builder addAllUniqueAtts(Iterable<? extends Common.AttributeBase> values) {
                if (this.uniqueAttsBuilder_ == null) {
                    ensureUniqueAttsIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.uniqueAtts_);
                    onChanged();
                } else {
                    this.uniqueAttsBuilder_.addAllMessages(values);
                }
                return this;
            }

            public Builder clearUniqueAtts() {
                if (this.uniqueAttsBuilder_ == null) {
                    this.uniqueAtts_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFDFF;
                    onChanged();
                } else {
                    this.uniqueAttsBuilder_.clear();
                }
                return this;
            }

            public Builder removeUniqueAtts(int index) {
                if (this.uniqueAttsBuilder_ == null) {
                    ensureUniqueAttsIsMutable();
                    this.uniqueAtts_.remove(index);
                    onChanged();
                } else {
                    this.uniqueAttsBuilder_.remove(index);
                }
                return this;
            }

            public Common.AttributeBase.Builder getUniqueAttsBuilder(int index) {
                return (Common.AttributeBase.Builder) getUniqueAttsFieldBuilder().getBuilder(index);
            }

            public Common.AttributeBaseOrBuilder getUniqueAttsOrBuilder(int index) {
                if (this.uniqueAttsBuilder_ == null)
                    return (Common.AttributeBaseOrBuilder) this.uniqueAtts_.get(index);
                return (Common.AttributeBaseOrBuilder) this.uniqueAttsBuilder_.getMessageOrBuilder(index);
            }

            public List<? extends Common.AttributeBaseOrBuilder> getUniqueAttsOrBuilderList() {
                if (this.uniqueAttsBuilder_ != null)
                    return this.uniqueAttsBuilder_.getMessageOrBuilderList();
                return (List) Collections.unmodifiableList(this.uniqueAtts_);
            }

            public Common.AttributeBase.Builder addUniqueAttsBuilder() {
                return (Common.AttributeBase.Builder) getUniqueAttsFieldBuilder().addBuilder((GeneratedMessage) Common.AttributeBase.getDefaultInstance());
            }

            public Common.AttributeBase.Builder addUniqueAttsBuilder(int index) {
                return (Common.AttributeBase.Builder) getUniqueAttsFieldBuilder().addBuilder(index, (GeneratedMessage) Common.AttributeBase.getDefaultInstance());
            }

            public List<Common.AttributeBase.Builder> getUniqueAttsBuilderList() {
                return getUniqueAttsFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilder<Common.AttributeBase, Common.AttributeBase.Builder, Common.AttributeBaseOrBuilder> getUniqueAttsFieldBuilder() {
                if (this.uniqueAttsBuilder_ == null) {
                    this.uniqueAttsBuilder_ = new RepeatedFieldBuilder(this.uniqueAtts_, ((this.bitField0_ & 0x200) == 512), getParentForChildren(), isClean());
                    this.uniqueAtts_ = null;
                }
                return this.uniqueAttsBuilder_;
            }

            private void ensureTempBaseAttsIsMutable() {
                if ((this.bitField0_ & 0x400) != 1024) {
                    this.tempBaseAtts_ = new ArrayList<>(this.tempBaseAtts_);
                    this.bitField0_ |= 0x400;
                }
            }

            public List<Common.AttributeBase> getTempBaseAttsList() {
                if (this.tempBaseAttsBuilder_ == null)
                    return Collections.unmodifiableList(this.tempBaseAtts_);
                return this.tempBaseAttsBuilder_.getMessageList();
            }

            public int getTempBaseAttsCount() {
                if (this.tempBaseAttsBuilder_ == null)
                    return this.tempBaseAtts_.size();
                return this.tempBaseAttsBuilder_.getCount();
            }

            public Common.AttributeBase getTempBaseAtts(int index) {
                if (this.tempBaseAttsBuilder_ == null)
                    return this.tempBaseAtts_.get(index);
                return (Common.AttributeBase) this.tempBaseAttsBuilder_.getMessage(index);
            }

            public Builder setTempBaseAtts(int index, Common.AttributeBase value) {
                if (this.tempBaseAttsBuilder_ == null) {
                    if (value == null)
                        throw new NullPointerException();
                    ensureTempBaseAttsIsMutable();
                    this.tempBaseAtts_.set(index, value);
                    onChanged();
                } else {
                    this.tempBaseAttsBuilder_.setMessage(index, (GeneratedMessage) value);
                }
                return this;
            }

            public Builder setTempBaseAtts(int index, Common.AttributeBase.Builder builderForValue) {
                if (this.tempBaseAttsBuilder_ == null) {
                    ensureTempBaseAttsIsMutable();
                    this.tempBaseAtts_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    this.tempBaseAttsBuilder_.setMessage(index, (GeneratedMessage) builderForValue.build());
                }
                return this;
            }

            public Builder addTempBaseAtts(Common.AttributeBase value) {
                if (this.tempBaseAttsBuilder_ == null) {
                    if (value == null)
                        throw new NullPointerException();
                    ensureTempBaseAttsIsMutable();
                    this.tempBaseAtts_.add(value);
                    onChanged();
                } else {
                    this.tempBaseAttsBuilder_.addMessage((GeneratedMessage) value);
                }
                return this;
            }

            public Builder addTempBaseAtts(int index, Common.AttributeBase value) {
                if (this.tempBaseAttsBuilder_ == null) {
                    if (value == null)
                        throw new NullPointerException();
                    ensureTempBaseAttsIsMutable();
                    this.tempBaseAtts_.add(index, value);
                    onChanged();
                } else {
                    this.tempBaseAttsBuilder_.addMessage(index, (GeneratedMessage) value);
                }
                return this;
            }

            public Builder addTempBaseAtts(Common.AttributeBase.Builder builderForValue) {
                if (this.tempBaseAttsBuilder_ == null) {
                    ensureTempBaseAttsIsMutable();
                    this.tempBaseAtts_.add(builderForValue.build());
                    onChanged();
                } else {
                    this.tempBaseAttsBuilder_.addMessage((GeneratedMessage) builderForValue.build());
                }
                return this;
            }

            public Builder addTempBaseAtts(int index, Common.AttributeBase.Builder builderForValue) {
                if (this.tempBaseAttsBuilder_ == null) {
                    ensureTempBaseAttsIsMutable();
                    this.tempBaseAtts_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    this.tempBaseAttsBuilder_.addMessage(index, (GeneratedMessage) builderForValue.build());
                }
                return this;
            }

            public Builder addAllTempBaseAtts(Iterable<? extends Common.AttributeBase> values) {
                if (this.tempBaseAttsBuilder_ == null) {
                    ensureTempBaseAttsIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.tempBaseAtts_);
                    onChanged();
                } else {
                    this.tempBaseAttsBuilder_.addAllMessages(values);
                }
                return this;
            }

            public Builder clearTempBaseAtts() {
                if (this.tempBaseAttsBuilder_ == null) {
                    this.tempBaseAtts_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFBFF;
                    onChanged();
                } else {
                    this.tempBaseAttsBuilder_.clear();
                }
                return this;
            }

            public Builder removeTempBaseAtts(int index) {
                if (this.tempBaseAttsBuilder_ == null) {
                    ensureTempBaseAttsIsMutable();
                    this.tempBaseAtts_.remove(index);
                    onChanged();
                } else {
                    this.tempBaseAttsBuilder_.remove(index);
                }
                return this;
            }

            public Common.AttributeBase.Builder getTempBaseAttsBuilder(int index) {
                return (Common.AttributeBase.Builder) getTempBaseAttsFieldBuilder().getBuilder(index);
            }

            public Common.AttributeBaseOrBuilder getTempBaseAttsOrBuilder(int index) {
                if (this.tempBaseAttsBuilder_ == null)
                    return (Common.AttributeBaseOrBuilder) this.tempBaseAtts_.get(index);
                return (Common.AttributeBaseOrBuilder) this.tempBaseAttsBuilder_.getMessageOrBuilder(index);
            }

            public List<? extends Common.AttributeBaseOrBuilder> getTempBaseAttsOrBuilderList() {
                if (this.tempBaseAttsBuilder_ != null)
                    return this.tempBaseAttsBuilder_.getMessageOrBuilderList();
                return (List) Collections.unmodifiableList(this.tempBaseAtts_);
            }

            public Common.AttributeBase.Builder addTempBaseAttsBuilder() {
                return (Common.AttributeBase.Builder) getTempBaseAttsFieldBuilder().addBuilder((GeneratedMessage) Common.AttributeBase.getDefaultInstance());
            }

            public Common.AttributeBase.Builder addTempBaseAttsBuilder(int index) {
                return (Common.AttributeBase.Builder) getTempBaseAttsFieldBuilder().addBuilder(index, (GeneratedMessage) Common.AttributeBase.getDefaultInstance());
            }

            public List<Common.AttributeBase.Builder> getTempBaseAttsBuilderList() {
                return getTempBaseAttsFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilder<Common.AttributeBase, Common.AttributeBase.Builder, Common.AttributeBaseOrBuilder> getTempBaseAttsFieldBuilder() {
                if (this.tempBaseAttsBuilder_ == null) {
                    this.tempBaseAttsBuilder_ = new RepeatedFieldBuilder(this.tempBaseAtts_, ((this.bitField0_ & 0x400) == 1024), getParentForChildren(), isClean());
                    this.tempBaseAtts_ = null;
                }
                return this.tempBaseAttsBuilder_;
            }

            private void ensureTempExtAttsIsMutable() {
                if ((this.bitField0_ & 0x800) != 2048) {
                    this.tempExtAtts_ = new ArrayList<>(this.tempExtAtts_);
                    this.bitField0_ |= 0x800;
                }
            }

            public List<Common.AttributeBase> getTempExtAttsList() {
                if (this.tempExtAttsBuilder_ == null)
                    return Collections.unmodifiableList(this.tempExtAtts_);
                return this.tempExtAttsBuilder_.getMessageList();
            }

            public int getTempExtAttsCount() {
                if (this.tempExtAttsBuilder_ == null)
                    return this.tempExtAtts_.size();
                return this.tempExtAttsBuilder_.getCount();
            }

            public Common.AttributeBase getTempExtAtts(int index) {
                if (this.tempExtAttsBuilder_ == null)
                    return this.tempExtAtts_.get(index);
                return (Common.AttributeBase) this.tempExtAttsBuilder_.getMessage(index);
            }

            public Builder setTempExtAtts(int index, Common.AttributeBase value) {
                if (this.tempExtAttsBuilder_ == null) {
                    if (value == null)
                        throw new NullPointerException();
                    ensureTempExtAttsIsMutable();
                    this.tempExtAtts_.set(index, value);
                    onChanged();
                } else {
                    this.tempExtAttsBuilder_.setMessage(index, (GeneratedMessage) value);
                }
                return this;
            }

            public Builder setTempExtAtts(int index, Common.AttributeBase.Builder builderForValue) {
                if (this.tempExtAttsBuilder_ == null) {
                    ensureTempExtAttsIsMutable();
                    this.tempExtAtts_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    this.tempExtAttsBuilder_.setMessage(index, (GeneratedMessage) builderForValue.build());
                }
                return this;
            }

            public Builder addTempExtAtts(Common.AttributeBase value) {
                if (this.tempExtAttsBuilder_ == null) {
                    if (value == null)
                        throw new NullPointerException();
                    ensureTempExtAttsIsMutable();
                    this.tempExtAtts_.add(value);
                    onChanged();
                } else {
                    this.tempExtAttsBuilder_.addMessage((GeneratedMessage) value);
                }
                return this;
            }

            public Builder addTempExtAtts(int index, Common.AttributeBase value) {
                if (this.tempExtAttsBuilder_ == null) {
                    if (value == null)
                        throw new NullPointerException();
                    ensureTempExtAttsIsMutable();
                    this.tempExtAtts_.add(index, value);
                    onChanged();
                } else {
                    this.tempExtAttsBuilder_.addMessage(index, (GeneratedMessage) value);
                }
                return this;
            }

            public Builder addTempExtAtts(Common.AttributeBase.Builder builderForValue) {
                if (this.tempExtAttsBuilder_ == null) {
                    ensureTempExtAttsIsMutable();
                    this.tempExtAtts_.add(builderForValue.build());
                    onChanged();
                } else {
                    this.tempExtAttsBuilder_.addMessage((GeneratedMessage) builderForValue.build());
                }
                return this;
            }

            public Builder addTempExtAtts(int index, Common.AttributeBase.Builder builderForValue) {
                if (this.tempExtAttsBuilder_ == null) {
                    ensureTempExtAttsIsMutable();
                    this.tempExtAtts_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    this.tempExtAttsBuilder_.addMessage(index, (GeneratedMessage) builderForValue.build());
                }
                return this;
            }

            public Builder addAllTempExtAtts(Iterable<? extends Common.AttributeBase> values) {
                if (this.tempExtAttsBuilder_ == null) {
                    ensureTempExtAttsIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.tempExtAtts_);
                    onChanged();
                } else {
                    this.tempExtAttsBuilder_.addAllMessages(values);
                }
                return this;
            }

            public Builder clearTempExtAtts() {
                if (this.tempExtAttsBuilder_ == null) {
                    this.tempExtAtts_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFF7FF;
                    onChanged();
                } else {
                    this.tempExtAttsBuilder_.clear();
                }
                return this;
            }

            public Builder removeTempExtAtts(int index) {
                if (this.tempExtAttsBuilder_ == null) {
                    ensureTempExtAttsIsMutable();
                    this.tempExtAtts_.remove(index);
                    onChanged();
                } else {
                    this.tempExtAttsBuilder_.remove(index);
                }
                return this;
            }

            public Common.AttributeBase.Builder getTempExtAttsBuilder(int index) {
                return (Common.AttributeBase.Builder) getTempExtAttsFieldBuilder().getBuilder(index);
            }

            public Common.AttributeBaseOrBuilder getTempExtAttsOrBuilder(int index) {
                if (this.tempExtAttsBuilder_ == null)
                    return (Common.AttributeBaseOrBuilder) this.tempExtAtts_.get(index);
                return (Common.AttributeBaseOrBuilder) this.tempExtAttsBuilder_.getMessageOrBuilder(index);
            }

            public List<? extends Common.AttributeBaseOrBuilder> getTempExtAttsOrBuilderList() {
                if (this.tempExtAttsBuilder_ != null)
                    return this.tempExtAttsBuilder_.getMessageOrBuilderList();
                return (List) Collections.unmodifiableList(this.tempExtAtts_);
            }

            public Common.AttributeBase.Builder addTempExtAttsBuilder() {
                return (Common.AttributeBase.Builder) getTempExtAttsFieldBuilder().addBuilder((GeneratedMessage) Common.AttributeBase.getDefaultInstance());
            }

            public Common.AttributeBase.Builder addTempExtAttsBuilder(int index) {
                return (Common.AttributeBase.Builder) getTempExtAttsFieldBuilder().addBuilder(index, (GeneratedMessage) Common.AttributeBase.getDefaultInstance());
            }

            public List<Common.AttributeBase.Builder> getTempExtAttsBuilderList() {
                return getTempExtAttsFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilder<Common.AttributeBase, Common.AttributeBase.Builder, Common.AttributeBaseOrBuilder> getTempExtAttsFieldBuilder() {
                if (this.tempExtAttsBuilder_ == null) {
                    this.tempExtAttsBuilder_ = new RepeatedFieldBuilder(this.tempExtAtts_, ((this.bitField0_ & 0x800) == 2048), getParentForChildren(), isClean());
                    this.tempExtAtts_ = null;
                }
                return this.tempExtAttsBuilder_;
            }

            private void ensureTempExtAttsSeniorIsMutable() {
                if ((this.bitField0_ & 0x1000) != 4096) {
                    this.tempExtAttsSenior_ = new ArrayList<>(this.tempExtAttsSenior_);
                    this.bitField0_ |= 0x1000;
                }
            }

            public List<Common.AttributeBase> getTempExtAttsSeniorList() {
                if (this.tempExtAttsSeniorBuilder_ == null)
                    return Collections.unmodifiableList(this.tempExtAttsSenior_);
                return this.tempExtAttsSeniorBuilder_.getMessageList();
            }

            public int getTempExtAttsSeniorCount() {
                if (this.tempExtAttsSeniorBuilder_ == null)
                    return this.tempExtAttsSenior_.size();
                return this.tempExtAttsSeniorBuilder_.getCount();
            }

            public Common.AttributeBase getTempExtAttsSenior(int index) {
                if (this.tempExtAttsSeniorBuilder_ == null)
                    return this.tempExtAttsSenior_.get(index);
                return (Common.AttributeBase) this.tempExtAttsSeniorBuilder_.getMessage(index);
            }

            public Builder setTempExtAttsSenior(int index, Common.AttributeBase value) {
                if (this.tempExtAttsSeniorBuilder_ == null) {
                    if (value == null)
                        throw new NullPointerException();
                    ensureTempExtAttsSeniorIsMutable();
                    this.tempExtAttsSenior_.set(index, value);
                    onChanged();
                } else {
                    this.tempExtAttsSeniorBuilder_.setMessage(index, (GeneratedMessage) value);
                }
                return this;
            }

            public Builder setTempExtAttsSenior(int index, Common.AttributeBase.Builder builderForValue) {
                if (this.tempExtAttsSeniorBuilder_ == null) {
                    ensureTempExtAttsSeniorIsMutable();
                    this.tempExtAttsSenior_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    this.tempExtAttsSeniorBuilder_.setMessage(index, (GeneratedMessage) builderForValue.build());
                }
                return this;
            }

            public Builder addTempExtAttsSenior(Common.AttributeBase value) {
                if (this.tempExtAttsSeniorBuilder_ == null) {
                    if (value == null)
                        throw new NullPointerException();
                    ensureTempExtAttsSeniorIsMutable();
                    this.tempExtAttsSenior_.add(value);
                    onChanged();
                } else {
                    this.tempExtAttsSeniorBuilder_.addMessage((GeneratedMessage) value);
                }
                return this;
            }

            public Builder addTempExtAttsSenior(int index, Common.AttributeBase value) {
                if (this.tempExtAttsSeniorBuilder_ == null) {
                    if (value == null)
                        throw new NullPointerException();
                    ensureTempExtAttsSeniorIsMutable();
                    this.tempExtAttsSenior_.add(index, value);
                    onChanged();
                } else {
                    this.tempExtAttsSeniorBuilder_.addMessage(index, (GeneratedMessage) value);
                }
                return this;
            }

            public Builder addTempExtAttsSenior(Common.AttributeBase.Builder builderForValue) {
                if (this.tempExtAttsSeniorBuilder_ == null) {
                    ensureTempExtAttsSeniorIsMutable();
                    this.tempExtAttsSenior_.add(builderForValue.build());
                    onChanged();
                } else {
                    this.tempExtAttsSeniorBuilder_.addMessage((GeneratedMessage) builderForValue.build());
                }
                return this;
            }

            public Builder addTempExtAttsSenior(int index, Common.AttributeBase.Builder builderForValue) {
                if (this.tempExtAttsSeniorBuilder_ == null) {
                    ensureTempExtAttsSeniorIsMutable();
                    this.tempExtAttsSenior_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    this.tempExtAttsSeniorBuilder_.addMessage(index, (GeneratedMessage) builderForValue.build());
                }
                return this;
            }

            public Builder addAllTempExtAttsSenior(Iterable<? extends Common.AttributeBase> values) {
                if (this.tempExtAttsSeniorBuilder_ == null) {
                    ensureTempExtAttsSeniorIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.tempExtAttsSenior_);
                    onChanged();
                } else {
                    this.tempExtAttsSeniorBuilder_.addAllMessages(values);
                }
                return this;
            }

            public Builder clearTempExtAttsSenior() {
                if (this.tempExtAttsSeniorBuilder_ == null) {
                    this.tempExtAttsSenior_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFEFFF;
                    onChanged();
                } else {
                    this.tempExtAttsSeniorBuilder_.clear();
                }
                return this;
            }

            public Builder removeTempExtAttsSenior(int index) {
                if (this.tempExtAttsSeniorBuilder_ == null) {
                    ensureTempExtAttsSeniorIsMutable();
                    this.tempExtAttsSenior_.remove(index);
                    onChanged();
                } else {
                    this.tempExtAttsSeniorBuilder_.remove(index);
                }
                return this;
            }

            public Common.AttributeBase.Builder getTempExtAttsSeniorBuilder(int index) {
                return (Common.AttributeBase.Builder) getTempExtAttsSeniorFieldBuilder().getBuilder(index);
            }

            public Common.AttributeBaseOrBuilder getTempExtAttsSeniorOrBuilder(int index) {
                if (this.tempExtAttsSeniorBuilder_ == null)
                    return (Common.AttributeBaseOrBuilder) this.tempExtAttsSenior_.get(index);
                return (Common.AttributeBaseOrBuilder) this.tempExtAttsSeniorBuilder_.getMessageOrBuilder(index);
            }

            public List<? extends Common.AttributeBaseOrBuilder> getTempExtAttsSeniorOrBuilderList() {
                if (this.tempExtAttsSeniorBuilder_ != null)
                    return this.tempExtAttsSeniorBuilder_.getMessageOrBuilderList();
                return (List) Collections.unmodifiableList(this.tempExtAttsSenior_);
            }

            public Common.AttributeBase.Builder addTempExtAttsSeniorBuilder() {
                return (Common.AttributeBase.Builder) getTempExtAttsSeniorFieldBuilder().addBuilder((GeneratedMessage) Common.AttributeBase.getDefaultInstance());
            }

            public Common.AttributeBase.Builder addTempExtAttsSeniorBuilder(int index) {
                return (Common.AttributeBase.Builder) getTempExtAttsSeniorFieldBuilder().addBuilder(index, (GeneratedMessage) Common.AttributeBase.getDefaultInstance());
            }

            public List<Common.AttributeBase.Builder> getTempExtAttsSeniorBuilderList() {
                return getTempExtAttsSeniorFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilder<Common.AttributeBase, Common.AttributeBase.Builder, Common.AttributeBaseOrBuilder> getTempExtAttsSeniorFieldBuilder() {
                if (this.tempExtAttsSeniorBuilder_ == null) {
                    this.tempExtAttsSeniorBuilder_ = new RepeatedFieldBuilder(this.tempExtAttsSenior_, ((this.bitField0_ & 0x1000) == 4096), getParentForChildren(), isClean());
                    this.tempExtAttsSenior_ = null;
                }
                return this.tempExtAttsSeniorBuilder_;
            }

            private void ensureTempUniqueAttsIsMutable() {
                if ((this.bitField0_ & 0x2000) != 8192) {
                    this.tempUniqueAtts_ = new ArrayList<>(this.tempUniqueAtts_);
                    this.bitField0_ |= 0x2000;
                }
            }

            public List<Common.AttributeBase> getTempUniqueAttsList() {
                if (this.tempUniqueAttsBuilder_ == null)
                    return Collections.unmodifiableList(this.tempUniqueAtts_);
                return this.tempUniqueAttsBuilder_.getMessageList();
            }

            public int getTempUniqueAttsCount() {
                if (this.tempUniqueAttsBuilder_ == null)
                    return this.tempUniqueAtts_.size();
                return this.tempUniqueAttsBuilder_.getCount();
            }

            public Common.AttributeBase getTempUniqueAtts(int index) {
                if (this.tempUniqueAttsBuilder_ == null)
                    return this.tempUniqueAtts_.get(index);
                return (Common.AttributeBase) this.tempUniqueAttsBuilder_.getMessage(index);
            }

            public Builder setTempUniqueAtts(int index, Common.AttributeBase value) {
                if (this.tempUniqueAttsBuilder_ == null) {
                    if (value == null)
                        throw new NullPointerException();
                    ensureTempUniqueAttsIsMutable();
                    this.tempUniqueAtts_.set(index, value);
                    onChanged();
                } else {
                    this.tempUniqueAttsBuilder_.setMessage(index, (GeneratedMessage) value);
                }
                return this;
            }

            public Builder setTempUniqueAtts(int index, Common.AttributeBase.Builder builderForValue) {
                if (this.tempUniqueAttsBuilder_ == null) {
                    ensureTempUniqueAttsIsMutable();
                    this.tempUniqueAtts_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    this.tempUniqueAttsBuilder_.setMessage(index, (GeneratedMessage) builderForValue.build());
                }
                return this;
            }

            public Builder addTempUniqueAtts(Common.AttributeBase value) {
                if (this.tempUniqueAttsBuilder_ == null) {
                    if (value == null)
                        throw new NullPointerException();
                    ensureTempUniqueAttsIsMutable();
                    this.tempUniqueAtts_.add(value);
                    onChanged();
                } else {
                    this.tempUniqueAttsBuilder_.addMessage((GeneratedMessage) value);
                }
                return this;
            }

            public Builder addTempUniqueAtts(int index, Common.AttributeBase value) {
                if (this.tempUniqueAttsBuilder_ == null) {
                    if (value == null)
                        throw new NullPointerException();
                    ensureTempUniqueAttsIsMutable();
                    this.tempUniqueAtts_.add(index, value);
                    onChanged();
                } else {
                    this.tempUniqueAttsBuilder_.addMessage(index, (GeneratedMessage) value);
                }
                return this;
            }

            public Builder addTempUniqueAtts(Common.AttributeBase.Builder builderForValue) {
                if (this.tempUniqueAttsBuilder_ == null) {
                    ensureTempUniqueAttsIsMutable();
                    this.tempUniqueAtts_.add(builderForValue.build());
                    onChanged();
                } else {
                    this.tempUniqueAttsBuilder_.addMessage((GeneratedMessage) builderForValue.build());
                }
                return this;
            }

            public Builder addTempUniqueAtts(int index, Common.AttributeBase.Builder builderForValue) {
                if (this.tempUniqueAttsBuilder_ == null) {
                    ensureTempUniqueAttsIsMutable();
                    this.tempUniqueAtts_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    this.tempUniqueAttsBuilder_.addMessage(index, (GeneratedMessage) builderForValue.build());
                }
                return this;
            }

            public Builder addAllTempUniqueAtts(Iterable<? extends Common.AttributeBase> values) {
                if (this.tempUniqueAttsBuilder_ == null) {
                    ensureTempUniqueAttsIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.tempUniqueAtts_);
                    onChanged();
                } else {
                    this.tempUniqueAttsBuilder_.addAllMessages(values);
                }
                return this;
            }

            public Builder clearTempUniqueAtts() {
                if (this.tempUniqueAttsBuilder_ == null) {
                    this.tempUniqueAtts_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFDFFF;
                    onChanged();
                } else {
                    this.tempUniqueAttsBuilder_.clear();
                }
                return this;
            }

            public Builder removeTempUniqueAtts(int index) {
                if (this.tempUniqueAttsBuilder_ == null) {
                    ensureTempUniqueAttsIsMutable();
                    this.tempUniqueAtts_.remove(index);
                    onChanged();
                } else {
                    this.tempUniqueAttsBuilder_.remove(index);
                }
                return this;
            }

            public Common.AttributeBase.Builder getTempUniqueAttsBuilder(int index) {
                return (Common.AttributeBase.Builder) getTempUniqueAttsFieldBuilder().getBuilder(index);
            }

            public Common.AttributeBaseOrBuilder getTempUniqueAttsOrBuilder(int index) {
                if (this.tempUniqueAttsBuilder_ == null)
                    return (Common.AttributeBaseOrBuilder) this.tempUniqueAtts_.get(index);
                return (Common.AttributeBaseOrBuilder) this.tempUniqueAttsBuilder_.getMessageOrBuilder(index);
            }

            public List<? extends Common.AttributeBaseOrBuilder> getTempUniqueAttsOrBuilderList() {
                if (this.tempUniqueAttsBuilder_ != null)
                    return this.tempUniqueAttsBuilder_.getMessageOrBuilderList();
                return (List) Collections.unmodifiableList(this.tempUniqueAtts_);
            }

            public Common.AttributeBase.Builder addTempUniqueAttsBuilder() {
                return (Common.AttributeBase.Builder) getTempUniqueAttsFieldBuilder().addBuilder((GeneratedMessage) Common.AttributeBase.getDefaultInstance());
            }

            public Common.AttributeBase.Builder addTempUniqueAttsBuilder(int index) {
                return (Common.AttributeBase.Builder) getTempUniqueAttsFieldBuilder().addBuilder(index, (GeneratedMessage) Common.AttributeBase.getDefaultInstance());
            }

            public List<Common.AttributeBase.Builder> getTempUniqueAttsBuilderList() {
                return getTempUniqueAttsFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilder<Common.AttributeBase, Common.AttributeBase.Builder, Common.AttributeBaseOrBuilder> getTempUniqueAttsFieldBuilder() {
                if (this.tempUniqueAttsBuilder_ == null) {
                    this.tempUniqueAttsBuilder_ = new RepeatedFieldBuilder(this.tempUniqueAtts_, ((this.bitField0_ & 0x2000) == 8192), getParentForChildren(), isClean());
                    this.tempUniqueAtts_ = null;
                }
                return this.tempUniqueAttsBuilder_;
            }

            public boolean hasRefineAttrId() {
                return ((this.bitField0_ & 0x4000) == 16384);
            }

            public int getRefineAttrId() {
                return this.refineAttrId_;
            }

            public Builder setRefineAttrId(int value) {
                this.bitField0_ |= 0x4000;
                this.refineAttrId_ = value;
                onChanged();
                return this;
            }

            public Builder clearRefineAttrId() {
                this.bitField0_ &= 0xFFFFBFFF;
                this.refineAttrId_ = 0;
                onChanged();
                return this;
            }

            public boolean hasTempRefineAttr() {
                return ((this.bitField0_ & 0x8000) == 32768);
            }

            public Common.AttributeBase getTempRefineAttr() {
                if (this.tempRefineAttrBuilder_ == null)
                    return this.tempRefineAttr_;
                return (Common.AttributeBase) this.tempRefineAttrBuilder_.getMessage();
            }

            public Builder setTempRefineAttr(Common.AttributeBase value) {
                if (this.tempRefineAttrBuilder_ == null) {
                    if (value == null)
                        throw new NullPointerException();
                    this.tempRefineAttr_ = value;
                    onChanged();
                } else {
                    this.tempRefineAttrBuilder_.setMessage((GeneratedMessage) value);
                }
                this.bitField0_ |= 0x8000;
                return this;
            }

            public Builder setTempRefineAttr(Common.AttributeBase.Builder builderForValue) {
                if (this.tempRefineAttrBuilder_ == null) {
                    this.tempRefineAttr_ = builderForValue.build();
                    onChanged();
                } else {
                    this.tempRefineAttrBuilder_.setMessage((GeneratedMessage) builderForValue.build());
                }
                this.bitField0_ |= 0x8000;
                return this;
            }

            public Builder mergeTempRefineAttr(Common.AttributeBase value) {
                if (this.tempRefineAttrBuilder_ == null) {
                    if ((this.bitField0_ & 0x8000) == 32768 && this.tempRefineAttr_ != Common.AttributeBase.getDefaultInstance()) {
                        this.tempRefineAttr_ = Common.AttributeBase.newBuilder(this.tempRefineAttr_).mergeFrom(value).buildPartial();
                    } else {
                        this.tempRefineAttr_ = value;
                    }
                    onChanged();
                } else {
                    this.tempRefineAttrBuilder_.mergeFrom((GeneratedMessage) value);
                }
                this.bitField0_ |= 0x8000;
                return this;
            }

            public Builder clearTempRefineAttr() {
                if (this.tempRefineAttrBuilder_ == null) {
                    this.tempRefineAttr_ = Common.AttributeBase.getDefaultInstance();
                    onChanged();
                } else {
                    this.tempRefineAttrBuilder_.clear();
                }
                this.bitField0_ &= 0xFFFF7FFF;
                return this;
            }

            public Common.AttributeBase.Builder getTempRefineAttrBuilder() {
                this.bitField0_ |= 0x8000;
                onChanged();
                return (Common.AttributeBase.Builder) getTempRefineAttrFieldBuilder().getBuilder();
            }

            public Common.AttributeBaseOrBuilder getTempRefineAttrOrBuilder() {
                if (this.tempRefineAttrBuilder_ != null)
                    return (Common.AttributeBaseOrBuilder) this.tempRefineAttrBuilder_.getMessageOrBuilder();
                return (Common.AttributeBaseOrBuilder) this.tempRefineAttr_;
            }

            private SingleFieldBuilder<Common.AttributeBase, Common.AttributeBase.Builder, Common.AttributeBaseOrBuilder> getTempRefineAttrFieldBuilder() {
                if (this.tempRefineAttrBuilder_ == null) {
                    this.tempRefineAttrBuilder_ = new SingleFieldBuilder((GeneratedMessage) getTempRefineAttr(), getParentForChildren(), isClean());
                    this.tempRefineAttr_ = null;
                }
                return this.tempRefineAttrBuilder_;
            }

            public boolean hasRemakeScore() {
                return ((this.bitField0_ & 0x10000) == 65536);
            }

            public int getRemakeScore() {
                return this.remakeScore_;
            }

            public Builder setRemakeScore(int value) {
                this.bitField0_ |= 0x10000;
                this.remakeScore_ = value;
                onChanged();
                return this;
            }

            public Builder clearRemakeScore() {
                this.bitField0_ &= 0xFFFEFFFF;
                this.remakeScore_ = 0;
                onChanged();
                return this;
            }

            public boolean hasTempRemakeScore() {
                return ((this.bitField0_ & 0x20000) == 131072);
            }

            public int getTempRemakeScore() {
                return this.tempRemakeScore_;
            }

            public Builder setTempRemakeScore(int value) {
                this.bitField0_ |= 0x20000;
                this.tempRemakeScore_ = value;
                onChanged();
                return this;
            }

            public Builder clearTempRemakeScore() {
                this.bitField0_ &= 0xFFFDFFFF;
                this.tempRemakeScore_ = 0;
                onChanged();
                return this;
            }

            private void ensureStarAttrIsMutable() {
                if ((this.bitField0_ & 0x40000) != 262144) {
                    this.starAttr_ = new ArrayList<>(this.starAttr_);
                    this.bitField0_ |= 0x40000;
                }
            }

            public List<Common.AttributeBase> getStarAttrList() {
                if (this.starAttrBuilder_ == null)
                    return Collections.unmodifiableList(this.starAttr_);
                return this.starAttrBuilder_.getMessageList();
            }

            public int getStarAttrCount() {
                if (this.starAttrBuilder_ == null)
                    return this.starAttr_.size();
                return this.starAttrBuilder_.getCount();
            }

            public Common.AttributeBase getStarAttr(int index) {
                if (this.starAttrBuilder_ == null)
                    return this.starAttr_.get(index);
                return (Common.AttributeBase) this.starAttrBuilder_.getMessage(index);
            }

            public Builder setStarAttr(int index, Common.AttributeBase value) {
                if (this.starAttrBuilder_ == null) {
                    if (value == null)
                        throw new NullPointerException();
                    ensureStarAttrIsMutable();
                    this.starAttr_.set(index, value);
                    onChanged();
                } else {
                    this.starAttrBuilder_.setMessage(index, (GeneratedMessage) value);
                }
                return this;
            }

            public Builder setStarAttr(int index, Common.AttributeBase.Builder builderForValue) {
                if (this.starAttrBuilder_ == null) {
                    ensureStarAttrIsMutable();
                    this.starAttr_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    this.starAttrBuilder_.setMessage(index, (GeneratedMessage) builderForValue.build());
                }
                return this;
            }

            public Builder addStarAttr(Common.AttributeBase value) {
                if (this.starAttrBuilder_ == null) {
                    if (value == null)
                        throw new NullPointerException();
                    ensureStarAttrIsMutable();
                    this.starAttr_.add(value);
                    onChanged();
                } else {
                    this.starAttrBuilder_.addMessage((GeneratedMessage) value);
                }
                return this;
            }

            public Builder addStarAttr(int index, Common.AttributeBase value) {
                if (this.starAttrBuilder_ == null) {
                    if (value == null)
                        throw new NullPointerException();
                    ensureStarAttrIsMutable();
                    this.starAttr_.add(index, value);
                    onChanged();
                } else {
                    this.starAttrBuilder_.addMessage(index, (GeneratedMessage) value);
                }
                return this;
            }

            public Builder addStarAttr(Common.AttributeBase.Builder builderForValue) {
                if (this.starAttrBuilder_ == null) {
                    ensureStarAttrIsMutable();
                    this.starAttr_.add(builderForValue.build());
                    onChanged();
                } else {
                    this.starAttrBuilder_.addMessage((GeneratedMessage) builderForValue.build());
                }
                return this;
            }

            public Builder addStarAttr(int index, Common.AttributeBase.Builder builderForValue) {
                if (this.starAttrBuilder_ == null) {
                    ensureStarAttrIsMutable();
                    this.starAttr_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    this.starAttrBuilder_.addMessage(index, (GeneratedMessage) builderForValue.build());
                }
                return this;
            }

            public Builder addAllStarAttr(Iterable<? extends Common.AttributeBase> values) {
                if (this.starAttrBuilder_ == null) {
                    ensureStarAttrIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.starAttr_);
                    onChanged();
                } else {
                    this.starAttrBuilder_.addAllMessages(values);
                }
                return this;
            }

            public Builder clearStarAttr() {
                if (this.starAttrBuilder_ == null) {
                    this.starAttr_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFBFFFF;
                    onChanged();
                } else {
                    this.starAttrBuilder_.clear();
                }
                return this;
            }

            public Builder removeStarAttr(int index) {
                if (this.starAttrBuilder_ == null) {
                    ensureStarAttrIsMutable();
                    this.starAttr_.remove(index);
                    onChanged();
                } else {
                    this.starAttrBuilder_.remove(index);
                }
                return this;
            }

            public Common.AttributeBase.Builder getStarAttrBuilder(int index) {
                return (Common.AttributeBase.Builder) getStarAttrFieldBuilder().getBuilder(index);
            }

            public Common.AttributeBaseOrBuilder getStarAttrOrBuilder(int index) {
                if (this.starAttrBuilder_ == null)
                    return (Common.AttributeBaseOrBuilder) this.starAttr_.get(index);
                return (Common.AttributeBaseOrBuilder) this.starAttrBuilder_.getMessageOrBuilder(index);
            }

            public List<? extends Common.AttributeBaseOrBuilder> getStarAttrOrBuilderList() {
                if (this.starAttrBuilder_ != null)
                    return this.starAttrBuilder_.getMessageOrBuilderList();
                return (List) Collections.unmodifiableList(this.starAttr_);
            }

            public Common.AttributeBase.Builder addStarAttrBuilder() {
                return (Common.AttributeBase.Builder) getStarAttrFieldBuilder().addBuilder((GeneratedMessage) Common.AttributeBase.getDefaultInstance());
            }

            public Common.AttributeBase.Builder addStarAttrBuilder(int index) {
                return (Common.AttributeBase.Builder) getStarAttrFieldBuilder().addBuilder(index, (GeneratedMessage) Common.AttributeBase.getDefaultInstance());
            }

            public List<Common.AttributeBase.Builder> getStarAttrBuilderList() {
                return getStarAttrFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilder<Common.AttributeBase, Common.AttributeBase.Builder, Common.AttributeBaseOrBuilder> getStarAttrFieldBuilder() {
                if (this.starAttrBuilder_ == null) {
                    this.starAttrBuilder_ = new RepeatedFieldBuilder(this.starAttr_, ((this.bitField0_ & 0x40000) == 262144), getParentForChildren(), isClean());
                    this.starAttr_ = null;
                }
                return this.starAttrBuilder_;
            }

            private void ensureTempstarAttrIsMutable() {
                if ((this.bitField0_ & 0x80000) != 524288) {
                    this.tempstarAttr_ = new ArrayList<>(this.tempstarAttr_);
                    this.bitField0_ |= 0x80000;
                }
            }

            public List<Common.AttributeBase> getTempstarAttrList() {
                if (this.tempstarAttrBuilder_ == null)
                    return Collections.unmodifiableList(this.tempstarAttr_);
                return this.tempstarAttrBuilder_.getMessageList();
            }

            public int getTempstarAttrCount() {
                if (this.tempstarAttrBuilder_ == null)
                    return this.tempstarAttr_.size();
                return this.tempstarAttrBuilder_.getCount();
            }

            public Common.AttributeBase getTempstarAttr(int index) {
                if (this.tempstarAttrBuilder_ == null)
                    return this.tempstarAttr_.get(index);
                return (Common.AttributeBase) this.tempstarAttrBuilder_.getMessage(index);
            }

            public Builder setTempstarAttr(int index, Common.AttributeBase value) {
                if (this.tempstarAttrBuilder_ == null) {
                    if (value == null)
                        throw new NullPointerException();
                    ensureTempstarAttrIsMutable();
                    this.tempstarAttr_.set(index, value);
                    onChanged();
                } else {
                    this.tempstarAttrBuilder_.setMessage(index, (GeneratedMessage) value);
                }
                return this;
            }

            public Builder setTempstarAttr(int index, Common.AttributeBase.Builder builderForValue) {
                if (this.tempstarAttrBuilder_ == null) {
                    ensureTempstarAttrIsMutable();
                    this.tempstarAttr_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    this.tempstarAttrBuilder_.setMessage(index, (GeneratedMessage) builderForValue.build());
                }
                return this;
            }

            public Builder addTempstarAttr(Common.AttributeBase value) {
                if (this.tempstarAttrBuilder_ == null) {
                    if (value == null)
                        throw new NullPointerException();
                    ensureTempstarAttrIsMutable();
                    this.tempstarAttr_.add(value);
                    onChanged();
                } else {
                    this.tempstarAttrBuilder_.addMessage((GeneratedMessage) value);
                }
                return this;
            }

            public Builder addTempstarAttr(int index, Common.AttributeBase value) {
                if (this.tempstarAttrBuilder_ == null) {
                    if (value == null)
                        throw new NullPointerException();
                    ensureTempstarAttrIsMutable();
                    this.tempstarAttr_.add(index, value);
                    onChanged();
                } else {
                    this.tempstarAttrBuilder_.addMessage(index, (GeneratedMessage) value);
                }
                return this;
            }

            public Builder addTempstarAttr(Common.AttributeBase.Builder builderForValue) {
                if (this.tempstarAttrBuilder_ == null) {
                    ensureTempstarAttrIsMutable();
                    this.tempstarAttr_.add(builderForValue.build());
                    onChanged();
                } else {
                    this.tempstarAttrBuilder_.addMessage((GeneratedMessage) builderForValue.build());
                }
                return this;
            }

            public Builder addTempstarAttr(int index, Common.AttributeBase.Builder builderForValue) {
                if (this.tempstarAttrBuilder_ == null) {
                    ensureTempstarAttrIsMutable();
                    this.tempstarAttr_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    this.tempstarAttrBuilder_.addMessage(index, (GeneratedMessage) builderForValue.build());
                }
                return this;
            }

            public Builder addAllTempstarAttr(Iterable<? extends Common.AttributeBase> values) {
                if (this.tempstarAttrBuilder_ == null) {
                    ensureTempstarAttrIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.tempstarAttr_);
                    onChanged();
                } else {
                    this.tempstarAttrBuilder_.addAllMessages(values);
                }
                return this;
            }

            public Builder clearTempstarAttr() {
                if (this.tempstarAttrBuilder_ == null) {
                    this.tempstarAttr_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFF7FFFF;
                    onChanged();
                } else {
                    this.tempstarAttrBuilder_.clear();
                }
                return this;
            }

            public Builder removeTempstarAttr(int index) {
                if (this.tempstarAttrBuilder_ == null) {
                    ensureTempstarAttrIsMutable();
                    this.tempstarAttr_.remove(index);
                    onChanged();
                } else {
                    this.tempstarAttrBuilder_.remove(index);
                }
                return this;
            }

            public Common.AttributeBase.Builder getTempstarAttrBuilder(int index) {
                return (Common.AttributeBase.Builder) getTempstarAttrFieldBuilder().getBuilder(index);
            }

            public Common.AttributeBaseOrBuilder getTempstarAttrOrBuilder(int index) {
                if (this.tempstarAttrBuilder_ == null)
                    return (Common.AttributeBaseOrBuilder) this.tempstarAttr_.get(index);
                return (Common.AttributeBaseOrBuilder) this.tempstarAttrBuilder_.getMessageOrBuilder(index);
            }

            public List<? extends Common.AttributeBaseOrBuilder> getTempstarAttrOrBuilderList() {
                if (this.tempstarAttrBuilder_ != null)
                    return this.tempstarAttrBuilder_.getMessageOrBuilderList();
                return (List) Collections.unmodifiableList(this.tempstarAttr_);
            }

            public Common.AttributeBase.Builder addTempstarAttrBuilder() {
                return (Common.AttributeBase.Builder) getTempstarAttrFieldBuilder().addBuilder((GeneratedMessage) Common.AttributeBase.getDefaultInstance());
            }

            public Common.AttributeBase.Builder addTempstarAttrBuilder(int index) {
                return (Common.AttributeBase.Builder) getTempstarAttrFieldBuilder().addBuilder(index, (GeneratedMessage) Common.AttributeBase.getDefaultInstance());
            }

            public List<Common.AttributeBase.Builder> getTempstarAttrBuilderList() {
                return getTempstarAttrFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilder<Common.AttributeBase, Common.AttributeBase.Builder, Common.AttributeBaseOrBuilder> getTempstarAttrFieldBuilder() {
                if (this.tempstarAttrBuilder_ == null) {
                    this.tempstarAttrBuilder_ = new RepeatedFieldBuilder(this.tempstarAttr_, ((this.bitField0_ & 0x80000) == 524288), getParentForChildren(), isClean());
                    this.tempstarAttr_ = null;
                }
                return this.tempstarAttrBuilder_;
            }

            public boolean hasSeniorTempRemakeScore() {
                return ((this.bitField0_ & 0x100000) == 1048576);
            }

            public int getSeniorTempRemakeScore() {
                return this.seniorTempRemakeScore_;
            }

            public Builder setSeniorTempRemakeScore(int value) {
                this.bitField0_ |= 0x100000;
                this.seniorTempRemakeScore_ = value;
                onChanged();
                return this;
            }

            public Builder clearSeniorTempRemakeScore() {
                this.bitField0_ &= 0xFFEFFFFF;
                this.seniorTempRemakeScore_ = 0;
                onChanged();
                return this;
            }
        }
    }

    public static final class EarItemDetail extends GeneratedMessage implements EarItemDetailOrBuilder {
        private static final EarItemDetail defaultInstance = new EarItemDetail(true);
        private final UnknownFieldSet unknownFields;

        private EarItemDetail(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private EarItemDetail(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static EarItemDetail getDefaultInstance() {
            return defaultInstance;
        }

        public EarItemDetail getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private EarItemDetail(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    ByteString bs;
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 10:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x1;
                            this.id_ = bs;
                            break;
                        case 18:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x2;
                            this.ownId_ = bs;
                            break;
                        case 26:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x4;
                            this.ownName_ = bs;
                            break;
                        case 34:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x8;
                            this.time_ = bs;
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ItemOuterClass.internal_static_pomelo_item_EarItemDetail_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return ItemOuterClass.internal_static_pomelo_item_EarItemDetail_fieldAccessorTable.ensureFieldAccessorsInitialized(EarItemDetail.class, Builder.class);
        }

        public static Parser<EarItemDetail> PARSER = (Parser<EarItemDetail>) new AbstractParser<EarItemDetail>() {
            public ItemOuterClass.EarItemDetail parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new ItemOuterClass.EarItemDetail(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int ID_FIELD_NUMBER = 1;
        private Object id_;
        public static final int OWNID_FIELD_NUMBER = 2;
        private Object ownId_;
        public static final int OWNNAME_FIELD_NUMBER = 3;
        private Object ownName_;
        public static final int TIME_FIELD_NUMBER = 4;
        private Object time_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<EarItemDetail> getParserForType() {
            return PARSER;
        }

        public boolean hasId() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public String getId() {
            Object ref = this.id_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.id_ = s;
            return s;
        }

        public ByteString getIdBytes() {
            Object ref = this.id_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.id_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public boolean hasOwnId() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        public String getOwnId() {
            Object ref = this.ownId_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.ownId_ = s;
            return s;
        }

        public ByteString getOwnIdBytes() {
            Object ref = this.ownId_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.ownId_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public boolean hasOwnName() {
            return ((this.bitField0_ & 0x4) == 4);
        }

        public String getOwnName() {
            Object ref = this.ownName_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.ownName_ = s;
            return s;
        }

        public ByteString getOwnNameBytes() {
            Object ref = this.ownName_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.ownName_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public boolean hasTime() {
            return ((this.bitField0_ & 0x8) == 8);
        }

        public String getTime() {
            Object ref = this.time_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.time_ = s;
            return s;
        }

        public ByteString getTimeBytes() {
            Object ref = this.time_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.time_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        private void initFields() {
            this.id_ = "";
            this.ownId_ = "";
            this.ownName_ = "";
            this.time_ = "";
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) output.writeBytes(1, getIdBytes());
            if ((this.bitField0_ & 0x2) == 2) output.writeBytes(2, getOwnIdBytes());
            if ((this.bitField0_ & 0x4) == 4) output.writeBytes(3, getOwnNameBytes());
            if ((this.bitField0_ & 0x8) == 8) output.writeBytes(4, getTimeBytes());
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) size += CodedOutputStream.computeBytesSize(1, getIdBytes());
            if ((this.bitField0_ & 0x2) == 2) size += CodedOutputStream.computeBytesSize(2, getOwnIdBytes());
            if ((this.bitField0_ & 0x4) == 4) size += CodedOutputStream.computeBytesSize(3, getOwnNameBytes());
            if ((this.bitField0_ & 0x8) == 8) size += CodedOutputStream.computeBytesSize(4, getTimeBytes());
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static EarItemDetail parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (EarItemDetail) PARSER.parseFrom(data);
        }

        public static EarItemDetail parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (EarItemDetail) PARSER.parseFrom(data, extensionRegistry);
        }

        public static EarItemDetail parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (EarItemDetail) PARSER.parseFrom(data);
        }

        public static EarItemDetail parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (EarItemDetail) PARSER.parseFrom(data, extensionRegistry);
        }

        public static EarItemDetail parseFrom(InputStream input) throws IOException {
            return (EarItemDetail) PARSER.parseFrom(input);
        }

        public static EarItemDetail parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (EarItemDetail) PARSER.parseFrom(input, extensionRegistry);
        }

        public static EarItemDetail parseDelimitedFrom(InputStream input) throws IOException {
            return (EarItemDetail) PARSER.parseDelimitedFrom(input);
        }

        public static EarItemDetail parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (EarItemDetail) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static EarItemDetail parseFrom(CodedInputStream input) throws IOException {
            return (EarItemDetail) PARSER.parseFrom(input);
        }

        public static EarItemDetail parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (EarItemDetail) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(EarItemDetail prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements ItemOuterClass.EarItemDetailOrBuilder {
            private int bitField0_;
            private Object id_;
            private Object ownId_;
            private Object ownName_;
            private Object time_;

            public static final Descriptors.Descriptor getDescriptor() {
                return ItemOuterClass.internal_static_pomelo_item_EarItemDetail_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return ItemOuterClass.internal_static_pomelo_item_EarItemDetail_fieldAccessorTable.ensureFieldAccessorsInitialized(ItemOuterClass.EarItemDetail.class, Builder.class);
            }

            private Builder() {
                this.id_ = "";
                this.ownId_ = "";
                this.ownName_ = "";
                this.time_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.id_ = "";
                this.ownId_ = "";
                this.ownName_ = "";
                this.time_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (ItemOuterClass.EarItemDetail.alwaysUseFieldBuilders) ;
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.id_ = "";
                this.bitField0_ &= 0xFFFFFFFE;
                this.ownId_ = "";
                this.bitField0_ &= 0xFFFFFFFD;
                this.ownName_ = "";
                this.bitField0_ &= 0xFFFFFFFB;
                this.time_ = "";
                this.bitField0_ &= 0xFFFFFFF7;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return ItemOuterClass.internal_static_pomelo_item_EarItemDetail_descriptor;
            }

            public ItemOuterClass.EarItemDetail getDefaultInstanceForType() {
                return ItemOuterClass.EarItemDetail.getDefaultInstance();
            }

            public ItemOuterClass.EarItemDetail build() {
                ItemOuterClass.EarItemDetail result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public ItemOuterClass.EarItemDetail buildPartial() {
                ItemOuterClass.EarItemDetail result = new ItemOuterClass.EarItemDetail(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.id_ = this.id_;
                if ((from_bitField0_ & 0x2) == 2) to_bitField0_ |= 0x2;
                result.ownId_ = this.ownId_;
                if ((from_bitField0_ & 0x4) == 4) to_bitField0_ |= 0x4;
                result.ownName_ = this.ownName_;
                if ((from_bitField0_ & 0x8) == 8) to_bitField0_ |= 0x8;
                result.time_ = this.time_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof ItemOuterClass.EarItemDetail)
                    return mergeFrom((ItemOuterClass.EarItemDetail) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(ItemOuterClass.EarItemDetail other) {
                if (other == ItemOuterClass.EarItemDetail.getDefaultInstance()) return this;
                if (other.hasId()) {
                    this.bitField0_ |= 0x1;
                    this.id_ = other.id_;
                    onChanged();
                }
                if (other.hasOwnId()) {
                    this.bitField0_ |= 0x2;
                    this.ownId_ = other.ownId_;
                    onChanged();
                }
                if (other.hasOwnName()) {
                    this.bitField0_ |= 0x4;
                    this.ownName_ = other.ownName_;
                    onChanged();
                }
                if (other.hasTime()) {
                    this.bitField0_ |= 0x8;
                    this.time_ = other.time_;
                    onChanged();
                }
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                ItemOuterClass.EarItemDetail parsedMessage = null;
                try {
                    parsedMessage = (ItemOuterClass.EarItemDetail) ItemOuterClass.EarItemDetail.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ItemOuterClass.EarItemDetail) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasId() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public String getId() {
                Object ref = this.id_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) this.id_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getIdBytes() {
                Object ref = this.id_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.id_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setId(String value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x1;
                this.id_ = value;
                onChanged();
                return this;
            }

            public Builder clearId() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.id_ = ItemOuterClass.EarItemDetail.getDefaultInstance().getId();
                onChanged();
                return this;
            }

            public Builder setIdBytes(ByteString value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x1;
                this.id_ = value;
                onChanged();
                return this;
            }

            public boolean hasOwnId() {
                return ((this.bitField0_ & 0x2) == 2);
            }

            public String getOwnId() {
                Object ref = this.ownId_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) this.ownId_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getOwnIdBytes() {
                Object ref = this.ownId_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.ownId_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setOwnId(String value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.ownId_ = value;
                onChanged();
                return this;
            }

            public Builder clearOwnId() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.ownId_ = ItemOuterClass.EarItemDetail.getDefaultInstance().getOwnId();
                onChanged();
                return this;
            }

            public Builder setOwnIdBytes(ByteString value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.ownId_ = value;
                onChanged();
                return this;
            }

            public boolean hasOwnName() {
                return ((this.bitField0_ & 0x4) == 4);
            }

            public String getOwnName() {
                Object ref = this.ownName_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) this.ownName_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getOwnNameBytes() {
                Object ref = this.ownName_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.ownName_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setOwnName(String value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x4;
                this.ownName_ = value;
                onChanged();
                return this;
            }

            public Builder clearOwnName() {
                this.bitField0_ &= 0xFFFFFFFB;
                this.ownName_ = ItemOuterClass.EarItemDetail.getDefaultInstance().getOwnName();
                onChanged();
                return this;
            }

            public Builder setOwnNameBytes(ByteString value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x4;
                this.ownName_ = value;
                onChanged();
                return this;
            }

            public boolean hasTime() {
                return ((this.bitField0_ & 0x8) == 8);
            }

            public String getTime() {
                Object ref = this.time_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) this.time_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getTimeBytes() {
                Object ref = this.time_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.time_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setTime(String value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x8;
                this.time_ = value;
                onChanged();
                return this;
            }

            public Builder clearTime() {
                this.bitField0_ &= 0xFFFFFFF7;
                this.time_ = ItemOuterClass.EarItemDetail.getDefaultInstance().getTime();
                onChanged();
                return this;
            }

            public Builder setTimeBytes(ByteString value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x8;
                this.time_ = value;
                onChanged();
                return this;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class ItemDetail
            extends GeneratedMessage
            implements ItemDetailOrBuilder {
        private static final ItemDetail defaultInstance = new ItemDetail(true);
        private final UnknownFieldSet unknownFields;

        private ItemDetail(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private ItemDetail(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static ItemDetail getDefaultInstance() {
            return defaultInstance;
        }

        public ItemDetail getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private ItemDetail(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    ByteString bs;
                    ItemOuterClass.EquipmentDetail.Builder builder;
                    ItemOuterClass.EarItemDetail.Builder subBuilder;
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 10:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x1;
                            this.id_ = bs;
                            break;
                        case 18:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x2;
                            this.code_ = bs;
                            break;
                        case 24:
                            this.bitField0_ |= 0x4;
                            this.bindType_ = input.readInt32();
                            break;
                        case 32:
                            this.bitField0_ |= 0x8;
                            this.canTrade_ = input.readInt32();
                            break;
                        case 40:
                            this.bitField0_ |= 0x10;
                            this.canAuction_ = input.readInt32();
                            break;
                        case 48:
                            this.bitField0_ |= 0x20;
                            this.canDepotRole_ = input.readInt32();
                            break;
                        case 56:
                            this.bitField0_ |= 0x40;
                            this.canDepotGuild_ = input.readInt32();
                            break;
                        case 66:
                            builder = null;
                            if ((this.bitField0_ & 0x80) == 128) builder = this.equipDetail_.toBuilder();
                            this.equipDetail_ = (ItemOuterClass.EquipmentDetail) input.readMessage(ItemOuterClass.EquipmentDetail.PARSER, extensionRegistry);
                            if (builder != null) {
                                builder.mergeFrom(this.equipDetail_);
                                this.equipDetail_ = builder.buildPartial();
                            }
                            this.bitField0_ |= 0x80;
                            break;
                        case 74:
                            subBuilder = null;
                            if ((this.bitField0_ & 0x100) == 256) subBuilder = this.earDetail_.toBuilder();
                            this.earDetail_ = (ItemOuterClass.EarItemDetail) input.readMessage(ItemOuterClass.EarItemDetail.PARSER, extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.earDetail_);
                                this.earDetail_ = subBuilder.buildPartial();
                            }
                            this.bitField0_ |= 0x100;
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ItemOuterClass.internal_static_pomelo_item_ItemDetail_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return ItemOuterClass.internal_static_pomelo_item_ItemDetail_fieldAccessorTable.ensureFieldAccessorsInitialized(ItemDetail.class, Builder.class);
        }

        public static Parser<ItemDetail> PARSER = (Parser<ItemDetail>) new AbstractParser<ItemDetail>() {
            public ItemOuterClass.ItemDetail parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new ItemOuterClass.ItemDetail(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int ID_FIELD_NUMBER = 1;
        private Object id_;
        public static final int CODE_FIELD_NUMBER = 2;
        private Object code_;
        public static final int BINDTYPE_FIELD_NUMBER = 3;
        private int bindType_;
        public static final int CANTRADE_FIELD_NUMBER = 4;
        private int canTrade_;
        public static final int CANAUCTION_FIELD_NUMBER = 5;
        private int canAuction_;
        public static final int CANDEPOTROLE_FIELD_NUMBER = 6;
        private int canDepotRole_;
        public static final int CANDEPOTGUILD_FIELD_NUMBER = 7;
        private int canDepotGuild_;
        public static final int EQUIPDETAIL_FIELD_NUMBER = 8;
        private ItemOuterClass.EquipmentDetail equipDetail_;
        public static final int EARDETAIL_FIELD_NUMBER = 9;
        private ItemOuterClass.EarItemDetail earDetail_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<ItemDetail> getParserForType() {
            return PARSER;
        }

        public boolean hasId() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public String getId() {
            Object ref = this.id_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.id_ = s;
            return s;
        }

        public ByteString getIdBytes() {
            Object ref = this.id_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.id_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public boolean hasCode() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        public String getCode() {
            Object ref = this.code_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.code_ = s;
            return s;
        }

        public ByteString getCodeBytes() {
            Object ref = this.code_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.code_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public boolean hasBindType() {
            return ((this.bitField0_ & 0x4) == 4);
        }

        public int getBindType() {
            return this.bindType_;
        }

        public boolean hasCanTrade() {
            return ((this.bitField0_ & 0x8) == 8);
        }

        public int getCanTrade() {
            return this.canTrade_;
        }

        public boolean hasCanAuction() {
            return ((this.bitField0_ & 0x10) == 16);
        }

        public int getCanAuction() {
            return this.canAuction_;
        }

        public boolean hasCanDepotRole() {
            return ((this.bitField0_ & 0x20) == 32);
        }

        public int getCanDepotRole() {
            return this.canDepotRole_;
        }

        public boolean hasCanDepotGuild() {
            return ((this.bitField0_ & 0x40) == 64);
        }

        public int getCanDepotGuild() {
            return this.canDepotGuild_;
        }

        public boolean hasEquipDetail() {
            return ((this.bitField0_ & 0x80) == 128);
        }

        public ItemOuterClass.EquipmentDetail getEquipDetail() {
            return this.equipDetail_;
        }

        public ItemOuterClass.EquipmentDetailOrBuilder getEquipDetailOrBuilder() {
            return this.equipDetail_;
        }

        public boolean hasEarDetail() {
            return ((this.bitField0_ & 0x100) == 256);
        }

        public ItemOuterClass.EarItemDetail getEarDetail() {
            return this.earDetail_;
        }

        public ItemOuterClass.EarItemDetailOrBuilder getEarDetailOrBuilder() {
            return this.earDetail_;
        }

        private void initFields() {
            this.id_ = "";
            this.code_ = "";
            this.bindType_ = 0;
            this.canTrade_ = 0;
            this.canAuction_ = 0;
            this.canDepotRole_ = 0;
            this.canDepotGuild_ = 0;
            this.equipDetail_ = ItemOuterClass.EquipmentDetail.getDefaultInstance();
            this.earDetail_ = ItemOuterClass.EarItemDetail.getDefaultInstance();
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            if (hasEquipDetail() && !getEquipDetail().isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) output.writeBytes(1, getIdBytes());
            if ((this.bitField0_ & 0x2) == 2) output.writeBytes(2, getCodeBytes());
            if ((this.bitField0_ & 0x4) == 4) output.writeInt32(3, this.bindType_);
            if ((this.bitField0_ & 0x8) == 8) output.writeInt32(4, this.canTrade_);
            if ((this.bitField0_ & 0x10) == 16) output.writeInt32(5, this.canAuction_);
            if ((this.bitField0_ & 0x20) == 32) output.writeInt32(6, this.canDepotRole_);
            if ((this.bitField0_ & 0x40) == 64) output.writeInt32(7, this.canDepotGuild_);
            if ((this.bitField0_ & 0x80) == 128) output.writeMessage(8, (MessageLite) this.equipDetail_);
            if ((this.bitField0_ & 0x100) == 256) output.writeMessage(9, (MessageLite) this.earDetail_);
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) size += CodedOutputStream.computeBytesSize(1, getIdBytes());
            if ((this.bitField0_ & 0x2) == 2) size += CodedOutputStream.computeBytesSize(2, getCodeBytes());
            if ((this.bitField0_ & 0x4) == 4) size += CodedOutputStream.computeInt32Size(3, this.bindType_);
            if ((this.bitField0_ & 0x8) == 8) size += CodedOutputStream.computeInt32Size(4, this.canTrade_);
            if ((this.bitField0_ & 0x10) == 16) size += CodedOutputStream.computeInt32Size(5, this.canAuction_);
            if ((this.bitField0_ & 0x20) == 32) size += CodedOutputStream.computeInt32Size(6, this.canDepotRole_);
            if ((this.bitField0_ & 0x40) == 64) size += CodedOutputStream.computeInt32Size(7, this.canDepotGuild_);
            if ((this.bitField0_ & 0x80) == 128)
                size += CodedOutputStream.computeMessageSize(8, (MessageLite) this.equipDetail_);
            if ((this.bitField0_ & 0x100) == 256)
                size += CodedOutputStream.computeMessageSize(9, (MessageLite) this.earDetail_);
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static ItemDetail parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (ItemDetail) PARSER.parseFrom(data);
        }

        public static ItemDetail parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ItemDetail) PARSER.parseFrom(data, extensionRegistry);
        }

        public static ItemDetail parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (ItemDetail) PARSER.parseFrom(data);
        }

        public static ItemDetail parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ItemDetail) PARSER.parseFrom(data, extensionRegistry);
        }

        public static ItemDetail parseFrom(InputStream input) throws IOException {
            return (ItemDetail) PARSER.parseFrom(input);
        }

        public static ItemDetail parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ItemDetail) PARSER.parseFrom(input, extensionRegistry);
        }

        public static ItemDetail parseDelimitedFrom(InputStream input) throws IOException {
            return (ItemDetail) PARSER.parseDelimitedFrom(input);
        }

        public static ItemDetail parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ItemDetail) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static ItemDetail parseFrom(CodedInputStream input) throws IOException {
            return (ItemDetail) PARSER.parseFrom(input);
        }

        public static ItemDetail parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ItemDetail) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(ItemDetail prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements ItemOuterClass.ItemDetailOrBuilder {
            private int bitField0_;
            private Object id_;
            private Object code_;
            private int bindType_;
            private int canTrade_;
            private int canAuction_;
            private int canDepotRole_;
            private int canDepotGuild_;
            private ItemOuterClass.EquipmentDetail equipDetail_;
            private SingleFieldBuilder<ItemOuterClass.EquipmentDetail, ItemOuterClass.EquipmentDetail.Builder, ItemOuterClass.EquipmentDetailOrBuilder> equipDetailBuilder_;
            private ItemOuterClass.EarItemDetail earDetail_;
            private SingleFieldBuilder<ItemOuterClass.EarItemDetail, ItemOuterClass.EarItemDetail.Builder, ItemOuterClass.EarItemDetailOrBuilder> earDetailBuilder_;

            public static final Descriptors.Descriptor getDescriptor() {
                return ItemOuterClass.internal_static_pomelo_item_ItemDetail_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return ItemOuterClass.internal_static_pomelo_item_ItemDetail_fieldAccessorTable.ensureFieldAccessorsInitialized(ItemOuterClass.ItemDetail.class, Builder.class);
            }

            private Builder() {
                this.id_ = "";
                this.code_ = "";
                this.equipDetail_ = ItemOuterClass.EquipmentDetail.getDefaultInstance();
                this.earDetail_ = ItemOuterClass.EarItemDetail.getDefaultInstance();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.id_ = "";
                this.code_ = "";
                this.equipDetail_ = ItemOuterClass.EquipmentDetail.getDefaultInstance();
                this.earDetail_ = ItemOuterClass.EarItemDetail.getDefaultInstance();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (ItemOuterClass.ItemDetail.alwaysUseFieldBuilders) {
                    getEquipDetailFieldBuilder();
                    getEarDetailFieldBuilder();
                }
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.id_ = "";
                this.bitField0_ &= 0xFFFFFFFE;
                this.code_ = "";
                this.bitField0_ &= 0xFFFFFFFD;
                this.bindType_ = 0;
                this.bitField0_ &= 0xFFFFFFFB;
                this.canTrade_ = 0;
                this.bitField0_ &= 0xFFFFFFF7;
                this.canAuction_ = 0;
                this.bitField0_ &= 0xFFFFFFEF;
                this.canDepotRole_ = 0;
                this.bitField0_ &= 0xFFFFFFDF;
                this.canDepotGuild_ = 0;
                this.bitField0_ &= 0xFFFFFFBF;
                if (this.equipDetailBuilder_ == null) {
                    this.equipDetail_ = ItemOuterClass.EquipmentDetail.getDefaultInstance();
                } else {
                    this.equipDetailBuilder_.clear();
                }
                this.bitField0_ &= 0xFFFFFF7F;
                if (this.earDetailBuilder_ == null) {
                    this.earDetail_ = ItemOuterClass.EarItemDetail.getDefaultInstance();
                } else {
                    this.earDetailBuilder_.clear();
                }
                this.bitField0_ &= 0xFFFFFEFF;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return ItemOuterClass.internal_static_pomelo_item_ItemDetail_descriptor;
            }

            public ItemOuterClass.ItemDetail getDefaultInstanceForType() {
                return ItemOuterClass.ItemDetail.getDefaultInstance();
            }

            public ItemOuterClass.ItemDetail build() {
                ItemOuterClass.ItemDetail result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public ItemOuterClass.ItemDetail buildPartial() {
                ItemOuterClass.ItemDetail result = new ItemOuterClass.ItemDetail(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.id_ = this.id_;
                if ((from_bitField0_ & 0x2) == 2) to_bitField0_ |= 0x2;
                result.code_ = this.code_;
                if ((from_bitField0_ & 0x4) == 4) to_bitField0_ |= 0x4;
                result.bindType_ = this.bindType_;
                if ((from_bitField0_ & 0x8) == 8) to_bitField0_ |= 0x8;
                result.canTrade_ = this.canTrade_;
                if ((from_bitField0_ & 0x10) == 16) to_bitField0_ |= 0x10;
                result.canAuction_ = this.canAuction_;
                if ((from_bitField0_ & 0x20) == 32) to_bitField0_ |= 0x20;
                result.canDepotRole_ = this.canDepotRole_;
                if ((from_bitField0_ & 0x40) == 64) to_bitField0_ |= 0x40;
                result.canDepotGuild_ = this.canDepotGuild_;
                if ((from_bitField0_ & 0x80) == 128) to_bitField0_ |= 0x80;
                if (this.equipDetailBuilder_ == null) {
                    result.equipDetail_ = this.equipDetail_;
                } else {
                    result.equipDetail_ = (ItemOuterClass.EquipmentDetail) this.equipDetailBuilder_.build();
                }
                if ((from_bitField0_ & 0x100) == 256) to_bitField0_ |= 0x100;
                if (this.earDetailBuilder_ == null) {
                    result.earDetail_ = this.earDetail_;
                } else {
                    result.earDetail_ = (ItemOuterClass.EarItemDetail) this.earDetailBuilder_.build();
                }
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof ItemOuterClass.ItemDetail) return mergeFrom((ItemOuterClass.ItemDetail) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(ItemOuterClass.ItemDetail other) {
                if (other == ItemOuterClass.ItemDetail.getDefaultInstance()) return this;
                if (other.hasId()) {
                    this.bitField0_ |= 0x1;
                    this.id_ = other.id_;
                    onChanged();
                }
                if (other.hasCode()) {
                    this.bitField0_ |= 0x2;
                    this.code_ = other.code_;
                    onChanged();
                }
                if (other.hasBindType()) setBindType(other.getBindType());
                if (other.hasCanTrade()) setCanTrade(other.getCanTrade());
                if (other.hasCanAuction()) setCanAuction(other.getCanAuction());
                if (other.hasCanDepotRole()) setCanDepotRole(other.getCanDepotRole());
                if (other.hasCanDepotGuild()) setCanDepotGuild(other.getCanDepotGuild());
                if (other.hasEquipDetail()) mergeEquipDetail(other.getEquipDetail());
                if (other.hasEarDetail()) mergeEarDetail(other.getEarDetail());
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (hasEquipDetail() && !getEquipDetail().isInitialized()) return false;
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                ItemOuterClass.ItemDetail parsedMessage = null;
                try {
                    parsedMessage = (ItemOuterClass.ItemDetail) ItemOuterClass.ItemDetail.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ItemOuterClass.ItemDetail) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasId() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public String getId() {
                Object ref = this.id_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) this.id_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getIdBytes() {
                Object ref = this.id_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.id_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setId(String value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x1;
                this.id_ = value;
                onChanged();
                return this;
            }

            public Builder clearId() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.id_ = ItemOuterClass.ItemDetail.getDefaultInstance().getId();
                onChanged();
                return this;
            }

            public Builder setIdBytes(ByteString value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x1;
                this.id_ = value;
                onChanged();
                return this;
            }

            public boolean hasCode() {
                return ((this.bitField0_ & 0x2) == 2);
            }

            public String getCode() {
                Object ref = this.code_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) this.code_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getCodeBytes() {
                Object ref = this.code_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.code_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setCode(String value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.code_ = value;
                onChanged();
                return this;
            }

            public Builder clearCode() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.code_ = ItemOuterClass.ItemDetail.getDefaultInstance().getCode();
                onChanged();
                return this;
            }

            public Builder setCodeBytes(ByteString value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.code_ = value;
                onChanged();
                return this;
            }

            public boolean hasBindType() {
                return ((this.bitField0_ & 0x4) == 4);
            }

            public int getBindType() {
                return this.bindType_;
            }

            public Builder setBindType(int value) {
                this.bitField0_ |= 0x4;
                this.bindType_ = value;
                onChanged();
                return this;
            }

            public Builder clearBindType() {
                this.bitField0_ &= 0xFFFFFFFB;
                this.bindType_ = 0;
                onChanged();
                return this;
            }

            public boolean hasCanTrade() {
                return ((this.bitField0_ & 0x8) == 8);
            }

            public int getCanTrade() {
                return this.canTrade_;
            }

            public Builder setCanTrade(int value) {
                this.bitField0_ |= 0x8;
                this.canTrade_ = value;
                onChanged();
                return this;
            }

            public Builder clearCanTrade() {
                this.bitField0_ &= 0xFFFFFFF7;
                this.canTrade_ = 0;
                onChanged();
                return this;
            }

            public boolean hasCanAuction() {
                return ((this.bitField0_ & 0x10) == 16);
            }

            public int getCanAuction() {
                return this.canAuction_;
            }

            public Builder setCanAuction(int value) {
                this.bitField0_ |= 0x10;
                this.canAuction_ = value;
                onChanged();
                return this;
            }

            public Builder clearCanAuction() {
                this.bitField0_ &= 0xFFFFFFEF;
                this.canAuction_ = 0;
                onChanged();
                return this;
            }

            public boolean hasCanDepotRole() {
                return ((this.bitField0_ & 0x20) == 32);
            }

            public int getCanDepotRole() {
                return this.canDepotRole_;
            }

            public Builder setCanDepotRole(int value) {
                this.bitField0_ |= 0x20;
                this.canDepotRole_ = value;
                onChanged();
                return this;
            }

            public Builder clearCanDepotRole() {
                this.bitField0_ &= 0xFFFFFFDF;
                this.canDepotRole_ = 0;
                onChanged();
                return this;
            }

            public boolean hasCanDepotGuild() {
                return ((this.bitField0_ & 0x40) == 64);
            }

            public int getCanDepotGuild() {
                return this.canDepotGuild_;
            }

            public Builder setCanDepotGuild(int value) {
                this.bitField0_ |= 0x40;
                this.canDepotGuild_ = value;
                onChanged();
                return this;
            }

            public Builder clearCanDepotGuild() {
                this.bitField0_ &= 0xFFFFFFBF;
                this.canDepotGuild_ = 0;
                onChanged();
                return this;
            }

            public boolean hasEquipDetail() {
                return ((this.bitField0_ & 0x80) == 128);
            }

            public ItemOuterClass.EquipmentDetail getEquipDetail() {
                if (this.equipDetailBuilder_ == null) return this.equipDetail_;
                return (ItemOuterClass.EquipmentDetail) this.equipDetailBuilder_.getMessage();
            }

            public Builder setEquipDetail(ItemOuterClass.EquipmentDetail value) {
                if (this.equipDetailBuilder_ == null) {
                    if (value == null) throw new NullPointerException();
                    this.equipDetail_ = value;
                    onChanged();
                } else {
                    this.equipDetailBuilder_.setMessage(value);
                }
                this.bitField0_ |= 0x80;
                return this;
            }

            public Builder setEquipDetail(ItemOuterClass.EquipmentDetail.Builder builderForValue) {
                if (this.equipDetailBuilder_ == null) {
                    this.equipDetail_ = builderForValue.build();
                    onChanged();
                } else {
                    this.equipDetailBuilder_.setMessage(builderForValue.build());
                }
                this.bitField0_ |= 0x80;
                return this;
            }

            public Builder mergeEquipDetail(ItemOuterClass.EquipmentDetail value) {
                if (this.equipDetailBuilder_ == null) {
                    if ((this.bitField0_ & 0x80) == 128 && this.equipDetail_ != ItemOuterClass.EquipmentDetail.getDefaultInstance()) {
                        this.equipDetail_ = ItemOuterClass.EquipmentDetail.newBuilder(this.equipDetail_).mergeFrom(value).buildPartial();
                    } else {
                        this.equipDetail_ = value;
                    }
                    onChanged();
                } else {
                    this.equipDetailBuilder_.mergeFrom(value);
                }
                this.bitField0_ |= 0x80;
                return this;
            }

            public Builder clearEquipDetail() {
                if (this.equipDetailBuilder_ == null) {
                    this.equipDetail_ = ItemOuterClass.EquipmentDetail.getDefaultInstance();
                    onChanged();
                } else {
                    this.equipDetailBuilder_.clear();
                }
                this.bitField0_ &= 0xFFFFFF7F;
                return this;
            }

            public ItemOuterClass.EquipmentDetail.Builder getEquipDetailBuilder() {
                this.bitField0_ |= 0x80;
                onChanged();
                return (ItemOuterClass.EquipmentDetail.Builder) getEquipDetailFieldBuilder().getBuilder();
            }

            public ItemOuterClass.EquipmentDetailOrBuilder getEquipDetailOrBuilder() {
                if (this.equipDetailBuilder_ != null)
                    return (ItemOuterClass.EquipmentDetailOrBuilder) this.equipDetailBuilder_.getMessageOrBuilder();
                return this.equipDetail_;
            }

            private SingleFieldBuilder<ItemOuterClass.EquipmentDetail, ItemOuterClass.EquipmentDetail.Builder, ItemOuterClass.EquipmentDetailOrBuilder> getEquipDetailFieldBuilder() {
                if (this.equipDetailBuilder_ == null) {
                    this.equipDetailBuilder_ = new SingleFieldBuilder(getEquipDetail(), getParentForChildren(), isClean());
                    this.equipDetail_ = null;
                }
                return this.equipDetailBuilder_;
            }

            public boolean hasEarDetail() {
                return ((this.bitField0_ & 0x100) == 256);
            }

            public ItemOuterClass.EarItemDetail getEarDetail() {
                if (this.earDetailBuilder_ == null) return this.earDetail_;
                return (ItemOuterClass.EarItemDetail) this.earDetailBuilder_.getMessage();
            }

            public Builder setEarDetail(ItemOuterClass.EarItemDetail value) {
                if (this.earDetailBuilder_ == null) {
                    if (value == null) throw new NullPointerException();
                    this.earDetail_ = value;
                    onChanged();
                } else {
                    this.earDetailBuilder_.setMessage(value);
                }
                this.bitField0_ |= 0x100;
                return this;
            }

            public Builder setEarDetail(ItemOuterClass.EarItemDetail.Builder builderForValue) {
                if (this.earDetailBuilder_ == null) {
                    this.earDetail_ = builderForValue.build();
                    onChanged();
                } else {
                    this.earDetailBuilder_.setMessage(builderForValue.build());
                }
                this.bitField0_ |= 0x100;
                return this;
            }

            public Builder mergeEarDetail(ItemOuterClass.EarItemDetail value) {
                if (this.earDetailBuilder_ == null) {
                    if ((this.bitField0_ & 0x100) == 256 && this.earDetail_ != ItemOuterClass.EarItemDetail.getDefaultInstance()) {
                        this.earDetail_ = ItemOuterClass.EarItemDetail.newBuilder(this.earDetail_).mergeFrom(value).buildPartial();
                    } else {
                        this.earDetail_ = value;
                    }
                    onChanged();
                } else {
                    this.earDetailBuilder_.mergeFrom(value);
                }
                this.bitField0_ |= 0x100;
                return this;
            }

            public Builder clearEarDetail() {
                if (this.earDetailBuilder_ == null) {
                    this.earDetail_ = ItemOuterClass.EarItemDetail.getDefaultInstance();
                    onChanged();
                } else {
                    this.earDetailBuilder_.clear();
                }
                this.bitField0_ &= 0xFFFFFEFF;
                return this;
            }

            public ItemOuterClass.EarItemDetail.Builder getEarDetailBuilder() {
                this.bitField0_ |= 0x100;
                onChanged();
                return (ItemOuterClass.EarItemDetail.Builder) getEarDetailFieldBuilder().getBuilder();
            }

            public ItemOuterClass.EarItemDetailOrBuilder getEarDetailOrBuilder() {
                if (this.earDetailBuilder_ != null)
                    return (ItemOuterClass.EarItemDetailOrBuilder) this.earDetailBuilder_.getMessageOrBuilder();
                return this.earDetail_;
            }

            private SingleFieldBuilder<ItemOuterClass.EarItemDetail, ItemOuterClass.EarItemDetail.Builder, ItemOuterClass.EarItemDetailOrBuilder> getEarDetailFieldBuilder() {
                if (this.earDetailBuilder_ == null) {
                    this.earDetailBuilder_ = new SingleFieldBuilder(getEarDetail(), getParentForChildren(), isClean());
                    this.earDetail_ = null;
                }
                return this.earDetailBuilder_;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class ConsignmentItem
            extends GeneratedMessage
            implements ConsignmentItemOrBuilder {
        private static final ConsignmentItem defaultInstance = new ConsignmentItem(true);
        private final UnknownFieldSet unknownFields;

        private ConsignmentItem(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private ConsignmentItem(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static ConsignmentItem getDefaultInstance() {
            return defaultInstance;
        }

        public ConsignmentItem getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private ConsignmentItem(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    ItemOuterClass.ItemDetail.Builder subBuilder;
                    ByteString bs;
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 10:
                            subBuilder = null;
                            if ((this.bitField0_ & 0x1) == 1) subBuilder = this.detail_.toBuilder();
                            this.detail_ = (ItemOuterClass.ItemDetail) input.readMessage(ItemOuterClass.ItemDetail.PARSER, extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.detail_);
                                this.detail_ = subBuilder.buildPartial();
                            }
                            this.bitField0_ |= 0x1;
                            break;
                        case 16:
                            this.bitField0_ |= 0x2;
                            this.groupCount_ = input.readInt32();
                            break;
                        case 24:
                            this.bitField0_ |= 0x4;
                            this.publishTimes_ = input.readInt32();
                            break;
                        case 32:
                            this.bitField0_ |= 0x8;
                            this.consignmentPrice_ = input.readInt32();
                            break;
                        case 42:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x10;
                            this.consignmentTime_ = bs;
                            break;
                        case 50:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x20;
                            this.consignmentPlayerName_ = bs;
                            break;
                        case 56:
                            this.bitField0_ |= 0x40;
                            this.consignmentPlayerPro_ = input.readInt32();
                            break;
                        case 66:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x80;
                            this.consignmentPlayerId_ = bs;
                            break;
                        case 72:
                            this.bitField0_ |= 0x100;
                            this.lateTime_ = input.readInt64();
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ItemOuterClass.internal_static_pomelo_item_ConsignmentItem_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return ItemOuterClass.internal_static_pomelo_item_ConsignmentItem_fieldAccessorTable.ensureFieldAccessorsInitialized(ConsignmentItem.class, Builder.class);
        }

        public static Parser<ConsignmentItem> PARSER = (Parser<ConsignmentItem>) new AbstractParser<ConsignmentItem>() {
            public ItemOuterClass.ConsignmentItem parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new ItemOuterClass.ConsignmentItem(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int DETAIL_FIELD_NUMBER = 1;
        private ItemOuterClass.ItemDetail detail_;
        public static final int GROUPCOUNT_FIELD_NUMBER = 2;
        private int groupCount_;
        public static final int PUBLISHTIMES_FIELD_NUMBER = 3;
        private int publishTimes_;
        public static final int CONSIGNMENTPRICE_FIELD_NUMBER = 4;
        private int consignmentPrice_;
        public static final int CONSIGNMENTTIME_FIELD_NUMBER = 5;
        private Object consignmentTime_;
        public static final int CONSIGNMENTPLAYERNAME_FIELD_NUMBER = 6;
        private Object consignmentPlayerName_;
        public static final int CONSIGNMENTPLAYERPRO_FIELD_NUMBER = 7;
        private int consignmentPlayerPro_;
        public static final int CONSIGNMENTPLAYERID_FIELD_NUMBER = 8;
        private Object consignmentPlayerId_;
        public static final int LATETIME_FIELD_NUMBER = 9;
        private long lateTime_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<ConsignmentItem> getParserForType() {
            return PARSER;
        }

        public boolean hasDetail() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public ItemOuterClass.ItemDetail getDetail() {
            return this.detail_;
        }

        public ItemOuterClass.ItemDetailOrBuilder getDetailOrBuilder() {
            return this.detail_;
        }

        public boolean hasGroupCount() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        public int getGroupCount() {
            return this.groupCount_;
        }

        public boolean hasPublishTimes() {
            return ((this.bitField0_ & 0x4) == 4);
        }

        public int getPublishTimes() {
            return this.publishTimes_;
        }

        public boolean hasConsignmentPrice() {
            return ((this.bitField0_ & 0x8) == 8);
        }

        public int getConsignmentPrice() {
            return this.consignmentPrice_;
        }

        public boolean hasConsignmentTime() {
            return ((this.bitField0_ & 0x10) == 16);
        }

        public String getConsignmentTime() {
            Object ref = this.consignmentTime_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.consignmentTime_ = s;
            return s;
        }

        public ByteString getConsignmentTimeBytes() {
            Object ref = this.consignmentTime_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.consignmentTime_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public boolean hasConsignmentPlayerName() {
            return ((this.bitField0_ & 0x20) == 32);
        }

        public String getConsignmentPlayerName() {
            Object ref = this.consignmentPlayerName_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.consignmentPlayerName_ = s;
            return s;
        }

        public ByteString getConsignmentPlayerNameBytes() {
            Object ref = this.consignmentPlayerName_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.consignmentPlayerName_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public boolean hasConsignmentPlayerPro() {
            return ((this.bitField0_ & 0x40) == 64);
        }

        public int getConsignmentPlayerPro() {
            return this.consignmentPlayerPro_;
        }

        public boolean hasConsignmentPlayerId() {
            return ((this.bitField0_ & 0x80) == 128);
        }

        public String getConsignmentPlayerId() {
            Object ref = this.consignmentPlayerId_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.consignmentPlayerId_ = s;
            return s;
        }

        public ByteString getConsignmentPlayerIdBytes() {
            Object ref = this.consignmentPlayerId_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.consignmentPlayerId_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public boolean hasLateTime() {
            return ((this.bitField0_ & 0x100) == 256);
        }

        public long getLateTime() {
            return this.lateTime_;
        }

        private void initFields() {
            this.detail_ = ItemOuterClass.ItemDetail.getDefaultInstance();
            this.groupCount_ = 0;
            this.publishTimes_ = 0;
            this.consignmentPrice_ = 0;
            this.consignmentTime_ = "";
            this.consignmentPlayerName_ = "";
            this.consignmentPlayerPro_ = 0;
            this.consignmentPlayerId_ = "";
            this.lateTime_ = 0L;
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            if (hasDetail() && !getDetail().isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) output.writeMessage(1, (MessageLite) this.detail_);
            if ((this.bitField0_ & 0x2) == 2) output.writeInt32(2, this.groupCount_);
            if ((this.bitField0_ & 0x4) == 4) output.writeInt32(3, this.publishTimes_);
            if ((this.bitField0_ & 0x8) == 8) output.writeInt32(4, this.consignmentPrice_);
            if ((this.bitField0_ & 0x10) == 16) output.writeBytes(5, getConsignmentTimeBytes());
            if ((this.bitField0_ & 0x20) == 32) output.writeBytes(6, getConsignmentPlayerNameBytes());
            if ((this.bitField0_ & 0x40) == 64) output.writeInt32(7, this.consignmentPlayerPro_);
            if ((this.bitField0_ & 0x80) == 128) output.writeBytes(8, getConsignmentPlayerIdBytes());
            if ((this.bitField0_ & 0x100) == 256) output.writeInt64(9, this.lateTime_);
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1)
                size += CodedOutputStream.computeMessageSize(1, (MessageLite) this.detail_);
            if ((this.bitField0_ & 0x2) == 2) size += CodedOutputStream.computeInt32Size(2, this.groupCount_);
            if ((this.bitField0_ & 0x4) == 4) size += CodedOutputStream.computeInt32Size(3, this.publishTimes_);
            if ((this.bitField0_ & 0x8) == 8) size += CodedOutputStream.computeInt32Size(4, this.consignmentPrice_);
            if ((this.bitField0_ & 0x10) == 16)
                size += CodedOutputStream.computeBytesSize(5, getConsignmentTimeBytes());
            if ((this.bitField0_ & 0x20) == 32)
                size += CodedOutputStream.computeBytesSize(6, getConsignmentPlayerNameBytes());
            if ((this.bitField0_ & 0x40) == 64)
                size += CodedOutputStream.computeInt32Size(7, this.consignmentPlayerPro_);
            if ((this.bitField0_ & 0x80) == 128)
                size += CodedOutputStream.computeBytesSize(8, getConsignmentPlayerIdBytes());
            if ((this.bitField0_ & 0x100) == 256) size += CodedOutputStream.computeInt64Size(9, this.lateTime_);
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static ConsignmentItem parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (ConsignmentItem) PARSER.parseFrom(data);
        }

        public static ConsignmentItem parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ConsignmentItem) PARSER.parseFrom(data, extensionRegistry);
        }

        public static ConsignmentItem parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (ConsignmentItem) PARSER.parseFrom(data);
        }

        public static ConsignmentItem parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ConsignmentItem) PARSER.parseFrom(data, extensionRegistry);
        }

        public static ConsignmentItem parseFrom(InputStream input) throws IOException {
            return (ConsignmentItem) PARSER.parseFrom(input);
        }

        public static ConsignmentItem parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ConsignmentItem) PARSER.parseFrom(input, extensionRegistry);
        }

        public static ConsignmentItem parseDelimitedFrom(InputStream input) throws IOException {
            return (ConsignmentItem) PARSER.parseDelimitedFrom(input);
        }

        public static ConsignmentItem parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ConsignmentItem) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static ConsignmentItem parseFrom(CodedInputStream input) throws IOException {
            return (ConsignmentItem) PARSER.parseFrom(input);
        }

        public static ConsignmentItem parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ConsignmentItem) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(ConsignmentItem prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements ItemOuterClass.ConsignmentItemOrBuilder {
            private int bitField0_;
            private ItemOuterClass.ItemDetail detail_;
            private SingleFieldBuilder<ItemOuterClass.ItemDetail, ItemOuterClass.ItemDetail.Builder, ItemOuterClass.ItemDetailOrBuilder> detailBuilder_;
            private int groupCount_;
            private int publishTimes_;
            private int consignmentPrice_;
            private Object consignmentTime_;
            private Object consignmentPlayerName_;
            private int consignmentPlayerPro_;
            private Object consignmentPlayerId_;
            private long lateTime_;

            public static final Descriptors.Descriptor getDescriptor() {
                return ItemOuterClass.internal_static_pomelo_item_ConsignmentItem_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return ItemOuterClass.internal_static_pomelo_item_ConsignmentItem_fieldAccessorTable.ensureFieldAccessorsInitialized(ItemOuterClass.ConsignmentItem.class, Builder.class);
            }

            private Builder() {
                this.detail_ = ItemOuterClass.ItemDetail.getDefaultInstance();
                this.consignmentTime_ = "";
                this.consignmentPlayerName_ = "";
                this.consignmentPlayerId_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.detail_ = ItemOuterClass.ItemDetail.getDefaultInstance();
                this.consignmentTime_ = "";
                this.consignmentPlayerName_ = "";
                this.consignmentPlayerId_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (ItemOuterClass.ConsignmentItem.alwaysUseFieldBuilders) getDetailFieldBuilder();
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                if (this.detailBuilder_ == null) {
                    this.detail_ = ItemOuterClass.ItemDetail.getDefaultInstance();
                } else {
                    this.detailBuilder_.clear();
                }
                this.bitField0_ &= 0xFFFFFFFE;
                this.groupCount_ = 0;
                this.bitField0_ &= 0xFFFFFFFD;
                this.publishTimes_ = 0;
                this.bitField0_ &= 0xFFFFFFFB;
                this.consignmentPrice_ = 0;
                this.bitField0_ &= 0xFFFFFFF7;
                this.consignmentTime_ = "";
                this.bitField0_ &= 0xFFFFFFEF;
                this.consignmentPlayerName_ = "";
                this.bitField0_ &= 0xFFFFFFDF;
                this.consignmentPlayerPro_ = 0;
                this.bitField0_ &= 0xFFFFFFBF;
                this.consignmentPlayerId_ = "";
                this.bitField0_ &= 0xFFFFFF7F;
                this.lateTime_ = 0L;
                this.bitField0_ &= 0xFFFFFEFF;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return ItemOuterClass.internal_static_pomelo_item_ConsignmentItem_descriptor;
            }

            public ItemOuterClass.ConsignmentItem getDefaultInstanceForType() {
                return ItemOuterClass.ConsignmentItem.getDefaultInstance();
            }

            public ItemOuterClass.ConsignmentItem build() {
                ItemOuterClass.ConsignmentItem result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public ItemOuterClass.ConsignmentItem buildPartial() {
                ItemOuterClass.ConsignmentItem result = new ItemOuterClass.ConsignmentItem(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                if (this.detailBuilder_ == null) {
                    result.detail_ = this.detail_;
                } else {
                    result.detail_ = (ItemOuterClass.ItemDetail) this.detailBuilder_.build();
                }
                if ((from_bitField0_ & 0x2) == 2) to_bitField0_ |= 0x2;
                result.groupCount_ = this.groupCount_;
                if ((from_bitField0_ & 0x4) == 4) to_bitField0_ |= 0x4;
                result.publishTimes_ = this.publishTimes_;
                if ((from_bitField0_ & 0x8) == 8) to_bitField0_ |= 0x8;
                result.consignmentPrice_ = this.consignmentPrice_;
                if ((from_bitField0_ & 0x10) == 16) to_bitField0_ |= 0x10;
                result.consignmentTime_ = this.consignmentTime_;
                if ((from_bitField0_ & 0x20) == 32) to_bitField0_ |= 0x20;
                result.consignmentPlayerName_ = this.consignmentPlayerName_;
                if ((from_bitField0_ & 0x40) == 64) to_bitField0_ |= 0x40;
                result.consignmentPlayerPro_ = this.consignmentPlayerPro_;
                if ((from_bitField0_ & 0x80) == 128) to_bitField0_ |= 0x80;
                result.consignmentPlayerId_ = this.consignmentPlayerId_;
                if ((from_bitField0_ & 0x100) == 256) to_bitField0_ |= 0x100;
                result.lateTime_ = this.lateTime_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof ItemOuterClass.ConsignmentItem)
                    return mergeFrom((ItemOuterClass.ConsignmentItem) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(ItemOuterClass.ConsignmentItem other) {
                if (other == ItemOuterClass.ConsignmentItem.getDefaultInstance()) return this;
                if (other.hasDetail()) mergeDetail(other.getDetail());
                if (other.hasGroupCount()) setGroupCount(other.getGroupCount());
                if (other.hasPublishTimes()) setPublishTimes(other.getPublishTimes());
                if (other.hasConsignmentPrice()) setConsignmentPrice(other.getConsignmentPrice());
                if (other.hasConsignmentTime()) {
                    this.bitField0_ |= 0x10;
                    this.consignmentTime_ = other.consignmentTime_;
                    onChanged();
                }
                if (other.hasConsignmentPlayerName()) {
                    this.bitField0_ |= 0x20;
                    this.consignmentPlayerName_ = other.consignmentPlayerName_;
                    onChanged();
                }
                if (other.hasConsignmentPlayerPro()) setConsignmentPlayerPro(other.getConsignmentPlayerPro());
                if (other.hasConsignmentPlayerId()) {
                    this.bitField0_ |= 0x80;
                    this.consignmentPlayerId_ = other.consignmentPlayerId_;
                    onChanged();
                }
                if (other.hasLateTime()) setLateTime(other.getLateTime());
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (hasDetail() && !getDetail().isInitialized()) return false;
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                ItemOuterClass.ConsignmentItem parsedMessage = null;
                try {
                    parsedMessage = (ItemOuterClass.ConsignmentItem) ItemOuterClass.ConsignmentItem.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ItemOuterClass.ConsignmentItem) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasDetail() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public ItemOuterClass.ItemDetail getDetail() {
                if (this.detailBuilder_ == null) return this.detail_;
                return (ItemOuterClass.ItemDetail) this.detailBuilder_.getMessage();
            }

            public Builder setDetail(ItemOuterClass.ItemDetail value) {
                if (this.detailBuilder_ == null) {
                    if (value == null) throw new NullPointerException();
                    this.detail_ = value;
                    onChanged();
                } else {
                    this.detailBuilder_.setMessage(value);
                }
                this.bitField0_ |= 0x1;
                return this;
            }

            public Builder setDetail(ItemOuterClass.ItemDetail.Builder builderForValue) {
                if (this.detailBuilder_ == null) {
                    this.detail_ = builderForValue.build();
                    onChanged();
                } else {
                    this.detailBuilder_.setMessage(builderForValue.build());
                }
                this.bitField0_ |= 0x1;
                return this;
            }

            public Builder mergeDetail(ItemOuterClass.ItemDetail value) {
                if (this.detailBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) == 1 && this.detail_ != ItemOuterClass.ItemDetail.getDefaultInstance()) {
                        this.detail_ = ItemOuterClass.ItemDetail.newBuilder(this.detail_).mergeFrom(value).buildPartial();
                    } else {
                        this.detail_ = value;
                    }
                    onChanged();
                } else {
                    this.detailBuilder_.mergeFrom(value);
                }
                this.bitField0_ |= 0x1;
                return this;
            }

            public Builder clearDetail() {
                if (this.detailBuilder_ == null) {
                    this.detail_ = ItemOuterClass.ItemDetail.getDefaultInstance();
                    onChanged();
                } else {
                    this.detailBuilder_.clear();
                }
                this.bitField0_ &= 0xFFFFFFFE;
                return this;
            }

            public ItemOuterClass.ItemDetail.Builder getDetailBuilder() {
                this.bitField0_ |= 0x1;
                onChanged();
                return (ItemOuterClass.ItemDetail.Builder) getDetailFieldBuilder().getBuilder();
            }

            public ItemOuterClass.ItemDetailOrBuilder getDetailOrBuilder() {
                if (this.detailBuilder_ != null)
                    return (ItemOuterClass.ItemDetailOrBuilder) this.detailBuilder_.getMessageOrBuilder();
                return this.detail_;
            }

            private SingleFieldBuilder<ItemOuterClass.ItemDetail, ItemOuterClass.ItemDetail.Builder, ItemOuterClass.ItemDetailOrBuilder> getDetailFieldBuilder() {
                if (this.detailBuilder_ == null) {
                    this.detailBuilder_ = new SingleFieldBuilder(getDetail(), getParentForChildren(), isClean());
                    this.detail_ = null;
                }
                return this.detailBuilder_;
            }

            public boolean hasGroupCount() {
                return ((this.bitField0_ & 0x2) == 2);
            }

            public int getGroupCount() {
                return this.groupCount_;
            }

            public Builder setGroupCount(int value) {
                this.bitField0_ |= 0x2;
                this.groupCount_ = value;
                onChanged();
                return this;
            }

            public Builder clearGroupCount() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.groupCount_ = 0;
                onChanged();
                return this;
            }

            public boolean hasPublishTimes() {
                return ((this.bitField0_ & 0x4) == 4);
            }

            public int getPublishTimes() {
                return this.publishTimes_;
            }

            public Builder setPublishTimes(int value) {
                this.bitField0_ |= 0x4;
                this.publishTimes_ = value;
                onChanged();
                return this;
            }

            public Builder clearPublishTimes() {
                this.bitField0_ &= 0xFFFFFFFB;
                this.publishTimes_ = 0;
                onChanged();
                return this;
            }

            public boolean hasConsignmentPrice() {
                return ((this.bitField0_ & 0x8) == 8);
            }

            public int getConsignmentPrice() {
                return this.consignmentPrice_;
            }

            public Builder setConsignmentPrice(int value) {
                this.bitField0_ |= 0x8;
                this.consignmentPrice_ = value;
                onChanged();
                return this;
            }

            public Builder clearConsignmentPrice() {
                this.bitField0_ &= 0xFFFFFFF7;
                this.consignmentPrice_ = 0;
                onChanged();
                return this;
            }

            public boolean hasConsignmentTime() {
                return ((this.bitField0_ & 0x10) == 16);
            }

            public String getConsignmentTime() {
                Object ref = this.consignmentTime_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) this.consignmentTime_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getConsignmentTimeBytes() {
                Object ref = this.consignmentTime_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.consignmentTime_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setConsignmentTime(String value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x10;
                this.consignmentTime_ = value;
                onChanged();
                return this;
            }

            public Builder clearConsignmentTime() {
                this.bitField0_ &= 0xFFFFFFEF;
                this.consignmentTime_ = ItemOuterClass.ConsignmentItem.getDefaultInstance().getConsignmentTime();
                onChanged();
                return this;
            }

            public Builder setConsignmentTimeBytes(ByteString value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x10;
                this.consignmentTime_ = value;
                onChanged();
                return this;
            }

            public boolean hasConsignmentPlayerName() {
                return ((this.bitField0_ & 0x20) == 32);
            }

            public String getConsignmentPlayerName() {
                Object ref = this.consignmentPlayerName_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) this.consignmentPlayerName_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getConsignmentPlayerNameBytes() {
                Object ref = this.consignmentPlayerName_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.consignmentPlayerName_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setConsignmentPlayerName(String value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x20;
                this.consignmentPlayerName_ = value;
                onChanged();
                return this;
            }

            public Builder clearConsignmentPlayerName() {
                this.bitField0_ &= 0xFFFFFFDF;
                this.consignmentPlayerName_ = ItemOuterClass.ConsignmentItem.getDefaultInstance().getConsignmentPlayerName();
                onChanged();
                return this;
            }

            public Builder setConsignmentPlayerNameBytes(ByteString value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x20;
                this.consignmentPlayerName_ = value;
                onChanged();
                return this;
            }

            public boolean hasConsignmentPlayerPro() {
                return ((this.bitField0_ & 0x40) == 64);
            }

            public int getConsignmentPlayerPro() {
                return this.consignmentPlayerPro_;
            }

            public Builder setConsignmentPlayerPro(int value) {
                this.bitField0_ |= 0x40;
                this.consignmentPlayerPro_ = value;
                onChanged();
                return this;
            }

            public Builder clearConsignmentPlayerPro() {
                this.bitField0_ &= 0xFFFFFFBF;
                this.consignmentPlayerPro_ = 0;
                onChanged();
                return this;
            }

            public boolean hasConsignmentPlayerId() {
                return ((this.bitField0_ & 0x80) == 128);
            }

            public String getConsignmentPlayerId() {
                Object ref = this.consignmentPlayerId_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) this.consignmentPlayerId_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getConsignmentPlayerIdBytes() {
                Object ref = this.consignmentPlayerId_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.consignmentPlayerId_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setConsignmentPlayerId(String value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x80;
                this.consignmentPlayerId_ = value;
                onChanged();
                return this;
            }

            public Builder clearConsignmentPlayerId() {
                this.bitField0_ &= 0xFFFFFF7F;
                this.consignmentPlayerId_ = ItemOuterClass.ConsignmentItem.getDefaultInstance().getConsignmentPlayerId();
                onChanged();
                return this;
            }

            public Builder setConsignmentPlayerIdBytes(ByteString value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x80;
                this.consignmentPlayerId_ = value;
                onChanged();
                return this;
            }

            public boolean hasLateTime() {
                return ((this.bitField0_ & 0x100) == 256);
            }

            public long getLateTime() {
                return this.lateTime_;
            }

            public Builder setLateTime(long value) {
                this.bitField0_ |= 0x100;
                this.lateTime_ = value;
                onChanged();
                return this;
            }

            public Builder clearLateTime() {
                this.bitField0_ &= 0xFFFFFEFF;
                this.lateTime_ = 0L;
                onChanged();
                return this;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class EquipGridStrengthInfo
            extends GeneratedMessage
            implements EquipGridStrengthInfoOrBuilder {
        private static final EquipGridStrengthInfo defaultInstance = new EquipGridStrengthInfo(true);
        private final UnknownFieldSet unknownFields;

        private EquipGridStrengthInfo(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private EquipGridStrengthInfo(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static EquipGridStrengthInfo getDefaultInstance() {
            return defaultInstance;
        }

        public EquipGridStrengthInfo getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private EquipGridStrengthInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.bitField0_ |= 0x1;
                            this.pos_ = input.readInt32();
                            break;
                        case 16:
                            this.bitField0_ |= 0x2;
                            this.enSection_ = input.readInt32();
                            break;
                        case 24:
                            this.bitField0_ |= 0x4;
                            this.enLevel_ = input.readInt32();
                            break;
                        case 34:
                            if ((mutable_bitField0_ & 0x8) != 8) {
                                this.jewelAtts_ = new ArrayList<>();
                                mutable_bitField0_ |= 0x8;
                            }
                            this.jewelAtts_.add(input.readMessage(ItemOuterClass.EquipmentJewelAtt.PARSER, extensionRegistry));
                            break;
                        case 40:
                            this.bitField0_ |= 0x8;
                            this.socks_ = input.readInt32();
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                if ((mutable_bitField0_ & 0x8) == 8) this.jewelAtts_ = Collections.unmodifiableList(this.jewelAtts_);
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ItemOuterClass.internal_static_pomelo_item_EquipGridStrengthInfo_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return ItemOuterClass.internal_static_pomelo_item_EquipGridStrengthInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(EquipGridStrengthInfo.class, Builder.class);
        }

        public static Parser<EquipGridStrengthInfo> PARSER = (Parser<EquipGridStrengthInfo>) new AbstractParser<EquipGridStrengthInfo>() {
            public ItemOuterClass.EquipGridStrengthInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new ItemOuterClass.EquipGridStrengthInfo(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int POS_FIELD_NUMBER = 1;
        private int pos_;
        public static final int ENSECTION_FIELD_NUMBER = 2;
        private int enSection_;
        public static final int ENLEVEL_FIELD_NUMBER = 3;
        private int enLevel_;
        public static final int JEWELATTS_FIELD_NUMBER = 4;
        private List<ItemOuterClass.EquipmentJewelAtt> jewelAtts_;
        public static final int SOCKS_FIELD_NUMBER = 5;
        private int socks_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<EquipGridStrengthInfo> getParserForType() {
            return PARSER;
        }

        public boolean hasPos() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public int getPos() {
            return this.pos_;
        }

        public boolean hasEnSection() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        public int getEnSection() {
            return this.enSection_;
        }

        public boolean hasEnLevel() {
            return ((this.bitField0_ & 0x4) == 4);
        }

        public int getEnLevel() {
            return this.enLevel_;
        }

        public List<ItemOuterClass.EquipmentJewelAtt> getJewelAttsList() {
            return this.jewelAtts_;
        }

        public List<? extends ItemOuterClass.EquipmentJewelAttOrBuilder> getJewelAttsOrBuilderList() {
            return (List) this.jewelAtts_;
        }

        public int getJewelAttsCount() {
            return this.jewelAtts_.size();
        }

        public ItemOuterClass.EquipmentJewelAtt getJewelAtts(int index) {
            return this.jewelAtts_.get(index);
        }

        public ItemOuterClass.EquipmentJewelAttOrBuilder getJewelAttsOrBuilder(int index) {
            return this.jewelAtts_.get(index);
        }

        public boolean hasSocks() {
            return ((this.bitField0_ & 0x8) == 8);
        }

        public int getSocks() {
            return this.socks_;
        }

        private void initFields() {
            this.pos_ = 0;
            this.enSection_ = 0;
            this.enLevel_ = 0;
            this.jewelAtts_ = Collections.emptyList();
            this.socks_ = 0;
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            if (!hasPos()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            for (int i = 0; i < getJewelAttsCount(); i++) {
                if (!getJewelAtts(i).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) output.writeInt32(1, this.pos_);
            if ((this.bitField0_ & 0x2) == 2) output.writeInt32(2, this.enSection_);
            if ((this.bitField0_ & 0x4) == 4) output.writeInt32(3, this.enLevel_);
            for (int i = 0; i < this.jewelAtts_.size(); i++)
                output.writeMessage(4, (MessageLite) this.jewelAtts_.get(i));
            if ((this.bitField0_ & 0x8) == 8) output.writeInt32(5, this.socks_);
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) size += CodedOutputStream.computeInt32Size(1, this.pos_);
            if ((this.bitField0_ & 0x2) == 2) size += CodedOutputStream.computeInt32Size(2, this.enSection_);
            if ((this.bitField0_ & 0x4) == 4) size += CodedOutputStream.computeInt32Size(3, this.enLevel_);
            for (int i = 0; i < this.jewelAtts_.size(); i++)
                size += CodedOutputStream.computeMessageSize(4, (MessageLite) this.jewelAtts_.get(i));
            if ((this.bitField0_ & 0x8) == 8) size += CodedOutputStream.computeInt32Size(5, this.socks_);
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static EquipGridStrengthInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (EquipGridStrengthInfo) PARSER.parseFrom(data);
        }

        public static EquipGridStrengthInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (EquipGridStrengthInfo) PARSER.parseFrom(data, extensionRegistry);
        }

        public static EquipGridStrengthInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (EquipGridStrengthInfo) PARSER.parseFrom(data);
        }

        public static EquipGridStrengthInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (EquipGridStrengthInfo) PARSER.parseFrom(data, extensionRegistry);
        }

        public static EquipGridStrengthInfo parseFrom(InputStream input) throws IOException {
            return (EquipGridStrengthInfo) PARSER.parseFrom(input);
        }

        public static EquipGridStrengthInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (EquipGridStrengthInfo) PARSER.parseFrom(input, extensionRegistry);
        }

        public static EquipGridStrengthInfo parseDelimitedFrom(InputStream input) throws IOException {
            return (EquipGridStrengthInfo) PARSER.parseDelimitedFrom(input);
        }

        public static EquipGridStrengthInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (EquipGridStrengthInfo) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static EquipGridStrengthInfo parseFrom(CodedInputStream input) throws IOException {
            return (EquipGridStrengthInfo) PARSER.parseFrom(input);
        }

        public static EquipGridStrengthInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (EquipGridStrengthInfo) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(EquipGridStrengthInfo prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements ItemOuterClass.EquipGridStrengthInfoOrBuilder {
            private int bitField0_;
            private int pos_;
            private int enSection_;
            private int enLevel_;
            private List<ItemOuterClass.EquipmentJewelAtt> jewelAtts_;
            private RepeatedFieldBuilder<ItemOuterClass.EquipmentJewelAtt, ItemOuterClass.EquipmentJewelAtt.Builder, ItemOuterClass.EquipmentJewelAttOrBuilder> jewelAttsBuilder_;
            private int socks_;

            public static final Descriptors.Descriptor getDescriptor() {
                return ItemOuterClass.internal_static_pomelo_item_EquipGridStrengthInfo_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return ItemOuterClass.internal_static_pomelo_item_EquipGridStrengthInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(ItemOuterClass.EquipGridStrengthInfo.class, Builder.class);
            }

            private Builder() {
                this.jewelAtts_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.jewelAtts_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (ItemOuterClass.EquipGridStrengthInfo.alwaysUseFieldBuilders) getJewelAttsFieldBuilder();
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.pos_ = 0;
                this.bitField0_ &= 0xFFFFFFFE;
                this.enSection_ = 0;
                this.bitField0_ &= 0xFFFFFFFD;
                this.enLevel_ = 0;
                this.bitField0_ &= 0xFFFFFFFB;
                if (this.jewelAttsBuilder_ == null) {
                    this.jewelAtts_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFF7;
                } else {
                    this.jewelAttsBuilder_.clear();
                }
                this.socks_ = 0;
                this.bitField0_ &= 0xFFFFFFEF;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return ItemOuterClass.internal_static_pomelo_item_EquipGridStrengthInfo_descriptor;
            }

            public ItemOuterClass.EquipGridStrengthInfo getDefaultInstanceForType() {
                return ItemOuterClass.EquipGridStrengthInfo.getDefaultInstance();
            }

            public ItemOuterClass.EquipGridStrengthInfo build() {
                ItemOuterClass.EquipGridStrengthInfo result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public ItemOuterClass.EquipGridStrengthInfo buildPartial() {
                ItemOuterClass.EquipGridStrengthInfo result = new ItemOuterClass.EquipGridStrengthInfo(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.pos_ = this.pos_;
                if ((from_bitField0_ & 0x2) == 2) to_bitField0_ |= 0x2;
                result.enSection_ = this.enSection_;
                if ((from_bitField0_ & 0x4) == 4) to_bitField0_ |= 0x4;
                result.enLevel_ = this.enLevel_;
                if (this.jewelAttsBuilder_ == null) {
                    if ((this.bitField0_ & 0x8) == 8) {
                        this.jewelAtts_ = Collections.unmodifiableList(this.jewelAtts_);
                        this.bitField0_ &= 0xFFFFFFF7;
                    }
                    result.jewelAtts_ = this.jewelAtts_;
                } else {
                    result.jewelAtts_ = this.jewelAttsBuilder_.build();
                }
                if ((from_bitField0_ & 0x10) == 16) to_bitField0_ |= 0x8;
                result.socks_ = this.socks_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof ItemOuterClass.EquipGridStrengthInfo)
                    return mergeFrom((ItemOuterClass.EquipGridStrengthInfo) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(ItemOuterClass.EquipGridStrengthInfo other) {
                if (other == ItemOuterClass.EquipGridStrengthInfo.getDefaultInstance()) return this;
                if (other.hasPos()) setPos(other.getPos());
                if (other.hasEnSection()) setEnSection(other.getEnSection());
                if (other.hasEnLevel()) setEnLevel(other.getEnLevel());
                if (this.jewelAttsBuilder_ == null) {
                    if (!other.jewelAtts_.isEmpty()) {
                        if (this.jewelAtts_.isEmpty()) {
                            this.jewelAtts_ = other.jewelAtts_;
                            this.bitField0_ &= 0xFFFFFFF7;
                        } else {
                            ensureJewelAttsIsMutable();
                            this.jewelAtts_.addAll(other.jewelAtts_);
                        }
                        onChanged();
                    }
                } else if (!other.jewelAtts_.isEmpty()) {
                    if (this.jewelAttsBuilder_.isEmpty()) {
                        this.jewelAttsBuilder_.dispose();
                        this.jewelAttsBuilder_ = null;
                        this.jewelAtts_ = other.jewelAtts_;
                        this.bitField0_ &= 0xFFFFFFF7;
                        this.jewelAttsBuilder_ = ItemOuterClass.EquipGridStrengthInfo.alwaysUseFieldBuilders ? getJewelAttsFieldBuilder() : null;
                    } else {
                        this.jewelAttsBuilder_.addAllMessages(other.jewelAtts_);
                    }
                }
                if (other.hasSocks()) setSocks(other.getSocks());
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasPos()) return false;
                for (int i = 0; i < getJewelAttsCount(); i++) {
                    if (!getJewelAtts(i).isInitialized()) return false;
                }
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                ItemOuterClass.EquipGridStrengthInfo parsedMessage = null;
                try {
                    parsedMessage = (ItemOuterClass.EquipGridStrengthInfo) ItemOuterClass.EquipGridStrengthInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ItemOuterClass.EquipGridStrengthInfo) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasPos() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public int getPos() {
                return this.pos_;
            }

            public Builder setPos(int value) {
                this.bitField0_ |= 0x1;
                this.pos_ = value;
                onChanged();
                return this;
            }

            public Builder clearPos() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.pos_ = 0;
                onChanged();
                return this;
            }

            public boolean hasEnSection() {
                return ((this.bitField0_ & 0x2) == 2);
            }

            public int getEnSection() {
                return this.enSection_;
            }

            public Builder setEnSection(int value) {
                this.bitField0_ |= 0x2;
                this.enSection_ = value;
                onChanged();
                return this;
            }

            public Builder clearEnSection() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.enSection_ = 0;
                onChanged();
                return this;
            }

            public boolean hasEnLevel() {
                return ((this.bitField0_ & 0x4) == 4);
            }

            public int getEnLevel() {
                return this.enLevel_;
            }

            public Builder setEnLevel(int value) {
                this.bitField0_ |= 0x4;
                this.enLevel_ = value;
                onChanged();
                return this;
            }

            public Builder clearEnLevel() {
                this.bitField0_ &= 0xFFFFFFFB;
                this.enLevel_ = 0;
                onChanged();
                return this;
            }

            private void ensureJewelAttsIsMutable() {
                if ((this.bitField0_ & 0x8) != 8) {
                    this.jewelAtts_ = new ArrayList<>(this.jewelAtts_);
                    this.bitField0_ |= 0x8;
                }
            }

            public List<ItemOuterClass.EquipmentJewelAtt> getJewelAttsList() {
                if (this.jewelAttsBuilder_ == null) return Collections.unmodifiableList(this.jewelAtts_);
                return this.jewelAttsBuilder_.getMessageList();
            }

            public int getJewelAttsCount() {
                if (this.jewelAttsBuilder_ == null) return this.jewelAtts_.size();
                return this.jewelAttsBuilder_.getCount();
            }

            public ItemOuterClass.EquipmentJewelAtt getJewelAtts(int index) {
                if (this.jewelAttsBuilder_ == null) return this.jewelAtts_.get(index);
                return (ItemOuterClass.EquipmentJewelAtt) this.jewelAttsBuilder_.getMessage(index);
            }

            public Builder setJewelAtts(int index, ItemOuterClass.EquipmentJewelAtt value) {
                if (this.jewelAttsBuilder_ == null) {
                    if (value == null) throw new NullPointerException();
                    ensureJewelAttsIsMutable();
                    this.jewelAtts_.set(index, value);
                    onChanged();
                } else {
                    this.jewelAttsBuilder_.setMessage(index, value);
                }
                return this;
            }

            public Builder setJewelAtts(int index, ItemOuterClass.EquipmentJewelAtt.Builder builderForValue) {
                if (this.jewelAttsBuilder_ == null) {
                    ensureJewelAttsIsMutable();
                    this.jewelAtts_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    this.jewelAttsBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }

            public Builder addJewelAtts(ItemOuterClass.EquipmentJewelAtt value) {
                if (this.jewelAttsBuilder_ == null) {
                    if (value == null) throw new NullPointerException();
                    ensureJewelAttsIsMutable();
                    this.jewelAtts_.add(value);
                    onChanged();
                } else {
                    this.jewelAttsBuilder_.addMessage(value);
                }
                return this;
            }

            public Builder addJewelAtts(int index, ItemOuterClass.EquipmentJewelAtt value) {
                if (this.jewelAttsBuilder_ == null) {
                    if (value == null) throw new NullPointerException();
                    ensureJewelAttsIsMutable();
                    this.jewelAtts_.add(index, value);
                    onChanged();
                } else {
                    this.jewelAttsBuilder_.addMessage(index, value);
                }
                return this;
            }

            public Builder addJewelAtts(ItemOuterClass.EquipmentJewelAtt.Builder builderForValue) {
                if (this.jewelAttsBuilder_ == null) {
                    ensureJewelAttsIsMutable();
                    this.jewelAtts_.add(builderForValue.build());
                    onChanged();
                } else {
                    this.jewelAttsBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }

            public Builder addJewelAtts(int index, ItemOuterClass.EquipmentJewelAtt.Builder builderForValue) {
                if (this.jewelAttsBuilder_ == null) {
                    ensureJewelAttsIsMutable();
                    this.jewelAtts_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    this.jewelAttsBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }

            public Builder addAllJewelAtts(Iterable<? extends ItemOuterClass.EquipmentJewelAtt> values) {
                if (this.jewelAttsBuilder_ == null) {
                    ensureJewelAttsIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.jewelAtts_);
                    onChanged();
                } else {
                    this.jewelAttsBuilder_.addAllMessages(values);
                }
                return this;
            }

            public Builder clearJewelAtts() {
                if (this.jewelAttsBuilder_ == null) {
                    this.jewelAtts_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFF7;
                    onChanged();
                } else {
                    this.jewelAttsBuilder_.clear();
                }
                return this;
            }

            public Builder removeJewelAtts(int index) {
                if (this.jewelAttsBuilder_ == null) {
                    ensureJewelAttsIsMutable();
                    this.jewelAtts_.remove(index);
                    onChanged();
                } else {
                    this.jewelAttsBuilder_.remove(index);
                }
                return this;
            }

            public ItemOuterClass.EquipmentJewelAtt.Builder getJewelAttsBuilder(int index) {
                return (ItemOuterClass.EquipmentJewelAtt.Builder) getJewelAttsFieldBuilder().getBuilder(index);
            }

            public ItemOuterClass.EquipmentJewelAttOrBuilder getJewelAttsOrBuilder(int index) {
                if (this.jewelAttsBuilder_ == null) return this.jewelAtts_.get(index);
                return (ItemOuterClass.EquipmentJewelAttOrBuilder) this.jewelAttsBuilder_.getMessageOrBuilder(index);
            }

            public List<? extends ItemOuterClass.EquipmentJewelAttOrBuilder> getJewelAttsOrBuilderList() {
                if (this.jewelAttsBuilder_ != null) return this.jewelAttsBuilder_.getMessageOrBuilderList();
                return Collections.unmodifiableList((List) this.jewelAtts_);
            }

            public ItemOuterClass.EquipmentJewelAtt.Builder addJewelAttsBuilder() {
                return (ItemOuterClass.EquipmentJewelAtt.Builder) getJewelAttsFieldBuilder().addBuilder(ItemOuterClass.EquipmentJewelAtt.getDefaultInstance());
            }

            public ItemOuterClass.EquipmentJewelAtt.Builder addJewelAttsBuilder(int index) {
                return (ItemOuterClass.EquipmentJewelAtt.Builder) getJewelAttsFieldBuilder().addBuilder(index, ItemOuterClass.EquipmentJewelAtt.getDefaultInstance());
            }

            public List<ItemOuterClass.EquipmentJewelAtt.Builder> getJewelAttsBuilderList() {
                return getJewelAttsFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilder<ItemOuterClass.EquipmentJewelAtt, ItemOuterClass.EquipmentJewelAtt.Builder, ItemOuterClass.EquipmentJewelAttOrBuilder> getJewelAttsFieldBuilder() {
                if (this.jewelAttsBuilder_ == null) {
                    this.jewelAttsBuilder_ = new RepeatedFieldBuilder(this.jewelAtts_, ((this.bitField0_ & 0x8) == 8), getParentForChildren(), isClean());
                    this.jewelAtts_ = null;
                }
                return this.jewelAttsBuilder_;
            }

            public boolean hasSocks() {
                return ((this.bitField0_ & 0x10) == 16);
            }

            public int getSocks() {
                return this.socks_;
            }

            public Builder setSocks(int value) {
                this.bitField0_ |= 0x10;
                this.socks_ = value;
                onChanged();
                return this;
            }

            public Builder clearSocks() {
                this.bitField0_ &= 0xFFFFFFEF;
                this.socks_ = 0;
                onChanged();
                return this;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class EquipFashionInfo
            extends GeneratedMessage
            implements EquipFashionInfoOrBuilder {
        private static final EquipFashionInfo defaultInstance = new EquipFashionInfo(true);
        private final UnknownFieldSet unknownFields;

        private EquipFashionInfo(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private EquipFashionInfo(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static EquipFashionInfo getDefaultInstance() {
            return defaultInstance;
        }

        public EquipFashionInfo getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private EquipFashionInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    ByteString bs;
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.bitField0_ |= 0x1;
                            this.pos_ = input.readInt32();
                            break;
                        case 18:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x2;
                            this.itemcode_ = bs;
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ItemOuterClass.internal_static_pomelo_item_EquipFashionInfo_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return ItemOuterClass.internal_static_pomelo_item_EquipFashionInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(EquipFashionInfo.class, Builder.class);
        }

        public static Parser<EquipFashionInfo> PARSER = (Parser<EquipFashionInfo>) new AbstractParser<EquipFashionInfo>() {
            public ItemOuterClass.EquipFashionInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new ItemOuterClass.EquipFashionInfo(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int POS_FIELD_NUMBER = 1;
        private int pos_;
        public static final int ITEMCODE_FIELD_NUMBER = 2;
        private Object itemcode_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<EquipFashionInfo> getParserForType() {
            return PARSER;
        }

        public boolean hasPos() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public int getPos() {
            return this.pos_;
        }

        public boolean hasItemcode() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        public String getItemcode() {
            Object ref = this.itemcode_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.itemcode_ = s;
            return s;
        }

        public ByteString getItemcodeBytes() {
            Object ref = this.itemcode_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.itemcode_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        private void initFields() {
            this.pos_ = 0;
            this.itemcode_ = "";
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            if (!hasPos()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) output.writeInt32(1, this.pos_);
            if ((this.bitField0_ & 0x2) == 2) output.writeBytes(2, getItemcodeBytes());
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) size += CodedOutputStream.computeInt32Size(1, this.pos_);
            if ((this.bitField0_ & 0x2) == 2) size += CodedOutputStream.computeBytesSize(2, getItemcodeBytes());
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static EquipFashionInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (EquipFashionInfo) PARSER.parseFrom(data);
        }

        public static EquipFashionInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (EquipFashionInfo) PARSER.parseFrom(data, extensionRegistry);
        }

        public static EquipFashionInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (EquipFashionInfo) PARSER.parseFrom(data);
        }

        public static EquipFashionInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (EquipFashionInfo) PARSER.parseFrom(data, extensionRegistry);
        }

        public static EquipFashionInfo parseFrom(InputStream input) throws IOException {
            return (EquipFashionInfo) PARSER.parseFrom(input);
        }

        public static EquipFashionInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (EquipFashionInfo) PARSER.parseFrom(input, extensionRegistry);
        }

        public static EquipFashionInfo parseDelimitedFrom(InputStream input) throws IOException {
            return (EquipFashionInfo) PARSER.parseDelimitedFrom(input);
        }

        public static EquipFashionInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (EquipFashionInfo) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static EquipFashionInfo parseFrom(CodedInputStream input) throws IOException {
            return (EquipFashionInfo) PARSER.parseFrom(input);
        }

        public static EquipFashionInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (EquipFashionInfo) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(EquipFashionInfo prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements ItemOuterClass.EquipFashionInfoOrBuilder {
            private int bitField0_;
            private int pos_;
            private Object itemcode_;

            public static final Descriptors.Descriptor getDescriptor() {
                return ItemOuterClass.internal_static_pomelo_item_EquipFashionInfo_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return ItemOuterClass.internal_static_pomelo_item_EquipFashionInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(ItemOuterClass.EquipFashionInfo.class, Builder.class);
            }

            private Builder() {
                this.itemcode_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.itemcode_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (ItemOuterClass.EquipFashionInfo.alwaysUseFieldBuilders) ;
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.pos_ = 0;
                this.bitField0_ &= 0xFFFFFFFE;
                this.itemcode_ = "";
                this.bitField0_ &= 0xFFFFFFFD;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return ItemOuterClass.internal_static_pomelo_item_EquipFashionInfo_descriptor;
            }

            public ItemOuterClass.EquipFashionInfo getDefaultInstanceForType() {
                return ItemOuterClass.EquipFashionInfo.getDefaultInstance();
            }

            public ItemOuterClass.EquipFashionInfo build() {
                ItemOuterClass.EquipFashionInfo result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public ItemOuterClass.EquipFashionInfo buildPartial() {
                ItemOuterClass.EquipFashionInfo result = new ItemOuterClass.EquipFashionInfo(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.pos_ = this.pos_;
                if ((from_bitField0_ & 0x2) == 2) to_bitField0_ |= 0x2;
                result.itemcode_ = this.itemcode_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof ItemOuterClass.EquipFashionInfo)
                    return mergeFrom((ItemOuterClass.EquipFashionInfo) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(ItemOuterClass.EquipFashionInfo other) {
                if (other == ItemOuterClass.EquipFashionInfo.getDefaultInstance()) return this;
                if (other.hasPos()) setPos(other.getPos());
                if (other.hasItemcode()) {
                    this.bitField0_ |= 0x2;
                    this.itemcode_ = other.itemcode_;
                    onChanged();
                }
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasPos()) return false;
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                ItemOuterClass.EquipFashionInfo parsedMessage = null;
                try {
                    parsedMessage = (ItemOuterClass.EquipFashionInfo) ItemOuterClass.EquipFashionInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ItemOuterClass.EquipFashionInfo) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasPos() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public int getPos() {
                return this.pos_;
            }

            public Builder setPos(int value) {
                this.bitField0_ |= 0x1;
                this.pos_ = value;
                onChanged();
                return this;
            }

            public Builder clearPos() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.pos_ = 0;
                onChanged();
                return this;
            }

            public boolean hasItemcode() {
                return ((this.bitField0_ & 0x2) == 2);
            }

            public String getItemcode() {
                Object ref = this.itemcode_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) this.itemcode_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getItemcodeBytes() {
                Object ref = this.itemcode_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.itemcode_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setItemcode(String value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.itemcode_ = value;
                onChanged();
                return this;
            }

            public Builder clearItemcode() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.itemcode_ = ItemOuterClass.EquipFashionInfo.getDefaultInstance().getItemcode();
                onChanged();
                return this;
            }

            public Builder setItemcodeBytes(ByteString value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.itemcode_ = value;
                onChanged();
                return this;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }


    static {
        String[] descriptorData = {"\n\nitem.proto\022\013pomelo.item\032\fcommon.proto\"ã\001\n\004Item\022\n\n\002id\030\001 \002(\t\022\f\n\004code\030\002 \002(\t\022\020\n\bitemType\030\003 \002(\005\022\026\n\016itemSecondType\030\004 \002(\005\022\016\n\006qColor\030\005 \002(\005\022\025\n\rmaxGroupCount\030\006 \002(\005\022\022\n\ngroupCount\030\007 \002(\005\022\r\n\005isNew\030\b \002(\005\022\f\n\004icon\030\t \002(\t\022\017\n\007enLevel\030\n \001(\005\022\f\n\004star\030\013 \001(\005\022\016\n\006cdTime\030\f \001(\t\022\020\n\bbindType\030\r \001(\005\"J\n\004Grid\022\021\n\tgridIndex\030\001 \002(\005\022\037\n\004item\030\002 \001(\0132\021.pomelo.item.Item\022\016\n\006source\030\004 \001(\005\"x\n\bMiniItem\022\f\n\004code\030\001 \002(\t\022\022\n\ngroupCount\030\002 \002(\005\022\f\n\004icon\030", "\003 \002(\t\022\016\n\006qColor\030\004 \002(\005\022\f\n\004name\030\005 \001(\t\022\f\n\004star\030\006 \001(\005\022\020\n\bbindType\030\007 \001(\005\"i\n\007Combine\022&\n\007product\030\001 \001(\0132\025.pomelo.item.MiniItem\022(\n\tmaterials\030\002 \003(\0132\025.pomelo.item.MiniItem\022\f\n\004gold\030\003 \001(\005\"&\n\tCountItem\022\f\n\004code\030\001 \002(\t\022\013\n\003num\030\002 \002(\005\"3\n\nCountItems\022%\n\005items\030\001 \003(\0132\026.pomelo.item.CountItem\"a\n\021EquipmentJewelAtt\022\r\n\005index\030\001 \002(\005\022\n\n\002id\030\002 \001(\005\022\r\n\005value\030\003 \001(\005\022\"\n\003gem\030\004 \001(\0132\025.pomelo.item.MiniItem\"ê\005\n\017EquipmentDetail\022\023\n\013isIdentfie", "d\030\001 \001(\005\022\017\n\007enLevel\030\002 \001(\005\022\r\n\005score\030\003 \001(\005\022)\n\nrandomAtts\030\004 \003(\0132\025.pomelo.AttributeBase\0221\n\tjewelAtts\030\005 \003(\0132\036.pomelo.item.EquipmentJewelAtt\022(\n\tmagicAtts\030\006 \003(\0132\025.pomelo.AttributeBase\022\020\n\bluckyExp\030\007 \001(\005\022\021\n\tbaseScore\030\t \001(\005\022'\n\bbaseAtts\030\n \003(\0132\025.pomelo.AttributeBase\022)\n\nuniqueAtts\030\013 \003(\0132\025.pomelo.AttributeBase\022+\n\ftempBaseAtts\030\f \003(\0132\025.pomelo.AttributeBase\022*\n\013tempExtAtts\030\r \003(\0132\025.pomelo.AttributeBase\0221\n\022tempExtAtts", "_senior\030\016 \003(\0132\025.pomelo.AttributeBase\022-\n\016tempUniqueAtts\030\017 \003(\0132\025.pomelo.AttributeBase\022\024\n\frefineAttrId\030\020 \001(\005\022-\n\016tempRefineAttr\030\021 \001(\0132\025.pomelo.AttributeBase\022\023\n\013remakeScore\030\022 \001(\005\022\027\n\017tempRemakeScore\030\023 \001(\005\022'\n\bstarAttr\030\024 \003(\0132\025.pomelo.AttributeBase\022+\n\ftempstarAttr\030\025 \003(\0132\025.pomelo.AttributeBase\022\035\n\025seniorTempRemakeScore\030\026 \001(\005\"I\n\rEarItemDetail\022\n\n\002id\030\001 \001(\t\022\r\n\005ownId\030\002 \001(\t\022\017\n\007ownName\030\003 \001(\t\022\f\n\004time\030\004 \001(\t\"í\001\n\nItemD", "etail\022\n\n\002id\030\001 \001(\t\022\f\n\004code\030\002 \001(\t\022\020\n\bbindType\030\003 \001(\005\022\020\n\bcanTrade\030\004 \001(\005\022\022\n\ncanAuction\030\005 \001(\005\022\024\n\fcanDepotRole\030\006 \001(\005\022\025\n\rcanDepotGuild\030\007 \001(\005\0221\n\013equipDetail\030\b \001(\0132\034.pomelo.item.EquipmentDetail\022-\n\tearDetail\030\t \001(\0132\032.pomelo.item.EarItemDetail\"\002\n\017ConsignmentItem\022'\n\006detail\030\001 \001(\0132\027.pomelo.item.ItemDetail\022\022\n\ngroupCount\030\002 \001(\005\022\024\n\fpublishTimes\030\003 \001(\005\022\030\n\020consignmentPrice\030\004 \001(\005\022\027\n\017consignmentTime\030\005 \001(\t\022\035\n\025consignmentP", "layerName\030\006 \001(\t\022\034\n\024consignmentPlayerPro\030\007 \001(\005\022\033\n\023consignmentPlayerId\030\b \001(\t\022\020\n\blateTime\030\t \001(\003\"\001\n\025EquipGridStrengthInfo\022\013\n\003pos\030\001 \002(\005\022\021\n\tenSection\030\002 \001(\005\022\017\n\007enLevel\030\003 \001(\005\0221\n\tjewelAtts\030\004 \003(\0132\036.pomelo.item.EquipmentJewelAtt\022\r\n\005socks\030\005 \001(\005\"1\n\020EquipFashionInfo\022\013\n\003pos\030\001 \002(\005\022\020\n\bitemcode\030\002 \001(\t*_\n\bBindType\022\013\n\007UN_BIND\020\000\022\b\n\004BIND\020\001\022\016\n\nEQUIP_BIND\020\002\022\022\n\016BIND_AFTER_GET\020\003\022\030\n\024EQUIP_BIND_AFTER_GET\020\004"};


        Descriptors.FileDescriptor.InternalDescriptorAssigner assigner = new Descriptors.FileDescriptor.InternalDescriptorAssigner() {
            public ExtensionRegistry assignDescriptors(Descriptors.FileDescriptor root) {
                ItemOuterClass.descriptor = root;
                return null;
            }
        };

        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{

                Common.getDescriptor()}, assigner);
    }

    private static final Descriptors.Descriptor internal_static_pomelo_item_Item_descriptor = getDescriptor().getMessageTypes().get(0);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_item_Item_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_item_Item_descriptor, new String[]{"Id", "Code", "ItemType", "ItemSecondType", "QColor", "MaxGroupCount", "GroupCount", "IsNew", "Icon", "EnLevel", "Star", "CdTime", "BindType"});


    private static final Descriptors.Descriptor internal_static_pomelo_item_Grid_descriptor = getDescriptor().getMessageTypes().get(1);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_item_Grid_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_item_Grid_descriptor, new String[]{"GridIndex", "Item", "Source"});


    private static final Descriptors.Descriptor internal_static_pomelo_item_MiniItem_descriptor = getDescriptor().getMessageTypes().get(2);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_item_MiniItem_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_item_MiniItem_descriptor, new String[]{"Code", "GroupCount", "Icon", "QColor", "Name", "Star", "BindType"});


    private static final Descriptors.Descriptor internal_static_pomelo_item_Combine_descriptor = getDescriptor().getMessageTypes().get(3);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_item_Combine_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_item_Combine_descriptor, new String[]{"Product", "Materials", "Gold"});


    private static final Descriptors.Descriptor internal_static_pomelo_item_CountItem_descriptor = getDescriptor().getMessageTypes().get(4);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_item_CountItem_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_item_CountItem_descriptor, new String[]{"Code", "Num"});


    private static final Descriptors.Descriptor internal_static_pomelo_item_CountItems_descriptor = getDescriptor().getMessageTypes().get(5);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_item_CountItems_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_item_CountItems_descriptor, new String[]{"Items"});


    private static final Descriptors.Descriptor internal_static_pomelo_item_EquipmentJewelAtt_descriptor = getDescriptor().getMessageTypes().get(6);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_item_EquipmentJewelAtt_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_item_EquipmentJewelAtt_descriptor, new String[]{"Index", "Id", "Value", "Gem"});


    private static final Descriptors.Descriptor internal_static_pomelo_item_EquipmentDetail_descriptor = getDescriptor().getMessageTypes().get(7);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_item_EquipmentDetail_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_item_EquipmentDetail_descriptor, new String[]{"IsIdentfied", "EnLevel", "Score", "RandomAtts", "JewelAtts", "MagicAtts", "LuckyExp", "BaseScore", "BaseAtts", "UniqueAtts", "TempBaseAtts", "TempExtAtts", "TempExtAttsSenior", "TempUniqueAtts", "RefineAttrId", "TempRefineAttr", "RemakeScore", "TempRemakeScore", "StarAttr", "TempstarAttr", "SeniorTempRemakeScore"});


    private static final Descriptors.Descriptor internal_static_pomelo_item_EarItemDetail_descriptor = getDescriptor().getMessageTypes().get(8);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_item_EarItemDetail_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_item_EarItemDetail_descriptor, new String[]{"Id", "OwnId", "OwnName", "Time"});


    private static final Descriptors.Descriptor internal_static_pomelo_item_ItemDetail_descriptor = getDescriptor().getMessageTypes().get(9);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_item_ItemDetail_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_item_ItemDetail_descriptor, new String[]{"Id", "Code", "BindType", "CanTrade", "CanAuction", "CanDepotRole", "CanDepotGuild", "EquipDetail", "EarDetail"});


    private static final Descriptors.Descriptor internal_static_pomelo_item_ConsignmentItem_descriptor = getDescriptor().getMessageTypes().get(10);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_item_ConsignmentItem_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_item_ConsignmentItem_descriptor, new String[]{"Detail", "GroupCount", "PublishTimes", "ConsignmentPrice", "ConsignmentTime", "ConsignmentPlayerName", "ConsignmentPlayerPro", "ConsignmentPlayerId", "LateTime"});


    private static final Descriptors.Descriptor internal_static_pomelo_item_EquipGridStrengthInfo_descriptor = getDescriptor().getMessageTypes().get(11);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_item_EquipGridStrengthInfo_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_item_EquipGridStrengthInfo_descriptor, new String[]{"Pos", "EnSection", "EnLevel", "JewelAtts", "Socks"});


    private static final Descriptors.Descriptor internal_static_pomelo_item_EquipFashionInfo_descriptor = getDescriptor().getMessageTypes().get(12);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_item_EquipFashionInfo_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_item_EquipFashionInfo_descriptor, new String[]{"Pos", "Itemcode"});
    private static Descriptors.FileDescriptor descriptor;

    static {
        Common.getDescriptor();
    }

    public static interface EquipFashionInfoOrBuilder extends MessageOrBuilder {
        boolean hasPos();

        int getPos();

        boolean hasItemcode();

        String getItemcode();

        ByteString getItemcodeBytes();
    }

    public static interface EquipGridStrengthInfoOrBuilder extends MessageOrBuilder {
        boolean hasPos();

        int getPos();

        boolean hasEnSection();

        int getEnSection();

        boolean hasEnLevel();

        int getEnLevel();

        List<ItemOuterClass.EquipmentJewelAtt> getJewelAttsList();

        ItemOuterClass.EquipmentJewelAtt getJewelAtts(int param1Int);

        int getJewelAttsCount();

        List<? extends ItemOuterClass.EquipmentJewelAttOrBuilder> getJewelAttsOrBuilderList();

        ItemOuterClass.EquipmentJewelAttOrBuilder getJewelAttsOrBuilder(int param1Int);

        boolean hasSocks();

        int getSocks();
    }

    public static interface ConsignmentItemOrBuilder extends MessageOrBuilder {
        boolean hasDetail();

        ItemOuterClass.ItemDetail getDetail();

        ItemOuterClass.ItemDetailOrBuilder getDetailOrBuilder();

        boolean hasGroupCount();

        int getGroupCount();

        boolean hasPublishTimes();

        int getPublishTimes();

        boolean hasConsignmentPrice();

        int getConsignmentPrice();

        boolean hasConsignmentTime();

        String getConsignmentTime();

        ByteString getConsignmentTimeBytes();

        boolean hasConsignmentPlayerName();

        String getConsignmentPlayerName();

        ByteString getConsignmentPlayerNameBytes();

        boolean hasConsignmentPlayerPro();

        int getConsignmentPlayerPro();

        boolean hasConsignmentPlayerId();

        String getConsignmentPlayerId();

        ByteString getConsignmentPlayerIdBytes();

        boolean hasLateTime();

        long getLateTime();
    }

    public static interface ItemDetailOrBuilder extends MessageOrBuilder {
        boolean hasId();

        String getId();

        ByteString getIdBytes();

        boolean hasCode();

        String getCode();

        ByteString getCodeBytes();

        boolean hasBindType();

        int getBindType();

        boolean hasCanTrade();

        int getCanTrade();

        boolean hasCanAuction();

        int getCanAuction();

        boolean hasCanDepotRole();

        int getCanDepotRole();

        boolean hasCanDepotGuild();

        int getCanDepotGuild();

        boolean hasEquipDetail();

        ItemOuterClass.EquipmentDetail getEquipDetail();

        ItemOuterClass.EquipmentDetailOrBuilder getEquipDetailOrBuilder();

        boolean hasEarDetail();

        ItemOuterClass.EarItemDetail getEarDetail();

        ItemOuterClass.EarItemDetailOrBuilder getEarDetailOrBuilder();
    }

    public static interface EarItemDetailOrBuilder extends MessageOrBuilder {
        boolean hasId();

        String getId();

        ByteString getIdBytes();

        boolean hasOwnId();

        String getOwnId();

        ByteString getOwnIdBytes();

        boolean hasOwnName();

        String getOwnName();

        ByteString getOwnNameBytes();

        boolean hasTime();

        String getTime();

        ByteString getTimeBytes();
    }

    public static interface EquipmentDetailOrBuilder extends MessageOrBuilder {
        boolean hasIsIdentfied();

        int getIsIdentfied();

        boolean hasEnLevel();

        int getEnLevel();

        boolean hasScore();

        int getScore();

        List<Common.AttributeBase> getRandomAttsList();

        Common.AttributeBase getRandomAtts(int param1Int);

        int getRandomAttsCount();

        List<? extends Common.AttributeBaseOrBuilder> getRandomAttsOrBuilderList();

        Common.AttributeBaseOrBuilder getRandomAttsOrBuilder(int param1Int);

        List<ItemOuterClass.EquipmentJewelAtt> getJewelAttsList();

        ItemOuterClass.EquipmentJewelAtt getJewelAtts(int param1Int);

        int getJewelAttsCount();

        List<? extends ItemOuterClass.EquipmentJewelAttOrBuilder> getJewelAttsOrBuilderList();

        ItemOuterClass.EquipmentJewelAttOrBuilder getJewelAttsOrBuilder(int param1Int);

        List<Common.AttributeBase> getMagicAttsList();

        Common.AttributeBase getMagicAtts(int param1Int);

        int getMagicAttsCount();

        List<? extends Common.AttributeBaseOrBuilder> getMagicAttsOrBuilderList();

        Common.AttributeBaseOrBuilder getMagicAttsOrBuilder(int param1Int);

        boolean hasLuckyExp();

        int getLuckyExp();

        boolean hasBaseScore();

        int getBaseScore();

        List<Common.AttributeBase> getBaseAttsList();

        Common.AttributeBase getBaseAtts(int param1Int);

        int getBaseAttsCount();

        List<? extends Common.AttributeBaseOrBuilder> getBaseAttsOrBuilderList();

        Common.AttributeBaseOrBuilder getBaseAttsOrBuilder(int param1Int);

        List<Common.AttributeBase> getUniqueAttsList();

        Common.AttributeBase getUniqueAtts(int param1Int);

        int getUniqueAttsCount();

        List<? extends Common.AttributeBaseOrBuilder> getUniqueAttsOrBuilderList();

        Common.AttributeBaseOrBuilder getUniqueAttsOrBuilder(int param1Int);

        List<Common.AttributeBase> getTempBaseAttsList();

        Common.AttributeBase getTempBaseAtts(int param1Int);

        int getTempBaseAttsCount();

        List<? extends Common.AttributeBaseOrBuilder> getTempBaseAttsOrBuilderList();

        Common.AttributeBaseOrBuilder getTempBaseAttsOrBuilder(int param1Int);

        List<Common.AttributeBase> getTempExtAttsList();

        Common.AttributeBase getTempExtAtts(int param1Int);

        int getTempExtAttsCount();

        List<? extends Common.AttributeBaseOrBuilder> getTempExtAttsOrBuilderList();

        Common.AttributeBaseOrBuilder getTempExtAttsOrBuilder(int param1Int);

        List<Common.AttributeBase> getTempExtAttsSeniorList();

        Common.AttributeBase getTempExtAttsSenior(int param1Int);

        int getTempExtAttsSeniorCount();

        List<? extends Common.AttributeBaseOrBuilder> getTempExtAttsSeniorOrBuilderList();

        Common.AttributeBaseOrBuilder getTempExtAttsSeniorOrBuilder(int param1Int);

        List<Common.AttributeBase> getTempUniqueAttsList();

        Common.AttributeBase getTempUniqueAtts(int param1Int);

        int getTempUniqueAttsCount();

        List<? extends Common.AttributeBaseOrBuilder> getTempUniqueAttsOrBuilderList();

        Common.AttributeBaseOrBuilder getTempUniqueAttsOrBuilder(int param1Int);

        boolean hasRefineAttrId();

        int getRefineAttrId();

        boolean hasTempRefineAttr();

        Common.AttributeBase getTempRefineAttr();

        Common.AttributeBaseOrBuilder getTempRefineAttrOrBuilder();

        boolean hasRemakeScore();

        int getRemakeScore();

        boolean hasTempRemakeScore();

        int getTempRemakeScore();

        List<Common.AttributeBase> getStarAttrList();

        Common.AttributeBase getStarAttr(int param1Int);

        int getStarAttrCount();

        List<? extends Common.AttributeBaseOrBuilder> getStarAttrOrBuilderList();

        Common.AttributeBaseOrBuilder getStarAttrOrBuilder(int param1Int);

        List<Common.AttributeBase> getTempstarAttrList();

        Common.AttributeBase getTempstarAttr(int param1Int);

        int getTempstarAttrCount();

        List<? extends Common.AttributeBaseOrBuilder> getTempstarAttrOrBuilderList();

        Common.AttributeBaseOrBuilder getTempstarAttrOrBuilder(int param1Int);

        boolean hasSeniorTempRemakeScore();

        int getSeniorTempRemakeScore();
    }

    public static interface EquipmentJewelAttOrBuilder extends MessageOrBuilder {
        boolean hasIndex();

        int getIndex();

        boolean hasId();

        int getId();

        boolean hasValue();

        int getValue();

        boolean hasGem();

        ItemOuterClass.MiniItem getGem();

        ItemOuterClass.MiniItemOrBuilder getGemOrBuilder();
    }

    public static interface CountItemsOrBuilder extends MessageOrBuilder {
        List<ItemOuterClass.CountItem> getItemsList();

        ItemOuterClass.CountItem getItems(int param1Int);

        int getItemsCount();

        List<? extends ItemOuterClass.CountItemOrBuilder> getItemsOrBuilderList();

        ItemOuterClass.CountItemOrBuilder getItemsOrBuilder(int param1Int);
    }

    public static interface CountItemOrBuilder extends MessageOrBuilder {
        boolean hasCode();

        String getCode();

        ByteString getCodeBytes();

        boolean hasNum();

        int getNum();
    }

    public static interface CombineOrBuilder extends MessageOrBuilder {
        boolean hasProduct();

        ItemOuterClass.MiniItem getProduct();

        ItemOuterClass.MiniItemOrBuilder getProductOrBuilder();

        List<ItemOuterClass.MiniItem> getMaterialsList();

        ItemOuterClass.MiniItem getMaterials(int param1Int);

        int getMaterialsCount();

        List<? extends ItemOuterClass.MiniItemOrBuilder> getMaterialsOrBuilderList();

        ItemOuterClass.MiniItemOrBuilder getMaterialsOrBuilder(int param1Int);

        boolean hasGold();

        int getGold();
    }

    public static interface MiniItemOrBuilder extends MessageOrBuilder {
        boolean hasCode();

        String getCode();

        ByteString getCodeBytes();

        boolean hasGroupCount();

        int getGroupCount();

        boolean hasIcon();

        String getIcon();

        ByteString getIconBytes();

        boolean hasQColor();

        int getQColor();

        boolean hasName();

        String getName();

        ByteString getNameBytes();

        boolean hasStar();

        int getStar();

        boolean hasBindType();

        int getBindType();
    }

    public static interface GridOrBuilder extends MessageOrBuilder {
        boolean hasGridIndex();

        int getGridIndex();

        boolean hasItem();

        ItemOuterClass.Item getItem();

        ItemOuterClass.ItemOrBuilder getItemOrBuilder();

        boolean hasSource();

        int getSource();
    }

    public static interface ItemOrBuilder extends MessageOrBuilder {
        boolean hasId();

        String getId();

        ByteString getIdBytes();

        boolean hasCode();

        String getCode();

        ByteString getCodeBytes();

        boolean hasItemType();

        int getItemType();

        boolean hasItemSecondType();

        int getItemSecondType();

        boolean hasQColor();

        int getQColor();

        boolean hasMaxGroupCount();

        int getMaxGroupCount();

        boolean hasGroupCount();

        int getGroupCount();

        boolean hasIsNew();

        int getIsNew();

        boolean hasIcon();

        String getIcon();

        ByteString getIconBytes();

        boolean hasEnLevel();

        int getEnLevel();

        boolean hasStar();

        int getStar();

        boolean hasCdTime();

        String getCdTime();

        ByteString getCdTimeBytes();

        boolean hasBindType();

        int getBindType();
    }
}


