package pomelo.redpacket;

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
import com.google.protobuf.SingleFieldBuilder;
import com.google.protobuf.UnknownFieldSet;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectStreamException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import pomelo.Common;


public final class RedPacketHandler {
    public static void registerAllExtensions(ExtensionRegistry registry) {
    }

    public static final class FetcherInfo
            extends GeneratedMessage
            implements FetcherInfoOrBuilder {
        private static final FetcherInfo defaultInstance = new FetcherInfo(true);
        private final UnknownFieldSet unknownFields;

        private FetcherInfo(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private FetcherInfo(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static FetcherInfo getDefaultInstance() {
            return defaultInstance;
        }

        public FetcherInfo getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private FetcherInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.fetcherId_ = bs;
                            break;
                        case 18:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x2;
                            this.fetcherName_ = bs;
                            break;
                        case 24:
                            this.bitField0_ |= 0x4;
                            this.fetcherValue_ = input.readInt32();
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
            return RedPacketHandler.internal_static_pomelo_redpacket_FetcherInfo_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return RedPacketHandler.internal_static_pomelo_redpacket_FetcherInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(FetcherInfo.class, Builder.class);
        }

        public static Parser<FetcherInfo> PARSER = (Parser<FetcherInfo>) new AbstractParser<FetcherInfo>() {
            public RedPacketHandler.FetcherInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new RedPacketHandler.FetcherInfo(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int FETCHERID_FIELD_NUMBER = 1;
        private Object fetcherId_;
        public static final int FETCHERNAME_FIELD_NUMBER = 2;
        private Object fetcherName_;
        public static final int FETCHERVALUE_FIELD_NUMBER = 3;
        private int fetcherValue_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<FetcherInfo> getParserForType() {
            return PARSER;
        }

        public boolean hasFetcherId() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public String getFetcherId() {
            Object ref = this.fetcherId_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.fetcherId_ = s;
            return s;
        }

        public ByteString getFetcherIdBytes() {
            Object ref = this.fetcherId_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.fetcherId_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public boolean hasFetcherName() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        public String getFetcherName() {
            Object ref = this.fetcherName_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.fetcherName_ = s;
            return s;
        }

        public ByteString getFetcherNameBytes() {
            Object ref = this.fetcherName_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.fetcherName_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public boolean hasFetcherValue() {
            return ((this.bitField0_ & 0x4) == 4);
        }

        public int getFetcherValue() {
            return this.fetcherValue_;
        }

        private void initFields() {
            this.fetcherId_ = "";
            this.fetcherName_ = "";
            this.fetcherValue_ = 0;
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            if (!hasFetcherId()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasFetcherName()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasFetcherValue()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) output.writeBytes(1, getFetcherIdBytes());
            if ((this.bitField0_ & 0x2) == 2) output.writeBytes(2, getFetcherNameBytes());
            if ((this.bitField0_ & 0x4) == 4) output.writeInt32(3, this.fetcherValue_);
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) size += CodedOutputStream.computeBytesSize(1, getFetcherIdBytes());
            if ((this.bitField0_ & 0x2) == 2) size += CodedOutputStream.computeBytesSize(2, getFetcherNameBytes());
            if ((this.bitField0_ & 0x4) == 4) size += CodedOutputStream.computeInt32Size(3, this.fetcherValue_);
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static FetcherInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (FetcherInfo) PARSER.parseFrom(data);
        }

        public static FetcherInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (FetcherInfo) PARSER.parseFrom(data, extensionRegistry);
        }

        public static FetcherInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (FetcherInfo) PARSER.parseFrom(data);
        }

        public static FetcherInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (FetcherInfo) PARSER.parseFrom(data, extensionRegistry);
        }

        public static FetcherInfo parseFrom(InputStream input) throws IOException {
            return (FetcherInfo) PARSER.parseFrom(input);
        }

        public static FetcherInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (FetcherInfo) PARSER.parseFrom(input, extensionRegistry);
        }

        public static FetcherInfo parseDelimitedFrom(InputStream input) throws IOException {
            return (FetcherInfo) PARSER.parseDelimitedFrom(input);
        }

        public static FetcherInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (FetcherInfo) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static FetcherInfo parseFrom(CodedInputStream input) throws IOException {
            return (FetcherInfo) PARSER.parseFrom(input);
        }

        public static FetcherInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (FetcherInfo) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(FetcherInfo prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements RedPacketHandler.FetcherInfoOrBuilder {
            private int bitField0_;
            private Object fetcherId_;
            private Object fetcherName_;
            private int fetcherValue_;

            public static final Descriptors.Descriptor getDescriptor() {
                return RedPacketHandler.internal_static_pomelo_redpacket_FetcherInfo_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return RedPacketHandler.internal_static_pomelo_redpacket_FetcherInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(RedPacketHandler.FetcherInfo.class, Builder.class);
            }

            private Builder() {
                this.fetcherId_ = "";
                this.fetcherName_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.fetcherId_ = "";
                this.fetcherName_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (RedPacketHandler.FetcherInfo.alwaysUseFieldBuilders) ;
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.fetcherId_ = "";
                this.bitField0_ &= 0xFFFFFFFE;
                this.fetcherName_ = "";
                this.bitField0_ &= 0xFFFFFFFD;
                this.fetcherValue_ = 0;
                this.bitField0_ &= 0xFFFFFFFB;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return RedPacketHandler.internal_static_pomelo_redpacket_FetcherInfo_descriptor;
            }

            public RedPacketHandler.FetcherInfo getDefaultInstanceForType() {
                return RedPacketHandler.FetcherInfo.getDefaultInstance();
            }

            public RedPacketHandler.FetcherInfo build() {
                RedPacketHandler.FetcherInfo result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public RedPacketHandler.FetcherInfo buildPartial() {
                RedPacketHandler.FetcherInfo result = new RedPacketHandler.FetcherInfo(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.fetcherId_ = this.fetcherId_;
                if ((from_bitField0_ & 0x2) == 2) to_bitField0_ |= 0x2;
                result.fetcherName_ = this.fetcherName_;
                if ((from_bitField0_ & 0x4) == 4) to_bitField0_ |= 0x4;
                result.fetcherValue_ = this.fetcherValue_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof RedPacketHandler.FetcherInfo)
                    return mergeFrom((RedPacketHandler.FetcherInfo) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(RedPacketHandler.FetcherInfo other) {
                if (other == RedPacketHandler.FetcherInfo.getDefaultInstance()) return this;
                if (other.hasFetcherId()) {
                    this.bitField0_ |= 0x1;
                    this.fetcherId_ = other.fetcherId_;
                    onChanged();
                }
                if (other.hasFetcherName()) {
                    this.bitField0_ |= 0x2;
                    this.fetcherName_ = other.fetcherName_;
                    onChanged();
                }
                if (other.hasFetcherValue()) setFetcherValue(other.getFetcherValue());
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasFetcherId()) return false;
                if (!hasFetcherName()) return false;
                if (!hasFetcherValue()) return false;
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                RedPacketHandler.FetcherInfo parsedMessage = null;
                try {
                    parsedMessage = (RedPacketHandler.FetcherInfo) RedPacketHandler.FetcherInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (RedPacketHandler.FetcherInfo) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasFetcherId() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public String getFetcherId() {
                Object ref = this.fetcherId_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) this.fetcherId_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getFetcherIdBytes() {
                Object ref = this.fetcherId_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.fetcherId_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setFetcherId(String value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x1;
                this.fetcherId_ = value;
                onChanged();
                return this;
            }

            public Builder clearFetcherId() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.fetcherId_ = RedPacketHandler.FetcherInfo.getDefaultInstance().getFetcherId();
                onChanged();
                return this;
            }

            public Builder setFetcherIdBytes(ByteString value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x1;
                this.fetcherId_ = value;
                onChanged();
                return this;
            }

            public boolean hasFetcherName() {
                return ((this.bitField0_ & 0x2) == 2);
            }

            public String getFetcherName() {
                Object ref = this.fetcherName_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) this.fetcherName_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getFetcherNameBytes() {
                Object ref = this.fetcherName_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.fetcherName_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setFetcherName(String value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.fetcherName_ = value;
                onChanged();
                return this;
            }

            public Builder clearFetcherName() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.fetcherName_ = RedPacketHandler.FetcherInfo.getDefaultInstance().getFetcherName();
                onChanged();
                return this;
            }

            public Builder setFetcherNameBytes(ByteString value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.fetcherName_ = value;
                onChanged();
                return this;
            }

            public boolean hasFetcherValue() {
                return ((this.bitField0_ & 0x4) == 4);
            }

            public int getFetcherValue() {
                return this.fetcherValue_;
            }

            public Builder setFetcherValue(int value) {
                this.bitField0_ |= 0x4;
                this.fetcherValue_ = value;
                onChanged();
                return this;
            }

            public Builder clearFetcherValue() {
                this.bitField0_ &= 0xFFFFFFFB;
                this.fetcherValue_ = 0;
                onChanged();
                return this;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class RedPacketInfo
            extends GeneratedMessage
            implements RedPacketInfoOrBuilder {
        private static final RedPacketInfo defaultInstance = new RedPacketInfo(true);
        private final UnknownFieldSet unknownFields;

        private RedPacketInfo(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private RedPacketInfo(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static RedPacketInfo getDefaultInstance() {
            return defaultInstance;
        }

        public RedPacketInfo getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private RedPacketInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 16:
                            this.bitField0_ |= 0x2;
                            this.count_ = input.readInt32();
                            break;
                        case 24:
                            this.bitField0_ |= 0x4;
                            this.totalNum_ = input.readInt32();
                            break;
                        case 32:
                            this.bitField0_ |= 0x8;
                            this.channelType_ = input.readInt32();
                            break;
                        case 40:
                            this.bitField0_ |= 0x10;
                            this.fetchType_ = input.readInt32();
                            break;
                        case 48:
                            this.bitField0_ |= 0x20;
                            this.benifitType_ = input.readInt32();
                            break;
                        case 58:
                            if ((mutable_bitField0_ & 0x40) != 64) {
                                this.fetcherList_ = new ArrayList<>();
                                mutable_bitField0_ |= 0x40;
                            }
                            this.fetcherList_.add(input.readMessage(RedPacketHandler.FetcherInfo.PARSER, extensionRegistry));
                            break;
                        case 66:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x40;
                            this.providerId_ = bs;
                            break;
                        case 74:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x80;
                            this.providerName_ = bs;
                            break;
                        case 82:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x100;
                            this.message_ = bs;
                            break;
                        case 88:
                            this.bitField0_ |= 0x200;
                            this.dispatchTimestamp_ = input.readInt64();
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                if ((mutable_bitField0_ & 0x40) == 64)
                    this.fetcherList_ = Collections.unmodifiableList(this.fetcherList_);
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return RedPacketHandler.internal_static_pomelo_redpacket_RedPacketInfo_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return RedPacketHandler.internal_static_pomelo_redpacket_RedPacketInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(RedPacketInfo.class, Builder.class);
        }

        public static Parser<RedPacketInfo> PARSER = (Parser<RedPacketInfo>) new AbstractParser<RedPacketInfo>() {
            public RedPacketHandler.RedPacketInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new RedPacketHandler.RedPacketInfo(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int ID_FIELD_NUMBER = 1;
        private Object id_;
        public static final int COUNT_FIELD_NUMBER = 2;
        private int count_;
        public static final int TOTALNUM_FIELD_NUMBER = 3;
        private int totalNum_;
        public static final int CHANNELTYPE_FIELD_NUMBER = 4;
        private int channelType_;
        public static final int FETCHTYPE_FIELD_NUMBER = 5;
        private int fetchType_;
        public static final int BENIFITTYPE_FIELD_NUMBER = 6;
        private int benifitType_;
        public static final int FETCHERLIST_FIELD_NUMBER = 7;
        private List<RedPacketHandler.FetcherInfo> fetcherList_;
        public static final int PROVIDERID_FIELD_NUMBER = 8;
        private Object providerId_;
        public static final int PROVIDERNAME_FIELD_NUMBER = 9;
        private Object providerName_;
        public static final int MESSAGE_FIELD_NUMBER = 10;
        private Object message_;
        public static final int DISPATCHTIMESTAMP_FIELD_NUMBER = 11;
        private long dispatchTimestamp_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<RedPacketInfo> getParserForType() {
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

        public boolean hasCount() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        public int getCount() {
            return this.count_;
        }

        public boolean hasTotalNum() {
            return ((this.bitField0_ & 0x4) == 4);
        }

        public int getTotalNum() {
            return this.totalNum_;
        }

        public boolean hasChannelType() {
            return ((this.bitField0_ & 0x8) == 8);
        }

        public int getChannelType() {
            return this.channelType_;
        }

        public boolean hasFetchType() {
            return ((this.bitField0_ & 0x10) == 16);
        }

        public int getFetchType() {
            return this.fetchType_;
        }

        public boolean hasBenifitType() {
            return ((this.bitField0_ & 0x20) == 32);
        }

        public int getBenifitType() {
            return this.benifitType_;
        }

        public List<RedPacketHandler.FetcherInfo> getFetcherListList() {
            return this.fetcherList_;
        }

        public List<? extends RedPacketHandler.FetcherInfoOrBuilder> getFetcherListOrBuilderList() {
            return (List) this.fetcherList_;
        }

        public int getFetcherListCount() {
            return this.fetcherList_.size();
        }

        public RedPacketHandler.FetcherInfo getFetcherList(int index) {
            return this.fetcherList_.get(index);
        }

        public RedPacketHandler.FetcherInfoOrBuilder getFetcherListOrBuilder(int index) {
            return this.fetcherList_.get(index);
        }

        public boolean hasProviderId() {
            return ((this.bitField0_ & 0x40) == 64);
        }

        public String getProviderId() {
            Object ref = this.providerId_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.providerId_ = s;
            return s;
        }

        public ByteString getProviderIdBytes() {
            Object ref = this.providerId_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.providerId_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public boolean hasProviderName() {
            return ((this.bitField0_ & 0x80) == 128);
        }

        public String getProviderName() {
            Object ref = this.providerName_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.providerName_ = s;
            return s;
        }

        public ByteString getProviderNameBytes() {
            Object ref = this.providerName_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.providerName_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public boolean hasMessage() {
            return ((this.bitField0_ & 0x100) == 256);
        }

        public String getMessage() {
            Object ref = this.message_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.message_ = s;
            return s;
        }

        public ByteString getMessageBytes() {
            Object ref = this.message_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.message_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public boolean hasDispatchTimestamp() {
            return ((this.bitField0_ & 0x200) == 512);
        }

        static {
            defaultInstance.initFields();
        }

        public long getDispatchTimestamp() {
            return this.dispatchTimestamp_;
        }

        private void initFields() {
            this.id_ = "";
            this.count_ = 0;
            this.totalNum_ = 0;
            this.channelType_ = 0;
            this.fetchType_ = 0;
            this.benifitType_ = 0;
            this.fetcherList_ = Collections.emptyList();
            this.providerId_ = "";
            this.providerName_ = "";
            this.message_ = "";
            this.dispatchTimestamp_ = 0L;
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1)
                return true;
            if (isInitialized == 0)
                return false;
            if (!hasId()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasCount()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasTotalNum()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasChannelType()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasFetchType()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasBenifitType()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasProviderName()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasDispatchTimestamp()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            for (int i = 0; i < getFetcherListCount(); i++) {
                if (!getFetcherList(i).isInitialized()) {
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
                output.writeBytes(1, getIdBytes());
            if ((this.bitField0_ & 0x2) == 2)
                output.writeInt32(2, this.count_);
            if ((this.bitField0_ & 0x4) == 4)
                output.writeInt32(3, this.totalNum_);
            if ((this.bitField0_ & 0x8) == 8)
                output.writeInt32(4, this.channelType_);
            if ((this.bitField0_ & 0x10) == 16)
                output.writeInt32(5, this.fetchType_);
            if ((this.bitField0_ & 0x20) == 32)
                output.writeInt32(6, this.benifitType_);
            for (int i = 0; i < this.fetcherList_.size(); i++)
                output.writeMessage(7, (MessageLite) this.fetcherList_.get(i));
            if ((this.bitField0_ & 0x40) == 64)
                output.writeBytes(8, getProviderIdBytes());
            if ((this.bitField0_ & 0x80) == 128)
                output.writeBytes(9, getProviderNameBytes());
            if ((this.bitField0_ & 0x100) == 256)
                output.writeBytes(10, getMessageBytes());
            if ((this.bitField0_ & 0x200) == 512)
                output.writeInt64(11, this.dispatchTimestamp_);
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1)
                return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1)
                size += CodedOutputStream.computeBytesSize(1, getIdBytes());
            if ((this.bitField0_ & 0x2) == 2)
                size += CodedOutputStream.computeInt32Size(2, this.count_);
            if ((this.bitField0_ & 0x4) == 4)
                size += CodedOutputStream.computeInt32Size(3, this.totalNum_);
            if ((this.bitField0_ & 0x8) == 8)
                size += CodedOutputStream.computeInt32Size(4, this.channelType_);
            if ((this.bitField0_ & 0x10) == 16)
                size += CodedOutputStream.computeInt32Size(5, this.fetchType_);
            if ((this.bitField0_ & 0x20) == 32)
                size += CodedOutputStream.computeInt32Size(6, this.benifitType_);
            for (int i = 0; i < this.fetcherList_.size(); i++)
                size += CodedOutputStream.computeMessageSize(7, (MessageLite) this.fetcherList_.get(i));
            if ((this.bitField0_ & 0x40) == 64)
                size += CodedOutputStream.computeBytesSize(8, getProviderIdBytes());
            if ((this.bitField0_ & 0x80) == 128)
                size += CodedOutputStream.computeBytesSize(9, getProviderNameBytes());
            if ((this.bitField0_ & 0x100) == 256)
                size += CodedOutputStream.computeBytesSize(10, getMessageBytes());
            if ((this.bitField0_ & 0x200) == 512)
                size += CodedOutputStream.computeInt64Size(11, this.dispatchTimestamp_);
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static RedPacketInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (RedPacketInfo) PARSER.parseFrom(data);
        }

        public static RedPacketInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (RedPacketInfo) PARSER.parseFrom(data, extensionRegistry);
        }

        public static RedPacketInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (RedPacketInfo) PARSER.parseFrom(data);
        }

        public static RedPacketInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (RedPacketInfo) PARSER.parseFrom(data, extensionRegistry);
        }

        public static RedPacketInfo parseFrom(InputStream input) throws IOException {
            return (RedPacketInfo) PARSER.parseFrom(input);
        }

        public static RedPacketInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (RedPacketInfo) PARSER.parseFrom(input, extensionRegistry);
        }

        public static RedPacketInfo parseDelimitedFrom(InputStream input) throws IOException {
            return (RedPacketInfo) PARSER.parseDelimitedFrom(input);
        }

        public static RedPacketInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (RedPacketInfo) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static RedPacketInfo parseFrom(CodedInputStream input) throws IOException {
            return (RedPacketInfo) PARSER.parseFrom(input);
        }

        public static RedPacketInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (RedPacketInfo) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(RedPacketInfo prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements RedPacketHandler.RedPacketInfoOrBuilder {
            private int bitField0_;
            private Object id_;
            private int count_;
            private int totalNum_;
            private int channelType_;
            private int fetchType_;
            private int benifitType_;
            private List<RedPacketHandler.FetcherInfo> fetcherList_;
            private RepeatedFieldBuilder<RedPacketHandler.FetcherInfo, RedPacketHandler.FetcherInfo.Builder, RedPacketHandler.FetcherInfoOrBuilder> fetcherListBuilder_;
            private Object providerId_;
            private Object providerName_;
            private Object message_;
            private long dispatchTimestamp_;

            public static final Descriptors.Descriptor getDescriptor() {
                return RedPacketHandler.internal_static_pomelo_redpacket_RedPacketInfo_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return RedPacketHandler.internal_static_pomelo_redpacket_RedPacketInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(RedPacketHandler.RedPacketInfo.class, Builder.class);
            }

            private Builder() {
                this.id_ = "";
                this.fetcherList_ = Collections.emptyList();
                this.providerId_ = "";
                this.providerName_ = "";
                this.message_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.id_ = "";
                this.fetcherList_ = Collections.emptyList();
                this.providerId_ = "";
                this.providerName_ = "";
                this.message_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (RedPacketHandler.RedPacketInfo.alwaysUseFieldBuilders)
                    getFetcherListFieldBuilder();
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.id_ = "";
                this.bitField0_ &= 0xFFFFFFFE;
                this.count_ = 0;
                this.bitField0_ &= 0xFFFFFFFD;
                this.totalNum_ = 0;
                this.bitField0_ &= 0xFFFFFFFB;
                this.channelType_ = 0;
                this.bitField0_ &= 0xFFFFFFF7;
                this.fetchType_ = 0;
                this.bitField0_ &= 0xFFFFFFEF;
                this.benifitType_ = 0;
                this.bitField0_ &= 0xFFFFFFDF;
                if (this.fetcherListBuilder_ == null) {
                    this.fetcherList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFBF;
                } else {
                    this.fetcherListBuilder_.clear();
                }
                this.providerId_ = "";
                this.bitField0_ &= 0xFFFFFF7F;
                this.providerName_ = "";
                this.bitField0_ &= 0xFFFFFEFF;
                this.message_ = "";
                this.bitField0_ &= 0xFFFFFDFF;
                this.dispatchTimestamp_ = 0L;
                this.bitField0_ &= 0xFFFFFBFF;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return RedPacketHandler.internal_static_pomelo_redpacket_RedPacketInfo_descriptor;
            }

            public RedPacketHandler.RedPacketInfo getDefaultInstanceForType() {
                return RedPacketHandler.RedPacketInfo.getDefaultInstance();
            }

            public RedPacketHandler.RedPacketInfo build() {
                RedPacketHandler.RedPacketInfo result = buildPartial();
                if (!result.isInitialized())
                    throw newUninitializedMessageException(result);
                return result;
            }

            public RedPacketHandler.RedPacketInfo buildPartial() {
                RedPacketHandler.RedPacketInfo result = new RedPacketHandler.RedPacketInfo(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1)
                    to_bitField0_ |= 0x1;
                result.id_ = this.id_;
                if ((from_bitField0_ & 0x2) == 2)
                    to_bitField0_ |= 0x2;
                result.count_ = this.count_;
                if ((from_bitField0_ & 0x4) == 4)
                    to_bitField0_ |= 0x4;
                result.totalNum_ = this.totalNum_;
                if ((from_bitField0_ & 0x8) == 8)
                    to_bitField0_ |= 0x8;
                result.channelType_ = this.channelType_;
                if ((from_bitField0_ & 0x10) == 16)
                    to_bitField0_ |= 0x10;
                result.fetchType_ = this.fetchType_;
                if ((from_bitField0_ & 0x20) == 32)
                    to_bitField0_ |= 0x20;
                result.benifitType_ = this.benifitType_;
                if (this.fetcherListBuilder_ == null) {
                    if ((this.bitField0_ & 0x40) == 64) {
                        this.fetcherList_ = Collections.unmodifiableList(this.fetcherList_);
                        this.bitField0_ &= 0xFFFFFFBF;
                    }
                    result.fetcherList_ = this.fetcherList_;
                } else {
                    result.fetcherList_ = this.fetcherListBuilder_.build();
                }
                if ((from_bitField0_ & 0x80) == 128)
                    to_bitField0_ |= 0x40;
                result.providerId_ = this.providerId_;
                if ((from_bitField0_ & 0x100) == 256)
                    to_bitField0_ |= 0x80;
                result.providerName_ = this.providerName_;
                if ((from_bitField0_ & 0x200) == 512)
                    to_bitField0_ |= 0x100;
                result.message_ = this.message_;
                if ((from_bitField0_ & 0x400) == 1024)
                    to_bitField0_ |= 0x200;
                result.dispatchTimestamp_ = this.dispatchTimestamp_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof RedPacketHandler.RedPacketInfo)
                    return mergeFrom((RedPacketHandler.RedPacketInfo) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(RedPacketHandler.RedPacketInfo other) {
                if (other == RedPacketHandler.RedPacketInfo.getDefaultInstance())
                    return this;
                if (other.hasId()) {
                    this.bitField0_ |= 0x1;
                    this.id_ = other.id_;
                    onChanged();
                }
                if (other.hasCount())
                    setCount(other.getCount());
                if (other.hasTotalNum())
                    setTotalNum(other.getTotalNum());
                if (other.hasChannelType())
                    setChannelType(other.getChannelType());
                if (other.hasFetchType())
                    setFetchType(other.getFetchType());
                if (other.hasBenifitType())
                    setBenifitType(other.getBenifitType());
                if (this.fetcherListBuilder_ == null) {
                    if (!other.fetcherList_.isEmpty()) {
                        if (this.fetcherList_.isEmpty()) {
                            this.fetcherList_ = other.fetcherList_;
                            this.bitField0_ &= 0xFFFFFFBF;
                        } else {
                            ensureFetcherListIsMutable();
                            this.fetcherList_.addAll(other.fetcherList_);
                        }
                        onChanged();
                    }
                } else if (!other.fetcherList_.isEmpty()) {
                    if (this.fetcherListBuilder_.isEmpty()) {
                        this.fetcherListBuilder_.dispose();
                        this.fetcherListBuilder_ = null;
                        this.fetcherList_ = other.fetcherList_;
                        this.bitField0_ &= 0xFFFFFFBF;
                        this.fetcherListBuilder_ = RedPacketHandler.RedPacketInfo.alwaysUseFieldBuilders ? getFetcherListFieldBuilder() : null;
                    } else {
                        this.fetcherListBuilder_.addAllMessages(other.fetcherList_);
                    }
                }
                if (other.hasProviderId()) {
                    this.bitField0_ |= 0x80;
                    this.providerId_ = other.providerId_;
                    onChanged();
                }
                if (other.hasProviderName()) {
                    this.bitField0_ |= 0x100;
                    this.providerName_ = other.providerName_;
                    onChanged();
                }
                if (other.hasMessage()) {
                    this.bitField0_ |= 0x200;
                    this.message_ = other.message_;
                    onChanged();
                }
                if (other.hasDispatchTimestamp())
                    setDispatchTimestamp(other.getDispatchTimestamp());
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasId())
                    return false;
                if (!hasCount())
                    return false;
                if (!hasTotalNum())
                    return false;
                if (!hasChannelType())
                    return false;
                if (!hasFetchType())
                    return false;
                if (!hasBenifitType())
                    return false;
                if (!hasProviderName())
                    return false;
                if (!hasDispatchTimestamp())
                    return false;
                for (int i = 0; i < getFetcherListCount(); i++) {
                    if (!getFetcherList(i).isInitialized())
                        return false;
                }
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                RedPacketHandler.RedPacketInfo parsedMessage = null;
                try {
                    parsedMessage = (RedPacketHandler.RedPacketInfo) RedPacketHandler.RedPacketInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (RedPacketHandler.RedPacketInfo) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null)
                        mergeFrom(parsedMessage);
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
                    if (bs.isValidUtf8())
                        this.id_ = s;
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
                if (value == null)
                    throw new NullPointerException();
                this.bitField0_ |= 0x1;
                this.id_ = value;
                onChanged();
                return this;
            }

            public Builder clearId() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.id_ = RedPacketHandler.RedPacketInfo.getDefaultInstance().getId();
                onChanged();
                return this;
            }

            public Builder setIdBytes(ByteString value) {
                if (value == null)
                    throw new NullPointerException();
                this.bitField0_ |= 0x1;
                this.id_ = value;
                onChanged();
                return this;
            }

            public boolean hasCount() {
                return ((this.bitField0_ & 0x2) == 2);
            }

            public int getCount() {
                return this.count_;
            }

            public Builder setCount(int value) {
                this.bitField0_ |= 0x2;
                this.count_ = value;
                onChanged();
                return this;
            }

            public Builder clearCount() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.count_ = 0;
                onChanged();
                return this;
            }

            public boolean hasTotalNum() {
                return ((this.bitField0_ & 0x4) == 4);
            }

            public int getTotalNum() {
                return this.totalNum_;
            }

            public Builder setTotalNum(int value) {
                this.bitField0_ |= 0x4;
                this.totalNum_ = value;
                onChanged();
                return this;
            }

            public Builder clearTotalNum() {
                this.bitField0_ &= 0xFFFFFFFB;
                this.totalNum_ = 0;
                onChanged();
                return this;
            }

            public boolean hasChannelType() {
                return ((this.bitField0_ & 0x8) == 8);
            }

            public int getChannelType() {
                return this.channelType_;
            }

            public Builder setChannelType(int value) {
                this.bitField0_ |= 0x8;
                this.channelType_ = value;
                onChanged();
                return this;
            }

            public Builder clearChannelType() {
                this.bitField0_ &= 0xFFFFFFF7;
                this.channelType_ = 0;
                onChanged();
                return this;
            }

            public boolean hasFetchType() {
                return ((this.bitField0_ & 0x10) == 16);
            }

            public int getFetchType() {
                return this.fetchType_;
            }

            public Builder setFetchType(int value) {
                this.bitField0_ |= 0x10;
                this.fetchType_ = value;
                onChanged();
                return this;
            }

            public Builder clearFetchType() {
                this.bitField0_ &= 0xFFFFFFEF;
                this.fetchType_ = 0;
                onChanged();
                return this;
            }

            public boolean hasBenifitType() {
                return ((this.bitField0_ & 0x20) == 32);
            }

            public int getBenifitType() {
                return this.benifitType_;
            }

            public Builder setBenifitType(int value) {
                this.bitField0_ |= 0x20;
                this.benifitType_ = value;
                onChanged();
                return this;
            }

            public Builder clearBenifitType() {
                this.bitField0_ &= 0xFFFFFFDF;
                this.benifitType_ = 0;
                onChanged();
                return this;
            }

            private void ensureFetcherListIsMutable() {
                if ((this.bitField0_ & 0x40) != 64) {
                    this.fetcherList_ = new ArrayList<>(this.fetcherList_);
                    this.bitField0_ |= 0x40;
                }
            }

            public List<RedPacketHandler.FetcherInfo> getFetcherListList() {
                if (this.fetcherListBuilder_ == null)
                    return Collections.unmodifiableList(this.fetcherList_);
                return this.fetcherListBuilder_.getMessageList();
            }

            public int getFetcherListCount() {
                if (this.fetcherListBuilder_ == null)
                    return this.fetcherList_.size();
                return this.fetcherListBuilder_.getCount();
            }

            public RedPacketHandler.FetcherInfo getFetcherList(int index) {
                if (this.fetcherListBuilder_ == null)
                    return this.fetcherList_.get(index);
                return (RedPacketHandler.FetcherInfo) this.fetcherListBuilder_.getMessage(index);
            }

            public Builder setFetcherList(int index, RedPacketHandler.FetcherInfo value) {
                if (this.fetcherListBuilder_ == null) {
                    if (value == null)
                        throw new NullPointerException();
                    ensureFetcherListIsMutable();
                    this.fetcherList_.set(index, value);
                    onChanged();
                } else {
                    this.fetcherListBuilder_.setMessage(index, value);
                }
                return this;
            }

            public Builder setFetcherList(int index, RedPacketHandler.FetcherInfo.Builder builderForValue) {
                if (this.fetcherListBuilder_ == null) {
                    ensureFetcherListIsMutable();
                    this.fetcherList_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    this.fetcherListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }

            public Builder addFetcherList(RedPacketHandler.FetcherInfo value) {
                if (this.fetcherListBuilder_ == null) {
                    if (value == null)
                        throw new NullPointerException();
                    ensureFetcherListIsMutable();
                    this.fetcherList_.add(value);
                    onChanged();
                } else {
                    this.fetcherListBuilder_.addMessage(value);
                }
                return this;
            }

            public Builder addFetcherList(int index, RedPacketHandler.FetcherInfo value) {
                if (this.fetcherListBuilder_ == null) {
                    if (value == null)
                        throw new NullPointerException();
                    ensureFetcherListIsMutable();
                    this.fetcherList_.add(index, value);
                    onChanged();
                } else {
                    this.fetcherListBuilder_.addMessage(index, value);
                }
                return this;
            }

            public Builder addFetcherList(RedPacketHandler.FetcherInfo.Builder builderForValue) {
                if (this.fetcherListBuilder_ == null) {
                    ensureFetcherListIsMutable();
                    this.fetcherList_.add(builderForValue.build());
                    onChanged();
                } else {
                    this.fetcherListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }

            public Builder addFetcherList(int index, RedPacketHandler.FetcherInfo.Builder builderForValue) {
                if (this.fetcherListBuilder_ == null) {
                    ensureFetcherListIsMutable();
                    this.fetcherList_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    this.fetcherListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }

            public Builder addAllFetcherList(Iterable<? extends RedPacketHandler.FetcherInfo> values) {
                if (this.fetcherListBuilder_ == null) {
                    ensureFetcherListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.fetcherList_);
                    onChanged();
                } else {
                    this.fetcherListBuilder_.addAllMessages(values);
                }
                return this;
            }

            public Builder clearFetcherList() {
                if (this.fetcherListBuilder_ == null) {
                    this.fetcherList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFBF;
                    onChanged();
                } else {
                    this.fetcherListBuilder_.clear();
                }
                return this;
            }

            public Builder removeFetcherList(int index) {
                if (this.fetcherListBuilder_ == null) {
                    ensureFetcherListIsMutable();
                    this.fetcherList_.remove(index);
                    onChanged();
                } else {
                    this.fetcherListBuilder_.remove(index);
                }
                return this;
            }

            public RedPacketHandler.FetcherInfo.Builder getFetcherListBuilder(int index) {
                return (RedPacketHandler.FetcherInfo.Builder) getFetcherListFieldBuilder().getBuilder(index);
            }

            public RedPacketHandler.FetcherInfoOrBuilder getFetcherListOrBuilder(int index) {
                if (this.fetcherListBuilder_ == null)
                    return this.fetcherList_.get(index);
                return (RedPacketHandler.FetcherInfoOrBuilder) this.fetcherListBuilder_.getMessageOrBuilder(index);
            }

            public List<? extends RedPacketHandler.FetcherInfoOrBuilder> getFetcherListOrBuilderList() {
                if (this.fetcherListBuilder_ != null)
                    return this.fetcherListBuilder_.getMessageOrBuilderList();
                return Collections.unmodifiableList((List) this.fetcherList_);
            }

            public RedPacketHandler.FetcherInfo.Builder addFetcherListBuilder() {
                return (RedPacketHandler.FetcherInfo.Builder) getFetcherListFieldBuilder().addBuilder(RedPacketHandler.FetcherInfo.getDefaultInstance());
            }

            public RedPacketHandler.FetcherInfo.Builder addFetcherListBuilder(int index) {
                return (RedPacketHandler.FetcherInfo.Builder) getFetcherListFieldBuilder().addBuilder(index, RedPacketHandler.FetcherInfo.getDefaultInstance());
            }

            public List<RedPacketHandler.FetcherInfo.Builder> getFetcherListBuilderList() {
                return getFetcherListFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilder<RedPacketHandler.FetcherInfo, RedPacketHandler.FetcherInfo.Builder, RedPacketHandler.FetcherInfoOrBuilder> getFetcherListFieldBuilder() {
                if (this.fetcherListBuilder_ == null) {
                    this.fetcherListBuilder_ = new RepeatedFieldBuilder(this.fetcherList_, ((this.bitField0_ & 0x40) == 64), getParentForChildren(), isClean());
                    this.fetcherList_ = null;
                }
                return this.fetcherListBuilder_;
            }

            public boolean hasProviderId() {
                return ((this.bitField0_ & 0x80) == 128);
            }

            public String getProviderId() {
                Object ref = this.providerId_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8())
                        this.providerId_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getProviderIdBytes() {
                Object ref = this.providerId_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.providerId_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setProviderId(String value) {
                if (value == null)
                    throw new NullPointerException();
                this.bitField0_ |= 0x80;
                this.providerId_ = value;
                onChanged();
                return this;
            }

            public Builder clearProviderId() {
                this.bitField0_ &= 0xFFFFFF7F;
                this.providerId_ = RedPacketHandler.RedPacketInfo.getDefaultInstance().getProviderId();
                onChanged();
                return this;
            }

            public Builder setProviderIdBytes(ByteString value) {
                if (value == null)
                    throw new NullPointerException();
                this.bitField0_ |= 0x80;
                this.providerId_ = value;
                onChanged();
                return this;
            }

            public boolean hasProviderName() {
                return ((this.bitField0_ & 0x100) == 256);
            }

            public String getProviderName() {
                Object ref = this.providerName_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8())
                        this.providerName_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getProviderNameBytes() {
                Object ref = this.providerName_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.providerName_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setProviderName(String value) {
                if (value == null)
                    throw new NullPointerException();
                this.bitField0_ |= 0x100;
                this.providerName_ = value;
                onChanged();
                return this;
            }

            public Builder clearProviderName() {
                this.bitField0_ &= 0xFFFFFEFF;
                this.providerName_ = RedPacketHandler.RedPacketInfo.getDefaultInstance().getProviderName();
                onChanged();
                return this;
            }

            public Builder setProviderNameBytes(ByteString value) {
                if (value == null)
                    throw new NullPointerException();
                this.bitField0_ |= 0x100;
                this.providerName_ = value;
                onChanged();
                return this;
            }

            public boolean hasMessage() {
                return ((this.bitField0_ & 0x200) == 512);
            }

            public String getMessage() {
                Object ref = this.message_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8())
                        this.message_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getMessageBytes() {
                Object ref = this.message_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.message_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setMessage(String value) {
                if (value == null)
                    throw new NullPointerException();
                this.bitField0_ |= 0x200;
                this.message_ = value;
                onChanged();
                return this;
            }

            public Builder clearMessage() {
                this.bitField0_ &= 0xFFFFFDFF;
                this.message_ = RedPacketHandler.RedPacketInfo.getDefaultInstance().getMessage();
                onChanged();
                return this;
            }

            public Builder setMessageBytes(ByteString value) {
                if (value == null)
                    throw new NullPointerException();
                this.bitField0_ |= 0x200;
                this.message_ = value;
                onChanged();
                return this;
            }

            public boolean hasDispatchTimestamp() {
                return ((this.bitField0_ & 0x400) == 1024);
            }

            public long getDispatchTimestamp() {
                return this.dispatchTimestamp_;
            }

            public Builder setDispatchTimestamp(long value) {
                this.bitField0_ |= 0x400;
                this.dispatchTimestamp_ = value;
                onChanged();
                return this;
            }

            public Builder clearDispatchTimestamp() {
                this.bitField0_ &= 0xFFFFFBFF;
                this.dispatchTimestamp_ = 0L;
                onChanged();
                return this;
            }
        }
    }

    public static final class GetRedPacketListRequest extends GeneratedMessage implements GetRedPacketListRequestOrBuilder {
        private static final GetRedPacketListRequest defaultInstance = new GetRedPacketListRequest(true);
        private final UnknownFieldSet unknownFields;

        private GetRedPacketListRequest(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private GetRedPacketListRequest(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static GetRedPacketListRequest getDefaultInstance() {
            return defaultInstance;
        }

        public GetRedPacketListRequest getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private GetRedPacketListRequest(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            continue;
                    }
                    if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) done = true;
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
            return RedPacketHandler.internal_static_pomelo_redpacket_GetRedPacketListRequest_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return RedPacketHandler.internal_static_pomelo_redpacket_GetRedPacketListRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GetRedPacketListRequest.class, Builder.class);
        }

        public static Parser<GetRedPacketListRequest> PARSER = (Parser<GetRedPacketListRequest>) new AbstractParser<GetRedPacketListRequest>() {
            public RedPacketHandler.GetRedPacketListRequest parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new RedPacketHandler.GetRedPacketListRequest(input, extensionRegistry);
            }
        };
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<GetRedPacketListRequest> getParserForType() {
            return PARSER;
        }

        private void initFields() {
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
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static GetRedPacketListRequest parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (GetRedPacketListRequest) PARSER.parseFrom(data);
        }

        public static GetRedPacketListRequest parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GetRedPacketListRequest) PARSER.parseFrom(data, extensionRegistry);
        }

        public static GetRedPacketListRequest parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (GetRedPacketListRequest) PARSER.parseFrom(data);
        }

        public static GetRedPacketListRequest parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GetRedPacketListRequest) PARSER.parseFrom(data, extensionRegistry);
        }

        public static GetRedPacketListRequest parseFrom(InputStream input) throws IOException {
            return (GetRedPacketListRequest) PARSER.parseFrom(input);
        }

        public static GetRedPacketListRequest parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GetRedPacketListRequest) PARSER.parseFrom(input, extensionRegistry);
        }

        public static GetRedPacketListRequest parseDelimitedFrom(InputStream input) throws IOException {
            return (GetRedPacketListRequest) PARSER.parseDelimitedFrom(input);
        }

        public static GetRedPacketListRequest parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GetRedPacketListRequest) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static GetRedPacketListRequest parseFrom(CodedInputStream input) throws IOException {
            return (GetRedPacketListRequest) PARSER.parseFrom(input);
        }

        public static GetRedPacketListRequest parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GetRedPacketListRequest) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(GetRedPacketListRequest prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements RedPacketHandler.GetRedPacketListRequestOrBuilder {
            public static final Descriptors.Descriptor getDescriptor() {
                return RedPacketHandler.internal_static_pomelo_redpacket_GetRedPacketListRequest_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return RedPacketHandler.internal_static_pomelo_redpacket_GetRedPacketListRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(RedPacketHandler.GetRedPacketListRequest.class, Builder.class);
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (RedPacketHandler.GetRedPacketListRequest.alwaysUseFieldBuilders) ;
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return RedPacketHandler.internal_static_pomelo_redpacket_GetRedPacketListRequest_descriptor;
            }

            public RedPacketHandler.GetRedPacketListRequest getDefaultInstanceForType() {
                return RedPacketHandler.GetRedPacketListRequest.getDefaultInstance();
            }

            public RedPacketHandler.GetRedPacketListRequest build() {
                RedPacketHandler.GetRedPacketListRequest result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public RedPacketHandler.GetRedPacketListRequest buildPartial() {
                RedPacketHandler.GetRedPacketListRequest result = new RedPacketHandler.GetRedPacketListRequest(this);
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof RedPacketHandler.GetRedPacketListRequest)
                    return mergeFrom((RedPacketHandler.GetRedPacketListRequest) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(RedPacketHandler.GetRedPacketListRequest other) {
                if (other == RedPacketHandler.GetRedPacketListRequest.getDefaultInstance()) return this;
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                RedPacketHandler.GetRedPacketListRequest parsedMessage = null;
                try {
                    parsedMessage = (RedPacketHandler.GetRedPacketListRequest) RedPacketHandler.GetRedPacketListRequest.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (RedPacketHandler.GetRedPacketListRequest) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class GetRedPacketListResponse
            extends GeneratedMessage
            implements GetRedPacketListResponseOrBuilder {
        private static final GetRedPacketListResponse defaultInstance = new GetRedPacketListResponse(true);
        private final UnknownFieldSet unknownFields;

        private GetRedPacketListResponse(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private GetRedPacketListResponse(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static GetRedPacketListResponse getDefaultInstance() {
            return defaultInstance;
        }

        public GetRedPacketListResponse getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private GetRedPacketListResponse(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                                this.redPacketInfo_ = new ArrayList<>();
                                mutable_bitField0_ |= 0x4;
                            }
                            this.redPacketInfo_.add(input.readMessage(RedPacketHandler.RedPacketInfo.PARSER, extensionRegistry));
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                if ((mutable_bitField0_ & 0x4) == 4)
                    this.redPacketInfo_ = Collections.unmodifiableList(this.redPacketInfo_);
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return RedPacketHandler.internal_static_pomelo_redpacket_GetRedPacketListResponse_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return RedPacketHandler.internal_static_pomelo_redpacket_GetRedPacketListResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GetRedPacketListResponse.class, Builder.class);
        }

        public static Parser<GetRedPacketListResponse> PARSER = (Parser<GetRedPacketListResponse>) new AbstractParser<GetRedPacketListResponse>() {
            public RedPacketHandler.GetRedPacketListResponse parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new RedPacketHandler.GetRedPacketListResponse(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int S2C_CODE_FIELD_NUMBER = 1;
        private int s2CCode_;
        public static final int S2C_MSG_FIELD_NUMBER = 2;
        private Object s2CMsg_;
        public static final int REDPACKETINFO_FIELD_NUMBER = 3;
        private List<RedPacketHandler.RedPacketInfo> redPacketInfo_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<GetRedPacketListResponse> getParserForType() {
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

        public List<RedPacketHandler.RedPacketInfo> getRedPacketInfoList() {
            return this.redPacketInfo_;
        }

        public List<? extends RedPacketHandler.RedPacketInfoOrBuilder> getRedPacketInfoOrBuilderList() {
            return (List) this.redPacketInfo_;
        }

        public int getRedPacketInfoCount() {
            return this.redPacketInfo_.size();
        }

        public RedPacketHandler.RedPacketInfo getRedPacketInfo(int index) {
            return this.redPacketInfo_.get(index);
        }

        public RedPacketHandler.RedPacketInfoOrBuilder getRedPacketInfoOrBuilder(int index) {
            return this.redPacketInfo_.get(index);
        }

        private void initFields() {
            this.s2CCode_ = 0;
            this.s2CMsg_ = "";
            this.redPacketInfo_ = Collections.emptyList();
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            if (!hasS2CCode()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            for (int i = 0; i < getRedPacketInfoCount(); i++) {
                if (!getRedPacketInfo(i).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) output.writeInt32(1, this.s2CCode_);
            if ((this.bitField0_ & 0x2) == 2) output.writeBytes(2, getS2CMsgBytes());
            for (int i = 0; i < this.redPacketInfo_.size(); i++)
                output.writeMessage(3, (MessageLite) this.redPacketInfo_.get(i));
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) size += CodedOutputStream.computeInt32Size(1, this.s2CCode_);
            if ((this.bitField0_ & 0x2) == 2) size += CodedOutputStream.computeBytesSize(2, getS2CMsgBytes());
            for (int i = 0; i < this.redPacketInfo_.size(); i++)
                size += CodedOutputStream.computeMessageSize(3, (MessageLite) this.redPacketInfo_.get(i));
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static GetRedPacketListResponse parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (GetRedPacketListResponse) PARSER.parseFrom(data);
        }

        public static GetRedPacketListResponse parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GetRedPacketListResponse) PARSER.parseFrom(data, extensionRegistry);
        }

        public static GetRedPacketListResponse parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (GetRedPacketListResponse) PARSER.parseFrom(data);
        }

        public static GetRedPacketListResponse parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GetRedPacketListResponse) PARSER.parseFrom(data, extensionRegistry);
        }

        public static GetRedPacketListResponse parseFrom(InputStream input) throws IOException {
            return (GetRedPacketListResponse) PARSER.parseFrom(input);
        }

        public static GetRedPacketListResponse parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GetRedPacketListResponse) PARSER.parseFrom(input, extensionRegistry);
        }

        public static GetRedPacketListResponse parseDelimitedFrom(InputStream input) throws IOException {
            return (GetRedPacketListResponse) PARSER.parseDelimitedFrom(input);
        }

        public static GetRedPacketListResponse parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GetRedPacketListResponse) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static GetRedPacketListResponse parseFrom(CodedInputStream input) throws IOException {
            return (GetRedPacketListResponse) PARSER.parseFrom(input);
        }

        public static GetRedPacketListResponse parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GetRedPacketListResponse) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(GetRedPacketListResponse prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements RedPacketHandler.GetRedPacketListResponseOrBuilder {
            private int bitField0_;
            private int s2CCode_;
            private Object s2CMsg_;
            private List<RedPacketHandler.RedPacketInfo> redPacketInfo_;
            private RepeatedFieldBuilder<RedPacketHandler.RedPacketInfo, RedPacketHandler.RedPacketInfo.Builder, RedPacketHandler.RedPacketInfoOrBuilder> redPacketInfoBuilder_;

            public static final Descriptors.Descriptor getDescriptor() {
                return RedPacketHandler.internal_static_pomelo_redpacket_GetRedPacketListResponse_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return RedPacketHandler.internal_static_pomelo_redpacket_GetRedPacketListResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(RedPacketHandler.GetRedPacketListResponse.class, Builder.class);
            }

            private Builder() {
                this.s2CMsg_ = "";
                this.redPacketInfo_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.s2CMsg_ = "";
                this.redPacketInfo_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (RedPacketHandler.GetRedPacketListResponse.alwaysUseFieldBuilders) getRedPacketInfoFieldBuilder();
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
                if (this.redPacketInfoBuilder_ == null) {
                    this.redPacketInfo_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFB;
                } else {
                    this.redPacketInfoBuilder_.clear();
                }
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return RedPacketHandler.internal_static_pomelo_redpacket_GetRedPacketListResponse_descriptor;
            }

            public RedPacketHandler.GetRedPacketListResponse getDefaultInstanceForType() {
                return RedPacketHandler.GetRedPacketListResponse.getDefaultInstance();
            }

            public RedPacketHandler.GetRedPacketListResponse build() {
                RedPacketHandler.GetRedPacketListResponse result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public RedPacketHandler.GetRedPacketListResponse buildPartial() {
                RedPacketHandler.GetRedPacketListResponse result = new RedPacketHandler.GetRedPacketListResponse(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.s2CCode_ = this.s2CCode_;
                if ((from_bitField0_ & 0x2) == 2) to_bitField0_ |= 0x2;
                result.s2CMsg_ = this.s2CMsg_;
                if (this.redPacketInfoBuilder_ == null) {
                    if ((this.bitField0_ & 0x4) == 4) {
                        this.redPacketInfo_ = Collections.unmodifiableList(this.redPacketInfo_);
                        this.bitField0_ &= 0xFFFFFFFB;
                    }
                    result.redPacketInfo_ = this.redPacketInfo_;
                } else {
                    result.redPacketInfo_ = this.redPacketInfoBuilder_.build();
                }
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof RedPacketHandler.GetRedPacketListResponse)
                    return mergeFrom((RedPacketHandler.GetRedPacketListResponse) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(RedPacketHandler.GetRedPacketListResponse other) {
                if (other == RedPacketHandler.GetRedPacketListResponse.getDefaultInstance()) return this;
                if (other.hasS2CCode()) setS2CCode(other.getS2CCode());
                if (other.hasS2CMsg()) {
                    this.bitField0_ |= 0x2;
                    this.s2CMsg_ = other.s2CMsg_;
                    onChanged();
                }
                if (this.redPacketInfoBuilder_ == null) {
                    if (!other.redPacketInfo_.isEmpty()) {
                        if (this.redPacketInfo_.isEmpty()) {
                            this.redPacketInfo_ = other.redPacketInfo_;
                            this.bitField0_ &= 0xFFFFFFFB;
                        } else {
                            ensureRedPacketInfoIsMutable();
                            this.redPacketInfo_.addAll(other.redPacketInfo_);
                        }
                        onChanged();
                    }
                } else if (!other.redPacketInfo_.isEmpty()) {
                    if (this.redPacketInfoBuilder_.isEmpty()) {
                        this.redPacketInfoBuilder_.dispose();
                        this.redPacketInfoBuilder_ = null;
                        this.redPacketInfo_ = other.redPacketInfo_;
                        this.bitField0_ &= 0xFFFFFFFB;
                        this.redPacketInfoBuilder_ = RedPacketHandler.GetRedPacketListResponse.alwaysUseFieldBuilders ? getRedPacketInfoFieldBuilder() : null;
                    } else {
                        this.redPacketInfoBuilder_.addAllMessages(other.redPacketInfo_);
                    }
                }
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasS2CCode()) return false;
                for (int i = 0; i < getRedPacketInfoCount(); i++) {
                    if (!getRedPacketInfo(i).isInitialized()) return false;
                }
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                RedPacketHandler.GetRedPacketListResponse parsedMessage = null;
                try {
                    parsedMessage = (RedPacketHandler.GetRedPacketListResponse) RedPacketHandler.GetRedPacketListResponse.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (RedPacketHandler.GetRedPacketListResponse) e.getUnfinishedMessage();
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
                this.s2CMsg_ = RedPacketHandler.GetRedPacketListResponse.getDefaultInstance().getS2CMsg();
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

            private void ensureRedPacketInfoIsMutable() {
                if ((this.bitField0_ & 0x4) != 4) {
                    this.redPacketInfo_ = new ArrayList<>(this.redPacketInfo_);
                    this.bitField0_ |= 0x4;
                }
            }

            public List<RedPacketHandler.RedPacketInfo> getRedPacketInfoList() {
                if (this.redPacketInfoBuilder_ == null) return Collections.unmodifiableList(this.redPacketInfo_);
                return this.redPacketInfoBuilder_.getMessageList();
            }

            public int getRedPacketInfoCount() {
                if (this.redPacketInfoBuilder_ == null) return this.redPacketInfo_.size();
                return this.redPacketInfoBuilder_.getCount();
            }

            public RedPacketHandler.RedPacketInfo getRedPacketInfo(int index) {
                if (this.redPacketInfoBuilder_ == null) return this.redPacketInfo_.get(index);
                return (RedPacketHandler.RedPacketInfo) this.redPacketInfoBuilder_.getMessage(index);
            }

            public Builder setRedPacketInfo(int index, RedPacketHandler.RedPacketInfo value) {
                if (this.redPacketInfoBuilder_ == null) {
                    if (value == null) throw new NullPointerException();
                    ensureRedPacketInfoIsMutable();
                    this.redPacketInfo_.set(index, value);
                    onChanged();
                } else {
                    this.redPacketInfoBuilder_.setMessage(index, value);
                }
                return this;
            }

            public Builder setRedPacketInfo(int index, RedPacketHandler.RedPacketInfo.Builder builderForValue) {
                if (this.redPacketInfoBuilder_ == null) {
                    ensureRedPacketInfoIsMutable();
                    this.redPacketInfo_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    this.redPacketInfoBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }

            public Builder addRedPacketInfo(RedPacketHandler.RedPacketInfo value) {
                if (this.redPacketInfoBuilder_ == null) {
                    if (value == null) throw new NullPointerException();
                    ensureRedPacketInfoIsMutable();
                    this.redPacketInfo_.add(value);
                    onChanged();
                } else {
                    this.redPacketInfoBuilder_.addMessage(value);
                }
                return this;
            }

            public Builder addRedPacketInfo(int index, RedPacketHandler.RedPacketInfo value) {
                if (this.redPacketInfoBuilder_ == null) {
                    if (value == null) throw new NullPointerException();
                    ensureRedPacketInfoIsMutable();
                    this.redPacketInfo_.add(index, value);
                    onChanged();
                } else {
                    this.redPacketInfoBuilder_.addMessage(index, value);
                }
                return this;
            }

            public Builder addRedPacketInfo(RedPacketHandler.RedPacketInfo.Builder builderForValue) {
                if (this.redPacketInfoBuilder_ == null) {
                    ensureRedPacketInfoIsMutable();
                    this.redPacketInfo_.add(builderForValue.build());
                    onChanged();
                } else {
                    this.redPacketInfoBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }

            public Builder addRedPacketInfo(int index, RedPacketHandler.RedPacketInfo.Builder builderForValue) {
                if (this.redPacketInfoBuilder_ == null) {
                    ensureRedPacketInfoIsMutable();
                    this.redPacketInfo_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    this.redPacketInfoBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }

            public Builder addAllRedPacketInfo(Iterable<? extends RedPacketHandler.RedPacketInfo> values) {
                if (this.redPacketInfoBuilder_ == null) {
                    ensureRedPacketInfoIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.redPacketInfo_);
                    onChanged();
                } else {
                    this.redPacketInfoBuilder_.addAllMessages(values);
                }
                return this;
            }

            public Builder clearRedPacketInfo() {
                if (this.redPacketInfoBuilder_ == null) {
                    this.redPacketInfo_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFB;
                    onChanged();
                } else {
                    this.redPacketInfoBuilder_.clear();
                }
                return this;
            }

            public Builder removeRedPacketInfo(int index) {
                if (this.redPacketInfoBuilder_ == null) {
                    ensureRedPacketInfoIsMutable();
                    this.redPacketInfo_.remove(index);
                    onChanged();
                } else {
                    this.redPacketInfoBuilder_.remove(index);
                }
                return this;
            }

            public RedPacketHandler.RedPacketInfo.Builder getRedPacketInfoBuilder(int index) {
                return (RedPacketHandler.RedPacketInfo.Builder) getRedPacketInfoFieldBuilder().getBuilder(index);
            }

            public RedPacketHandler.RedPacketInfoOrBuilder getRedPacketInfoOrBuilder(int index) {
                if (this.redPacketInfoBuilder_ == null) return this.redPacketInfo_.get(index);
                return (RedPacketHandler.RedPacketInfoOrBuilder) this.redPacketInfoBuilder_.getMessageOrBuilder(index);
            }

            public List<? extends RedPacketHandler.RedPacketInfoOrBuilder> getRedPacketInfoOrBuilderList() {
                if (this.redPacketInfoBuilder_ != null) return this.redPacketInfoBuilder_.getMessageOrBuilderList();
                return Collections.unmodifiableList((List) this.redPacketInfo_);
            }

            public RedPacketHandler.RedPacketInfo.Builder addRedPacketInfoBuilder() {
                return (RedPacketHandler.RedPacketInfo.Builder) getRedPacketInfoFieldBuilder().addBuilder(RedPacketHandler.RedPacketInfo.getDefaultInstance());
            }

            public RedPacketHandler.RedPacketInfo.Builder addRedPacketInfoBuilder(int index) {
                return (RedPacketHandler.RedPacketInfo.Builder) getRedPacketInfoFieldBuilder().addBuilder(index, RedPacketHandler.RedPacketInfo.getDefaultInstance());
            }

            public List<RedPacketHandler.RedPacketInfo.Builder> getRedPacketInfoBuilderList() {
                return getRedPacketInfoFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilder<RedPacketHandler.RedPacketInfo, RedPacketHandler.RedPacketInfo.Builder, RedPacketHandler.RedPacketInfoOrBuilder> getRedPacketInfoFieldBuilder() {
                if (this.redPacketInfoBuilder_ == null) {
                    this.redPacketInfoBuilder_ = new RepeatedFieldBuilder(this.redPacketInfo_, ((this.bitField0_ & 0x4) == 4), getParentForChildren(), isClean());
                    this.redPacketInfo_ = null;
                }
                return this.redPacketInfoBuilder_;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class DispatchRedPacketRequest
            extends GeneratedMessage
            implements DispatchRedPacketRequestOrBuilder {
        private static final DispatchRedPacketRequest defaultInstance = new DispatchRedPacketRequest(true);
        private final UnknownFieldSet unknownFields;

        private DispatchRedPacketRequest(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private DispatchRedPacketRequest(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static DispatchRedPacketRequest getDefaultInstance() {
            return defaultInstance;
        }

        public DispatchRedPacketRequest getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private DispatchRedPacketRequest(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.count_ = input.readInt32();
                            break;
                        case 16:
                            this.bitField0_ |= 0x2;
                            this.totalNum_ = input.readInt32();
                            break;
                        case 24:
                            this.bitField0_ |= 0x4;
                            this.channelType_ = input.readInt32();
                            break;
                        case 32:
                            this.bitField0_ |= 0x8;
                            this.fetchType_ = input.readInt32();
                            break;
                        case 40:
                            this.bitField0_ |= 0x10;
                            this.benifitType_ = input.readInt32();
                            break;
                        case 50:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x20;
                            this.message_ = bs;
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
            return RedPacketHandler.internal_static_pomelo_redpacket_DispatchRedPacketRequest_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return RedPacketHandler.internal_static_pomelo_redpacket_DispatchRedPacketRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(DispatchRedPacketRequest.class, Builder.class);
        }

        public static Parser<DispatchRedPacketRequest> PARSER = (Parser<DispatchRedPacketRequest>) new AbstractParser<DispatchRedPacketRequest>() {
            public RedPacketHandler.DispatchRedPacketRequest parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new RedPacketHandler.DispatchRedPacketRequest(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int COUNT_FIELD_NUMBER = 1;
        private int count_;
        public static final int TOTALNUM_FIELD_NUMBER = 2;
        private int totalNum_;
        public static final int CHANNELTYPE_FIELD_NUMBER = 3;
        private int channelType_;
        public static final int FETCHTYPE_FIELD_NUMBER = 4;
        private int fetchType_;
        public static final int BENIFITTYPE_FIELD_NUMBER = 5;
        private int benifitType_;
        public static final int MESSAGE_FIELD_NUMBER = 6;
        private Object message_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<DispatchRedPacketRequest> getParserForType() {
            return PARSER;
        }

        public boolean hasCount() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public int getCount() {
            return this.count_;
        }

        public boolean hasTotalNum() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        public int getTotalNum() {
            return this.totalNum_;
        }

        public boolean hasChannelType() {
            return ((this.bitField0_ & 0x4) == 4);
        }

        public int getChannelType() {
            return this.channelType_;
        }

        public boolean hasFetchType() {
            return ((this.bitField0_ & 0x8) == 8);
        }

        public int getFetchType() {
            return this.fetchType_;
        }

        public boolean hasBenifitType() {
            return ((this.bitField0_ & 0x10) == 16);
        }

        public int getBenifitType() {
            return this.benifitType_;
        }

        public boolean hasMessage() {
            return ((this.bitField0_ & 0x20) == 32);
        }

        public String getMessage() {
            Object ref = this.message_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.message_ = s;
            return s;
        }

        public ByteString getMessageBytes() {
            Object ref = this.message_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.message_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        private void initFields() {
            this.count_ = 0;
            this.totalNum_ = 0;
            this.channelType_ = 0;
            this.fetchType_ = 0;
            this.benifitType_ = 0;
            this.message_ = "";
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            if (!hasCount()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasTotalNum()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasChannelType()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasFetchType()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasBenifitType()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasMessage()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) output.writeInt32(1, this.count_);
            if ((this.bitField0_ & 0x2) == 2) output.writeInt32(2, this.totalNum_);
            if ((this.bitField0_ & 0x4) == 4) output.writeInt32(3, this.channelType_);
            if ((this.bitField0_ & 0x8) == 8) output.writeInt32(4, this.fetchType_);
            if ((this.bitField0_ & 0x10) == 16) output.writeInt32(5, this.benifitType_);
            if ((this.bitField0_ & 0x20) == 32) output.writeBytes(6, getMessageBytes());
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) size += CodedOutputStream.computeInt32Size(1, this.count_);
            if ((this.bitField0_ & 0x2) == 2) size += CodedOutputStream.computeInt32Size(2, this.totalNum_);
            if ((this.bitField0_ & 0x4) == 4) size += CodedOutputStream.computeInt32Size(3, this.channelType_);
            if ((this.bitField0_ & 0x8) == 8) size += CodedOutputStream.computeInt32Size(4, this.fetchType_);
            if ((this.bitField0_ & 0x10) == 16) size += CodedOutputStream.computeInt32Size(5, this.benifitType_);
            if ((this.bitField0_ & 0x20) == 32) size += CodedOutputStream.computeBytesSize(6, getMessageBytes());
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static DispatchRedPacketRequest parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (DispatchRedPacketRequest) PARSER.parseFrom(data);
        }

        public static DispatchRedPacketRequest parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (DispatchRedPacketRequest) PARSER.parseFrom(data, extensionRegistry);
        }

        public static DispatchRedPacketRequest parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (DispatchRedPacketRequest) PARSER.parseFrom(data);
        }

        public static DispatchRedPacketRequest parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (DispatchRedPacketRequest) PARSER.parseFrom(data, extensionRegistry);
        }

        public static DispatchRedPacketRequest parseFrom(InputStream input) throws IOException {
            return (DispatchRedPacketRequest) PARSER.parseFrom(input);
        }

        public static DispatchRedPacketRequest parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (DispatchRedPacketRequest) PARSER.parseFrom(input, extensionRegistry);
        }

        public static DispatchRedPacketRequest parseDelimitedFrom(InputStream input) throws IOException {
            return (DispatchRedPacketRequest) PARSER.parseDelimitedFrom(input);
        }

        public static DispatchRedPacketRequest parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (DispatchRedPacketRequest) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static DispatchRedPacketRequest parseFrom(CodedInputStream input) throws IOException {
            return (DispatchRedPacketRequest) PARSER.parseFrom(input);
        }

        public static DispatchRedPacketRequest parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (DispatchRedPacketRequest) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(DispatchRedPacketRequest prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements RedPacketHandler.DispatchRedPacketRequestOrBuilder {
            private int bitField0_;
            private int count_;
            private int totalNum_;
            private int channelType_;
            private int fetchType_;
            private int benifitType_;
            private Object message_;

            public static final Descriptors.Descriptor getDescriptor() {
                return RedPacketHandler.internal_static_pomelo_redpacket_DispatchRedPacketRequest_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return RedPacketHandler.internal_static_pomelo_redpacket_DispatchRedPacketRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(RedPacketHandler.DispatchRedPacketRequest.class, Builder.class);
            }

            private Builder() {
                this.message_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.message_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (RedPacketHandler.DispatchRedPacketRequest.alwaysUseFieldBuilders) ;
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.count_ = 0;
                this.bitField0_ &= 0xFFFFFFFE;
                this.totalNum_ = 0;
                this.bitField0_ &= 0xFFFFFFFD;
                this.channelType_ = 0;
                this.bitField0_ &= 0xFFFFFFFB;
                this.fetchType_ = 0;
                this.bitField0_ &= 0xFFFFFFF7;
                this.benifitType_ = 0;
                this.bitField0_ &= 0xFFFFFFEF;
                this.message_ = "";
                this.bitField0_ &= 0xFFFFFFDF;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return RedPacketHandler.internal_static_pomelo_redpacket_DispatchRedPacketRequest_descriptor;
            }

            public RedPacketHandler.DispatchRedPacketRequest getDefaultInstanceForType() {
                return RedPacketHandler.DispatchRedPacketRequest.getDefaultInstance();
            }

            public RedPacketHandler.DispatchRedPacketRequest build() {
                RedPacketHandler.DispatchRedPacketRequest result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public RedPacketHandler.DispatchRedPacketRequest buildPartial() {
                RedPacketHandler.DispatchRedPacketRequest result = new RedPacketHandler.DispatchRedPacketRequest(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.count_ = this.count_;
                if ((from_bitField0_ & 0x2) == 2) to_bitField0_ |= 0x2;
                result.totalNum_ = this.totalNum_;
                if ((from_bitField0_ & 0x4) == 4) to_bitField0_ |= 0x4;
                result.channelType_ = this.channelType_;
                if ((from_bitField0_ & 0x8) == 8) to_bitField0_ |= 0x8;
                result.fetchType_ = this.fetchType_;
                if ((from_bitField0_ & 0x10) == 16) to_bitField0_ |= 0x10;
                result.benifitType_ = this.benifitType_;
                if ((from_bitField0_ & 0x20) == 32) to_bitField0_ |= 0x20;
                result.message_ = this.message_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof RedPacketHandler.DispatchRedPacketRequest)
                    return mergeFrom((RedPacketHandler.DispatchRedPacketRequest) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(RedPacketHandler.DispatchRedPacketRequest other) {
                if (other == RedPacketHandler.DispatchRedPacketRequest.getDefaultInstance()) return this;
                if (other.hasCount()) setCount(other.getCount());
                if (other.hasTotalNum()) setTotalNum(other.getTotalNum());
                if (other.hasChannelType()) setChannelType(other.getChannelType());
                if (other.hasFetchType()) setFetchType(other.getFetchType());
                if (other.hasBenifitType()) setBenifitType(other.getBenifitType());
                if (other.hasMessage()) {
                    this.bitField0_ |= 0x20;
                    this.message_ = other.message_;
                    onChanged();
                }
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasCount()) return false;
                if (!hasTotalNum()) return false;
                if (!hasChannelType()) return false;
                if (!hasFetchType()) return false;
                if (!hasBenifitType()) return false;
                if (!hasMessage()) return false;
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                RedPacketHandler.DispatchRedPacketRequest parsedMessage = null;
                try {
                    parsedMessage = (RedPacketHandler.DispatchRedPacketRequest) RedPacketHandler.DispatchRedPacketRequest.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (RedPacketHandler.DispatchRedPacketRequest) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasCount() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public int getCount() {
                return this.count_;
            }

            public Builder setCount(int value) {
                this.bitField0_ |= 0x1;
                this.count_ = value;
                onChanged();
                return this;
            }

            public Builder clearCount() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.count_ = 0;
                onChanged();
                return this;
            }

            public boolean hasTotalNum() {
                return ((this.bitField0_ & 0x2) == 2);
            }

            public int getTotalNum() {
                return this.totalNum_;
            }

            public Builder setTotalNum(int value) {
                this.bitField0_ |= 0x2;
                this.totalNum_ = value;
                onChanged();
                return this;
            }

            public Builder clearTotalNum() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.totalNum_ = 0;
                onChanged();
                return this;
            }

            public boolean hasChannelType() {
                return ((this.bitField0_ & 0x4) == 4);
            }

            public int getChannelType() {
                return this.channelType_;
            }

            public Builder setChannelType(int value) {
                this.bitField0_ |= 0x4;
                this.channelType_ = value;
                onChanged();
                return this;
            }

            public Builder clearChannelType() {
                this.bitField0_ &= 0xFFFFFFFB;
                this.channelType_ = 0;
                onChanged();
                return this;
            }

            public boolean hasFetchType() {
                return ((this.bitField0_ & 0x8) == 8);
            }

            public int getFetchType() {
                return this.fetchType_;
            }

            public Builder setFetchType(int value) {
                this.bitField0_ |= 0x8;
                this.fetchType_ = value;
                onChanged();
                return this;
            }

            public Builder clearFetchType() {
                this.bitField0_ &= 0xFFFFFFF7;
                this.fetchType_ = 0;
                onChanged();
                return this;
            }

            public boolean hasBenifitType() {
                return ((this.bitField0_ & 0x10) == 16);
            }

            public int getBenifitType() {
                return this.benifitType_;
            }

            public Builder setBenifitType(int value) {
                this.bitField0_ |= 0x10;
                this.benifitType_ = value;
                onChanged();
                return this;
            }

            public Builder clearBenifitType() {
                this.bitField0_ &= 0xFFFFFFEF;
                this.benifitType_ = 0;
                onChanged();
                return this;
            }

            public boolean hasMessage() {
                return ((this.bitField0_ & 0x20) == 32);
            }

            public String getMessage() {
                Object ref = this.message_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) this.message_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getMessageBytes() {
                Object ref = this.message_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.message_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setMessage(String value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x20;
                this.message_ = value;
                onChanged();
                return this;
            }

            public Builder clearMessage() {
                this.bitField0_ &= 0xFFFFFFDF;
                this.message_ = RedPacketHandler.DispatchRedPacketRequest.getDefaultInstance().getMessage();
                onChanged();
                return this;
            }

            public Builder setMessageBytes(ByteString value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x20;
                this.message_ = value;
                onChanged();
                return this;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class DispatchRedPacketResponse
            extends GeneratedMessage
            implements DispatchRedPacketResponseOrBuilder {
        private static final DispatchRedPacketResponse defaultInstance = new DispatchRedPacketResponse(true);
        private final UnknownFieldSet unknownFields;

        private DispatchRedPacketResponse(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private DispatchRedPacketResponse(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static DispatchRedPacketResponse getDefaultInstance() {
            return defaultInstance;
        }

        public DispatchRedPacketResponse getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private DispatchRedPacketResponse(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
            return RedPacketHandler.internal_static_pomelo_redpacket_DispatchRedPacketResponse_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return RedPacketHandler.internal_static_pomelo_redpacket_DispatchRedPacketResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(DispatchRedPacketResponse.class, Builder.class);
        }

        public static Parser<DispatchRedPacketResponse> PARSER = (Parser<DispatchRedPacketResponse>) new AbstractParser<DispatchRedPacketResponse>() {
            public RedPacketHandler.DispatchRedPacketResponse parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new RedPacketHandler.DispatchRedPacketResponse(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int S2C_CODE_FIELD_NUMBER = 1;
        private int s2CCode_;
        public static final int S2C_MSG_FIELD_NUMBER = 2;
        private Object s2CMsg_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<DispatchRedPacketResponse> getParserForType() {
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

        private void initFields() {
            this.s2CCode_ = 0;
            this.s2CMsg_ = "";
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
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) size += CodedOutputStream.computeInt32Size(1, this.s2CCode_);
            if ((this.bitField0_ & 0x2) == 2) size += CodedOutputStream.computeBytesSize(2, getS2CMsgBytes());
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static DispatchRedPacketResponse parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (DispatchRedPacketResponse) PARSER.parseFrom(data);
        }

        public static DispatchRedPacketResponse parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (DispatchRedPacketResponse) PARSER.parseFrom(data, extensionRegistry);
        }

        public static DispatchRedPacketResponse parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (DispatchRedPacketResponse) PARSER.parseFrom(data);
        }

        public static DispatchRedPacketResponse parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (DispatchRedPacketResponse) PARSER.parseFrom(data, extensionRegistry);
        }

        public static DispatchRedPacketResponse parseFrom(InputStream input) throws IOException {
            return (DispatchRedPacketResponse) PARSER.parseFrom(input);
        }

        public static DispatchRedPacketResponse parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (DispatchRedPacketResponse) PARSER.parseFrom(input, extensionRegistry);
        }

        public static DispatchRedPacketResponse parseDelimitedFrom(InputStream input) throws IOException {
            return (DispatchRedPacketResponse) PARSER.parseDelimitedFrom(input);
        }

        public static DispatchRedPacketResponse parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (DispatchRedPacketResponse) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static DispatchRedPacketResponse parseFrom(CodedInputStream input) throws IOException {
            return (DispatchRedPacketResponse) PARSER.parseFrom(input);
        }

        public static DispatchRedPacketResponse parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (DispatchRedPacketResponse) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(DispatchRedPacketResponse prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements RedPacketHandler.DispatchRedPacketResponseOrBuilder {
            private int bitField0_;
            private int s2CCode_;
            private Object s2CMsg_;

            public static final Descriptors.Descriptor getDescriptor() {
                return RedPacketHandler.internal_static_pomelo_redpacket_DispatchRedPacketResponse_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return RedPacketHandler.internal_static_pomelo_redpacket_DispatchRedPacketResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(RedPacketHandler.DispatchRedPacketResponse.class, Builder.class);
            }

            private Builder() {
                this.s2CMsg_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.s2CMsg_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (RedPacketHandler.DispatchRedPacketResponse.alwaysUseFieldBuilders) ;
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
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return RedPacketHandler.internal_static_pomelo_redpacket_DispatchRedPacketResponse_descriptor;
            }

            public RedPacketHandler.DispatchRedPacketResponse getDefaultInstanceForType() {
                return RedPacketHandler.DispatchRedPacketResponse.getDefaultInstance();
            }

            public RedPacketHandler.DispatchRedPacketResponse build() {
                RedPacketHandler.DispatchRedPacketResponse result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public RedPacketHandler.DispatchRedPacketResponse buildPartial() {
                RedPacketHandler.DispatchRedPacketResponse result = new RedPacketHandler.DispatchRedPacketResponse(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.s2CCode_ = this.s2CCode_;
                if ((from_bitField0_ & 0x2) == 2) to_bitField0_ |= 0x2;
                result.s2CMsg_ = this.s2CMsg_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof RedPacketHandler.DispatchRedPacketResponse)
                    return mergeFrom((RedPacketHandler.DispatchRedPacketResponse) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(RedPacketHandler.DispatchRedPacketResponse other) {
                if (other == RedPacketHandler.DispatchRedPacketResponse.getDefaultInstance()) return this;
                if (other.hasS2CCode()) setS2CCode(other.getS2CCode());
                if (other.hasS2CMsg()) {
                    this.bitField0_ |= 0x2;
                    this.s2CMsg_ = other.s2CMsg_;
                    onChanged();
                }
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasS2CCode()) return false;
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                RedPacketHandler.DispatchRedPacketResponse parsedMessage = null;
                try {
                    parsedMessage = (RedPacketHandler.DispatchRedPacketResponse) RedPacketHandler.DispatchRedPacketResponse.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (RedPacketHandler.DispatchRedPacketResponse) e.getUnfinishedMessage();
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
                this.s2CMsg_ = RedPacketHandler.DispatchRedPacketResponse.getDefaultInstance().getS2CMsg();
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
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class FetchRedPacketRequest
            extends GeneratedMessage
            implements FetchRedPacketRequestOrBuilder {
        private static final FetchRedPacketRequest defaultInstance = new FetchRedPacketRequest(true);
        private final UnknownFieldSet unknownFields;

        private FetchRedPacketRequest(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private FetchRedPacketRequest(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static FetchRedPacketRequest getDefaultInstance() {
            return defaultInstance;
        }

        public FetchRedPacketRequest getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private FetchRedPacketRequest(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
            return RedPacketHandler.internal_static_pomelo_redpacket_FetchRedPacketRequest_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return RedPacketHandler.internal_static_pomelo_redpacket_FetchRedPacketRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(FetchRedPacketRequest.class, Builder.class);
        }

        public static Parser<FetchRedPacketRequest> PARSER = (Parser<FetchRedPacketRequest>) new AbstractParser<FetchRedPacketRequest>() {
            public RedPacketHandler.FetchRedPacketRequest parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new RedPacketHandler.FetchRedPacketRequest(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int ID_FIELD_NUMBER = 1;
        private Object id_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<FetchRedPacketRequest> getParserForType() {
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

        private void initFields() {
            this.id_ = "";
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            if (!hasId()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) output.writeBytes(1, getIdBytes());
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) size += CodedOutputStream.computeBytesSize(1, getIdBytes());
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static FetchRedPacketRequest parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (FetchRedPacketRequest) PARSER.parseFrom(data);
        }

        public static FetchRedPacketRequest parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (FetchRedPacketRequest) PARSER.parseFrom(data, extensionRegistry);
        }

        public static FetchRedPacketRequest parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (FetchRedPacketRequest) PARSER.parseFrom(data);
        }

        public static FetchRedPacketRequest parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (FetchRedPacketRequest) PARSER.parseFrom(data, extensionRegistry);
        }

        public static FetchRedPacketRequest parseFrom(InputStream input) throws IOException {
            return (FetchRedPacketRequest) PARSER.parseFrom(input);
        }

        public static FetchRedPacketRequest parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (FetchRedPacketRequest) PARSER.parseFrom(input, extensionRegistry);
        }

        public static FetchRedPacketRequest parseDelimitedFrom(InputStream input) throws IOException {
            return (FetchRedPacketRequest) PARSER.parseDelimitedFrom(input);
        }

        public static FetchRedPacketRequest parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (FetchRedPacketRequest) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static FetchRedPacketRequest parseFrom(CodedInputStream input) throws IOException {
            return (FetchRedPacketRequest) PARSER.parseFrom(input);
        }

        public static FetchRedPacketRequest parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (FetchRedPacketRequest) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(FetchRedPacketRequest prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements RedPacketHandler.FetchRedPacketRequestOrBuilder {
            private int bitField0_;
            private Object id_;

            public static final Descriptors.Descriptor getDescriptor() {
                return RedPacketHandler.internal_static_pomelo_redpacket_FetchRedPacketRequest_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return RedPacketHandler.internal_static_pomelo_redpacket_FetchRedPacketRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(RedPacketHandler.FetchRedPacketRequest.class, Builder.class);
            }

            private Builder() {
                this.id_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.id_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (RedPacketHandler.FetchRedPacketRequest.alwaysUseFieldBuilders) ;
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.id_ = "";
                this.bitField0_ &= 0xFFFFFFFE;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return RedPacketHandler.internal_static_pomelo_redpacket_FetchRedPacketRequest_descriptor;
            }

            public RedPacketHandler.FetchRedPacketRequest getDefaultInstanceForType() {
                return RedPacketHandler.FetchRedPacketRequest.getDefaultInstance();
            }

            public RedPacketHandler.FetchRedPacketRequest build() {
                RedPacketHandler.FetchRedPacketRequest result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public RedPacketHandler.FetchRedPacketRequest buildPartial() {
                RedPacketHandler.FetchRedPacketRequest result = new RedPacketHandler.FetchRedPacketRequest(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.id_ = this.id_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof RedPacketHandler.FetchRedPacketRequest)
                    return mergeFrom((RedPacketHandler.FetchRedPacketRequest) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(RedPacketHandler.FetchRedPacketRequest other) {
                if (other == RedPacketHandler.FetchRedPacketRequest.getDefaultInstance()) return this;
                if (other.hasId()) {
                    this.bitField0_ |= 0x1;
                    this.id_ = other.id_;
                    onChanged();
                }
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasId()) return false;
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                RedPacketHandler.FetchRedPacketRequest parsedMessage = null;
                try {
                    parsedMessage = (RedPacketHandler.FetchRedPacketRequest) RedPacketHandler.FetchRedPacketRequest.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (RedPacketHandler.FetchRedPacketRequest) e.getUnfinishedMessage();
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
                this.id_ = RedPacketHandler.FetchRedPacketRequest.getDefaultInstance().getId();
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
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class FetchRedPacketResponse
            extends GeneratedMessage
            implements FetchRedPacketResponseOrBuilder {
        private static final FetchRedPacketResponse defaultInstance = new FetchRedPacketResponse(true);
        private final UnknownFieldSet unknownFields;

        private FetchRedPacketResponse(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private FetchRedPacketResponse(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static FetchRedPacketResponse getDefaultInstance() {
            return defaultInstance;
        }

        public FetchRedPacketResponse getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private FetchRedPacketResponse(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 24:
                            this.bitField0_ |= 0x4;
                            this.value_ = input.readInt32();
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
            return RedPacketHandler.internal_static_pomelo_redpacket_FetchRedPacketResponse_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return RedPacketHandler.internal_static_pomelo_redpacket_FetchRedPacketResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(FetchRedPacketResponse.class, Builder.class);
        }

        public static Parser<FetchRedPacketResponse> PARSER = (Parser<FetchRedPacketResponse>) new AbstractParser<FetchRedPacketResponse>() {
            public RedPacketHandler.FetchRedPacketResponse parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new RedPacketHandler.FetchRedPacketResponse(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int S2C_CODE_FIELD_NUMBER = 1;
        private int s2CCode_;
        public static final int S2C_MSG_FIELD_NUMBER = 2;
        private Object s2CMsg_;
        public static final int VALUE_FIELD_NUMBER = 3;
        private int value_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<FetchRedPacketResponse> getParserForType() {
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

        public boolean hasValue() {
            return ((this.bitField0_ & 0x4) == 4);
        }

        public int getValue() {
            return this.value_;
        }

        private void initFields() {
            this.s2CCode_ = 0;
            this.s2CMsg_ = "";
            this.value_ = 0;
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
            if ((this.bitField0_ & 0x4) == 4) output.writeInt32(3, this.value_);
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) size += CodedOutputStream.computeInt32Size(1, this.s2CCode_);
            if ((this.bitField0_ & 0x2) == 2) size += CodedOutputStream.computeBytesSize(2, getS2CMsgBytes());
            if ((this.bitField0_ & 0x4) == 4) size += CodedOutputStream.computeInt32Size(3, this.value_);
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static FetchRedPacketResponse parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (FetchRedPacketResponse) PARSER.parseFrom(data);
        }

        public static FetchRedPacketResponse parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (FetchRedPacketResponse) PARSER.parseFrom(data, extensionRegistry);
        }

        public static FetchRedPacketResponse parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (FetchRedPacketResponse) PARSER.parseFrom(data);
        }

        public static FetchRedPacketResponse parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (FetchRedPacketResponse) PARSER.parseFrom(data, extensionRegistry);
        }

        public static FetchRedPacketResponse parseFrom(InputStream input) throws IOException {
            return (FetchRedPacketResponse) PARSER.parseFrom(input);
        }

        public static FetchRedPacketResponse parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (FetchRedPacketResponse) PARSER.parseFrom(input, extensionRegistry);
        }

        public static FetchRedPacketResponse parseDelimitedFrom(InputStream input) throws IOException {
            return (FetchRedPacketResponse) PARSER.parseDelimitedFrom(input);
        }

        public static FetchRedPacketResponse parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (FetchRedPacketResponse) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static FetchRedPacketResponse parseFrom(CodedInputStream input) throws IOException {
            return (FetchRedPacketResponse) PARSER.parseFrom(input);
        }

        public static FetchRedPacketResponse parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (FetchRedPacketResponse) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(FetchRedPacketResponse prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements RedPacketHandler.FetchRedPacketResponseOrBuilder {
            private int bitField0_;
            private int s2CCode_;
            private Object s2CMsg_;
            private int value_;

            public static final Descriptors.Descriptor getDescriptor() {
                return RedPacketHandler.internal_static_pomelo_redpacket_FetchRedPacketResponse_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return RedPacketHandler.internal_static_pomelo_redpacket_FetchRedPacketResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(RedPacketHandler.FetchRedPacketResponse.class, Builder.class);
            }

            private Builder() {
                this.s2CMsg_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.s2CMsg_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (RedPacketHandler.FetchRedPacketResponse.alwaysUseFieldBuilders) ;
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
                this.value_ = 0;
                this.bitField0_ &= 0xFFFFFFFB;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return RedPacketHandler.internal_static_pomelo_redpacket_FetchRedPacketResponse_descriptor;
            }

            public RedPacketHandler.FetchRedPacketResponse getDefaultInstanceForType() {
                return RedPacketHandler.FetchRedPacketResponse.getDefaultInstance();
            }

            public RedPacketHandler.FetchRedPacketResponse build() {
                RedPacketHandler.FetchRedPacketResponse result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public RedPacketHandler.FetchRedPacketResponse buildPartial() {
                RedPacketHandler.FetchRedPacketResponse result = new RedPacketHandler.FetchRedPacketResponse(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.s2CCode_ = this.s2CCode_;
                if ((from_bitField0_ & 0x2) == 2) to_bitField0_ |= 0x2;
                result.s2CMsg_ = this.s2CMsg_;
                if ((from_bitField0_ & 0x4) == 4) to_bitField0_ |= 0x4;
                result.value_ = this.value_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof RedPacketHandler.FetchRedPacketResponse)
                    return mergeFrom((RedPacketHandler.FetchRedPacketResponse) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(RedPacketHandler.FetchRedPacketResponse other) {
                if (other == RedPacketHandler.FetchRedPacketResponse.getDefaultInstance()) return this;
                if (other.hasS2CCode()) setS2CCode(other.getS2CCode());
                if (other.hasS2CMsg()) {
                    this.bitField0_ |= 0x2;
                    this.s2CMsg_ = other.s2CMsg_;
                    onChanged();
                }
                if (other.hasValue()) setValue(other.getValue());
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasS2CCode()) return false;
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                RedPacketHandler.FetchRedPacketResponse parsedMessage = null;
                try {
                    parsedMessage = (RedPacketHandler.FetchRedPacketResponse) RedPacketHandler.FetchRedPacketResponse.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (RedPacketHandler.FetchRedPacketResponse) e.getUnfinishedMessage();
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
                this.s2CMsg_ = RedPacketHandler.FetchRedPacketResponse.getDefaultInstance().getS2CMsg();
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
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class OnRedPacketDispatchPush
            extends GeneratedMessage
            implements OnRedPacketDispatchPushOrBuilder {
        private static final OnRedPacketDispatchPush defaultInstance = new OnRedPacketDispatchPush(true);
        private final UnknownFieldSet unknownFields;

        private OnRedPacketDispatchPush(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private OnRedPacketDispatchPush(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static OnRedPacketDispatchPush getDefaultInstance() {
            return defaultInstance;
        }

        public OnRedPacketDispatchPush getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private OnRedPacketDispatchPush(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    ByteString byteString1;
                    RedPacketHandler.RedPacketInfo.Builder subBuilder;
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
                            byteString1 = input.readBytes();
                            this.bitField0_ |= 0x2;
                            this.s2CMsg_ = byteString1;
                            break;
                        case 26:
                            subBuilder = null;
                            if ((this.bitField0_ & 0x4) == 4) subBuilder = this.redPacketInfo_.toBuilder();
                            this.redPacketInfo_ = (RedPacketHandler.RedPacketInfo) input.readMessage(RedPacketHandler.RedPacketInfo.PARSER, extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.redPacketInfo_);
                                this.redPacketInfo_ = subBuilder.buildPartial();
                            }
                            this.bitField0_ |= 0x4;
                            break;
                        case 34:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x8;
                            this.id_ = bs;
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
            return RedPacketHandler.internal_static_pomelo_redpacket_OnRedPacketDispatchPush_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return RedPacketHandler.internal_static_pomelo_redpacket_OnRedPacketDispatchPush_fieldAccessorTable.ensureFieldAccessorsInitialized(OnRedPacketDispatchPush.class, Builder.class);
        }

        public static Parser<OnRedPacketDispatchPush> PARSER = (Parser<OnRedPacketDispatchPush>) new AbstractParser<OnRedPacketDispatchPush>() {
            public RedPacketHandler.OnRedPacketDispatchPush parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new RedPacketHandler.OnRedPacketDispatchPush(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int S2C_CODE_FIELD_NUMBER = 1;
        private int s2CCode_;
        public static final int S2C_MSG_FIELD_NUMBER = 2;
        private Object s2CMsg_;
        public static final int REDPACKETINFO_FIELD_NUMBER = 3;
        private RedPacketHandler.RedPacketInfo redPacketInfo_;
        public static final int ID_FIELD_NUMBER = 4;
        private Object id_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<OnRedPacketDispatchPush> getParserForType() {
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

        public boolean hasRedPacketInfo() {
            return ((this.bitField0_ & 0x4) == 4);
        }

        public RedPacketHandler.RedPacketInfo getRedPacketInfo() {
            return this.redPacketInfo_;
        }

        public RedPacketHandler.RedPacketInfoOrBuilder getRedPacketInfoOrBuilder() {
            return this.redPacketInfo_;
        }

        public boolean hasId() {
            return ((this.bitField0_ & 0x8) == 8);
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

        private void initFields() {
            this.s2CCode_ = 0;
            this.s2CMsg_ = "";
            this.redPacketInfo_ = RedPacketHandler.RedPacketInfo.getDefaultInstance();
            this.id_ = "";
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            if (!hasS2CCode()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (hasRedPacketInfo() && !getRedPacketInfo().isInitialized()) {
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
            if ((this.bitField0_ & 0x4) == 4) output.writeMessage(3, (MessageLite) this.redPacketInfo_);
            if ((this.bitField0_ & 0x8) == 8) output.writeBytes(4, getIdBytes());
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) size += CodedOutputStream.computeInt32Size(1, this.s2CCode_);
            if ((this.bitField0_ & 0x2) == 2) size += CodedOutputStream.computeBytesSize(2, getS2CMsgBytes());
            if ((this.bitField0_ & 0x4) == 4)
                size += CodedOutputStream.computeMessageSize(3, (MessageLite) this.redPacketInfo_);
            if ((this.bitField0_ & 0x8) == 8) size += CodedOutputStream.computeBytesSize(4, getIdBytes());
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static OnRedPacketDispatchPush parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (OnRedPacketDispatchPush) PARSER.parseFrom(data);
        }

        public static OnRedPacketDispatchPush parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (OnRedPacketDispatchPush) PARSER.parseFrom(data, extensionRegistry);
        }

        public static OnRedPacketDispatchPush parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (OnRedPacketDispatchPush) PARSER.parseFrom(data);
        }

        public static OnRedPacketDispatchPush parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (OnRedPacketDispatchPush) PARSER.parseFrom(data, extensionRegistry);
        }

        public static OnRedPacketDispatchPush parseFrom(InputStream input) throws IOException {
            return (OnRedPacketDispatchPush) PARSER.parseFrom(input);
        }

        public static OnRedPacketDispatchPush parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (OnRedPacketDispatchPush) PARSER.parseFrom(input, extensionRegistry);
        }

        public static OnRedPacketDispatchPush parseDelimitedFrom(InputStream input) throws IOException {
            return (OnRedPacketDispatchPush) PARSER.parseDelimitedFrom(input);
        }

        public static OnRedPacketDispatchPush parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (OnRedPacketDispatchPush) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static OnRedPacketDispatchPush parseFrom(CodedInputStream input) throws IOException {
            return (OnRedPacketDispatchPush) PARSER.parseFrom(input);
        }

        public static OnRedPacketDispatchPush parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (OnRedPacketDispatchPush) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(OnRedPacketDispatchPush prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements RedPacketHandler.OnRedPacketDispatchPushOrBuilder {
            private int bitField0_;
            private int s2CCode_;
            private Object s2CMsg_;
            private RedPacketHandler.RedPacketInfo redPacketInfo_;
            private SingleFieldBuilder<RedPacketHandler.RedPacketInfo, RedPacketHandler.RedPacketInfo.Builder, RedPacketHandler.RedPacketInfoOrBuilder> redPacketInfoBuilder_;
            private Object id_;

            public static final Descriptors.Descriptor getDescriptor() {
                return RedPacketHandler.internal_static_pomelo_redpacket_OnRedPacketDispatchPush_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return RedPacketHandler.internal_static_pomelo_redpacket_OnRedPacketDispatchPush_fieldAccessorTable.ensureFieldAccessorsInitialized(RedPacketHandler.OnRedPacketDispatchPush.class, Builder.class);
            }

            private Builder() {
                this.s2CMsg_ = "";
                this.redPacketInfo_ = RedPacketHandler.RedPacketInfo.getDefaultInstance();
                this.id_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.s2CMsg_ = "";
                this.redPacketInfo_ = RedPacketHandler.RedPacketInfo.getDefaultInstance();
                this.id_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (RedPacketHandler.OnRedPacketDispatchPush.alwaysUseFieldBuilders) getRedPacketInfoFieldBuilder();
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
                if (this.redPacketInfoBuilder_ == null) {
                    this.redPacketInfo_ = RedPacketHandler.RedPacketInfo.getDefaultInstance();
                } else {
                    this.redPacketInfoBuilder_.clear();
                }
                this.bitField0_ &= 0xFFFFFFFB;
                this.id_ = "";
                this.bitField0_ &= 0xFFFFFFF7;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return RedPacketHandler.internal_static_pomelo_redpacket_OnRedPacketDispatchPush_descriptor;
            }

            public RedPacketHandler.OnRedPacketDispatchPush getDefaultInstanceForType() {
                return RedPacketHandler.OnRedPacketDispatchPush.getDefaultInstance();
            }

            public RedPacketHandler.OnRedPacketDispatchPush build() {
                RedPacketHandler.OnRedPacketDispatchPush result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public RedPacketHandler.OnRedPacketDispatchPush buildPartial() {
                RedPacketHandler.OnRedPacketDispatchPush result = new RedPacketHandler.OnRedPacketDispatchPush(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.s2CCode_ = this.s2CCode_;
                if ((from_bitField0_ & 0x2) == 2) to_bitField0_ |= 0x2;
                result.s2CMsg_ = this.s2CMsg_;
                if ((from_bitField0_ & 0x4) == 4) to_bitField0_ |= 0x4;
                if (this.redPacketInfoBuilder_ == null) {
                    result.redPacketInfo_ = this.redPacketInfo_;
                } else {
                    result.redPacketInfo_ = (RedPacketHandler.RedPacketInfo) this.redPacketInfoBuilder_.build();
                }
                if ((from_bitField0_ & 0x8) == 8) to_bitField0_ |= 0x8;
                result.id_ = this.id_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof RedPacketHandler.OnRedPacketDispatchPush)
                    return mergeFrom((RedPacketHandler.OnRedPacketDispatchPush) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(RedPacketHandler.OnRedPacketDispatchPush other) {
                if (other == RedPacketHandler.OnRedPacketDispatchPush.getDefaultInstance()) return this;
                if (other.hasS2CCode()) setS2CCode(other.getS2CCode());
                if (other.hasS2CMsg()) {
                    this.bitField0_ |= 0x2;
                    this.s2CMsg_ = other.s2CMsg_;
                    onChanged();
                }
                if (other.hasRedPacketInfo()) mergeRedPacketInfo(other.getRedPacketInfo());
                if (other.hasId()) {
                    this.bitField0_ |= 0x8;
                    this.id_ = other.id_;
                    onChanged();
                }
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasS2CCode()) return false;
                if (hasRedPacketInfo() && !getRedPacketInfo().isInitialized()) return false;
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                RedPacketHandler.OnRedPacketDispatchPush parsedMessage = null;
                try {
                    parsedMessage = (RedPacketHandler.OnRedPacketDispatchPush) RedPacketHandler.OnRedPacketDispatchPush.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (RedPacketHandler.OnRedPacketDispatchPush) e.getUnfinishedMessage();
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
                this.s2CMsg_ = RedPacketHandler.OnRedPacketDispatchPush.getDefaultInstance().getS2CMsg();
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

            public boolean hasRedPacketInfo() {
                return ((this.bitField0_ & 0x4) == 4);
            }

            public RedPacketHandler.RedPacketInfo getRedPacketInfo() {
                if (this.redPacketInfoBuilder_ == null) return this.redPacketInfo_;
                return (RedPacketHandler.RedPacketInfo) this.redPacketInfoBuilder_.getMessage();
            }

            public Builder setRedPacketInfo(RedPacketHandler.RedPacketInfo value) {
                if (this.redPacketInfoBuilder_ == null) {
                    if (value == null) throw new NullPointerException();
                    this.redPacketInfo_ = value;
                    onChanged();
                } else {
                    this.redPacketInfoBuilder_.setMessage(value);
                }
                this.bitField0_ |= 0x4;
                return this;
            }

            public Builder setRedPacketInfo(RedPacketHandler.RedPacketInfo.Builder builderForValue) {
                if (this.redPacketInfoBuilder_ == null) {
                    this.redPacketInfo_ = builderForValue.build();
                    onChanged();
                } else {
                    this.redPacketInfoBuilder_.setMessage(builderForValue.build());
                }
                this.bitField0_ |= 0x4;
                return this;
            }

            public Builder mergeRedPacketInfo(RedPacketHandler.RedPacketInfo value) {
                if (this.redPacketInfoBuilder_ == null) {
                    if ((this.bitField0_ & 0x4) == 4 && this.redPacketInfo_ != RedPacketHandler.RedPacketInfo.getDefaultInstance()) {
                        this.redPacketInfo_ = RedPacketHandler.RedPacketInfo.newBuilder(this.redPacketInfo_).mergeFrom(value).buildPartial();
                    } else {
                        this.redPacketInfo_ = value;
                    }
                    onChanged();
                } else {
                    this.redPacketInfoBuilder_.mergeFrom(value);
                }
                this.bitField0_ |= 0x4;
                return this;
            }

            public Builder clearRedPacketInfo() {
                if (this.redPacketInfoBuilder_ == null) {
                    this.redPacketInfo_ = RedPacketHandler.RedPacketInfo.getDefaultInstance();
                    onChanged();
                } else {
                    this.redPacketInfoBuilder_.clear();
                }
                this.bitField0_ &= 0xFFFFFFFB;
                return this;
            }

            public RedPacketHandler.RedPacketInfo.Builder getRedPacketInfoBuilder() {
                this.bitField0_ |= 0x4;
                onChanged();
                return (RedPacketHandler.RedPacketInfo.Builder) getRedPacketInfoFieldBuilder().getBuilder();
            }

            public RedPacketHandler.RedPacketInfoOrBuilder getRedPacketInfoOrBuilder() {
                if (this.redPacketInfoBuilder_ != null)
                    return (RedPacketHandler.RedPacketInfoOrBuilder) this.redPacketInfoBuilder_.getMessageOrBuilder();
                return this.redPacketInfo_;
            }

            private SingleFieldBuilder<RedPacketHandler.RedPacketInfo, RedPacketHandler.RedPacketInfo.Builder, RedPacketHandler.RedPacketInfoOrBuilder> getRedPacketInfoFieldBuilder() {
                if (this.redPacketInfoBuilder_ == null) {
                    this.redPacketInfoBuilder_ = new SingleFieldBuilder(getRedPacketInfo(), getParentForChildren(), isClean());
                    this.redPacketInfo_ = null;
                }
                return this.redPacketInfoBuilder_;
            }

            public boolean hasId() {
                return ((this.bitField0_ & 0x8) == 8);
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
                this.bitField0_ |= 0x8;
                this.id_ = value;
                onChanged();
                return this;
            }

            public Builder clearId() {
                this.bitField0_ &= 0xFFFFFFF7;
                this.id_ = RedPacketHandler.OnRedPacketDispatchPush.getDefaultInstance().getId();
                onChanged();
                return this;
            }

            public Builder setIdBytes(ByteString value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x8;
                this.id_ = value;
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
        String[] descriptorData = {"\n\026redPacketHandler.proto\022\020pomelo.redpacket\032\fcommon.proto\"K\n\013FetcherInfo\022\021\n\tfetcherId\030\001 \002(\t\022\023\n\013fetcherName\030\002 \002(\t\022\024\n\ffetcherValue\030\003 \002(\005\"\002\n\rRedPacketInfo\022\n\n\002id\030\001 \002(\t\022\r\n\005count\030\002 \002(\005\022\020\n\btotalNum\030\003 \002(\005\022\023\n\013channelType\030\004 \002(\005\022\021\n\tfetchType\030\005 \002(\005\022\023\n\013benifitType\030\006 \002(\005\0222\n\013fetcherList\030\007 \003(\0132\035.pomelo.redpacket.FetcherInfo\022\022\n\nproviderId\030\b \001(\t\022\024\n\fproviderName\030\t \002(\t\022\017\n\007message\030\n \001(\t\022\031\n\021dispatchTimestamp\030\013 \002(\003\"\031\n\027G", "etRedPacketListRequest\"u\n\030GetRedPacketListResponse\022\020\n\bs2c_code\030\001 \002(\005\022\017\n\007s2c_msg\030\002 \001(\t\0226\n\rredPacketInfo\030\003 \003(\0132\037.pomelo.redpacket.RedPacketInfo\"\001\n\030DispatchRedPacketRequest\022\r\n\005count\030\001 \002(\005\022\020\n\btotalNum\030\002 \002(\005\022\023\n\013channelType\030\003 \002(\005\022\021\n\tfetchType\030\004 \002(\005\022\023\n\013benifitType\030\005 \002(\005\022\017\n\007message\030\006 \002(\t\">\n\031DispatchRedPacketResponse\022\020\n\bs2c_code\030\001 \002(\005\022\017\n\007s2c_msg\030\002 \001(\t\"#\n\025FetchRedPacketRequest\022\n\n\002id\030\001 \002(\t\"J\n\026FetchRedPacket", "Response\022\020\n\bs2c_code\030\001 \002(\005\022\017\n\007s2c_msg\030\002 \001(\t\022\r\n\005value\030\003 \001(\005\"\001\n\027OnRedPacketDispatchPush\022\020\n\bs2c_code\030\001 \002(\005\022\017\n\007s2c_msg\030\002 \001(\t\0226\n\rredPacketInfo\030\003 \001(\0132\037.pomelo.redpacket.RedPacketInfo\022\n\n\002id\030\004 \001(\t2å\002\n\020redPacketHandler\022p\n\027getRedPacketListRequest\022).pomelo.redpacket.GetRedPacketListRequest\032*.pomelo.redpacket.GetRedPacketListResponse\022s\n\030dispatchRedPacketRequest\022*.pomelo.redpacket.DispatchRedPacketRequest\032+.p", "omelo.redpacket.DispatchRedPacketResponse\022j\n\025fetchRedPacketRequest\022'.pomelo.redpacket.FetchRedPacketRequest\032(.pomelo.redpacket.FetchRedPacketResponse2c\n\rredPacketPush\022R\n\027onRedPacketDispatchPush\022).pomelo.redpacket.OnRedPacketDispatchPush\032\f.pomelo.Void"};


        Descriptors.FileDescriptor.InternalDescriptorAssigner assigner = new Descriptors.FileDescriptor.InternalDescriptorAssigner() {
            public ExtensionRegistry assignDescriptors(Descriptors.FileDescriptor root) {
                RedPacketHandler.descriptor = root;
                return null;
            }
        };

        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{

                Common.getDescriptor()}, assigner);
    }

    private static final Descriptors.Descriptor internal_static_pomelo_redpacket_FetcherInfo_descriptor = getDescriptor().getMessageTypes().get(0);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_redpacket_FetcherInfo_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_redpacket_FetcherInfo_descriptor, new String[]{"FetcherId", "FetcherName", "FetcherValue"});


    private static final Descriptors.Descriptor internal_static_pomelo_redpacket_RedPacketInfo_descriptor = getDescriptor().getMessageTypes().get(1);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_redpacket_RedPacketInfo_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_redpacket_RedPacketInfo_descriptor, new String[]{"Id", "Count", "TotalNum", "ChannelType", "FetchType", "BenifitType", "FetcherList", "ProviderId", "ProviderName", "Message", "DispatchTimestamp"});


    private static final Descriptors.Descriptor internal_static_pomelo_redpacket_GetRedPacketListRequest_descriptor = getDescriptor().getMessageTypes().get(2);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_redpacket_GetRedPacketListRequest_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_redpacket_GetRedPacketListRequest_descriptor, new String[0]);


    private static final Descriptors.Descriptor internal_static_pomelo_redpacket_GetRedPacketListResponse_descriptor = getDescriptor().getMessageTypes().get(3);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_redpacket_GetRedPacketListResponse_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_redpacket_GetRedPacketListResponse_descriptor, new String[]{"S2CCode", "S2CMsg", "RedPacketInfo"});


    private static final Descriptors.Descriptor internal_static_pomelo_redpacket_DispatchRedPacketRequest_descriptor = getDescriptor().getMessageTypes().get(4);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_redpacket_DispatchRedPacketRequest_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_redpacket_DispatchRedPacketRequest_descriptor, new String[]{"Count", "TotalNum", "ChannelType", "FetchType", "BenifitType", "Message"});


    private static final Descriptors.Descriptor internal_static_pomelo_redpacket_DispatchRedPacketResponse_descriptor = getDescriptor().getMessageTypes().get(5);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_redpacket_DispatchRedPacketResponse_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_redpacket_DispatchRedPacketResponse_descriptor, new String[]{"S2CCode", "S2CMsg"});


    private static final Descriptors.Descriptor internal_static_pomelo_redpacket_FetchRedPacketRequest_descriptor = getDescriptor().getMessageTypes().get(6);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_redpacket_FetchRedPacketRequest_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_redpacket_FetchRedPacketRequest_descriptor, new String[]{"Id"});


    private static final Descriptors.Descriptor internal_static_pomelo_redpacket_FetchRedPacketResponse_descriptor = getDescriptor().getMessageTypes().get(7);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_redpacket_FetchRedPacketResponse_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_redpacket_FetchRedPacketResponse_descriptor, new String[]{"S2CCode", "S2CMsg", "Value"});


    private static final Descriptors.Descriptor internal_static_pomelo_redpacket_OnRedPacketDispatchPush_descriptor = getDescriptor().getMessageTypes().get(8);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_redpacket_OnRedPacketDispatchPush_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_redpacket_OnRedPacketDispatchPush_descriptor, new String[]{"S2CCode", "S2CMsg", "RedPacketInfo", "Id"});
    private static Descriptors.FileDescriptor descriptor;

    static {
        Common.getDescriptor();
    }

    public static interface OnRedPacketDispatchPushOrBuilder extends MessageOrBuilder {
        boolean hasS2CCode();

        int getS2CCode();

        boolean hasS2CMsg();

        String getS2CMsg();

        ByteString getS2CMsgBytes();

        boolean hasRedPacketInfo();

        RedPacketHandler.RedPacketInfo getRedPacketInfo();

        RedPacketHandler.RedPacketInfoOrBuilder getRedPacketInfoOrBuilder();

        boolean hasId();

        String getId();

        ByteString getIdBytes();
    }

    public static interface FetchRedPacketResponseOrBuilder extends MessageOrBuilder {
        boolean hasS2CCode();

        int getS2CCode();

        boolean hasS2CMsg();

        String getS2CMsg();

        ByteString getS2CMsgBytes();

        boolean hasValue();

        int getValue();
    }

    public static interface FetchRedPacketRequestOrBuilder extends MessageOrBuilder {
        boolean hasId();

        String getId();

        ByteString getIdBytes();
    }

    public static interface DispatchRedPacketResponseOrBuilder extends MessageOrBuilder {
        boolean hasS2CCode();

        int getS2CCode();

        boolean hasS2CMsg();

        String getS2CMsg();

        ByteString getS2CMsgBytes();
    }

    public static interface DispatchRedPacketRequestOrBuilder extends MessageOrBuilder {
        boolean hasCount();

        int getCount();

        boolean hasTotalNum();

        int getTotalNum();

        boolean hasChannelType();

        int getChannelType();

        boolean hasFetchType();

        int getFetchType();

        boolean hasBenifitType();

        int getBenifitType();

        boolean hasMessage();

        String getMessage();

        ByteString getMessageBytes();
    }

    public static interface GetRedPacketListResponseOrBuilder extends MessageOrBuilder {
        boolean hasS2CCode();

        int getS2CCode();

        boolean hasS2CMsg();

        String getS2CMsg();

        ByteString getS2CMsgBytes();

        List<RedPacketHandler.RedPacketInfo> getRedPacketInfoList();

        RedPacketHandler.RedPacketInfo getRedPacketInfo(int param1Int);

        int getRedPacketInfoCount();

        List<? extends RedPacketHandler.RedPacketInfoOrBuilder> getRedPacketInfoOrBuilderList();

        RedPacketHandler.RedPacketInfoOrBuilder getRedPacketInfoOrBuilder(int param1Int);
    }

    public static interface GetRedPacketListRequestOrBuilder extends MessageOrBuilder {
    }

    public static interface RedPacketInfoOrBuilder extends MessageOrBuilder {
        boolean hasId();

        String getId();

        ByteString getIdBytes();

        boolean hasCount();

        int getCount();

        boolean hasTotalNum();

        int getTotalNum();

        boolean hasChannelType();

        int getChannelType();

        boolean hasFetchType();

        int getFetchType();

        boolean hasBenifitType();

        int getBenifitType();

        List<RedPacketHandler.FetcherInfo> getFetcherListList();

        RedPacketHandler.FetcherInfo getFetcherList(int param1Int);

        int getFetcherListCount();

        List<? extends RedPacketHandler.FetcherInfoOrBuilder> getFetcherListOrBuilderList();

        RedPacketHandler.FetcherInfoOrBuilder getFetcherListOrBuilder(int param1Int);

        boolean hasProviderId();

        String getProviderId();

        ByteString getProviderIdBytes();

        boolean hasProviderName();

        String getProviderName();

        ByteString getProviderNameBytes();

        boolean hasMessage();

        String getMessage();

        ByteString getMessageBytes();

        boolean hasDispatchTimestamp();

        long getDispatchTimestamp();
    }

    public static interface FetcherInfoOrBuilder extends MessageOrBuilder {
        boolean hasFetcherId();

        String getFetcherId();

        ByteString getFetcherIdBytes();

        boolean hasFetcherName();

        String getFetcherName();

        ByteString getFetcherNameBytes();

        boolean hasFetcherValue();

        int getFetcherValue();
    }
}


