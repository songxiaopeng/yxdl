package pomelo.area;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.RepeatedFieldBuilder;
import com.google.protobuf.UnknownFieldSet;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectStreamException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import pomelo.Common;


public final class CrossServerHandler {
    public static void registerAllExtensions(ExtensionRegistry registry) {
    }

    public static final class TreasureOpenPush
            extends GeneratedMessage
            implements TreasureOpenPushOrBuilder {
        private static final TreasureOpenPush defaultInstance = new TreasureOpenPush(true);
        private final UnknownFieldSet unknownFields;

        private TreasureOpenPush(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private TreasureOpenPush(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static TreasureOpenPush getDefaultInstance() {
            return defaultInstance;
        }

        public TreasureOpenPush getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private TreasureOpenPush(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.s2CCode_ = input.readInt32();
                            break;
                        case 18:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x2;
                            this.s2CMsg_ = bs;
                            break;
                        case 26:
                            if ((mutable_bitField0_ & 0x4) != 4) {
                                this.s2COpenList_ = new ArrayList<>();
                                mutable_bitField0_ |= 0x4;
                            }
                            this.s2COpenList_.add(input.readMessage(Common.OpenTimeInfo.PARSER, extensionRegistry));
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                if ((mutable_bitField0_ & 0x4) == 4)
                    this.s2COpenList_ = Collections.unmodifiableList(this.s2COpenList_);
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CrossServerHandler.internal_static_pomelo_area_TreasureOpenPush_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossServerHandler.internal_static_pomelo_area_TreasureOpenPush_fieldAccessorTable.ensureFieldAccessorsInitialized(TreasureOpenPush.class, Builder.class);
        }

        public static Parser<TreasureOpenPush> PARSER = (Parser<TreasureOpenPush>) new AbstractParser<TreasureOpenPush>() {
            public CrossServerHandler.TreasureOpenPush parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new CrossServerHandler.TreasureOpenPush(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int S2C_CODE_FIELD_NUMBER = 1;
        private int s2CCode_;
        public static final int S2C_MSG_FIELD_NUMBER = 2;
        private Object s2CMsg_;
        public static final int S2C_OPENLIST_FIELD_NUMBER = 3;
        private List<Common.OpenTimeInfo> s2COpenList_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<TreasureOpenPush> getParserForType() {
            return PARSER;
        }

        public boolean hasS2CCode() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public int getS2CCode() {
            return this.s2CCode_;
        }

        public boolean hasS2CMsg() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        public String getS2CMsg() {
            Object ref = this.s2CMsg_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.s2CMsg_ = s;
            return s;
        }

        public ByteString getS2CMsgBytes() {
            Object ref = this.s2CMsg_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.s2CMsg_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public List<Common.OpenTimeInfo> getS2COpenListList() {
            return this.s2COpenList_;
        }

        public List<? extends Common.OpenTimeInfoOrBuilder> getS2COpenListOrBuilderList() {
            return (List) this.s2COpenList_;
        }

        public int getS2COpenListCount() {
            return this.s2COpenList_.size();
        }

        public Common.OpenTimeInfo getS2COpenList(int index) {
            return this.s2COpenList_.get(index);
        }

        public Common.OpenTimeInfoOrBuilder getS2COpenListOrBuilder(int index) {
            return (Common.OpenTimeInfoOrBuilder) this.s2COpenList_.get(index);
        }

        private void initFields() {
            this.s2CCode_ = 0;
            this.s2CMsg_ = "";
            this.s2COpenList_ = Collections.emptyList();
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            if (!hasS2CCode()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) output.writeInt32(1, this.s2CCode_);
            if ((this.bitField0_ & 0x2) == 2) output.writeBytes(2, getS2CMsgBytes());
            for (int i = 0; i < this.s2COpenList_.size(); i++)
                output.writeMessage(3, (MessageLite) this.s2COpenList_.get(i));
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) size += CodedOutputStream.computeInt32Size(1, this.s2CCode_);
            if ((this.bitField0_ & 0x2) == 2) size += CodedOutputStream.computeBytesSize(2, getS2CMsgBytes());
            for (int i = 0; i < this.s2COpenList_.size(); i++)
                size += CodedOutputStream.computeMessageSize(3, (MessageLite) this.s2COpenList_.get(i));
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static TreasureOpenPush parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (TreasureOpenPush) PARSER.parseFrom(data);
        }

        public static TreasureOpenPush parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (TreasureOpenPush) PARSER.parseFrom(data, extensionRegistry);
        }

        public static TreasureOpenPush parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (TreasureOpenPush) PARSER.parseFrom(data);
        }

        static {
            defaultInstance.initFields();
        }

        public static TreasureOpenPush parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (TreasureOpenPush) PARSER.parseFrom(data, extensionRegistry);
        }

        public static TreasureOpenPush parseFrom(InputStream input) throws IOException {
            return (TreasureOpenPush) PARSER.parseFrom(input);
        }

        public static TreasureOpenPush parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (TreasureOpenPush) PARSER.parseFrom(input, extensionRegistry);
        }

        public static TreasureOpenPush parseDelimitedFrom(InputStream input) throws IOException {
            return (TreasureOpenPush) PARSER.parseDelimitedFrom(input);
        }

        public static TreasureOpenPush parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (TreasureOpenPush) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static TreasureOpenPush parseFrom(CodedInputStream input) throws IOException {
            return (TreasureOpenPush) PARSER.parseFrom(input);
        }

        public static TreasureOpenPush parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (TreasureOpenPush) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(TreasureOpenPush prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements CrossServerHandler.TreasureOpenPushOrBuilder {
            private int bitField0_;
            private int s2CCode_;
            private Object s2CMsg_;
            private List<Common.OpenTimeInfo> s2COpenList_;
            private RepeatedFieldBuilder<Common.OpenTimeInfo, Common.OpenTimeInfo.Builder, Common.OpenTimeInfoOrBuilder> s2COpenListBuilder_;

            public static final Descriptors.Descriptor getDescriptor() {
                return CrossServerHandler.internal_static_pomelo_area_TreasureOpenPush_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return CrossServerHandler.internal_static_pomelo_area_TreasureOpenPush_fieldAccessorTable.ensureFieldAccessorsInitialized(CrossServerHandler.TreasureOpenPush.class, Builder.class);
            }

            private Builder() {
                this.s2CMsg_ = "";
                this.s2COpenList_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.s2CMsg_ = "";
                this.s2COpenList_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (CrossServerHandler.TreasureOpenPush.alwaysUseFieldBuilders) getS2COpenListFieldBuilder();
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.s2CCode_ = 0;
                this.bitField0_ &= 0xFFFFFFFE;
                this.s2CMsg_ = "";
                this.bitField0_ &= 0xFFFFFFFD;
                if (this.s2COpenListBuilder_ == null) {
                    this.s2COpenList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFB;
                } else {
                    this.s2COpenListBuilder_.clear();
                }
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return CrossServerHandler.internal_static_pomelo_area_TreasureOpenPush_descriptor;
            }

            public CrossServerHandler.TreasureOpenPush getDefaultInstanceForType() {
                return CrossServerHandler.TreasureOpenPush.getDefaultInstance();
            }

            public CrossServerHandler.TreasureOpenPush build() {
                CrossServerHandler.TreasureOpenPush result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public CrossServerHandler.TreasureOpenPush buildPartial() {
                CrossServerHandler.TreasureOpenPush result = new CrossServerHandler.TreasureOpenPush(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.s2CCode_ = this.s2CCode_;
                if ((from_bitField0_ & 0x2) == 2) to_bitField0_ |= 0x2;
                result.s2CMsg_ = this.s2CMsg_;
                if (this.s2COpenListBuilder_ == null) {
                    if ((this.bitField0_ & 0x4) == 4) {
                        this.s2COpenList_ = Collections.unmodifiableList(this.s2COpenList_);
                        this.bitField0_ &= 0xFFFFFFFB;
                    }
                    result.s2COpenList_ = this.s2COpenList_;
                } else {
                    result.s2COpenList_ = this.s2COpenListBuilder_.build();
                }
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof CrossServerHandler.TreasureOpenPush)
                    return mergeFrom((CrossServerHandler.TreasureOpenPush) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(CrossServerHandler.TreasureOpenPush other) {
                if (other == CrossServerHandler.TreasureOpenPush.getDefaultInstance()) return this;
                if (other.hasS2CCode()) setS2CCode(other.getS2CCode());
                if (other.hasS2CMsg()) {
                    this.bitField0_ |= 0x2;
                    this.s2CMsg_ = other.s2CMsg_;
                    onChanged();
                }
                if (this.s2COpenListBuilder_ == null) {
                    if (!other.s2COpenList_.isEmpty()) {
                        if (this.s2COpenList_.isEmpty()) {
                            this.s2COpenList_ = other.s2COpenList_;
                            this.bitField0_ &= 0xFFFFFFFB;
                        } else {
                            ensureS2COpenListIsMutable();
                            this.s2COpenList_.addAll(other.s2COpenList_);
                        }
                        onChanged();
                    }
                } else if (!other.s2COpenList_.isEmpty()) {
                    if (this.s2COpenListBuilder_.isEmpty()) {
                        this.s2COpenListBuilder_.dispose();
                        this.s2COpenListBuilder_ = null;
                        this.s2COpenList_ = other.s2COpenList_;
                        this.bitField0_ &= 0xFFFFFFFB;
                        this.s2COpenListBuilder_ = CrossServerHandler.TreasureOpenPush.alwaysUseFieldBuilders ? getS2COpenListFieldBuilder() : null;
                    } else {
                        this.s2COpenListBuilder_.addAllMessages(other.s2COpenList_);
                    }
                }
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasS2CCode()) return false;
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                CrossServerHandler.TreasureOpenPush parsedMessage = null;
                try {
                    parsedMessage = (CrossServerHandler.TreasureOpenPush) CrossServerHandler.TreasureOpenPush.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (CrossServerHandler.TreasureOpenPush) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasS2CCode() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public int getS2CCode() {
                return this.s2CCode_;
            }

            public Builder setS2CCode(int value) {
                this.bitField0_ |= 0x1;
                this.s2CCode_ = value;
                onChanged();
                return this;
            }

            public Builder clearS2CCode() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.s2CCode_ = 0;
                onChanged();
                return this;
            }

            public boolean hasS2CMsg() {
                return ((this.bitField0_ & 0x2) == 2);
            }

            public String getS2CMsg() {
                Object ref = this.s2CMsg_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) this.s2CMsg_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getS2CMsgBytes() {
                Object ref = this.s2CMsg_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.s2CMsg_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setS2CMsg(String value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.s2CMsg_ = value;
                onChanged();
                return this;
            }

            public Builder clearS2CMsg() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.s2CMsg_ = CrossServerHandler.TreasureOpenPush.getDefaultInstance().getS2CMsg();
                onChanged();
                return this;
            }

            public Builder setS2CMsgBytes(ByteString value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.s2CMsg_ = value;
                onChanged();
                return this;
            }

            private void ensureS2COpenListIsMutable() {
                if ((this.bitField0_ & 0x4) != 4) {
                    this.s2COpenList_ = new ArrayList<>(this.s2COpenList_);
                    this.bitField0_ |= 0x4;
                }
            }

            public List<Common.OpenTimeInfo> getS2COpenListList() {
                if (this.s2COpenListBuilder_ == null) return Collections.unmodifiableList(this.s2COpenList_);
                return this.s2COpenListBuilder_.getMessageList();
            }

            public int getS2COpenListCount() {
                if (this.s2COpenListBuilder_ == null) return this.s2COpenList_.size();
                return this.s2COpenListBuilder_.getCount();
            }

            public Common.OpenTimeInfo getS2COpenList(int index) {
                if (this.s2COpenListBuilder_ == null) return this.s2COpenList_.get(index);
                return (Common.OpenTimeInfo) this.s2COpenListBuilder_.getMessage(index);
            }

            public Builder setS2COpenList(int index, Common.OpenTimeInfo value) {
                if (this.s2COpenListBuilder_ == null) {
                    if (value == null) throw new NullPointerException();
                    ensureS2COpenListIsMutable();
                    this.s2COpenList_.set(index, value);
                    onChanged();
                } else {
                    this.s2COpenListBuilder_.setMessage(index, (GeneratedMessage) value);
                }
                return this;
            }

            public Builder setS2COpenList(int index, Common.OpenTimeInfo.Builder builderForValue) {
                if (this.s2COpenListBuilder_ == null) {
                    ensureS2COpenListIsMutable();
                    this.s2COpenList_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    this.s2COpenListBuilder_.setMessage(index, (GeneratedMessage) builderForValue.build());
                }
                return this;
            }

            public Builder addS2COpenList(Common.OpenTimeInfo value) {
                if (this.s2COpenListBuilder_ == null) {
                    if (value == null) throw new NullPointerException();
                    ensureS2COpenListIsMutable();
                    this.s2COpenList_.add(value);
                    onChanged();
                } else {
                    this.s2COpenListBuilder_.addMessage((GeneratedMessage) value);
                }
                return this;
            }

            public Builder addS2COpenList(int index, Common.OpenTimeInfo value) {
                if (this.s2COpenListBuilder_ == null) {
                    if (value == null) throw new NullPointerException();
                    ensureS2COpenListIsMutable();
                    this.s2COpenList_.add(index, value);
                    onChanged();
                } else {
                    this.s2COpenListBuilder_.addMessage(index, (GeneratedMessage) value);
                }
                return this;
            }

            public Builder addS2COpenList(Common.OpenTimeInfo.Builder builderForValue) {
                if (this.s2COpenListBuilder_ == null) {
                    ensureS2COpenListIsMutable();
                    this.s2COpenList_.add(builderForValue.build());
                    onChanged();
                } else {
                    this.s2COpenListBuilder_.addMessage((GeneratedMessage) builderForValue.build());
                }
                return this;
            }

            public Builder addS2COpenList(int index, Common.OpenTimeInfo.Builder builderForValue) {
                if (this.s2COpenListBuilder_ == null) {
                    ensureS2COpenListIsMutable();
                    this.s2COpenList_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    this.s2COpenListBuilder_.addMessage(index, (GeneratedMessage) builderForValue.build());
                }
                return this;
            }

            public Builder addAllS2COpenList(Iterable<? extends Common.OpenTimeInfo> values) {
                if (this.s2COpenListBuilder_ == null) {
                    ensureS2COpenListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.s2COpenList_);
                    onChanged();
                } else {
                    this.s2COpenListBuilder_.addAllMessages(values);
                }
                return this;
            }

            public Builder clearS2COpenList() {
                if (this.s2COpenListBuilder_ == null) {
                    this.s2COpenList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFB;
                    onChanged();
                } else {
                    this.s2COpenListBuilder_.clear();
                }
                return this;
            }

            public Builder removeS2COpenList(int index) {
                if (this.s2COpenListBuilder_ == null) {
                    ensureS2COpenListIsMutable();
                    this.s2COpenList_.remove(index);
                    onChanged();
                } else {
                    this.s2COpenListBuilder_.remove(index);
                }
                return this;
            }

            public Common.OpenTimeInfo.Builder getS2COpenListBuilder(int index) {
                return (Common.OpenTimeInfo.Builder) getS2COpenListFieldBuilder().getBuilder(index);
            }

            public Common.OpenTimeInfoOrBuilder getS2COpenListOrBuilder(int index) {
                if (this.s2COpenListBuilder_ == null)
                    return (Common.OpenTimeInfoOrBuilder) this.s2COpenList_.get(index);
                return (Common.OpenTimeInfoOrBuilder) this.s2COpenListBuilder_.getMessageOrBuilder(index);
            }

            public List<? extends Common.OpenTimeInfoOrBuilder> getS2COpenListOrBuilderList() {
                if (this.s2COpenListBuilder_ != null) return this.s2COpenListBuilder_.getMessageOrBuilderList();
                return (List) Collections.unmodifiableList(this.s2COpenList_);
            }

            public Common.OpenTimeInfo.Builder addS2COpenListBuilder() {
                return (Common.OpenTimeInfo.Builder) getS2COpenListFieldBuilder().addBuilder((GeneratedMessage) Common.OpenTimeInfo.getDefaultInstance());
            }

            public Common.OpenTimeInfo.Builder addS2COpenListBuilder(int index) {
                return (Common.OpenTimeInfo.Builder) getS2COpenListFieldBuilder().addBuilder(index, (GeneratedMessage) Common.OpenTimeInfo.getDefaultInstance());
            }

            public List<Common.OpenTimeInfo.Builder> getS2COpenListBuilderList() {
                return getS2COpenListFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilder<Common.OpenTimeInfo, Common.OpenTimeInfo.Builder, Common.OpenTimeInfoOrBuilder> getS2COpenListFieldBuilder() {
                if (this.s2COpenListBuilder_ == null) {
                    this.s2COpenListBuilder_ = new RepeatedFieldBuilder(this.s2COpenList_, ((this.bitField0_ & 0x4) == 4), getParentForChildren(), isClean());
                    this.s2COpenList_ = null;
                }
                return this.s2COpenListBuilder_;
            }
        }
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }


    static {
        String[] descriptorData = {"\n\030crossServerHandler.proto\022\013pomelo.area\032\fcommon.proto\"a\n\020TreasureOpenPush\022\020\n\bs2c_code\030\001 \002(\005\022\017\n\007s2c_msg\030\002 \001(\t\022*\n\fs2c_openList\030\003 \003(\0132\024.pomelo.OpenTimeInfo2\024\n\022crossServerHandler2R\n\017crossServerPush\022?\n\020treasureOpenPush\022\035.pomelo.area.TreasureOpenPush\032\f.pomelo.Void"};


        Descriptors.FileDescriptor.InternalDescriptorAssigner assigner = new Descriptors.FileDescriptor.InternalDescriptorAssigner() {
            public ExtensionRegistry assignDescriptors(Descriptors.FileDescriptor root) {
                CrossServerHandler.descriptor = root;
                return null;
            }
        };

        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{

                Common.getDescriptor()}, assigner);
    }

    public static interface TreasureOpenPushOrBuilder extends MessageOrBuilder {
        boolean hasS2CCode();

        int getS2CCode();

        boolean hasS2CMsg();

        String getS2CMsg();

        ByteString getS2CMsgBytes();

        List<Common.OpenTimeInfo> getS2COpenListList();

        Common.OpenTimeInfo getS2COpenList(int param1Int);

        int getS2COpenListCount();

        List<? extends Common.OpenTimeInfoOrBuilder> getS2COpenListOrBuilderList();

        Common.OpenTimeInfoOrBuilder getS2COpenListOrBuilder(int param1Int);
    }

    private static final Descriptors.Descriptor internal_static_pomelo_area_TreasureOpenPush_descriptor = getDescriptor().getMessageTypes().get(0);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_TreasureOpenPush_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_TreasureOpenPush_descriptor, new String[]{"S2CCode", "S2CMsg", "S2COpenList"});
    private static Descriptors.FileDescriptor descriptor;

    static {
        Common.getDescriptor();
    }
}


