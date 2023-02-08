// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: trip.proto

package via.sep3.grpcserver.protobuf.tripservices;

/**
 * Protobuf type {@code SeatTicketResponseB}
 */
public final class SeatTicketResponseB extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:SeatTicketResponseB)
    SeatTicketResponseBOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SeatTicketResponseB.newBuilder() to construct.
  private SeatTicketResponseB(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SeatTicketResponseB() {
    passengerId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SeatTicketResponseB();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SeatTicketResponseB(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            id_ = input.readInt64();
            break;
          }
          case 17: {

            seatPrice_ = input.readDouble();
            break;
          }
          case 24: {

            totalSeats_ = input.readInt32();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            passengerId_ = s;
            break;
          }
          case 40: {

            tripId_ = input.readInt64();
            break;
          }
          case 48: {

            pickupId_ = input.readInt64();
            break;
          }
          case 56: {

            dropoffId_ = input.readInt64();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return via.sep3.grpcserver.protobuf.tripservices.Trip.internal_static_SeatTicketResponseB_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return via.sep3.grpcserver.protobuf.tripservices.Trip.internal_static_SeatTicketResponseB_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            via.sep3.grpcserver.protobuf.tripservices.SeatTicketResponseB.class, via.sep3.grpcserver.protobuf.tripservices.SeatTicketResponseB.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private long id_;
  /**
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public long getId() {
    return id_;
  }

  public static final int SEAT_PRICE_FIELD_NUMBER = 2;
  private double seatPrice_;
  /**
   * <code>double seat_price = 2;</code>
   * @return The seatPrice.
   */
  @java.lang.Override
  public double getSeatPrice() {
    return seatPrice_;
  }

  public static final int TOTAL_SEATS_FIELD_NUMBER = 3;
  private int totalSeats_;
  /**
   * <code>int32 total_seats = 3;</code>
   * @return The totalSeats.
   */
  @java.lang.Override
  public int getTotalSeats() {
    return totalSeats_;
  }

  public static final int PASSENGER_ID_FIELD_NUMBER = 4;
  private volatile java.lang.Object passengerId_;
  /**
   * <code>string passenger_id = 4;</code>
   * @return The passengerId.
   */
  @java.lang.Override
  public java.lang.String getPassengerId() {
    java.lang.Object ref = passengerId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      passengerId_ = s;
      return s;
    }
  }
  /**
   * <code>string passenger_id = 4;</code>
   * @return The bytes for passengerId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPassengerIdBytes() {
    java.lang.Object ref = passengerId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      passengerId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TRIP_ID_FIELD_NUMBER = 5;
  private long tripId_;
  /**
   * <code>int64 trip_id = 5;</code>
   * @return The tripId.
   */
  @java.lang.Override
  public long getTripId() {
    return tripId_;
  }

  public static final int PICKUP_ID_FIELD_NUMBER = 6;
  private long pickupId_;
  /**
   * <code>int64 pickup_id = 6;</code>
   * @return The pickupId.
   */
  @java.lang.Override
  public long getPickupId() {
    return pickupId_;
  }

  public static final int DROPOFF_ID_FIELD_NUMBER = 7;
  private long dropoffId_;
  /**
   * <code>int64 dropoff_id = 7;</code>
   * @return The dropoffId.
   */
  @java.lang.Override
  public long getDropoffId() {
    return dropoffId_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (id_ != 0L) {
      output.writeInt64(1, id_);
    }
    if (java.lang.Double.doubleToRawLongBits(seatPrice_) != 0) {
      output.writeDouble(2, seatPrice_);
    }
    if (totalSeats_ != 0) {
      output.writeInt32(3, totalSeats_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(passengerId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, passengerId_);
    }
    if (tripId_ != 0L) {
      output.writeInt64(5, tripId_);
    }
    if (pickupId_ != 0L) {
      output.writeInt64(6, pickupId_);
    }
    if (dropoffId_ != 0L) {
      output.writeInt64(7, dropoffId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, id_);
    }
    if (java.lang.Double.doubleToRawLongBits(seatPrice_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, seatPrice_);
    }
    if (totalSeats_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, totalSeats_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(passengerId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, passengerId_);
    }
    if (tripId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, tripId_);
    }
    if (pickupId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, pickupId_);
    }
    if (dropoffId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(7, dropoffId_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof via.sep3.grpcserver.protobuf.tripservices.SeatTicketResponseB)) {
      return super.equals(obj);
    }
    via.sep3.grpcserver.protobuf.tripservices.SeatTicketResponseB other = (via.sep3.grpcserver.protobuf.tripservices.SeatTicketResponseB) obj;

    if (getId()
        != other.getId()) return false;
    if (java.lang.Double.doubleToLongBits(getSeatPrice())
        != java.lang.Double.doubleToLongBits(
            other.getSeatPrice())) return false;
    if (getTotalSeats()
        != other.getTotalSeats()) return false;
    if (!getPassengerId()
        .equals(other.getPassengerId())) return false;
    if (getTripId()
        != other.getTripId()) return false;
    if (getPickupId()
        != other.getPickupId()) return false;
    if (getDropoffId()
        != other.getDropoffId()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getId());
    hash = (37 * hash) + SEAT_PRICE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getSeatPrice()));
    hash = (37 * hash) + TOTAL_SEATS_FIELD_NUMBER;
    hash = (53 * hash) + getTotalSeats();
    hash = (37 * hash) + PASSENGER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getPassengerId().hashCode();
    hash = (37 * hash) + TRIP_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTripId());
    hash = (37 * hash) + PICKUP_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPickupId());
    hash = (37 * hash) + DROPOFF_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getDropoffId());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static via.sep3.grpcserver.protobuf.tripservices.SeatTicketResponseB parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sep3.grpcserver.protobuf.tripservices.SeatTicketResponseB parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sep3.grpcserver.protobuf.tripservices.SeatTicketResponseB parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sep3.grpcserver.protobuf.tripservices.SeatTicketResponseB parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sep3.grpcserver.protobuf.tripservices.SeatTicketResponseB parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sep3.grpcserver.protobuf.tripservices.SeatTicketResponseB parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sep3.grpcserver.protobuf.tripservices.SeatTicketResponseB parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static via.sep3.grpcserver.protobuf.tripservices.SeatTicketResponseB parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static via.sep3.grpcserver.protobuf.tripservices.SeatTicketResponseB parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static via.sep3.grpcserver.protobuf.tripservices.SeatTicketResponseB parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static via.sep3.grpcserver.protobuf.tripservices.SeatTicketResponseB parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static via.sep3.grpcserver.protobuf.tripservices.SeatTicketResponseB parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(via.sep3.grpcserver.protobuf.tripservices.SeatTicketResponseB prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code SeatTicketResponseB}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:SeatTicketResponseB)
      via.sep3.grpcserver.protobuf.tripservices.SeatTicketResponseBOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return via.sep3.grpcserver.protobuf.tripservices.Trip.internal_static_SeatTicketResponseB_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return via.sep3.grpcserver.protobuf.tripservices.Trip.internal_static_SeatTicketResponseB_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              via.sep3.grpcserver.protobuf.tripservices.SeatTicketResponseB.class, via.sep3.grpcserver.protobuf.tripservices.SeatTicketResponseB.Builder.class);
    }

    // Construct using via.sep3.grpcserver.protobuf.tripservices.SeatTicketResponseB.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = 0L;

      seatPrice_ = 0D;

      totalSeats_ = 0;

      passengerId_ = "";

      tripId_ = 0L;

      pickupId_ = 0L;

      dropoffId_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return via.sep3.grpcserver.protobuf.tripservices.Trip.internal_static_SeatTicketResponseB_descriptor;
    }

    @java.lang.Override
    public via.sep3.grpcserver.protobuf.tripservices.SeatTicketResponseB getDefaultInstanceForType() {
      return via.sep3.grpcserver.protobuf.tripservices.SeatTicketResponseB.getDefaultInstance();
    }

    @java.lang.Override
    public via.sep3.grpcserver.protobuf.tripservices.SeatTicketResponseB build() {
      via.sep3.grpcserver.protobuf.tripservices.SeatTicketResponseB result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public via.sep3.grpcserver.protobuf.tripservices.SeatTicketResponseB buildPartial() {
      via.sep3.grpcserver.protobuf.tripservices.SeatTicketResponseB result = new via.sep3.grpcserver.protobuf.tripservices.SeatTicketResponseB(this);
      result.id_ = id_;
      result.seatPrice_ = seatPrice_;
      result.totalSeats_ = totalSeats_;
      result.passengerId_ = passengerId_;
      result.tripId_ = tripId_;
      result.pickupId_ = pickupId_;
      result.dropoffId_ = dropoffId_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof via.sep3.grpcserver.protobuf.tripservices.SeatTicketResponseB) {
        return mergeFrom((via.sep3.grpcserver.protobuf.tripservices.SeatTicketResponseB)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(via.sep3.grpcserver.protobuf.tripservices.SeatTicketResponseB other) {
      if (other == via.sep3.grpcserver.protobuf.tripservices.SeatTicketResponseB.getDefaultInstance()) return this;
      if (other.getId() != 0L) {
        setId(other.getId());
      }
      if (other.getSeatPrice() != 0D) {
        setSeatPrice(other.getSeatPrice());
      }
      if (other.getTotalSeats() != 0) {
        setTotalSeats(other.getTotalSeats());
      }
      if (!other.getPassengerId().isEmpty()) {
        passengerId_ = other.passengerId_;
        onChanged();
      }
      if (other.getTripId() != 0L) {
        setTripId(other.getTripId());
      }
      if (other.getPickupId() != 0L) {
        setPickupId(other.getPickupId());
      }
      if (other.getDropoffId() != 0L) {
        setDropoffId(other.getDropoffId());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      via.sep3.grpcserver.protobuf.tripservices.SeatTicketResponseB parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (via.sep3.grpcserver.protobuf.tripservices.SeatTicketResponseB) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long id_ ;
    /**
     * <code>int64 id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public long getId() {
      return id_;
    }
    /**
     * <code>int64 id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(long value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = 0L;
      onChanged();
      return this;
    }

    private double seatPrice_ ;
    /**
     * <code>double seat_price = 2;</code>
     * @return The seatPrice.
     */
    @java.lang.Override
    public double getSeatPrice() {
      return seatPrice_;
    }
    /**
     * <code>double seat_price = 2;</code>
     * @param value The seatPrice to set.
     * @return This builder for chaining.
     */
    public Builder setSeatPrice(double value) {
      
      seatPrice_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double seat_price = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSeatPrice() {
      
      seatPrice_ = 0D;
      onChanged();
      return this;
    }

    private int totalSeats_ ;
    /**
     * <code>int32 total_seats = 3;</code>
     * @return The totalSeats.
     */
    @java.lang.Override
    public int getTotalSeats() {
      return totalSeats_;
    }
    /**
     * <code>int32 total_seats = 3;</code>
     * @param value The totalSeats to set.
     * @return This builder for chaining.
     */
    public Builder setTotalSeats(int value) {
      
      totalSeats_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 total_seats = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalSeats() {
      
      totalSeats_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object passengerId_ = "";
    /**
     * <code>string passenger_id = 4;</code>
     * @return The passengerId.
     */
    public java.lang.String getPassengerId() {
      java.lang.Object ref = passengerId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        passengerId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string passenger_id = 4;</code>
     * @return The bytes for passengerId.
     */
    public com.google.protobuf.ByteString
        getPassengerIdBytes() {
      java.lang.Object ref = passengerId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        passengerId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string passenger_id = 4;</code>
     * @param value The passengerId to set.
     * @return This builder for chaining.
     */
    public Builder setPassengerId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      passengerId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string passenger_id = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearPassengerId() {
      
      passengerId_ = getDefaultInstance().getPassengerId();
      onChanged();
      return this;
    }
    /**
     * <code>string passenger_id = 4;</code>
     * @param value The bytes for passengerId to set.
     * @return This builder for chaining.
     */
    public Builder setPassengerIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      passengerId_ = value;
      onChanged();
      return this;
    }

    private long tripId_ ;
    /**
     * <code>int64 trip_id = 5;</code>
     * @return The tripId.
     */
    @java.lang.Override
    public long getTripId() {
      return tripId_;
    }
    /**
     * <code>int64 trip_id = 5;</code>
     * @param value The tripId to set.
     * @return This builder for chaining.
     */
    public Builder setTripId(long value) {
      
      tripId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 trip_id = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearTripId() {
      
      tripId_ = 0L;
      onChanged();
      return this;
    }

    private long pickupId_ ;
    /**
     * <code>int64 pickup_id = 6;</code>
     * @return The pickupId.
     */
    @java.lang.Override
    public long getPickupId() {
      return pickupId_;
    }
    /**
     * <code>int64 pickup_id = 6;</code>
     * @param value The pickupId to set.
     * @return This builder for chaining.
     */
    public Builder setPickupId(long value) {
      
      pickupId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 pickup_id = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearPickupId() {
      
      pickupId_ = 0L;
      onChanged();
      return this;
    }

    private long dropoffId_ ;
    /**
     * <code>int64 dropoff_id = 7;</code>
     * @return The dropoffId.
     */
    @java.lang.Override
    public long getDropoffId() {
      return dropoffId_;
    }
    /**
     * <code>int64 dropoff_id = 7;</code>
     * @param value The dropoffId to set.
     * @return This builder for chaining.
     */
    public Builder setDropoffId(long value) {
      
      dropoffId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 dropoff_id = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearDropoffId() {
      
      dropoffId_ = 0L;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:SeatTicketResponseB)
  }

  // @@protoc_insertion_point(class_scope:SeatTicketResponseB)
  private static final via.sep3.grpcserver.protobuf.tripservices.SeatTicketResponseB DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new via.sep3.grpcserver.protobuf.tripservices.SeatTicketResponseB();
  }

  public static via.sep3.grpcserver.protobuf.tripservices.SeatTicketResponseB getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SeatTicketResponseB>
      PARSER = new com.google.protobuf.AbstractParser<SeatTicketResponseB>() {
    @java.lang.Override
    public SeatTicketResponseB parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SeatTicketResponseB(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SeatTicketResponseB> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SeatTicketResponseB> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public via.sep3.grpcserver.protobuf.tripservices.SeatTicketResponseB getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
