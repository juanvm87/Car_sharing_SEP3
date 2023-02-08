// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ticket.proto

package via.sep3.grpcserver.protobuf.ticketservices;

public interface SeatTicketCreationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:SeatTicketCreationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>double seat_price = 1;</code>
   * @return The seatPrice.
   */
  double getSeatPrice();

  /**
   * <code>int32 total_seats = 2;</code>
   * @return The totalSeats.
   */
  int getTotalSeats();

  /**
   * <code>string passenger_id = 3;</code>
   * @return The passengerId.
   */
  java.lang.String getPassengerId();
  /**
   * <code>string passenger_id = 3;</code>
   * @return The bytes for passengerId.
   */
  com.google.protobuf.ByteString
      getPassengerIdBytes();

  /**
   * <code>int64 trip_id = 4;</code>
   * @return The tripId.
   */
  long getTripId();

  /**
   * <code>int64 pickup_id = 5;</code>
   * @return The pickupId.
   */
  long getPickupId();

  /**
   * <code>int64 dropoff_id = 6;</code>
   * @return The dropoffId.
   */
  long getDropoffId();
}
