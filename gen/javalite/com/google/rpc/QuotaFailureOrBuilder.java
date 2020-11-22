// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/rpc/error_details.proto

package com.google.rpc;

public interface QuotaFailureOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.rpc.QuotaFailure)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Describes all quota violations.
   * </pre>
   *
   * <code>repeated .google.rpc.QuotaFailure.Violation violations = 1;</code>
   */
  java.util.List<com.google.rpc.QuotaFailure.Violation> 
      getViolationsList();
  /**
   * <pre>
   * Describes all quota violations.
   * </pre>
   *
   * <code>repeated .google.rpc.QuotaFailure.Violation violations = 1;</code>
   */
  com.google.rpc.QuotaFailure.Violation getViolations(int index);
  /**
   * <pre>
   * Describes all quota violations.
   * </pre>
   *
   * <code>repeated .google.rpc.QuotaFailure.Violation violations = 1;</code>
   */
  int getViolationsCount();
}